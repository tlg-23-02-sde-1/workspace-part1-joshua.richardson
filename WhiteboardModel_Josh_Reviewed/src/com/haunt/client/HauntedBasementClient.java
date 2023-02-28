package com.haunt.client;

import com.haunt.AsciiArtTemp;
import com.haunt.GhostName;
import com.haunt.HauntedBasement;

import java.util.Arrays;
import java.util.Scanner;

/*
 * JR: Very creative, nice touch.
 * Storyline messages and ascii art are a bit crowded on the console.
 * Blank lines between "episodes" and art display would help.
 *
 * main() method is too long, break it up into private method calls,
 * one for each "stage" of prompting or "episode."
 *
 * For human input, you can use a Scanner, but must only use its nextLine() method,
 * anything else is vulnerable to throwing an exception upon invalid or empty input.
 * For example, your "Press any key to continue" hangs if the user just presses [Enter].
 * We'll cover user prompting in class, during a future iteration of the DuckRace application.
 */
public class HauntedBasementClient {
    public static void main(String[] args) {
        String userInput;
        Scanner sn = new Scanner(System.in);
        boolean nextPage = true;

        // Create a house to prove concept:
        HauntedBasement screamScene = new HauntedBasement(true, 34, GhostName.JOSH, false, 0.3, "Not Josh");
        System.out.println(screamScene);



        // TODO for code clean up:
        // - Handle the "yes" and "no" to force the user to enter a valid input
        while (true) {
            //Print the options for the user to choose from
            HauntedBasement b = new HauntedBasement();
            System.out.println("\n\nYou enter a one story house.\nHowever, as you pass by a door with peeling " +
                    "paint a waft of aging books assault your nose.\nWith a shiver down your spine you decide to open the door only to find " +
                    "what appears to be a never ending stair case descending into the darkness.");
            System.out.println("Press any key to continue.");

            // JR: flawed - if user just presses [Enter], the application hangs.
            userInput = sn.next();
            //Check the user input
            if(userInput.length() != 0) {
                AsciiArtTemp.darkStairs();
            }

            System.out.println("\n\nWow it's so dark!  Do you choose to turn the lights on? yes/no");

            while(nextPage){
                userInput = sn.next();
                if(userInput.equals("yes")) {
                    b.turnLightOn();
                    AsciiArtTemp.brightStairs();
                    nextPage = false;
                } else if(userInput.equals("no")) {
                    System.out.println("You feel more comfortable in the darkness.");
                    AsciiArtTemp.darkStairs();
                    nextPage = false;
                } else {
                    System.out.println("Please enter a valid input. (yes/no)");
                }
            }
            nextPage = true;


            System.out.println("The fog that has settled on the ground of the basement seems " +
                    "\nto rapidly climb your body.  You quickly wonder if the owner of the house" +
                    "\n has ever been down here.  The fog seems to reach inside your mind." +
                    "\nAs your head swims, you call out into the empty room the owners name." +
                    "\nWhat name do you scream?");
            userInput = sn.next();
            b.setOwner(userInput);

            System.out.printf(
                    "Unfortunately, %s does not respond.  However, you hear a scurry from the corner of the room", b.getOwner()
            );
            System.out.println("\n\nPress any key to continue.");
            userInput = sn.next();
            AsciiArtTemp.ghost();

            System.out.println("\n\nYou Jump at the sight of the ghost." +
                    "Do you think it's friendly? yes/no");

            while(nextPage){
                userInput = sn.next();
                if(userInput.equals("no")) {
                    AsciiArtTemp.angryGhost();
                    b.setGhostFriendly(false);
                    System.out.println("You were right!!!  It's so scary!");
                    nextPage = false;
                } else if(userInput.equals("yes")) {
                    AsciiArtTemp.friendlyGhost();
                    b.setGhostFriendly(true);
                    System.out.println("You were right!!!  UWU!");
                    nextPage = false;
                } else {
                    System.out.println("Please enter a valid input. (yes/no)");
                }
            }
            nextPage = true;

            while(nextPage){
                System.out.println("You call out asking the ghost's name.  What name does it present to you?");
                System.out.println(Arrays.asList(GhostName.values())); // TODO: Evaluate if complying with enum
                String userInputName = sn.next();
                b.setGhostName(userInputName);
                System.out.println("I think we can calm the ghost down... should we try?  yes/no");
                userInput = sn.next();
                if(userInput.equals("yes")) {
                    AsciiArtTemp.musicPerform();
                    System.out.println("You call up your buddy Demi Lovato to heal " + b.getGhostName() + "'s ghostly trauma!!!\n(This is super weird if you haven't seen this reference)");
                    nextPage = false;
                } else if(userInput.equals("no")) {
                    AsciiArtTemp.musicPerform();
                    System.out.println("You perform a duet of the Adam's Family song with the ghost!");
                    nextPage = false;
                } else {
                    System.out.println("Please enter a valid input. (yes/no)");
                }
            }

            System.out.println("\n\nDo you want to play again? yes/no");
            userInput = sn.next();
            if(userInput.equals("yes")) {
                continue;
            } else {System.exit(0);}
        }
    }
}



