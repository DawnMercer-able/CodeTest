package Test.src;

import com.company.a_datatype.DataType;

public class a_DataTest {
    public static void main(String[] args) {

        DataType dataType = new DataType();

        Byte abyte = 1;

        dataType.setByteValue(abyte);

        Byte abyte1 = dataType.getByteValue();

        System.out.println(abyte);
    }
}
