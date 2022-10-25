package Code;

import Code.PlayingField.*;

public class Picker {

    private Field field;
    private int turnPoints;


    public void LandedField(SumOfDice sumOfDice){


        int landedNumber = sumOfDice.getSum();

        switch (landedNumber){
            case 2:
                field = new _2Tower();

                this.turnPoints = field.response();
                field.message();
                break;
            case 3:
                field = new _3Crater();

                this.turnPoints = field.response();
                field.message();
                break;
            case 4:
                field = new _4PalaceGates();

                this.turnPoints = field.response();
                field.message();
                break;
            case 5:
                field = new _5ColdDesert();

                this.turnPoints = field.response();
                field.message();
                break;
            case 6:
                field = new _6WalledCity();

                this.turnPoints = field.response();
                field.message();
                break;
            case 7:
                field = new _7Monastery();

                this.turnPoints = field.response();
                field.message();
                break;
            case 8:
                field = new _8BlackCave();

                this.turnPoints = field.response();
                field.message();
                break;
            case 9:
                field = new _9HutsInTheMountain();

                this.turnPoints = field.response();
                field.message();
                break;
            case 10:
                field = new _10WerewolfWall();

                this.turnPoints = field.response();
                field.message();
                break;
            case 11:
                field = new _11ThePit();

                this.turnPoints = field.response();
                field.message();
                break;
            case 12:
                field = new _12Goldmine();

                this.turnPoints = field.response();
                field.message();
                break;

        }




    }

    public int getTurnPoints() {
        return turnPoints;
    }
}
