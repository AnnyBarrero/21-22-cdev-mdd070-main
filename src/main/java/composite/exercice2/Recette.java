package composite.exercice2;

import java.util.HashMap;
import java.util.Map;

public class Recette implements  CookComponent{
    /*private Map<Ingredient, Double> ingredients = new HashMap<>();
    private Map<Recette, Double> sousRecettes = new HashMap<>();*/
    private  Map<CookComponent, Double> components = new HashMap<>();

    public void add(double quantite, Ingredient ingredient) {
        components.put(ingredient, quantite);
    }

    public void addSousRecette(double quantite, Recette recette) {
        components.put(recette, quantite);
    }

    @Override
    public double getPrix() {
        double prixTotal = 0;
        for (Map.Entry<CookComponent, Double> mapIngredientsPizza : components.entrySet()) {
            CookComponent ingredientDePizza = mapIngredientsPizza.getKey();
            Double quantiteIngredientPizza =  mapIngredientsPizza.getValue();
            prixTotal += ingredientDePizza.getPrix() = quantiteIngredientPizza;
        }
        return prixTotal;
    }

}
