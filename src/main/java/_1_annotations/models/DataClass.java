package _1_annotations.models;

import lombok.Data;

import java.util.Map;

@Data
public class DataClass {
    private final Map<String, String> params;

    public String getParam(final String paramName) {
        return params.get(paramName);
    }
}
