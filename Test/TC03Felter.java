package Test;
import Code.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import Code.Languages.Text;
import Code.PlayingField.Field;
import Code.PlayingField._2Tower;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.Format;
import java.util.Scanner;

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
                "checks that money added in field 2 is right");
    }

        @Test
        @DisplayName("landing on field 2 txt")
        void testFieldTxt2() {

         // Preserve current console which contains 'One - Previous console'.
        PrintStream previousConsole = System.out;

        // Set the standard output to use newConsole.
        ByteArrayOutputStream newConsole = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole));
        // gemmer
        previousConsole.print(newConsole.toString());

        //skriver og gemmer forventet 2 gange, da det hvis de er ens vil stå to gange i process linjen.
            System.out.println("You climb up the great tower and at the top is a nest with a golden egg in it! +250") ;
            String expect = String.valueOf(newConsole) +  String.valueOf(newConsole);

        Field field = new _2Tower();
        field.message();
            previousConsole.println(newConsole);
        String actual = String.valueOf(newConsole);

        assertEquals(expect,actual,
                "checks that field 2 text is right");
    }

}