package com.company.process;

public class Process {

    public static void main(String[] args) {



        int num = 1;

        if( num == 1) {
            System.out.println("true!");
        } else {
            System.out.println("false!");
        }

        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            if( i == 5) {
                System.out.println(i);
                System.out.println("循环停止");
                break;
            }
        }

        for (int i = 1; i <= 6; i++) {
            if( i == 5) {
                System.out.println("跳过本次循环");
                continue;
            }
            System.out.println(i);
         }

        int i = 1;

        while (i < 10) {
            System.out.println(i);
            i++;
        }

        int j = 1;
        do{
            System.out.println(j);
            j++;
        } while (j < 10) ;
    }

}
