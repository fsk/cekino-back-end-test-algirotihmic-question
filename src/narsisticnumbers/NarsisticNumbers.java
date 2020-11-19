package narsisticnumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class NarsisticNumbers {

    public static void main(String[] args) throws Exception {

        boolean result = isNarsisticNumber(enteredNumber());

        if (result == true) {
            System.out.println(Colors.Red + "This number is a narsistic number.");
        } else {
            System.out.println(Colors.Red + "This number is not a narsistic number.");
        }

    }

    public static String enteredNumber() {
        Scanner data = new Scanner(System.in);
        System.out.print(Colors.Green + "Please enter a number: ");
        String numberString = data.next();
        String newNumberString = numberString.trim();
        return newNumberString;
    }

    public static boolean isNarsisticNumber(String number) throws Exception {

        if (number.contains(",") || number.contains(".")) {
            throw new Exception(Colors.Blue + "This is a invalid number. Float or Double numbers can not Narsistic Number.");
        }
        
        try{
            int i = Integer.parseInt(number.trim());
        }catch(IllegalArgumentException nfe){
            throw new NumberFormatException(Colors.Yellow + "This is not a number or This number is overbig.");
        }
        
        if(number.length() > 10){
            throw new Exception(Colors.Yellow + "This number is a overbig.");
        }

        int convertNumberForFirstControl = Integer.parseInt(number.trim());
        
        if (convertNumberForFirstControl < 0) {
            throw new Exception(Colors.Cyan + "This is a invalid number. Negative numbers can not Narsistic Numbers. ");
        }
        
        if(convertNumberForFirstControl == 0){
            throw new Exception(Colors.Cyan + "0 is not a Narsistic Number. Because 0 pow 0 = infinite");
        }

        
        if (convertNumberForFirstControl >= 1 && convertNumberForFirstControl <= 9) {
            return true;
        }

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
