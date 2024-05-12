package BigDecimalOperations;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
            BigDecimal bd = new BigDecimal("4.2223455");
            double data =acceptsBigDecimalReturnsDouble(bd);
            BigDecimal data2 = acceptsBigDecimalReturnsBigDecimal(bd);
        System.out.println(data2);
    }
    public static double acceptsBigDecimalReturnsDouble(BigDecimal bigDec) {
     //   Using the BigDecimal documentation, create a method that accepts a BigDecimal and returns a double of
      //  the BigDecimal number rounded to the nearest hundredth. For example, 4.2545 should return 4.25.
if (bigDec == null) {
    System.out.println("it has to be a bigDecimal");

}
        assert bigDec != null;
        return bigDec.setScale(2, RoundingMode.HALF_UP).doubleValue();



    }
   // Using the BigDecimal documentation, create a method that accepts a BigDecimal, reverses the sign
         //   (if the parameter is positive, the result should be negative and vice versa),
   // rounds the number to the nearest tenth and returns the result. For example,
    //1.2345 should return -1.2 and -45.67 should return 45.7.

    public static BigDecimal acceptsBigDecimalReturnsBigDecimal(BigDecimal bigDec) {
        if (bigDec == null) {
            System.out.println("it has to be a bigDecimal");
        }
        assert bigDec != null;
        BigDecimal negative = bigDec.negate();
        return negative.setScale(1, RoundingMode.HALF_UP);
    }
}
