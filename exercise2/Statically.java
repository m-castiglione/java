package exercise2;

public class Statically {
    //Once you have finished getting statistically.js to run, refactor the code here in Java.
    String jello = "Jello";
    static private String glue = "Epoxy";

    moveAndShake() {
        System.out.println("Never stagnate in life. Be agile, change, and improve...");
    }

    static stubborn() {
        moveAndShake();
        System.out.println("Please don't make me change... I just don't like it...");
    }
}
    static explain() {
        stubborn();

        System.out.println(System.out.println("In java, static means that it can be accessed without creating an object of the class, unlike public. In javascript, Static methods aren't called on instances of the class. Instead, they're called on the class itself."););
    }

    public static void main(String[] args) {
        Class stats = new Statically();

        stats.moveAndShake();
        stats.stubborn();
        stats.explain();

        System.out.println(stats.jello);
        System.out.println(stats.glue);
    }

