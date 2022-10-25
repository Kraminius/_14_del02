package Code;

import Code.PlayingField.Field;

import java.util.Scanner;

public class Game {


    public Game(int numberOfPlayers){

        Players players = new Players(numberOfPlayers);
        CurrentPlayer currentPlayer = new CurrentPlayer();

        do{

            currentPlayer.checkCurrentPlayer(players);
            StartPlayerTurn();
            TurnProcess(players.getAllPlayers()[currentPlayer.getCurrentPlayerNumber()-1]);


        }while(true);



    }


    public void StartPlayerTurn(){

        //Player has to press something to start turn
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

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

        System.out.println(player.getNumber() + " " + player.getScore());



    }



}
