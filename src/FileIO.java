/*
* Todo: lav denne klasse om til en uitlity klasse, med navnet FileIO.
*  - Sørg for at den ikke kender til Player
* 1. Slet hele main metoden incl. indhold
* 2. slet players arrayet
* 3. Metoden readPlayers() skal laves om så den returner en liste af Strings hvor hvert element er en linje i players.txt
*  den skal altså ikke længere instantiere Player objekter
Vi skal derfor in i while loopet og i stedet for at splitte på "," og lave Player instanser her,
lægges hele linjen - fx. "Egon, 30000" (svarende til et playerobjekt), i listen
 4.  write players udkommenterer vi for nu
* */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {


    public static void writePlayers() {
       /* try {
            FileWriter writer = new FileWriter("players.txt");
            for (Player p : players) {
                writer.write(p.getName() + "," + p.getAmount()+"\n");
            }
            writer.close();
        } catch (Exception e) {
            System.out.println(e);

        }*/
    }


    public static void readPlayers() {
       /* try {
            Scanner input = new Scanner(new File("players.txt"));

        } catch (FileNotFoundException e) {
            System.out.println(e);
            // e.printStackTrace();
        }*/
    }


    public ArrayList<String> readGameData() {
        ArrayList<String> values = new ArrayList<>();

        try {
        Scanner input = new Scanner(new File("gamedata.txt"));

        while (input.hasNextLine()) {
            String s = input.nextLine();
            values.add(s);
        }

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return values;
    }
}
