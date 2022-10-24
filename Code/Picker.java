package Code;

import Code.PlayingField.Field;
import Code.PlayingField._2Tower;

public class Picker {

    private Field field;


    public void LandedField(SumOfDice sumOfDice){


        int landedNumber = sumOfDice.getSum();

        switch (landedNumber){
            case 2:
                field = new _2Tower();
                field.response();
                field.message();
                break;
        }




    }



}
