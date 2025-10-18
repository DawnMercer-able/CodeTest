package com.company.a_datatype;

public class DataType {
    private byte Byte;
    private short Short;
    private int Int;
    private long Long;

    // 构造函数
    public DataType() {}

    public DataType(byte byteVal, short shortVal, int intVal, long longVal) {
        this.Byte = byteVal;
        this.Short = shortVal;
        this.Int = intVal;
        this.Long = longVal;
    }

    // Getter/Setter 方法
    public byte getByteValue() {
        return Byte;
    }

    public void setByteValue(byte value) {
        this.Byte = value;
    }

    public short getShortValue() {
        return Short;
    }

    public void setShortValue(short value) {
        this.Short = value;
    }

    public int getIntValue() {
        return Int;
    }

    public void setIntValue(int value) {
        this.Int = value;
    }

    public long getLongValue() {
        return Long;
    }

    public void setLongValue(long value) {
        this.Long = value;
    }

    // 类型操作器获取方法
    public ByteOperator getByte() {
        return new ByteOperator(this.Byte);
    }

    public ShortOperator getShort() {
        return new ShortOperator(this.Short);
    }

    public IntOperator getInt() {
        return new IntOperator(this.Int);
    }

    public LongOperator getLong() {
        return new LongOperator(this.Long);
    }

    // 字节类型操作器
    public static class ByteOperator {
        private final byte value;

        public ByteOperator(byte value) {
            this.value = value;
        }

        public byte getMax() {
            return java.lang.Byte.MAX_VALUE;
        }

        public byte getMin() {
            return java.lang.Byte.MIN_VALUE;
        }

        public int getSize() {
            return java.lang.Byte.SIZE;
        }

        public byte getValue() {
            return value;
        }
    }

    // 短整型操作器
    public static class ShortOperator {
        private final short value;

        public ShortOperator(short value) {
            this.value = value;
        }

        public short getMax() {
            return java.lang.Short.MAX_VALUE;
        }

        public short getMin() {
            return java.lang.Short.MIN_VALUE;
        }

        public int getSize() {
            return java.lang.Short.SIZE;
        }

        public short getValue() {
            return value;
        }
    }

    // 整型操作器
    public static class IntOperator {
        private final int value;

        public IntOperator(int value) {
            this.value = value;
        }

        public int getMax() {
            return java.lang.Integer.MAX_VALUE;
        }

        public int getMin() {
            return java.lang.Integer.MIN_VALUE;
        }

        public int getSize() {
            return java.lang.Integer.SIZE;
        }

        public int getValue() {
            return value;
        }
    }

    // 长整型操作器
    public static class LongOperator {
        private final long value;

        public LongOperator(long value) {
            this.value = value;
        }

        public long getMax() {
            return java.lang.Long.MAX_VALUE;
        }

        public long getMin() {
            return java.lang.Long.MIN_VALUE;
        }

        public int getSize() {
            return java.lang.Long.SIZE;
        }

        public long getValue() {
            return value;
        }
    }
}