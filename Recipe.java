public final class Recipe implements Cloneable{
    private final String  recipeName;
    private final String  ingredients;
    private final String  instructions;
    private final int     prepTime;
    private final int     cookTime;
    private final int     servings;

    public Recipe() {
        this.recipeName = "Pecan Pie";
        this.ingredients = "Pecan,Flour,Water";
        this.instructions = " Pour water on top of flour. Mix thoroughly." +
                " Add pecans. Bake for 30 minutes.";
        this.prepTime = 15;
        this.cookTime = 30;
        this.servings = 4;
    }
    //Recipe r = new Recipe();
    //Recipe r1 = new Recipe();

    public Recipe(String recipeName, String ingredients, String instructions,
                  int prepTime, int cookTime, int servings) {
        this.recipeName = recipeName;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.prepTime = prepTime;
        this.cookTime = cookTime;
        this.servings = servings;
    }

    //we comment setters because they are not allowed in immutable class.
    public String getRecipeName() {
        return recipeName;
    }

    /*public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }*/

    public String getIngredients() {
        return ingredients;
    }

    /*public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }*/

    public String getInstructions() {
        return instructions;
    }

    /*public void setInstructions(String instructions) {
        this.instructions = instructions;
    }*/

    public int getPrepTime() {
        return prepTime;
    }

    /*public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }*/

    public int getCookTime() {
        return cookTime;
    }

    /*public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }*/

    public int getServings() {
        return servings;
    }



    /*public void setServings(int servings) {
        this.servings = servings;
    }*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
