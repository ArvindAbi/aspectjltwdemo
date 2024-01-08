package com.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestModel2 {
    
    private String field1;

    @TestAnnotation
    private Integer field2;

    @TestAnnotation
    private boolean field3;

    private Double field4;
}
