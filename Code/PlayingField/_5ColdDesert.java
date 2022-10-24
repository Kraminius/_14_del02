package Code.PlayingField;

import Code.Languages.Text;

public class _5ColdDesert extends Field {
    @Override
    public int response() {
        int fieldPoints = -20;





        return fieldPoints;
    }

    @Override
    public void message() {
        Text text = new Text();

        text.PickLanguage(5);
    }
}
