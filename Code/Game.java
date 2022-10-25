package Code;

import Code.PlayingField.Field;

import java.util.Scanner;

public class Game {

    public Game(){
        StartGameText();
        int numberOfPlayers;
        numberOfPlayers = AmountOfPlayers();
        Players players = new Players(numberOfPlayers);
        CurrentPlayer currentPlayer = new CurrentPlayer();
        Conditions conditions = new Conditions();

        do{

            currentPlayer.checkCurrentPlayer(players);
            do{

                StartPlayerTurn(players.getAllPlayers()[currentPlayer.getCurrentPlayerNumber()-1]);
                TurnProcess(players.getAllPlayers()[currentPlayer.getCurrentPlayerNumber()-1], conditions);

            }while(conditions.isExtraTurn());



        }while(!conditions.isWinTerm());



    }

    public void StartGameText(){
        Display display = new Display();
        display.startOfGameText();
    }
    public int AmountOfPlayers(){
        int howManyPlayers;
        Scanner scanner = new Scanner(System.in);
        howManyPlayers = scanner.nextInt();
        return howManyPlayers;
    }

    public void StartPlayerTurn(Player player){
        Display display = new Display();
        display.startText(player);

        //Player has to press something to start turn
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

    }

    public void TurnProcess(Player player, Conditions conditions){


        //Roll dice
        RollDice rollDice = new RollDice();
        rollDice.Roll();

        //Calculates sum of roll
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



}
