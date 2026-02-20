package org.example;

import java.util.HashMap;
import java.util.Map;

public final class ImmutableClass {

    private final String name;

    private final Map<String, String> metadata;


    public Map<String, String> getMetadata() {
        //performing deep copy (so that data members/variables cannot be changed with the object reference)
        Map<String, String> tempMetadata = new HashMap<>();
        for(Map.Entry<String, String> entry: this.metadata.entrySet()){
            tempMetadata.put(entry.getKey(), entry.getValue());
        }
        return tempMetadata;
    }


    public ImmutableClass(String name, Map<String, String> metadata) {
        this.name = name;
        //performing deep copy (so that data members/variables cannot be changed with the object reference)
        Map<String, String> tempMetadata = new HashMap<>();
        for(Map.Entry<String, String> entry: metadata.entrySet()){
            tempMetadata.put(entry.getKey(), entry.getValue());
        }
        this.metadata = tempMetadata;
    }

    public String getName() {
        String cName = this.name;
        return cName;
    }
}
