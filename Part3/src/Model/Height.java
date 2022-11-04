package Model;

public class Height {
    //  Instance Variable
    private int feet;
    private int inches;

    //  Default Constructor
    public Height() {
        feet = 0;
        inches = 0;
    }

    //  Parameterized Constructor
    public Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    //  Mutator & Accessor Method
    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    //  ToString Method
    @Override
    public String toString() {
        return feet + "'" + inches + "''";
    }
}
