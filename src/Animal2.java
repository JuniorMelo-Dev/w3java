interface Animal2 {
    public void animmalSound();
    public void sleep();
}

class Pig2 implements Animal2 {
    public void animmalSound() {
        System.out.println("The pig says: wee wee 2x");
    }
    public void sleep() {
        System.out.println("Zzz 3x");
    }
}

