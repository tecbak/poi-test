package ua.rd.xlsxparcer;

import java.util.HashMap;
import java.util.Map;

public class TypeDefiner {
    private Map<String, Type> mapping;

    public TypeDefiner() {
        mapping = new HashMap<String, Type>() {{
            put("NAME", Type.FIRST_NAME);
            put("SURNAME", Type.LAST_NAME);
            put("E-MAIL UPSA", Type.UPSA_EMAIL);
            put("E-MAIL PERSONAL", Type.PERSONAL_EMAIL);
            put("E-MAIL PERSONAL", Type.PERSONAL_EMAIL);
            put("PHONE NUMBER", Type.PHONE);
            put("RECRUITER ENGLISH LEVEL", Type.RECRUITER_ENGLISH);
        }};
    }

    public Type define(String name) {
        return mapping.get(name.toUpperCase().trim());
    }
}
