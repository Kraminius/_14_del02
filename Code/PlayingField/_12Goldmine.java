package Code.PlayingField;

import Code.Languages.Text;

public class _12Goldmine extends Field {
    @Override
    public int response() {

        int fieldPoints = 650;


        return fieldPoints;
    }

    @Override
    public void message() {

        Text text = new Text();

        text.PickLanguage(12);

    }
}
