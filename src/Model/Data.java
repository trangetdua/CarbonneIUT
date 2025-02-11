package Model;

import java.util.Hashtable;

public class Data {
    private static final int voiture = 1;
    private static final int co_voiturage = 2;
    private static final int velo = 3;
    private static final int transport_commun = 4;
    private static final int autre = 5;

    private Hashtable<Integer, Double> co2Min;
    private Hashtable<Integer, Double> co2Max;

    public double getCo2Min(int key) {
        if (co2Min.contains(key)) {
            return co2Min.get(key);
        } else {
            throw new IllegalArgumentException("erreur");
        }
    }

    public double getCo2Max(int key) {
        if (co2Max.contains(key)) {
            return co2Max.get(key);
        } else {
            throw new IllegalArgumentException("erreur");
        }
    }

    public Data(){
        co2Min = new Hashtable<>();
        co2Max = new Hashtable<>();

        co2Min.put(voiture, 4.5);
        co2Max.put(voiture,20.0);

        co2Min.put(co_voiturage, 2.0);
        co2Max.put(co_voiturage, 10.0);

        co2Min.put(velo, 0.001);
        co2Max.put(velo, 0.22);

        co2Min.put(transport_commun, 0.2);
        co2Max.put(transport_commun, 1.0);

        co2Min.put(autre, 0.0);
        co2Max.put(autre, 20.0);
    }

}
