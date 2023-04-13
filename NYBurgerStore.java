public class NYBurgerStore extends BurgerStore{
    public Burger createBurger(String type){
        Burger burger = null;
        BurgerIngredientFactory ingredientFactory = new NYBurgerIngredientFactory();
        if (type.equals("Cheeseburger")){
            burger = new Cheeseburger(ingredientFactory);
            burger.setName("Нью-Йоркский чизбургер");
        }
        else if (type.equals("Hamburger")){
            burger = new Hamburger(ingredientFactory);
            burger.setName("Нью-Йоркский гамбургер");
        }
        return burger;
    }
}