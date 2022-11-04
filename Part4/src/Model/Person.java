package Model;

public class Person {
    //  Instance Variable
    private String name;
    private Height height;
    private int weight;
    private String hometown;
    private String highSchool;

    //  Default Constructor
    public Person() {
        name = "";
        new Height(0,0);
        weight = 0;
        hometown = "";
        highSchool = "";
    }

    //  Parameterized Constructor
    public Person(String name, Height height, int weight, String hometown, String highSchool) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hometown = hometown;
        this.highSchool = highSchool;
    }

    // Mutator & Accessor Method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    // ToString Method
    @Override
    public String toString() {
        return "Name = " + name + '\n' +
                "Height = " + height + '\n' +
                "Weight = " + weight + '\n' +
                "Hometown = " + hometown + '\n' +
                "HighSchool = " + highSchool + '\n';
    }
}
