package Test;

import Code.Game.Game;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TC05GameDelay {



    @Test
    void getDelaytotal() {
        Game game = new Game();
        System.out.println(game.getDelaytotal());
    }
}