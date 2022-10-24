package Code.PlayingField;

import Code.Languages.Text;

public class _9HutsInTheMountain extends Field {
    @Override
    public int response() {
        int fieldPoints = 60;


        return fieldPoints;
    }

    @Override
    public void message() {

        Text text = new Text();

        text.PickLanguage(9);
    }
}
