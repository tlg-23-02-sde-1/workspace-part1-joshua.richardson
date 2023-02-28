package com.haunt.client;

import com.haunt.GhostName;
import com.haunt.HauntedBasement;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * JR: works as intended, but I'm confused on the logic for selectively showing
 * additional usage notes, based on number of input arguments.  Did not examine super-closely.
 *
 * Example usage does not work, throws unhandled exception.
 * Incorrect class name, should be HauntedBasementClientArgs.
 */
class HauntedBasementArgs {
    public static void main(String[] args) {
        if(args.length <= 5 ){
            ArrayList<String> notes = new ArrayList<String>();
            notes.add("Usage: java com.haunt.client.HauntedBasementArgs <dark> <age> <ghostName> <ghostFriendly> <creak> <owner>");
            notes.add("Example: java com.haunt.client.HauntedBasementArgs true 84 com.haunt.GhostName.Josh false 0.9 Mr.BananaPants");

            /*
             * JR: logic here seems flawed, but I did not examine super-closely.
             * Probably better to just output the entire usage notes if <= 5 inputs.
             */
            switch (args.length) {
                case 1: notes.add("Set true or false for if the basement is dark");
                case 2: notes.add("Set an age to the house.   Can be any integer");
                case 5: notes.add("Creak volume must be between 0.0 and 1.0");
                case 3: notes.add("Ghost name must be one of: " + Arrays.toString(GhostName.values()));
                case 4: notes.add("Is the ghost friendly?  Must be true or false"); break;
                case 0: notes.add("Well come on at least pass me something...");
            }
            for(String note : notes){
                System.out.println(note);
            }
            return;
        }
        System.out.println("You provided " + args.length + " arguments");

        // Convert any string inputs into the proper types:
        // Should come in as : dark, age, ghostName, ghostFriendly, creak, owner
        boolean dark = Boolean.parseBoolean(args[0]);
        int age = Integer.parseInt(args[1]);
        GhostName ghostName = GhostName.valueOf(args[2]);
        boolean ghostFriendly = Boolean.parseBoolean(args[3]);
        double creak = Double.parseDouble(args[4]);
        String owner = args[5];


        // Create a new House with the given parameters:
        HauntedBasement b1 = new HauntedBasement(dark, age, ghostName, ghostFriendly, creak, owner);
        // Print out the house:
        System.out.println("Grats on your haunted basement!  Too bad you sunk all your money into the house and can't move.  Time to hire a priest");
        System.out.println(b1);
    }
}