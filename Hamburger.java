public class Hamburger extends Burger{
    BurgerIngredientFactory ingredientFactory;
    public Hamburger(BurgerIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    void prepare(){
        System.out.println("Готовим " + name);
        buns = ingredientFactory.createBuns();
    }
}
