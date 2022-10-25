package Code.Player;

//The base-code is copied from earlier project made by same group. Modified slightly to work in this project.
public class Player {

    private final int startPoints = 1000;

    private int number; //The individual players score and number variables.
    private int score;
    public Player(int playerNumber){ //The Game.Code.Player.Players class calls this to set the player number.
        this.score = startPoints;
        number = playerNumber;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
