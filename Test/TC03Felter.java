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

    @Test
    @DisplayName("landing on field 7 money")
    void testField7() {
        Player player = new Player(1);
        Picker picker = new Picker();
        RollDice rollDice = new RollDice();
        rollDice.setOurRolls(new int[]{4, 3});
        SumOfDice sum = new SumOfDice();
        sum.calcSum(rollDice);
        picker.LandedField(sum);
        HandlePoints handlePoints = new HandlePoints();
        handlePoints.GivePlayerPoints(player, picker.getTurnPoints());
        //Ser at score er rigtig
        assertEquals(1000, player.getScore(),
                "checks that money change on field 7 is right");
    }

    @Test
    @DisplayName("landing on field 7 txt-english")
    void testFieldTxt7() {

        // Sætter output til newConsole
        PrintStream previousConsole = System.out;
        ByteArrayOutputStream newConsole = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole));
        previousConsole.print(newConsole.toString());

        //skriver og gemmer forventet 2 gange, da det hvis de er ens vil stå to gange i process linjen.
        System.out.println("You enter the Monastery greeted by monks, they offer you enlightenment, but nothing of physical " +
                "value. +0") ;
        String expect = String.valueOf(newConsole) +  String.valueOf(newConsole);

        Field field = new _7Monastery();
        field.message();
        previousConsole.println(newConsole);
        String actual = String.valueOf(newConsole);

        assertEquals(expect,actual,
                "checks that field 7 text in english is right");
    }

    @Test
    @DisplayName("landing on field 8 money")
    void testField8() {
        Player player = new Player(1);
        Picker picker = new Picker();
        RollDice rollDice = new RollDice();
        rollDice.setOurRolls(new int[]{4, 4});
        SumOfDice sum = new SumOfDice();
        sum.calcSum(rollDice);
        picker.LandedField(sum);
        HandlePoints handlePoints = new HandlePoints();
        handlePoints.GivePlayerPoints(player, picker.getTurnPoints());
        //Ser at score er rigtig
        assertEquals(930, player.getScore(),
                "checks that money change on field 8 is right");
    }

    @Test
    @DisplayName("landing on field 8 txt-english")
    void testFieldTxt8() {

        // Sætter output til newConsole
        PrintStream previousConsole = System.out;
        ByteArrayOutputStream newConsole = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole));
        previousConsole.print(newConsole.toString());

        //skriver og gemmer forventet 2 gange, da det hvis de er ens vil stå to gange i process linjen.
        System.out.println("You can barely see in the darkness, when a band of robbers attack you, they take what they " +
                "quickly can get and run off. -70") ;
        String expect = String.valueOf(newConsole) +  String.valueOf(newConsole);

        Field field = new _8BlackCave();
        field.message();
        previousConsole.println(newConsole);
        String actual = String.valueOf(newConsole);

        assertEquals(expect,actual,
                "checks that field 8 text in english is right");
    }

    @Test
    @DisplayName("landing on field 9 money")
    void testField9() {
        Player player = new Player(1);
        Picker picker = new Picker();
        RollDice rollDice = new RollDice();
        rollDice.setOurRolls(new int[]{5, 4});
        SumOfDice sum = new SumOfDice();
        sum.calcSum(rollDice);
        picker.LandedField(sum);
        HandlePoints handlePoints = new HandlePoints();
        handlePoints.GivePlayerPoints(player, picker.getTurnPoints());
        //Ser at score er rigtig
        assertEquals(1060, player.getScore(),
                "checks that money change on field 9 is right");
    }

    @Test
    @DisplayName("landing on field 9 txt-english")
    void testFieldTxt9() {

        // Sætter output til newConsole
        PrintStream previousConsole = System.out;
        ByteArrayOutputStream newConsole = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole));
        previousConsole.print(newConsole.toString());

        //skriver og gemmer forventet 2 gange, da det hvis de er ens vil stå to gange i process linjen.
        System.out.println("The hut is warm and cosy after having climbed back down from the top, a man gives you a reward " +
                "for telling about your journey. +60") ;
        String expect = String.valueOf(newConsole) +  String.valueOf(newConsole);

        Field field = new _9HutsInTheMountain();
        field.message();
        previousConsole.println(newConsole);
        String actual = String.valueOf(newConsole);

        assertEquals(expect,actual,
                "checks that field 9 text in english is right");
    }

    @Test
    @DisplayName("landing on field 10 money")
    void testField10() {
        Player player = new Player(1);
        Picker picker = new Picker();
        RollDice rollDice = new RollDice();
        rollDice.setOurRolls(new int[]{5, 5});
        SumOfDice sum = new SumOfDice();
        sum.calcSum(rollDice);
        picker.LandedField(sum);
        HandlePoints handlePoints = new HandlePoints();
        handlePoints.GivePlayerPoints(player, picker.getTurnPoints());
        //Ser at score er rigtig
        assertEquals(920, player.getScore(),
                "checks that money change on field 10 is right");
    }

    @Test
    @DisplayName("landing on field 10 txt-english")
    void testFieldTxt10() {

        // Sætter output til newConsole
        PrintStream previousConsole = System.out;
        ByteArrayOutputStream newConsole = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole));
        previousConsole.print(newConsole.toString());

        //skriver og gemmer forventet 2 gange, da det hvis de er ens vil stå to gange i process linjen.
        System.out.println("You are hunted down under the full moon by wolfish beasts, a great slash hits you and your " +
                "pocket of gold. Despite the wound you feel energized while under the moonlight and travels again immediately." +
                " You have an extra turn. -80") ;
        String expect = String.valueOf(newConsole) +  String.valueOf(newConsole);

        Field field = new _10WerewolfWall();
        field.message();
        previousConsole.println(newConsole);
        String actual = String.valueOf(newConsole);

        assertEquals(expect,actual,
                "checks that field 10 text in english is right");
    }

    @Test
    @DisplayName("landing on field 11 money")
    void testField11() {
        Player player = new Player(1);
        Picker picker = new Picker();
        RollDice rollDice = new RollDice();
        rollDice.setOurRolls(new int[]{6, 5});
        SumOfDice sum = new SumOfDice();
        sum.calcSum(rollDice);
        picker.LandedField(sum);
        HandlePoints handlePoints = new HandlePoints();
        handlePoints.GivePlayerPoints(player, picker.getTurnPoints());
        //Ser at score er rigtig
        assertEquals(950, player.getScore(),
                "checks that money change on field 11 is right");
    }

    @Test
    @DisplayName("landing on field 11 txt-english")
    void testFieldTxt11() {

        // Sætter output til newConsole
        PrintStream previousConsole = System.out;
        ByteArrayOutputStream newConsole = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole));
        previousConsole.print(newConsole.toString());

        //skriver og gemmer forventet 2 gange, da det hvis de er ens vil stå to gange i process linjen.
        System.out.println("You walk pondering in the twilight not noticing the pit before you until its too late, an evil " +
                "man will only help you out for 50 gold. -50") ;
        String expect = String.valueOf(newConsole) +  String.valueOf(newConsole);

        Field field = new _11ThePit();
        field.message();
        previousConsole.println(newConsole);
        String actual = String.valueOf(newConsole);

        assertEquals(expect,actual,
                "checks that field 11 text in english is right");
    }

    @Test
    @DisplayName("landing on field 12 money")
    void testField12() {
        Player player = new Player(1);
        Picker picker = new Picker();
        RollDice rollDice = new RollDice();
        rollDice.setOurRolls(new int[]{6, 6});
        SumOfDice sum = new SumOfDice();
        sum.calcSum(rollDice);
        picker.LandedField(sum);
        HandlePoints handlePoints = new HandlePoints();
        handlePoints.GivePlayerPoints(player, picker.getTurnPoints());
        //Ser at score er rigtig
        assertEquals(1650, player.getScore(),
                "checks that money change on field 12 is right");
    }

    @Test
    @DisplayName("landing on field 12 txt-english")
    void testFieldTxt12() {

        // Sætter output til newConsole
        PrintStream previousConsole = System.out;
        ByteArrayOutputStream newConsole = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole));
        previousConsole.print(newConsole.toString());

        //skriver og gemmer forventet 2 gange, da det hvis de er ens vil stå to gange i process linjen.
        System.out.println("You are about to give up mining for the day, when a hit with the chisel makes a shinning crack i" +
                "n the rock, you struck gold and a lot of it! +650") ;
        String expect = String.valueOf(newConsole) +  String.valueOf(newConsole);

        Field field = new _12Goldmine();
        field.message();
        previousConsole.println(newConsole);
        String actual = String.valueOf(newConsole);

        assertEquals(expect,actual,
                "checks that field 12 text in english is right");
    }

    @Test
    @DisplayName("landing on field 1 is impossible")
    void testField1() {
        // Sætter output til newConsole
        PrintStream previousConsole = System.out;
        ByteArrayOutputStream newConsole = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole));
        previousConsole.print(newConsole.toString());

        //skriver og gemmer forventet 2 gange, da det hvis de er ens vil stå to gange i process linjen.
        System.out.println("Field does not exist!") ;
        String expect = String.valueOf(newConsole) +  String.valueOf(newConsole);

        Player player = new Player(1);
        Picker picker = new Picker();
        RollDice rollDice = new RollDice();
        rollDice.setOurRolls(new int[]{0, 1});
        SumOfDice sum = new SumOfDice();
        sum.calcSum(rollDice);
        picker.LandedField(sum);

        previousConsole.println(newConsole);
        String actual = String.valueOf(newConsole);

        //Ser at score er rigtig
        assertEquals(expect, actual,
                "checks that no field 1 exists");
    }

    @Test
    @DisplayName("landing on field 13 is impossible")
    void testField13() {
        // Sætter output til newConsole
        PrintStream previousConsole = System.out;
        ByteArrayOutputStream newConsole = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole));
        previousConsole.print(newConsole.toString());

        //skriver og gemmer forventet 2 gange, da det hvis de er ens vil stå to gange i process linjen.
        System.out.println("Field does not exist!") ;
        String expect = String.valueOf(newConsole) +  String.valueOf(newConsole);

        Player player = new Player(1);
        Picker picker = new Picker();
        RollDice rollDice = new RollDice();
        rollDice.setOurRolls(new int[]{7, 6});
        SumOfDice sum = new SumOfDice();
        sum.calcSum(rollDice);
        picker.LandedField(sum);

        previousConsole.println(newConsole);
        String actual = String.valueOf(newConsole);

        //Ser at score er rigtig
        assertEquals(expect, actual,
                "checks that no field 13 exists");
    }
}