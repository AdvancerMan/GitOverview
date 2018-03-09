package com.company.test;

public class TestClassSecond {
    protected String field;

    public TestClassSecond() {
        field = "Hello World!";
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return this.field;
    }

    @Override
    public boolean equals(Object obj) {
        return this.field.equals(obj);
    }
}
