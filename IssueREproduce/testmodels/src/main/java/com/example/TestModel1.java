package com.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestModel1 {

    @TestAnnotation
    private String field1;

    private Integer field2;

    private boolean field3;

    @TestAnnotation
    private Double field4;
    
}
