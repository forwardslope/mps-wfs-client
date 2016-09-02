package com.fsi.geomap.mps.wfsclient;

import java.util.HashMap;
import java.util.Map;

public enum ResultType {
    RESULTS("results"),
    HITS("hits");

    private static final Map<String, ResultType> fromXml = new HashMap<String, ResultType>();

    static {
        for(ResultType r : ResultType.values()) {
            index(r);
        }
    }

    private static void index(ResultType resultType) {
        fromXml.put(resultType.xmlVal, resultType);
    }

    public static ResultType fromXml(String name) {
        return fromXml.get(name);
    }

    private final String xmlVal;

    ResultType(String xmlVal) {
        this.xmlVal = xmlVal;
    }

    public String getXmlName() {
        return xmlVal;
    }
}
