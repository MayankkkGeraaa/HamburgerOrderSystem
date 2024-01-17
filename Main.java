public class Main {
    public static void main(String[] args) {
        Hamburger hamburger=new Hamburger("Basic","Sausage",3.56,"White");
        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition2("Cheese",1.12);
        System.out.println("Total burger price is: "+hamburger.itemizeHamburger());

        HealthyBurger burger=new HealthyBurger("Bacon",5.2);
        burger.addHamburgerAddition1("Tomato",0.27);
        burger.addHamburgerAddition2("Cheese",1.12);
        burger.addHealthyAddition1("Mayonaisse",0.5);
        System.out.println("Total burger price is: "+burger.itemizeHamburger());

        DeluxeBurger db=new DeluxeBurger();
        db.addHamburgerAddition1("Pasta",3);
        System.out.println("Total burger price is: "+db.itemizeHamburger());
    }
}
