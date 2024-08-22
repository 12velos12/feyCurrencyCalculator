public abstract class FeyNumberConversion {
    private static final int feyNumBase = 8;

    public static String decimalToFeyNum(int decimalNum){ //TODO: fix so these accept negatives
        // array to store octal number
        String feyNum = "";

        // counter for octal number array
        while (decimalNum != 0) {
            // storing remainder in octal array
            feyNum += decimalNum % feyNumBase;
            decimalNum = decimalNum / feyNumBase;
        }

        return reverseString(feyNum);
    }

    public static int feyNumToDecimal(String feyNum){
        String reversedFeyNumString = reverseString(feyNum);
        int decimalNum = 0;

        for(int i = 0; i < reversedFeyNumString.length(); i++){
            decimalNum += Integer.parseInt(reversedFeyNumString.charAt(i) + "") * (Math.pow(feyNumBase,i));
        }

        return decimalNum;
    }

    private static String reverseString(String string){
        String reversedString = "";
        for(int i = string.length(); i > 0; i--){
            reversedString += string.charAt(i - 1);
        }

        return reversedString;
    }

}
