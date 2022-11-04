package Model;

public class Model {
    //  Default Constructor
    public Model() {
        //  Create Football Player Objects
        FootballPlayer F1 = new FootballPlayer(2, "Marcus Allen", "S", new Height(6, 2),
                209, "Upper Marlboro, Md.", "Dr. Henry A. Wise, Jr.");
        FootballPlayer F2 = new FootballPlayer(37, "Kyle Alston", "CB",
                new Height(5, 9), 180, "Robbinsville, N.J.", "Robbinsville");
        FootballPlayer F3 = new FootballPlayer(28, "Troy Apke", "S", new Height(6, 1),
                198, "Mt. Lebanon, Pa.", "Mount Lebanon");

        //  Create Offensive Line Object using 3 Football Player Objects
        OffensiveLine O = new OffensiveLine(F1, F2, F3);

        //  Print Offensive Line Player Details
        System.out.println(O.toString());

        //  Print Average Weight of Offensive Line 3 Player Details
        System.out.println("------------------\nAverage Weight of 3 Player = " + O.averageWeight());
    }
}