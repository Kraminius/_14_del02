package Code.Player;

import Code.Player.Players;

public class CurrentPlayer {
    private int currentPlayerNumberVar;
    private int currentPlayerNumber;


    public CurrentPlayer(){


        currentPlayerNumberVar = 1;
        currentPlayerNumber = 1;

    }

    public void checkCurrentPlayer(Players players){

        if(currentPlayerNumberVar <= players.getAllPlayers().length){

            currentPlayerNumber = currentPlayerNumberVar;
            currentPlayerNumberVar += 1;


        }
        else {
            currentPlayerNumber = 1;
            currentPlayerNumberVar = 2;
        }


    }

    public int getCurrentPlayerNumberVar() {
        return currentPlayerNumberVar;
    }

    public void setCurrentPlayerNumberVar(int currentPlayerNumberVar) {
        this.currentPlayerNumberVar = currentPlayerNumberVar;
    }

    public int getCurrentPlayerNumber() {
        return currentPlayerNumber;
    }

    public void setCurrentPlayerNumber(int currentPlayerNumber) {
        this.currentPlayerNumber = currentPlayerNumber;
    }
}

