//The base-code is copied from earlier project made by same group. Modified slightly to work in this project.
public class Players {

    private Player[] allPlayers; //Creates a Game.Player array to hold all the players.
    public Players(int numberOfPlayers){
        allPlayers = new Player[numberOfPlayers]; //allPlayers is equal to a new instance of Game.Player array for each time the method is called.

        for(int i =0; i<numberOfPlayers; i++){ //For loop repeats a number of times equal to the amount of players
            allPlayers[i] = new Player(i+1); //Adds a player to the array, that is a new instance of Game.Player with a playerNumber equal i+1.
        }
    }
    public Player[] getAllPlayers() {
        return allPlayers;
    } //Getter and Setter(Below) for the Game.Player array
    public void setAllPlayers(Player[] allPlayers) {
        this.allPlayers = allPlayers;
    }

}
