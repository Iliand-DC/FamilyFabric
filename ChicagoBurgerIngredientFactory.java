public class ChicagoBurgerIngredientFactory implements BurgerIngredientFactory{
    public Buns createBuns(){return new ChicagoBuns();}
}
