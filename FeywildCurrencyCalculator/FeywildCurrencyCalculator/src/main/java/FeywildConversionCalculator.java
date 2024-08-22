public abstract class FeywildConversionCalculator {
    private static double goldToFeyConversion = .064;

//    public void currencyExchangeGoldToFeywildMode(){
//        this.dreamCrystalGoldValue *= 1.1;
//        this.pixieDustGoldValue *= 1.1;
//        this.milkTeethGoldValue *= 1.1;
//    }
//
//    public void currencyExchangeFeywildToGoldMode(){
//        this.dreamCrystalGoldValue *= .9;
//        this.pixieDustGoldValue *= .9;
//        this.milkTeethGoldValue *= .9;
//    }

    public static String trueGoldToFeyCurrency(int goldDecimalAmount){
        double feyDecimalAmount = goldDecimalAmount * goldToFeyConversion;
        return FeyNumberConversion.decimalToFeyNum((int) feyDecimalAmount);
    }

    public static int trueFeyToGoldCurrency(String feyOctalAmount){
        int feyDecimalAmount = FeyNumberConversion.feyNumToDecimal(feyOctalAmount);
        return (int) (feyDecimalAmount/goldToFeyConversion);
    }

    public static int trueFeyToGoldCurrency(int feyOctalAmount) {
        return trueFeyToGoldCurrency(feyOctalAmount + "");
    }

//    public static String trueGoldToFeywildValue(double gp){
//
//    }
}