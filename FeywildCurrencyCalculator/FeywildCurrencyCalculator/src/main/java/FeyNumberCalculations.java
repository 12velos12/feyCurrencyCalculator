public class FeyNumberCalculations {
    public static String addition(String feyNumOne, String feyNumTwo){
        int decNumOne = FeyNumberConversion.feyNumToDecimal(feyNumOne);
        int decNumTwo = FeyNumberConversion.feyNumToDecimal(feyNumTwo);
        int result = decNumOne + decNumTwo;

        return FeyNumberConversion.decimalToFeyNum(result);
    }

    public static String subtract(String feyNumOne, String feyNumTwo){
        int decNumOne = FeyNumberConversion.feyNumToDecimal(feyNumOne);
        int decNumTwo = FeyNumberConversion.feyNumToDecimal(feyNumTwo);
        int result = decNumOne - decNumTwo;

        return FeyNumberConversion.decimalToFeyNum(result);
    }

    public static String multiplication(String feyNumOne, String feyNumTwo){
        int decNumOne = FeyNumberConversion.feyNumToDecimal(feyNumOne);
        int decNumTwo = FeyNumberConversion.feyNumToDecimal(feyNumTwo);
        int result = decNumOne * decNumTwo;

        return FeyNumberConversion.decimalToFeyNum(result);
    }

//    private static FeyCurrencyBalance redenominate(FeyCurrencyBalance balance){ //Todo rebalance if one field is negative
//        double newMilkTeeth = balance.getMilkTeeth();
//        double newPixieDust = balance.getPixieDust();
//        double newDreamShards = balance.getDreamShards();
//
//        newPixieDust += Math.floor(newMilkTeeth/FeyDenominationValues.getPixieDustToMilkTeeth());
//        newMilkTeeth = newMilkTeeth%FeyDenominationValues.getPixieDustToMilkTeeth();
//        newDreamShards += Math.floor(newPixieDust/FeyDenominationValues.getDreamCrystalToPixieDust());
//        newPixieDust = newPixieDust%FeyDenominationValues.getDreamCrystalToPixieDust();
//
//        return new FeyCurrencyBalance((int) newDreamShards,(int) newPixieDust,newMilkTeeth);
//    }
}