package com.example.multiplicationgame.model;

import java.util.Random;

/**
 * vars 2numbers,result
 * 1-generate random numbers from 0-99
 * 2-generate result
 */
public class Calculate {
    private final int upper = 20;
    private int num1;
    private int num2;
    private int ansTest;
    private int ans;
    private int resStatus;




    public Calculate() {
    }

    /**
     * Locally choose num1,num2
     */
    public void generateRandom() {
        Random random = new Random();
        num1 = random.nextInt(upper);
        num2 = random.nextInt(upper);
    }

    /**
     * Locally choose res
     */
    public void calculateResult() {
        double result = num1 * num2;
        double bias = Math.random() < 0.5 ? new Random().nextInt(10) : 0;
        ans = (int) (result + bias);
        ansTest = ans;
        resStatus = bias != 0 ? 0 : 1;
    }


    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getAns() {
        return ans;
    }

    public int getResStatus() {
        return resStatus;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int getAnsTest() {
        return ansTest;
    }

}