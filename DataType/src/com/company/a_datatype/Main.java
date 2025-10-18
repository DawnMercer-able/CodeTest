package com.company.a_datatype;

public class Main {

    public static void main(String[] args) {

        // 四大整数类型
        byte num1 = 1;
        short num2 = 2;
        int num3 = 3;
        long num4 = 4;

        // 两大浮点型
        float num5 = 1.1655f;
        double num6 = 14.2631;

        // 一个布尔型
        boolean tf = true;
        // 一个字符型
        char word = 'A' ;

        DataType dataType = new DataType();

        dataType.setByteValue(num1);

        dataType.getByte();

        System.out.println(Byte.MAX_VALUE);

        // 获取各类型的最大值
        System.out.println("获取各类型的最大值:");
        byte maxByte = dataType.getByte().getMax();
        short maxShort = dataType.getShort().getMax();
        int maxInt = dataType.getInt().getMax();
        long maxLong = dataType.getLong().getMax();

        System.out.println("Byte最大值: " + maxByte);
        System.out.println("Short最大值: " + maxShort);
        System.out.println("Int最大值: " + maxInt);
        System.out.println("Long最大值: " + maxLong);

        // 获取各类型的最小值
        System.out.println("获取各类型的最小值:");
        byte minByte = dataType.getByte().getMin();
        short minShort = dataType.getShort().getMin();
        int minInt = dataType.getInt().getMin();
        long minLong = dataType.getLong().getMin();

        System.out.println("Byte最大值: " + minByte);
        System.out.println("Short最大值: " + minShort);
        System.out.println("Int最大值: " + minInt);
        System.out.println("Long最大值: " + minLong);


    }
}
