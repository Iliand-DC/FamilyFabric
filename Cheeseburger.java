public class Cheeseburger extends Burger{
    BurgerIngredientFactory ingredientFactory;
    public Cheeseburger(BurgerIngredientFactory ingredeintFactory){
        this.ingredientFactory = ingredeintFactory;
    }
    void prepare(){
        System.out.println("Готовим " + name);
        buns = ingredientFactory.createBuns();
    }
}
