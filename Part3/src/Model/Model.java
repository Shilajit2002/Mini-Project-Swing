package Model;

public class Model {
    //  Default Constructor
    public Model() {
        //  Create Football Player Objects
        FootballPlayer fp = new FootballPlayer(2, "Marcus Allen", "S",
                new Height(6, 2), 209,
                "Upper Marlboro, Md.", "Dr. Henry A. Wise, Jr.");

        //  Print the Attribute List
        System.out.println(fp.getAttributes().toString());
        System.out.println(fp.getAttributes().toString());  //  Yes, we are running
        //  getAttributes twice just to check it

        for (int i = 0; i < fp.getAttributes().size(); i++) {
            System.out.println(i + " = " + fp.getAttributeName(i) + " --> " + fp.getAttribute(i));
        }

        //  Print the Attribute Name List
        System.out.println(fp.getAttributeNames().toString());
        System.out.println(fp.getAttributeNames().toString());  //  Yes, we are running
        //  getAttributeNames twice just to check it
    }
}