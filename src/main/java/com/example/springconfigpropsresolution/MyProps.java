package com.example.springconfigpropsresolution;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my-props")
@Data
public class MyProps {
    
    private String firstLevelProp;

    private final Nested nested = new Nested();
    private NestedCamelCaseNoFinal nestedCamelCaseNoFinal = new NestedCamelCaseNoFinal();
    private final NestedCamelCaseAndFinal nestedCamelCaseAndFinal = new NestedCamelCaseAndFinal();

    @Data
    private static class Nested {
        private String secondLevelProp;

    }
    @Data
    private static class NestedCamelCaseNoFinal {
        private String secondLevelProp;

    }
    @Data
    private static class NestedCamelCaseAndFinal {
        private String secondLevelProp;

    }
}
