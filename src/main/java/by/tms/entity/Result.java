package by.tms.entity;

public class Result {
    private int id;
    private double num1;
    private double num2;
    private double result;
    private String action;

    public Result(int id, double num1, double num2, double result, String action) {
        this.id = id;
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
        this.action = action;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return num1 + " " + action + " " + num2 + " = " + result;
    }
}
