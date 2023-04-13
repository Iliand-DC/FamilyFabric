public abstract class Burger {
    String name;
    Buns buns;
    String cutlets;
    String sauce;
    public String getName(){return this.name;}
    public void setName(String type){this.name = type;}
    abstract void prepare();
    void assemble(){System.out.println("Собираем бургер");}
    void box(){System.out.println("Упаковываем бургер");}
}
