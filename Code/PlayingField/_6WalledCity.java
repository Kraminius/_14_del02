package Code.PlayingField;

import Code.Languages.Text;

public class _6WalledCity extends Field {
    @Override
    public int response() {
        int fieldPoints = +180;





        return fieldPoints;
    }

    @Override
    public void message() {
        Text text = new Text();

        text.PickLanguage(6);
    }
}
