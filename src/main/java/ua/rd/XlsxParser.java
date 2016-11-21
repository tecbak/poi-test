package ua.rd;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static ua.rd.Type.*;

public class XlsxParser {
    private Map<Type, Integer> mapping = new HashMap<>();

    public List<Employee> parse(File file) throws IOException {
        List<Employee> employees = new ArrayList<>();

        FileInputStream stream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(stream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        for (Row row : sheet) {
            if (row.getRowNum() == 0) {
                defineCols(row);
            } else {
                Employee employee = parseRow(row);
                employees.add(employee);
            }
        }

        return employees;
    }

    private void defineCols(Row row) {
        for (Cell cell : row) {
            Integer index = cell.getColumnIndex();
            String name = cell.getStringCellValue().toUpperCase();
            Type type = valueOf(name);
            mapping.put(type, index);
        }
    }

    private Employee parseRow(Row row) {
        int firstNameIndex = mapping.get(FIRST_NAME);
        String firstName = getCellStringValue(row,firstNameIndex); //row.getCell(firstNameIndex).getStringCellValue();
        int lastNameIndex = mapping.get(LAST_NAME);
        String lastName = getCellStringValue(row, lastNameIndex); //row.getCell(lastNameIndex).getStringCellValue();
        String name = firstName + " " + lastName;

        int upsaEmailIndex = mapping.get(UPSA_EMAIL);
        String upsaEmail = getCellStringValue(row,upsaEmailIndex); //row.getCell(upsaEmailIndex).getStringCellValue();

        int personalEmailIndex = mapping.get(PERSONAL_EMAIL);
        String personalEmail = getCellStringValue(row, personalEmailIndex); //row.getCell(personalEmailIndex).getStringCellValue();

        Employee employee = new Employee();
        employee.setName(name);
        employee.setUpsaEmail(upsaEmail);
        employee.setPersonalEmail(personalEmail);

        return employee;
    }

    private String getCellStringValue(Row row, int cellIndex) {
        Cell cell = row.getCell(cellIndex);
        if (cell != null) {
            return cell.getStringCellValue();
        } else {
            return "";
        }
    }
}
