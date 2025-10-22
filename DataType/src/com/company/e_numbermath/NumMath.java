package com.company.e_numbermath;
import java.lang.Math;

public class NumMath {

    public static void main(String[] args) {


        int num = -100;

        int num1 = Math.abs(num);

        System.out.println(num1);

        double num2 = Math.random();

        System.out.println(num2);

        // 生成验证码的简单算法
        double randomNum = Math.random() * 1000000;

        System.out.println(randomNum);

        int num3 = (int) randomNum;

        System.out.println(num3);

        String outNum3 = String.format("%0" + 6 + "d" , num3);

        System.out.println(outNum3);
    }
}
