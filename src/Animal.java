abstract class Animal {
    public abstract void animmalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pig extends Animal {
    public void animmalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animmalSound();
        myPig.sleep();
    }
}