import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Party affiliation menu:");
        String menu = "D for Democrat\tR for Republican\tI for Independent";
        String partyAffiliation = "";
        //display the menu
        System.out.println(menu);
        System.out.println("What is your party affiliation?");
        partyAffiliation = in.nextLine();
        if (partyAffiliation.equalsIgnoreCase("D")) {
            System.out.println("You get a Democrat Donkey");}
        else  if (partyAffiliation.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant");}
        else  if (partyAffiliation.equalsIgnoreCase("I")) {
            System.out.println("You get a Independent Person");}
        else {System.out.println("You get other");}

        }

    }