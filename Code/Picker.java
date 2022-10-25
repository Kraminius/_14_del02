package Code;

import Code.PlayingField.*;

public class Picker {

    private Field field;

    private boolean rolledExtraTurn;
    private int turnPoints;


    public boolean isRolledExtraTurn() {
        return rolledExtraTurn;
    }

    public void LandedField(SumOfDice sumOfDice){


        int landedNumber = sumOfDice.getSum();

        switch (landedNumber){
            case 2:
                field = new _2Tower();
                rolledExtraTurn = false;

                this.turnPoints = field.response();
                field.message();
                break;
            case 3:
                field = new _3Crater();
                rolledExtraTurn = false;

                this.turnPoints = field.response();
                field.message();
                break;
            case 4:
                field = new _4PalaceGates();
                rolledExtraTurn = false;

                this.turnPoints = field.response();
                field.message();
                break;
            case 5:
                field = new _5ColdDesert();
                rolledExtraTurn = false;

                this.turnPoints = field.response();
                field.message();
                break;
            case 6:
                field = new _6WalledCity();
                rolledExtraTurn = false;

                this.turnPoints = field.response();
                field.message();
                break;
            case 7:
                field = new _7Monastery();
                rolledExtraTurn = false;

                this.turnPoints = field.response();
                field.message();
                break;
            case 8:
                field = new _8BlackCave();
                rolledExtraTurn = false;

                this.turnPoints = field.response();
                field.message();
                break;
            case 9:
                field = new _9HutsInTheMountain();
                rolledExtraTurn = false;

                this.turnPoints = field.response();
                field.message();
                break;
            case 10:
                field = new _10WerewolfWall();
                rolledExtraTurn = true;

                this.turnPoints = field.response();
                field.message();
                break;
            case 11:
                field = new _11ThePit();
                rolledExtraTurn = false;

                this.turnPoints = field.response();
                field.message();
                break;
            case 12:
                field = new _12Goldmine();
                rolledExtraTurn = false;

                this.turnPoints = field.response();
                field.message();
                break;

        }




    }

    public int getTurnPoints() {
        return turnPoints;
    }
}
