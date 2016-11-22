package ua.rd;


import ua.rd.xlsxparcer.XlsxParser;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws IOException {
        XlsxParser parser = new XlsxParser();
        File file = new File("Import Template EXCEL.xlsx");
        List<Employee> employees = parser.parse(file);

        for (Employee employee : employees) {
            System.out.println(employee);
        }


//        FileInputStream stream = new FileInputStream(new File("employees.xlsx"));
//        XSSFWorkbook workbook = new XSSFWorkbook(stream);
//        XSSFSheet sheet = workbook.getSheetAt(0);
//        Iterator<Row> rowIterator = sheet.iterator();

//        for (Row row : sheet) {
//            if (row.getRowNum() != 0) {
//                for (Cell cell : row) {
//                    int type = cell.getCellType();
//                    switch (type) {
//                        case Cell.CELL_TYPE_NUMERIC:
//                            System.out.print(cell.getNumericCellValue() + "\t");
//                            break;
//                        case Cell.CELL_TYPE_STRING:
//                            System.out.print(cell.getStringCellValue() + "\t");
//                    }
//                }
//                System.out.println();
//            } else {
////                defineCols(row);
//            }
//        }

//        while (rowIterator.hasNext()) {
//            Row row = rowIterator.next();
//            Iterator<Cell> cellIterator = row.iterator();
//            for (Cell cell : row) {
//
//            }
//        }

    }

//    private static void defineCols(Row row) {
//        Map<Integer, Type> mapping = new HashMap<>();
//        for (Cell cell : row) {
//            Integer index = cell.getColumnIndex();
//            String name = cell.getStringCellValue().toUpperCase();
//            Type type = Type.valueOf(name);
//            mapping.put(index, type);
//        }
//    }
}
