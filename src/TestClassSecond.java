public class TestClassSecond {
    protected String field;

    public TestClassSecond() {
        field = "Hello World!";
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
