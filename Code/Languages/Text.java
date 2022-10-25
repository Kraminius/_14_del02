package Code.Languages;

public class Text {

    public void StartTurnText(){

    }

    public void PickLanguage(int fieldNumber) {

        int choice = 1;

        switch (choice) {
            case 1:
                English(fieldNumber);
                break;
        }
    }
    public void English(int fieldNumber) {
        switch (fieldNumber) {
            //Fields, in each { }, change text in between " ".
            case 2:
            {
                System.out.println("You climb up the great tower and at the top is a nest with a golden egg in it! +250");
                break;
            }
            case 3:
            {
                System.out.println("You stumble down the ancient crater and a great chunk of wealth fall out off your pocket on " +
                        "the way down. -100");
                break;
            }
            case 4:
            {
                System.out.println("You enter the queen’s palace; she has heard of your name and awaits you with a gift of a " +
                        "treasure. +100");
                break;
            }
            case 5:
            {
                System.out.println("You are losing heat rapidly here. Luckily a merchant offers you wood for a fire, but not for " +
                        "free. -20");
                break;
            }
            case 6:
            {
                System.out.println("You dig under the walls of the city and on the other side you find a city made of emerald, you " +
                        "take an emerald brick from a house and hurry back out. +180");
                break;
            }
            case 7:
            {
                System.out.println("You enter the Monastery greeted by monks, they offer you enlightenment, but nothing of physical " +
                        "value. +0");
                break;
            }
            case 8:
            {
                System.out.println("You can barely see in the darkness, when a band of robbers attack you, they take what they " +
                        "quickly can get and run off. -70");
                break;
            }
            case 9:
            {
                System.out.println("The hut is warm and cosy after having climbed back down from the top, a man gives you a reward " +
                        "for telling about your journey. +60");
                break;
            }
            case 10:
            {
                System.out.println("You are hunted down under the full moon by wolfish beasts, a great slash hits you and your " +
                        "pocket of gold. Despite the wound you feel energized while under the moonlight and travels again immediately. You have an extra turn. -80");
                break;
            }
            case 11:
            {
                System.out.println("You walk pondering in the twilight not noticing the pit before you until its too late, an evil " +
                        "man will only help you out for 50 gold. -50");
                break;
            }
            case 12:
            {
                System.out.println("You are about to give up mining for the day, when a hit with the chisel makes a shinning crack i" +
                        "n the rock, you struck gold and a lot of it! +650");
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + fieldNumber);
        }
    }
    public void Danish() {
    }
}
