package src.chapter5;

public class Exercise2 {

    public static void main(String[] args) {

    }

    public int age;

    public Exercise2(int age) {
        this.age = age;
    }
}

class Exercise extends Exercise2 {

    public Exercise() {
        super(1);
        System.out.println(this.age);
    }
}