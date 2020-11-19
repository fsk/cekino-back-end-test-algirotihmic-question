package narsisticnumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class NarsisticNumbers {

    public static void main(String[] args) {

        boolean result = isNarsisticNumber(enteredNumber());
        
        if(result == true){
            System.out.println("This number is a narsistic number.");
        }else{
            System.out.println("This number is not a narsistic number.");
        }

    }

    public static String enteredNumber() {
        Scanner data = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        String numberString = data.next();
        String newNumberString = numberString.trim();
        return newNumberString;
    }

    public static boolean isNarsisticNumber(String number) {

        ArrayList<Character> numberTextList = new ArrayList<>();
        for (Character c : number.toCharArray()) {
            numberTextList.add(c);
        }

        ArrayList<Integer> numberIntegerList = new ArrayList<>();
        for (int i = 0; i < numberTextList.size(); i++) {
            numberIntegerList.add(Character.getNumericValue(numberTextList.get(i)));
        }

        Integer enteredNumber = Integer.parseInt(number);

        int pow = numberTextList.size();

        int result = 0;

        for (int i = 0; i < numberIntegerList.size(); i++) {
            result = result + getPow(numberIntegerList.get(i), pow);
        }

        if (result == enteredNumber) {
            return true;
        } else {
            return false;
        }

    }
  

    public static int getPow(int a, int b) {
        if (a == 0 && b == 0) {
            return -1;
        } else if (a == 1) {
            return 1;
        } else if (b == 0) {
            return 1;
        } else {
            return a * getPow(a, b - 1);
        }
    }

}
