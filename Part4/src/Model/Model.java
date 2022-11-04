package Model;

import java.util.ArrayList;

public class Model {

    //  Create FootballPlayerData Object
    private FootballPlayerData fpData = new FootballPlayerData();

    //  Default Constructor
    public Model() {
        System.out.println("=============================================================");

        //  Print Table Size
        System.out.println("The Table Size is " + fpData.getTable().size());

        System.out.println("=============================================================");

        //  Print Attribute Names
        this.displayArray(fpData.getHeaders());
        //  Print 4 Line Football Player Data
        this.displayArray(fpData.getLine(4));

        System.out.println("=============================================================");

        //  Print Attribute Names
        this.displayArray(fpData.getHeaders());
        //  Print 121 Line Football Player Data
        this.displayArray(fpData.getLine(121));

        System.out.println("=============================================================");

        //  Print 70 Line to 72 Line Football Player Data
        this.displayArrayOfArrays(fpData.getLines(70, 72));
        System.out.println("=============================================================");

        //  Print 100 Line to 101 Line Football Player Data
        this.displayArrayOfArrays(fpData.getLines(100, 101));

        System.out.println("=============================================================");
        System.out.println("=============================================================");

        //  Print Table Size
        System.out.println("The Table Size is " + fpData.getTable().size());
    }

    //  ArrayList of ArrayList display Method for Many Lines Player
    public void displayArrayOfArrays(ArrayList<ArrayList<String>> manyLines) {
        for (int i = 0; i < manyLines.size(); i++) {
            displayArray(manyLines.get(i));
        }
    }

    //  ArrayList display Method for One Line Player
    public void displayArray(ArrayList<String> oneLineOnly) {
        for (int k = 0; k < oneLineOnly.size(); k++) {
            System.out.print(oneLineOnly.get(k));
            System.out.print(" ");
        }
        System.out.println("");
    }

    //  @return the fpData
    public FootballPlayerData getFpData() {
        return fpData;
    }

    //  @param fpData the fpData to set
    public void setFpData(FootballPlayerData fpData) {
        this.fpData = fpData;
    }
}