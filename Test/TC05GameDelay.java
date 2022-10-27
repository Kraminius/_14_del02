package Test;

import Code.Die.RollDice;
import Code.Die.SumOfDice;
import Code.Game.*;
import Code.Player.CurrentPlayer;
import Code.Player.Player;
import Code.Player.Players;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.*;

class TC05GameDelay {

    public void StartPlayerTurn(Player player){
        Display display = new Display();
        display.startText(player);

    }

    public void TurnProcessDelay(Player player, Conditions conditions){


        RollDice rollDice = new RollDice();
        rollDice.setOurRolls(new int[]{2, 2});

        SumOfDice sumOfDice = new SumOfDice();
        sumOfDice.calcSum(rollDice);

        Display display = new Display();
        display.turnText(player, sumOfDice);

        //Finds the field
        Picker picker = new Picker();


        picker.LandedField(sumOfDice);


        //Calculates player total points
        HandlePoints handlePoints = new HandlePoints();
        handlePoints.GivePlayerPoints(player, picker.getTurnPoints());


        //run conditions
        conditions.CheckExtraTurn(picker);
        conditions.WonGame(player);


        display.endTurnText(player);
        display.extraTurnText(conditions);


    }


    @Test
    @DisplayName("delay tælles op")
    void testGameDelay() {
        //Player player = new Player(2);

        Players players = new Players(2);
        CurrentPlayer currentPlayer = new CurrentPlayer();
        Conditions conditions = new Conditions();
        double delay1, delay2, delayTotal = 0;
        int timesRun = 1000;
        boolean works = false;

        //Kører to runder så spiller 2 er den sidste kaldt og den vi bør se
        for(int i =0; i<=timesRun; i++) {
            currentPlayer.checkCurrentPlayer(players);

            StartPlayerTurn(players.getAllPlayers()[currentPlayer.getCurrentPlayerNumber() - 1]);
            delay1 = System.currentTimeMillis();
            TurnProcessDelay(players.getAllPlayers()[currentPlayer.getCurrentPlayerNumber() - 1], conditions);
            delay2 = System.currentTimeMillis();
            delayTotal += delay2-delay1;
        }
        final double maxDelay = 1000 * timesRun;
        if(delayTotal < maxDelay)
            works = true;

        assertEquals(true, works,
                "checks that delays are short");
    }

}