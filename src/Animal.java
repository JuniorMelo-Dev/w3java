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

