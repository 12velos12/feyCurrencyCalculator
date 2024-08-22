public class FeyCurrencyBalance {

    private int dreamShards;
    private int pixieDust;
    private double milkTeeth;

    public int getDreamShards() {
        return dreamShards;
    }
    public void setDreamShards(int dreamShards) {
        this.dreamShards = dreamShards;
    }

    public int getPixieDust() {
        return pixieDust;
    }
    public void setPixieDust(int pixieDust) {
        this.pixieDust = pixieDust;
    }

    public double getMilkTeeth() {
        return milkTeeth;
    }
    public void setMilkTeeth(double milkTeeth) {
        this.milkTeeth = milkTeeth;
    }

    public FeyCurrencyBalance(int dreamShards, int pixieDust, double milkTeeth){
        this.dreamShards = dreamShards;
        this.pixieDust = pixieDust;
        this.milkTeeth = milkTeeth;
    }
}