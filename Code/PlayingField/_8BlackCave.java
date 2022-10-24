package Code.PlayingField;

import Code.Languages.Text;

public class _8BlackCave extends Field {
    @Override
    public int response() {
        int fieldPoints = -70;


        return fieldPoints;
    }

    @Override
    public void message() {

        Text text = new Text();

        text.PickLanguage(8);

    }
}
