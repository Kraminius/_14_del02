package Code.Languages;

public class Text {


    public void PickLanguage(int fieldNumber) {

        int choice = 1;

        switch (choice) {
            case 1:
                English(fieldNumber);
        }
    }
    public String English(int fieldNumber) {
        switch (fieldNumber) {
            case 2:
            {
                return "You climb up the great tower and at the top is a nest with a golden egg in it! +250";
            }
            case 3:
            {
                return "You stumble down the ancient crater and a great chunk of wealth fall out off your pocket on " +
                        "the way down. -100";
            }
            case 4:
            {
                return "You enter the queen’s palace; she has heard of your name and awaits you with a gift of a " +
                        "treasure. +100";
            }
            case 5:
            {
                return "You are losing heat rapidly here. Luckily a merchant offers you wood for a fire, but not for " +
                        "free. -20";
            }
            case 6:
            {
                return "You dig under the walls of the city and on the other side you find a city made of emerald, you " +
                        "take an emerald brick from a house and hurry back out. +180";
            }
            case 7:
            {
                return "You enter the Monastery greeted by monks, they offer you enlightenment, but nothing of physical " +
                        "value. +0";
            }
            case 8:
            {
                return "You can barely see in the darkness, when a band of robbers attack you, they take what they " +
                        "quickly can get and run off. -70";
            }
            case 9:
            {
                return "The hut is warm and cosy after having climbed back down from the top, a man gives you a reward " +
                        "for telling about your journey. +60";
            }
            case 10:
            {
                return "You are hunted down under the full moon by wolfish beasts, a great slash hits you and your " +
                        "pocket of gold. Despite the wound you feel energized while under the moonlight and travels again immediately. You have an extra turn. -80";
            }
            case 11:
            {
                return "You walk pondering in the twilight not noticing the pit before you until its too late, an evil " +
                        "man will only help you out for 50 gold. -50";
            }
            case 12:
            {
                return "You are about to give up mining for the day, when a hit with the chisel makes a shinning crack " +
                        "n the rock, you struck gold and a lot of it! +650";
            }
        }
        return "";
    }
    public void Danish() {
    }
}