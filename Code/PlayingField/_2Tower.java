package Code.PlayingField;


import Code.Game.HandlePoints;
import Code.Languages.Text;

public class _2Tower extends Field {

    private HandlePoints handlePoints;

    @Override
    public int response() {

        int fieldPoints = 250;

        return fieldPoints;




    }

    @Override
    public void message() {

        Text text = new Text();

        text.PickLanguage(2);


    }
}
