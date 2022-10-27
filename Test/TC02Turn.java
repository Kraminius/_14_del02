package Test;
import Code.Die.RollDice;
import Code.Die.SumOfDice;
import Code.Game.Conditions;
import Code.Game.Display;
import Code.Game.HandlePoints;
import Code.Game.Picker;
import Code.Player.CurrentPlayer;
import Code.Player.Player;
import static org.junit.jupiter.api.Assertions.assertEquals;

import Code.Player.Players;
import Code.PlayingField.Field;
import Code.PlayingField._10WerewolfWall;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class TC02Turn {

//Få turene til at kunne kører
public void StartPlayerTurn(Player player){
    Display display = new Display();
    display.startText(player);

}

    public void TurnProcess1(Player player, Conditions conditions){


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
    @DisplayName("next players turn")
    void testNextPlayersTurn() {
        //Player player = new Player(2);

        Players players = new Players(2);
        CurrentPlayer currentPlayer = new CurrentPlayer();
        Conditions conditions = new Conditions();

        //Kører to runder så spiller 2 er den sidste kaldt og den vi bør se
            for(int i =0; i<2; i++) {
                currentPlayer.checkCurrentPlayer(players);

                StartPlayerTurn(players.getAllPlayers()[currentPlayer.getCurrentPlayerNumber() - 1]);
                TurnProcess1(players.getAllPlayers()[currentPlayer.getCurrentPlayerNumber() - 1], conditions);
            }


        assertEquals(2, (currentPlayer.getCurrentPlayerNumber()),
                "checks that turns shift");
    }

    //En runde med ekstra rull


    @Test
    @DisplayName("extra turn")
    void testExtraTurn() {
        Conditions conditions = new Conditions();
        Picker picker = new Picker();
        RollDice rollDice = new RollDice();
        rollDice.setOurRolls(new int[]{5, 5});
        SumOfDice sumOfDice = new SumOfDice();
        sumOfDice.calcSum(rollDice);
        picker.LandedField(sumOfDice);
        conditions.CheckExtraTurn(picker);

        assertEquals(true, conditions.isExtraTurn(),
                "checks extra turn condition works");
    }

    @Test
    @DisplayName("winner found")
    void testWinTurn() {
        Player player = new Player(1);
        player.setScore(3000);
        Conditions conditions = new Conditions();
        conditions.WonGame(player);

        assertEquals(true, conditions.isWinTerm(),
                "checks winner condition works");
    }
}