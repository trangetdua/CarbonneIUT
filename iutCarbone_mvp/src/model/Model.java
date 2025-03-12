package model;

public class Model {
    private Data data;
    private double co2Min;
    private double co2Max;

    public Model() {
        data = new Data();
        co2Min = 0.0;
        co2Max = 0.0;
    }

    public void add (int transportMode) {
        co2Min += data.getCo2Min(transportMode);
        co2Max += data.getCo2Max(transportMode);
    }

    public double getCo2Min() {
        return co2Min;
    }

    public double getCo2Max(){
        return co2Max;
    }

    public void init(){
        co2Min = 0.0;
        co2Max = 0.0;
    }
}
