public abstract class BurgerStore {
    public abstract Burger createBurger(String type);
    public Burger orderBurger(String type){
        Burger burger;
        burger = createBurger(type);
        burger.prepare();
        burger.buns.describe();
        burger.assemble();
        burger.box();
        return burger;
    }
}

