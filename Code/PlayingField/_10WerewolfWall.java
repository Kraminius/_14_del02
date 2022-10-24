package Code.PlayingField;

import Code.Languages.Text;

public class _10WerewolfWall extends Field {
    @Override
    public int response() {
        int fieldPoints = -80;


        return fieldPoints;
    }

    @Override
    public void message() {

        Text text = new Text();

        text.PickLanguage(10);

    }
}
