package Code.PlayingField;


import Code.HandlePoints;
import Code.Player;

public class _2Tower extends Field {

    private HandlePoints handlePoints;

    @Override
    public int response() {

        int fieldPoints = 250;

        return fieldPoints;




    }

    @Override
    public void message() {

        String fieldsMessage = "You climb up the great tower and at the top is a nest with a golden egg in it!";

        System.out.println(fieldsMessage);

    }
}
