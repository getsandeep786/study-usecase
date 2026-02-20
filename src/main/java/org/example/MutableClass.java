package org.example;

import java.util.Map;

public class MutableClass {

    private String name;

    public String getName() {
        return name;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    private Map<String, String> metadata;

    public MutableClass(String name, Map<String, String> metadata) {
        this.name = name;
        this.metadata = metadata;
    }

}
