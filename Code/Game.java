package Code;

import Code.PlayingField.Field;

public class Game {


    public Game(int numberOfPlayers){

        Players players = new Players(numberOfPlayers);
        CurrentPlayer currentPlayer = new CurrentPlayer();

        do{
            currentPlayer.checkCurrentPlayer(players);



        }while(true);



    }



    public void TurnProcess(Player player){


        //Roll dice
        RollDice rollDice = new RollDice();
        rollDice.Roll();

        //Calculates sum of roll
        SumOfDice sumOfDice = new SumOfDice();
        sumOfDice.calcSum(rollDice);

        //Finds the field
        Picker picker = new Picker();
        picker.LandedField(sumOfDice);

        //Calculates player total points
        HandlePoints handlePoints = new HandlePoints();
        handlePoints.GivePlayerPoints(player, picker.getTurnPoints());



    }



}
