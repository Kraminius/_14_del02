package Code;

//The base-code is copied from earlier project made by same group. Modified slightly to work in this project.
public class Display {
    public void startText(Player player, Conditions conditions) {
        if (conditions.isExtraTurn()) {
            System.out.println();
            System.out.println("Click something to roll!");
        }
        else {
            System.out.println();
            System.out.print("Game.Player " + player.getNumber() +
                    " turn." + " Your current points are: " + player.getScore() + ". Click something to roll!");
            System.out.println();
        }

    }

    public void turnText(Player player, SumOfDice sumOfDice, Conditions conditions) {
        System.out.println("Player: " + player.getNumber() + " rolled " + sumOfDice.getSum());
    }
    public void endTurnText(Player player) {
        System.out.println("Your score is now: " + player.getScore() +"!");
    }
    public void extraTurnText(Conditions conditions) {
        if (conditions.isExtraTurn()) {
            System.out.println("Because you feel energized you got an extra turn, roll again!");
        }
        else {
            System.out.println("Your turn is over!");

        }
    }
}
