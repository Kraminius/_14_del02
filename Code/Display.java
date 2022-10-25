package Code;

//The base-code is copied from earlier project made by same group. Modified slightly to work in this project.
public class Display {

    public void startOfGameText() {
        System.out.println("You have chosen to enter Gold Rush! How many players would you like to play?");
    }
    public void startText(Player player) {
        System.out.print("Player " + player.getNumber() +
                " turn." + " Your current points are: " + player.getScore() + ". Click something to roll!");
        System.out.println();
    }

    public void turnText(Player player, SumOfDice sumOfDice) {
        System.out.println("Player: " + player.getNumber() + " rolled " + sumOfDice.getSum());
    }
    public void endTurnText(Player player) {
        System.out.println("Your score is now: " + player.getScore() +"!");
    }
    public void extraTurnText(Conditions conditions) {
        if (conditions.isExtraTurn()) {
            System.out.println("Because you feel energized you got an extra turn!");
            System.out.println("--------------------------------------------------------------------------------");
        }
        else {
            System.out.println("Your turn is over!");
            System.out.println();
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println();

        }
    }
}
