package src.chapter5;

public class Exercise1 {

    public static void main(String[] args) {

    }

    public int age;

    public Exercise1(int age) {
        this.age = age;
    }
}

class Exercise extends Exercise1 {

    public Exercise() {
        super();
        System.out.println(this.age);
    }
}