package Code.PlayingField;

import Code.Languages.Text;

public class _11ThePit extends Field {
    @Override
    public int response() {

        int fieldPoints = -50;


        return fieldPoints;
    }

    @Override
    public void message() {

        Text text = new Text();

        text.PickLanguage(11);
    }
}
