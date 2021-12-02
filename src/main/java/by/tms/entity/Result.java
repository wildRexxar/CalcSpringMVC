package by.tms.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Result {
    private int id;
    private double num1;
    private double num2;
    private double result;
    private String action;

    @Autowired
    public Result(){}

    public Result(int id, double num1, double num2, double result, String action) {
        this.id = id;
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
        this.action = action;
    }


    public void setId(int id) {
        this.id = id;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
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
