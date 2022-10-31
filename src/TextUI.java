/*
Todo: Tilføj en metode der prompter brugeren for en værdi indtil et max er nået eller brugeren taster q for quit

Lad metoden tage et argument for besked der skal vises hver gang brugeren promptes og et argument for maximum antal gange brugeren skal promptes
Hver gang brugeren taster et input, skal værdien placeres i en liste af Strings som returnes til allersidst.


Alle metoderne i denne klasse skal hedde getUserInput, men de tager forskellige argumenter. Dette kaldes 'overloading'.'

*/

import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
    static Scanner scan = new Scanner(System.in);

    //recieves a message and displays it to the user
    //prompts the user for a reponse

    public ArrayList<String> getUserInput(String msg, int interactions){
        ArrayList<String> ArrayList;
        ArrayList<String> values = ArrayList<>();
        int i = 0;
        while (i<interactions){

            System.out.println(msg);
            String input = scan.nextLine();

           if(input.equalsIgnoreCase("Q")){
               return values;

            }
            values.add(input);
            i++;

        }

        return values;
    }


    public String getUserInput(String msg){
        //besked fra systemet
        System.out.println(msg);
        //svar fra bruger
        String input = scan.nextLine();
        return input;
    }

    public int getUserChoice(ArrayList<String> arr){
        String msg =  "Du har følgende valgmuligheder";
        System.out.println(msg);
     
        for(int i = 0; i<arr.size(); i++){

            System.out.println(i+1+". "+arr.get(i));
        }
        int choice = scan.nextInt();
        return choice;
    }
}
