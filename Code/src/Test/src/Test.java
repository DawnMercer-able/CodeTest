package Test.src;

import com.company.DataType;

public class Test {
    public static void main(String[] args) {

        DataType dataType = new DataType();

        Byte abyte = 1;

        dataType.setByte(abyte);

        Byte abyte1 = dataType.getByte();

        System.out.println(abyte);
    }
}
