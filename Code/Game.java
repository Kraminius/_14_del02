package Code;

public class Game {


    public Game(){

        RollDice rollDice = new RollDice();
        rollDice.Roll();

        SumOfDice sumOfDice = new SumOfDice();
        sumOfDice.setSum(3);


        Picker picker = new Picker();
        picker.LandedField(sumOfDice);
        System.out.println(picker.getTurnPoints());



    }





}
