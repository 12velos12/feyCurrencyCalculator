public class FeyDenominationValues {
    private static final int pixieDustToMilkTeeth = 8;
    private static final int dreamShardToPixieDust = 8;
    private static final int dreamShardToMilkTeeth = dreamShardToPixieDust * pixieDustToMilkTeeth;
    private static final int dreamShardToGold = 1000;

    public static int getDreamCrystalToGold() {
        return dreamShardToGold;
    }

    public static int getPixieDustToMilkTeeth() {
        return pixieDustToMilkTeeth;
    }

    public static int getDreamCrystalToPixieDust() {
        return dreamShardToPixieDust;
    }

    public static int getDreamCrystalToMilkTeeth() {
        return dreamShardToMilkTeeth;
    }
}