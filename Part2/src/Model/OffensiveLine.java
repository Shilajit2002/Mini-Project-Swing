package Model;

public class OffensiveLine {
    //  Instance Variables
    private FootballPlayer center;
    private FootballPlayer offensiveGuard;
    private FootballPlayer offensiveTackle;

    //  Default Constructor
    public OffensiveLine() {
    }

    //  Parameterized Constructor
    public OffensiveLine(FootballPlayer center, FootballPlayer offensiveGuard,
                         FootballPlayer offensiveTackle) {
        this.center = center;
        this.offensiveGuard = offensiveGuard;
        this.offensiveTackle = offensiveTackle;
    }

    //  Mutator & Accessor Method
    public FootballPlayer getCenter() {
        return center;
    }

    public void setCenter(FootballPlayer center) {
        this.center = center;
    }

    public FootballPlayer getOffensiveGuard() {
        return offensiveGuard;
    }

    public void setOffensiveGuard(FootballPlayer offensiveGuard) {
        this.offensiveGuard = offensiveGuard;
    }

    public FootballPlayer getOffensiveTackle() {
        return offensiveTackle;
    }

    public void setOffensiveTackle(FootballPlayer offensiveTackle) {
        this.offensiveTackle = offensiveTackle;
    }

    //  Average Method
    public int averageWeight() {
        return (center.getWeight() + offensiveGuard.getWeight()
                + offensiveTackle.getWeight()) / 3;
    }

    //  ToString
    @Override
    public String toString() {
        return "------ Center Player ------\n" + center +
                "------ OffensiveGuard Player ------\n" + offensiveGuard +
                "------ OffensiveTackle Player ------\n" + offensiveTackle;
    }
}
