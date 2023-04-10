interface Animal2 {
    public void animmalSound();
    public void sleep();
}

class Pig2 implements Animal2 {
    public void animmalSound() {
        System.out.println("The pig says: wee wee 2x");
    }
    public void sleep() {
        System.out.println("Zzz 2x");
    }
}

class Main2 {
    public static void main(String[] args) {
        Pig2 myPig2 = new Pig2();
        myPig2.animmalSound();
        myPig2.sleep();
    }
}