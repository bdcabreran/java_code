/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellowolrd;

import java.io.Console;

/**
 *
 * @author Bayron Cabrera
 */
public class HelloWolrd {

    /**
     * @param args the command line arguments
     */
    double doubleVal = 1555555522;
    float floatVal = 2.5512F;
    boolean boolFlag = true;
    char charVal1 = 'a';
    char charVal2 = 65;
    char scapeChar = '\n';

    public static void main(String[] args) { 
        /*Single Message*/
        System.out.println("Hello World in Java\r\n");
        
        /*Sum of String */
        String randomString = "I am a random string";
        String anotherString = "another String";
        String addStrings = randomString + ',' + anotherString;
        System.out.println(addStrings);
        
        byte byteVal = 65;
        short shortVal = 152;
        String byteString = Byte.toString(byteVal);
        String shortString = Short.toString(shortVal);
        System.out.println("Sting -> " + byteString);
        System.out.println("Sting -> " + shortString);

        /** cast values */
        double aDoubleVal = 3.1456326589523;
        int doubleToInt = (int)aDoubleVal;
        System.out.println("double -> " + aDoubleVal + ";  to int -> " + doubleToInt);
        byte StringToByte = Byte.parseByte(byteString);
        System.out.println("String: " + byteString + " to byte -> " + StringToByte); 


        /*Print maximum size  */
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE); 
    }
    
}
