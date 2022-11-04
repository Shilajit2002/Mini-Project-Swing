package Model;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.io.*;

public class FootballPlayerData implements TableData {
    //  FootballPlayer ArrayList
    private ArrayList<FootballPlayer> players;

    //  Default Constructor
    public FootballPlayerData() {
        players = new ArrayList<>();
        //  loadTable Method Call
        loadTable();
    }

    //  Read the Player Data from XML file
    public void ReadPlayersFromXML() {
        try {
            FootballPlayer fp;
            XMLDecoder decoder;
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("FootballPlayerTable.xml")));
            fp = new FootballPlayer();
            while (fp != null) {
                try {
                    fp = (FootballPlayer) decoder.readObject();
                    players.add(fp);
                } catch (ArrayIndexOutOfBoundsException theend) {
                    break;
                }
            }
            decoder.close();
        } catch (Exception xx) {
            xx.printStackTrace();
        }
    }

    //  loadTable Method
    @Override
    public void loadTable() {
        //  Call ReadPlayerFromXML Method for Read the Player Data from XML file
        ReadPlayersFromXML();
    }

    //  getTable data return the FootballPlayer Data as a Table
    @Override
    public ArrayList<FootballPlayer> getTable() {
        return players;
    }

    //  getHeaders return the FootballPlayer AttributeNames as List
    @Override
    public ArrayList<String> getHeaders() {
        FootballPlayer fp = new FootballPlayer();
        return fp.getAttributeNames();
    }

    //  getLine returns the FootballPlayer details of the particular Line
    @Override
    public ArrayList<String> getLine(int line) {
        return players.get(line).getAttributes();
    }

    //  getLines returns the First Line player to Last Line player details as a ArrayList of ArrayList
    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> A = new ArrayList<ArrayList<String>>();

        //  Its add the FirstLine player to LastLine player data in the ArrayList of ArrayList
        for (int i = firstLine; i <= lastLine; i++) {
            A.add(getLine(i));
        }
        return A;
    }
}
