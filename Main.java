public class Main {
    public static void main(String[] args){
        BurgerStore store = new NYBurgerStore();
        store.orderBurger("Cheeseburger");
        store = new ChicagoBurgerStore();
        store.orderBurger("Hamburger");
    }
}
