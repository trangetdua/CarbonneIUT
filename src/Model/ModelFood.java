package Model;

public class ModelFood {
    public enum Meal { VEGAN, VEGETARIEN, BOEUF, AUTRE_VIANDE_POISSON };

    public int getNbVegan() {
        return nbVegan;
    }

    public void setNbVegetarien(int nbVegetarien) {
        this.nbVegetarien = nbVegetarien;
    }

    public void setNbBoeuf(int nbBoeuf) {
        this.nbBoeuf = nbBoeuf;
    }

    public void setNbVegan(int nbVegan) {
        this.nbVegan = nbVegan;
    }

    public void setNbAutreViandePoisson(int nbAutreViandePoisson) {
        this.nbAutreViandePoisson = nbAutreViandePoisson;
    }

    public int getNbVegetarien() {
        return nbVegetarien;
    }

    public int getNbBoeuf() {
        return nbBoeuf;
    }

    public int getNbAutreViandePoisson() {
        return nbAutreViandePoisson;
    }

    private static double getCO2(Meal m) {
        switch (m) {
            case VEGAN: return 0.4;
            case VEGETARIEN: return 0.5;
            case AUTRE_VIANDE_POISSON: return 1.1;
            case BOEUF: return 7;
            default: return 0;
        }
    }

    private int nbVegan, nbVegetarien, nbBoeuf, nbAutreViandePoisson;

    public void init() {}
    public void addMeals(Meal m, int q) {}
    public double computeCO2() { return 0.0; }
}
