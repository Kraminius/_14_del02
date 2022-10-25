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

    public boolean isWinTerm() {
        return winTerm;
    }

    public void setWinTerm(boolean winTerm) {
        this.winTerm = winTerm;
    }

    public boolean isExtraTurn() {
        return extraTurn;
    }

    public void setExtraTurn(boolean extraTurn) {
        this.extraTurn = extraTurn;
    }

    public void CheckExtraTurn(Picker picker){

        extraTurn = picker.isRolledExtraTurn();

    }


}
