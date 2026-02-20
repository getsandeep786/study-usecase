package org.example;

public class Walmart {

    public static void main(String ar[]){

        String str  = "Hello Madam How are you";

        String[] splitStr = str.split(" ");

        for(int i = 0 ; i<splitStr.length; i++){

            String current = splitStr[i];
            StringBuffer strBuf = new StringBuffer(current);
            String reversed = strBuf.reverse().toString();
            if(current.equalsIgnoreCase(reversed)){
                System.out.println("Its a palindrome string");
                String swapPalindrome = getSwappedMethod(reversed);
                System.out.println(swapPalindrome);
            }
        }

    }

    private static String getSwappedMethod(String reversed) {
        String swappedStr = "";
        for(int i=0; i<reversed.length(); i++){
            if(i+1 == reversed.length()){
                swappedStr += String.valueOf(reversed.charAt(i));
            }else{
                swappedStr += String.valueOf(reversed.charAt(i+1)) + String.valueOf(reversed.charAt(i));
                i++;
            }
        }
        return swappedStr;
    }
}
