package src.chapter5;

public class Exercise7 {

    public static void main(String... args) {
        new Two().printAge();
        new Two().printAge2();
    }
}

class One {
    public static int getAge() {
        return 1;
    }

    public void printAge() {
        System.out.println("I am " + this.getAge() + " year(s) old.");
    }
}
class Two extends One {
    public static int getAge() {
        return 2;
    }

    public void printAge2() {
        System.out.println("I am " + this.getAge() + " year(s) old.");
    }
}
