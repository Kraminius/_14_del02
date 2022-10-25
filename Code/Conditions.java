package Code;

public class Conditions {

    private final int pointsNeededToWin = 3000;

    private boolean winTerm;
    private boolean extraTurn;

    public void WonGame(Player player){

        if(player.getScore() >= pointsNeededToWin){

            winTerm = true;

        }else{

        }

    }



}
