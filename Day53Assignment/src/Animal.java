public class Animal {
    private String name;
    private boolean isDog;

    

    public Animal() {
       
    }

    public Animal(String petname1) {
        this.name = petname1;
       
    }
    public Animal(boolean petdog1) {
        this.isDog = petdog1;
       
    }
    public Animal(String petname, boolean petdog) {
        this.name = petname;
        this.isDog = petdog;
    }

    public String getName() {
        return name;
    }

    public boolean getisdog() {
        return isDog;
    }

    public String toString() {
        String s;
        s = getName() + " is a dog = " + getisdog();
        return s;
    }
}
