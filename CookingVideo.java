import java.util.ArrayList;

public class CookingVideo extends Video implements CookingVideos{
    private Recipe  recipe;

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public CookingVideo() {
        super();
        this.recipe = new Recipe();
    }

    public CookingVideo(String title, double durationInMinutes, int views, int likes, double watchTime, Recipe recipe) {
        super(title, durationInMinutes, views, likes, watchTime);
        this.recipe = recipe;
    }

    @Override
    public String[] getIngredientsList() {
        return this.recipe.getIngredients().split(",");
    }

    @Override
    public Recipe getCookingRecipe() {
        return this.recipe;
    }

    @Override
    public void printRecipe() {
        System.out.print("\"Dish: " + recipe.getRecipeName() + ".\nIngredients: ");
        String[] ingredients = getIngredientsList();
        for (String ingredient : ingredients)
            System.out.println(ingredient + ".");
        System.out.println("Directions: "+ recipe.getInstructions() + ".");
        System.out.println("Prep Time: " + recipe.getPrepTime() +  " minutes.");
        System.out.println("Cooking time: " + recipe.getCookTime() +  " minutes.");
        System.out.println("Serving size: " + recipe.getServings() +  ".");
    }
}
