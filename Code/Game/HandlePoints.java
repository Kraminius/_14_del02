package Code.Game;

import Code.Player.Player;

//The base-code is copied from earlier project made by same group. Modified slightly to work in this project.
public class HandlePoints {

    public void GivePlayerPoints(Player player, int points){

        player.setScore(player.getScore() + points);

    }


}
