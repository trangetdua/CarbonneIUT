package Model;

import static org.junit.Assert.*;

public class ModelFoodTest {
    // Instance sur laquelle on va réaliser les tests
    private static ModelFood modelFood;

    // Code exécuté une unique fois avant tous les tests : instanciation du modèle
    @org.junit.BeforeClass
    public static void setUpBeforeClass() throws Exception {
        modelFood = new ModelFood ();
    }
    // Code exécuté avant chaque test : ré-initialisation du modèle
    @org.junit.Before
    public void setUp() throws Exception {
        modelFood.init();
    }

    // Test de la méthode `init`
    @org.junit.Test
    public void testInit() {
        assertEquals(0, modelFood.getNbBoeuf());
        assertEquals(0, modelFood.getNbAutreViandePoisson());
        assertEquals(0, modelFood.getNbVegan());
        assertEquals(0, modelFood.getNbVegetarien());

    }

    @org.junit.Test
    public void testaddMealsBoeuf1() {
        modelFood.addMeals(ModelFood.Meal.BOEUF, -1);
        assertEquals(0, modelFood.getNbBoeuf());
        assertEquals(0, modelFood.getNbAutreViandePoisson());
        assertEquals(0, modelFood.getNbVegan());
        assertEquals(0, modelFood.getNbVegetarien());

    }
    @org.junit.Test
    public void testaddMealsBoeuf2() {
        modelFood.addMeals(ModelFood.Meal.BOEUF,5);
        assertEquals(5, modelFood.getNbBoeuf());
        assertEquals(0, modelFood.getNbAutreViandePoisson());
        assertEquals(0, modelFood.getNbVegan());
        assertEquals(0, modelFood.getNbVegetarien());

    }

    @org.junit.Test
    public void testaddMealsVegan(){
        modelFood.addMeals(ModelFood.Meal.VEGAN,5);
        assertEquals(0, modelFood.getNbBoeuf());
        assertEquals(0, modelFood.getNbAutreViandePoisson());
        assertEquals(5, modelFood.getNbVegan());
        assertEquals(0, modelFood.getNbVegetarien());

    }
    @org.junit.Test
    public void testaddMealsVegetarien(){
        modelFood.addMeals(ModelFood.Meal.VEGETARIEN,5);
        assertEquals(0, modelFood.getNbBoeuf());
        assertEquals(0, modelFood.getNbAutreViandePoisson());
        assertEquals(0, modelFood.getNbVegan());
        assertEquals(5, modelFood.getNbVegetarien());

    }
    @org.junit.Test
    public void testaddMealsautre(){
        modelFood.addMeals(ModelFood.Meal.AUTRE_VIANDE_POISSON,5);
        assertEquals(0, modelFood.getNbBoeuf());
        assertEquals(5, modelFood.getNbAutreViandePoisson());
        assertEquals(0, modelFood.getNbVegan());
        assertEquals(0, modelFood.getNbVegetarien());
    }


    @org.junit.Test
   public void testcomputeCO2(){

        assertEquals(0, modelFood.getNbBoeuf());
        assertEquals(0, modelFood.getNbAutreViandePoisson());
        assertEquals(0, modelFood.getNbVegan());
        assertEquals(0, modelFood.getNbVegetarien());
        assertEquals(0, modelFood.computeCO2(),0.3);

    }



}