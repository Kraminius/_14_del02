package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import Code.Die.RollDice;
import Code.Die.SumOfDice;
import Code.Game.HandlePoints;
import Code.Game.Picker;
import Code.Player.Player;
import Code.PlayingField.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TC03Felter {

    @Test
    @DisplayName("landing on field 2 money")
    void testField2() {
        Player player = new Player(1);
        Picker picker = new Picker();
        RollDice rollDice = new RollDice();
        rollDice.setOurRolls(new int[]{1, 1});
        SumOfDice sum = new SumOfDice();
        sum.calcSum(rollDice);
        picker.LandedField(sum);
        HandlePoints handlePoints = new HandlePoints();
        handlePoints.GivePlayerPoints(player, picker.getTurnPoints());
        //Ser at score er rigtig
        assertEquals(1250, player.getScore(),
                "checks that money changed on field 2 is right");
    }

        @Test
        @DisplayName("landing on field 2 txt-english")
        void testFieldTxt2() {

            // Sætter output til newConsole
            PrintStream previousConsole = System.out;
            ByteArrayOutputStream newConsole = new ByteArrayOutputStream();
            System.setOut(new PrintStream(newConsole));
            previousConsole.print(newConsole.toString());

        //skriver og gemmer forventet 2 gange, da det hvis de er ens vil stå to gange i process linjen.
            System.out.println("You climb up the great tower and at the top is a nest with a golden egg in it! +250") ;
            String expect = String.valueOf(newConsole) +  String.valueOf(newConsole);

        Field field = new _2Tower();
        field.message();
            previousConsole.println(newConsole);
        String actual = String.valueOf(newConsole);

        assertEquals(expect,actual,
                "checks that field 2 text in english is right");
    }

    @Test
    @DisplayName("landing on field 3 money-english")
    void testField3() {
        Player player = new Player(1);
        Picker picker = new Picker();
        RollDice rollDice = new RollDice();
        rollDice.setOurRolls(new int[]{1, 2});
        SumOfDice sum = new SumOfDice();
        sum.calcSum(rollDice);
        picker.LandedField(sum);
        HandlePoints handlePoints = new HandlePoints();
        handlePoints.GivePlayerPoints(player, picker.getTurnPoints());
        //Ser at score er rigtig
        assertEquals(900, player.getScore(),
                "checks that money change on field 3 is right");
    }

    @Test
    @DisplayName("landing on field 3 txt-english")
    void testFieldTxt3() {

        // Sætter output til newConsole
        PrintStream previousConsole = System.out;
        ByteArrayOutputStream newConsole = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole));
        previousConsole.print(newConsole.toString());

        //skriver og gemmer forventet 2 gange, da det hvis de er ens vil stå to gange i process linjen.
        System.out.println("You stumble down the ancient crater and a great chunk of wealth fall out off your pocket on the way down. -100") ;
        String expect = String.valueOf(newConsole) +  String.valueOf(newConsole);

        Field field = new _3Crater();
        field.message();
        previousConsole.println(newConsole);
        String actual = String.valueOf(newConsole);

        assertEquals(expect,actual,
                "checks that field 3 text in english is right");
    }

    @Test
    @DisplayName("landing on field 4 money")
    void testField4() {
        Player player = new Player(1);
        Picker picker = new Picker();
        RollDice rollDice = new RollDice();
        rollDice.setOurRolls(new int[]{2, 2});
        SumOfDice sum = new SumOfDice();
        sum.calcSum(rollDice);
        picker.LandedField(sum);
        HandlePoints handlePoints = new HandlePoints();
        handlePoints.GivePlayerPoints(player, picker.getTurnPoints());
        //Ser at score er rigtig
        assertEquals(1100, player.getScore(),
                "checks that money change on field 4 is right");
    }

    @Test
    @DisplayName("landing on field 4 txt-english")
    void testFieldTxt4() {

        // Sætter output til newConsole
        PrintStream previousConsole = System.out;
        ByteArrayOutputStream newConsole = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole));
        previousConsole.print(newConsole.toString());

        //skriver og gemmer forventet 2 gange, da det hvis de er ens vil stå to gange i process linjen.
        System.out.println("You enter the queen’s palace; she has heard of your name and awaits you with a gift of a treasure. +100") ;
        String expect = String.valueOf(newConsole) +  String.valueOf(newConsole);

        Field field = new _4PalaceGates();
        field.message();
        previousConsole.println(newConsole);
        String actual = String.valueOf(newConsole);

        assertEquals(expect,actual,
                "checks that field 4 text in english is right");
    }

    @Test
    @DisplayName("landing on field 5 money")
    void testField5() {
        Player player = new Player(1);
        Picker picker = new Picker();
        RollDice rollDice = new RollDice();
        rollDice.setOurRolls(new int[]{3, 2});
        SumOfDice sum = new SumOfDice();
        sum.calcSum(rollDice);
        picker.LandedField(sum);
        HandlePoints handlePoints = new HandlePoints();
        handlePoints.GivePlayerPoints(player, picker.getTurnPoints());
        //Ser at score er rigtig
        assertEquals(980, player.getScore(),
                "checks that money change on field 5 is right");
    }

    @Test
    @DisplayName("landing on field 5 txt-english")
    void testFieldTxt5() {

        // Sætter output til newConsole
        PrintStream previousConsole = System.out;
        ByteArrayOutputStream newConsole = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole));
        previousConsole.print(newConsole.toString());

        //skriver og gemmer forventet 2 gange, da det hvis de er ens vil stå to gange i process linjen.
        System.out.println("You are losing heat rapidly here. Luckily a merchant offers you wood for a fire, but not for " +
                "free. -20") ;
        String expect = String.valueOf(newConsole) +  String.valueOf(newConsole);

        Field field = new _5ColdDesert();
        field.message();
        previousConsole.println(newConsole);
        String actual = String.valueOf(newConsole);

        assertEquals(expect,actual,
                "checks that field 5 text in english is right");
    }

    @Test
    @DisplayName("landing on field 6 money")
    void testField6() {
        Player player = new Player(1);
        Picker picker = new Picker();
        RollDice rollDice = new RollDice();
        rollDice.setOurRolls(new int[]{3, 3});
        SumOfDice sum = new SumOfDice();
        sum.calcSum(rollDice);
        picker.LandedField(sum);
        HandlePoints handlePoints = new HandlePoints();
        handlePoints.GivePlayerPoints(player, picker.getTurnPoints());
        //Ser at score er rigtig
        assertEquals(1180, player.getScore(),
                "checks that money change on field 6 is right");
    }

    @Test
    @DisplayName("landing on field 6 txt-english")
    void testFieldTxt6() {

        // Sætter output til newConsole
        PrintStream previousConsole = System.out;
        ByteArrayOutputStream newConsole = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole));
        previousConsole.print(newConsole.toString());

        //skriver og gemmer forventet 2 gange, da det hvis de er ens vil stå to gange i process linjen.
        System.out.println("You dig under the walls of the city and on the other side you find a city made of emerald, you " +
                "take an emerald brick from a house and hurry back out. +180") ;
        String expect = String.valueOf(newConsole) +  String.valueOf(newConsole);

        Field field = new _6WalledCity();
        field.message();
        previousConsole.println(newConsole);
        String actual = String.valueOf(newConsole);

        assertEquals(expect,actual,
                "checks that field 6 text in english is right");
    }

}