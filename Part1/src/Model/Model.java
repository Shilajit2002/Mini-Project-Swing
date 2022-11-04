package Model;

public class Model {

    //  Default Constructor
    public Model() {
        //  Create Football Player Object
        FootballPlayer F1 = new FootballPlayer(2, "Marcus Allen", "S",
                new Height(6, 2), 209, "Upper Marlboro, Md.");
        FootballPlayer F2 = new FootballPlayer(37, "Kyle Alston", "CB",
                new Height(5, 9), 180, "Robbinsville, N.J.");
        FootballPlayer F3 = new FootballPlayer(28, "Troy Apke", "S",
                new Height(6, 1), 198, "Mt. Lebanon, Pa.");

        //  Check the Height format is correct or not
        if (heightChecker(F1) && heightChecker(F2) && heightChecker(F3)) {
            //  Check First Player is Taller or not
            if (CompareTo(F1, F2) && CompareTo(F1, F3)) {
                System.out.println(F1.getName() + " is Taller");
                System.out.println("Height : " + F1.getHeight().toString());
            }
            //  Check Second Player is Taller or not
            else if (CompareTo(F2, F3) && CompareTo(F2, F1)) {
                System.out.println(F2.getName() + " is Taller");
                System.out.println("Height : " + F2.getHeight().toString());
            }
            //  Check Third Player is Taller or not
            else if (CompareTo(F2, F3) && CompareTo(F2, F1)) {
                System.out.println(F3.getName() + " is Taller");
                System.out.println("Height : " + F3.getHeight().toString());
            }
            //  If Heights are Equal
            else {
                //  First & Second & Third Players all are Equal Height
                if (Equals(F1, F2) && Equals(F2, F3)) {
                    System.out.println(F1.getName() + " & " + F2.getName() + " & "
                            + F3.getName() + " All are Equal Height");
                    System.out.println("Height : " + F1.getHeight().toString());
                }
                //  First & Second Player both are Equal Height
                else if (Equals(F1, F2)) {
                    System.out.println(F1.getName() + " & " + F2.getName() + " Both are Equal Height");
                    System.out.println("Height : " + F1.getHeight().toString());
                }
                //  Second & Third Player both are Equal Height
                else if (Equals(F2, F3)) {
                    System.out.println(F2.getName() + " & " + F3.getName() + " Both are Equal Height");
                    System.out.println("Height : " + F2.getHeight().toString());
                }
                //  First & Third Player both are Equal Height
                else {
                    System.out.println(F1.getName() + " & " + F3.getName() + " Both are Equal Height");
                    System.out.println("Height : " + F3.getHeight().toString());
                }
            }
        }
        //  If the Height format is wrong
        else {
            System.out.println("Enter Correct Height");
        }
    }

    //  Check Height Format
    public boolean heightChecker(Object A) {
        FootballPlayer X = (FootballPlayer) A;

        if (X.getHeight().getFeet() < 1 || X.getHeight().getInches() < 0 || X.getHeight().getInches() > 12) {
            return false;
        }
        return true;
    }

    //  Compare the Height Between Two Object
    public boolean CompareTo(Object A, Object B) {
        FootballPlayer X = (FootballPlayer) A;
        FootballPlayer Y = (FootballPlayer) B;

        int inchesX = (X.getHeight().getFeet() * 12) + (X.getHeight().getInches());
        int inchesY = (Y.getHeight().getFeet() * 12) + (Y.getHeight().getInches());

        if (inchesX > inchesY) {
            return true;
        }
        return false;
    }

    //  Compare the Height is Equal or Not
    public boolean Equals(Object A, Object B) {
        FootballPlayer X = (FootballPlayer) A;
        FootballPlayer Y = (FootballPlayer) B;

        int inchesX = (X.getHeight().getFeet() * 12) + (X.getHeight().getInches());
        int inchesY = (Y.getHeight().getFeet() * 12) + (Y.getHeight().getInches());

        if (inchesX == inchesY) {
            return true;
        }
        return false;
    }
}