package Model;

public class FootballPlayer extends Person {
    //  Instance Variable
    private int number;
    private String position;

    //  Default Constructor
    public FootballPlayer() {
        number = 0;
        position = "";
    }

    // Parameterized Constructor
    public FootballPlayer(int number, String name, String position, Height height,
                          int weight, String hometown, String highSchool) {
        super(name, height, weight, hometown, highSchool);
        this.number = number;
        this.position = position;
    }

    // Mutator & Accessor Method
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // ToString Method
    @Override
    public String toString() {
        return super.toString() +
                "Number = " + number + '\n' +
                "Position = " + position + '\n';
    }
}
