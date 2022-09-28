public class WolfTest {
    public static void main(String[] args){

        Wolf wolf1 = new Wolf();
        wolf1.gender = "male";
        wolf1.nickname = "Zion";
        wolf1.coloration = "Dark";
        wolf1.weight = 26.4;
        wolf1.age = 4;

        System.out.println("Wolf gender = " + wolf1.gender);
        System.out.println("Wolf nickname = " + wolf1.nickname);
        System.out.println("Wolf coloration = " + wolf1.coloration + " color");
        System.out.println("Wolf weight = " + wolf1.weight + " kg");
        System.out.println("Wolf age = " + wolf1.age + " years\n");
        wolf1.walk();
        wolf1.sit();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
    }
}