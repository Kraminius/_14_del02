package Test;
import Code.Player;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TC04Penge {

    @Test
    @DisplayName("add money")
    void testAddMoney() {
        Player player = new Player(1);
        player.setScore(100);
        player.setScore(player.getScore() +50);
        assertEquals(150, player.getScore(),
                "checks that money can add");
    }

    @Test
    @DisplayName("Subtract money")
    void testSubtractMoney() {
        Player player = new Player(1);
        player.setScore(160);
        player.setScore(player.getScore() -50);
        assertEquals(110, player.getScore(),
                "checks that cash can subtract");
    }

    @Test
    @DisplayName("prevent negativ money")
    void testMinMoney() {
        Player player = new Player(1);
        player.setScore(199);
        player.setScore(player.getScore() -200);
        assertEquals(0, player.getScore(),
                "checks money cant go below 0");
    }
}