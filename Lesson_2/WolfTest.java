public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.setGender("male");
        wolf1.setNickname("Zion");
        wolf1.setColoration("Dark");
        wolf1.setWeight(26.4);
        wolf1.setAge(7);

        System.out.println("Wolf gender = " + wolf1.getGender());
        System.out.println("Wolf nickname = " + wolf1.getNickname());
        System.out.println("Wolf coloration = " + wolf1.getColoration() + " color");
        System.out.println("Wolf weight = " + wolf1.getWeight() + " kg");
        System.out.println("Wolf age = " + wolf1.getAge() + " years\n");
        wolf1.walk();
        wolf1.sit();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
    }
}