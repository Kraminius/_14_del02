package Code.PlayingField;

import Code.Languages.Text;

public class _4PalaceGates extends Field {
    @Override
    public int response() {
        int fieldPoints = +100;





        return fieldPoints;
    }

    @Override
    public void message() {
        Text text = new Text();

        text.PickLanguage(4);
    }
}
