package Code;

import Code.PlayingField.*;

public class Picker {

    private Field field;


    public void LandedField(SumOfDice sumOfDice){


        int landedNumber = sumOfDice.getSum();

        switch (landedNumber){
            case 2:
                field = new _2Tower();

                System.out.println(field.response());
                field.message();
                break;
            case 3:
                field = new _3Crater();

                System.out.println(field.response());
                field.message();
                break;
            case 4:
                field = new _4PalaceGates();

                System.out.println(field.response());
                field.message();
                break;
            case 5:
                field = new _5ColdDesert();

                System.out.println(field.response());
                field.message();
                break;
            case 6:
                field = new _6WalledCity();

                System.out.println(field.response());
                field.message();
                break;
            case 7:
                field = new _7Monastery();

                System.out.println(field.response());
                field.message();
                break;
            case 8:
                field = new _8BlackCave();

                System.out.println(field.response());
                field.message();
                break;
            case 9:
                field = new _9HutsInTheMountain();

                System.out.println(field.response());
                field.message();
                break;
            case 10:
                field = new _10WerewolfWall();

                System.out.println(field.response());
                field.message();
                break;
            case 11:
                field = new _11ThePit();

                System.out.println(field.response());
                field.message();
                break;
            case 12:
                field = new _12Goldmine();

                System.out.println(field.response());
                field.message();
                break;

        }




    }



}
