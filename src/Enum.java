public class Enum {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {

        // Opção 01
        Level myVar = Level.LOW;
        System.out.println(myVar);
        /*
        // Opção 02
        Level myVar = Level.HIGH;

        switch (myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

        // Percorrendo um Enum
        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }
    */    
    }
}