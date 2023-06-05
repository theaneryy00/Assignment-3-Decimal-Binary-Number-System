import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static String Dec2Bin(int n) {
        if (n == 0) {
            return "0";
        }

        List<Integer> binaryDigits = new ArrayList<>();

        while (n > 0) {
            binaryDigits.add(n % 2);
            n = n / 2;
        }

        Collections.reverse(binaryDigits);

        StringBuilder binaryString = new StringBuilder();
        for (int digit : binaryDigits) {
            binaryString.append(digit);
        }

        return binaryString.toString();
    }

    public static int Bin2Dec(String n, int d, int w) {
        int decimal = 0;
        int power = 0;

        for (int i = n.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(n.charAt(i));
            decimal += digit * Math.pow(d, power);
            power++;
        }

        return decimal;
    }

    public static void main(String[] args) {
   
        System.out.println("DEC2BIN");
        System.out.println("     65 in decimal is " + Dec2Bin(65));
        System.out.println("     100 in decimal is " +Dec2Bin(100));
        System.out.println("     5 in decimal is " +Dec2Bin(5));
        System.out.println("     25 in decimal is " +Dec2Bin(25));
        System.out.println("     10 in decimal is " +Dec2Bin(10) +'\n');

       
        System.out.println("BIN2DEC");
        System.out.println("     11111 in binary is "+Bin2Dec("11111", 2, 0));
        System.out.println("     10001 in binary is "+Bin2Dec("10001", 2, 0));
        System.out.println("     1010 in binary is "+Bin2Dec("1010", 2, 0));
        System.out.println("     11011 in binary is "+Bin2Dec("11011", 2, 0));
        System.out.println("     100 in binary is "+Bin2Dec("100", 2, 0));
    }
}

