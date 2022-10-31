import java.util.ArrayList;

public class Game {

    FileIO fileIO = new FileIO();
    TextUI textUI = new TextUI();
private int startValue = 30000;
private int maxPlayers = 6;

private ArrayList<Player> players = new ArrayLest();

    public void gameSetup(){

        ArrayList<String> data = fileIO.readGameData();
//check if there is game data
        if(data == null){

        data = textUI.getUserInput("write gameplayer. press Q for escape", maxPlayers);

        }

        createPlayers(data);

    }

    public void createPlayers(ArrayList<String> data) {
        for (String s : data) {
            String[] values = s.split(","); //"Egon[0], 30000[1]"
            int amount;

            if (values.length > 1) {
                amount = Integer.parseInt(values[1]);
            } else {
                amount = startValue;
            }

            Player p = new Player(values[0], amount);
            players.add(p);

        }
    }
        public void showPlayers() {
            for (Player p : players) {
                System.out.println(p);

            }
        }
}
