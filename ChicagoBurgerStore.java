public class ChicagoBurgerStore extends BurgerStore{
    public Burger createBurger(String type){
        Burger burger = null;
        BurgerIngredientFactory ingredientFactory = new ChicagoBurgerIngredientFactory();
        if (type.equals("Cheeseburger")){
            burger = new Cheeseburger(ingredientFactory);
            burger.setName("Чикаго чизбургер");
        }
        else if (type.equals("Hamburger")){
            burger = new Hamburger(ingredientFactory);
            burger.setName("Чикаго гамбургер");
        }
        return burger;
    }
}
