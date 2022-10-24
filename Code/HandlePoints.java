package Code;

//The base-code is copied from earlier project made by same group. Modified slightly to work in this project.
public class HandlePoints {

    public void GivePlayerPoints(Player player, SumOfDice sumOfDice){

        player.setScore(player.getScore() + sumOfDice.getSum());

    }


}
