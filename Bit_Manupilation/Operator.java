package Bit_Manupilation;

import Practice.BinaryConversion;

import java.text.DecimalFormat;

public class Operator {
    public static void main(String[] args) {
    String binaryString = "1010101";
    int a = 25>>1;
        System.out.println(a);// this is the actual binary
    int decimalValue = Integer.parseInt(binaryString, 2); // convert to decimal

    int lastBit = decimalValue ^1; // get the last bit

        System.out.println("Decimal: " + decimalValue);
        System.out.println("Last Bit: " + lastBit); // prints 1 if odd, 0 if even
        System.out.println(BinaryConversion.binary(21));
}}
