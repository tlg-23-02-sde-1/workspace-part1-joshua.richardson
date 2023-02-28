package com.haunt.test;

import com.haunt.HauntedBasement;

/*
 * JR: good job overall, but the only validation logic you need to verify is setCreakVolume().
 * Test class should be focused only on that, the rest of it is superfluous.
 * You did use appropriate values for proper BVT (Boundary Value Testing), i.e.,
 *  -0.1, 0.0  and  1.0, 1.1
 *
 * You appear to be testing validation in setAge(), but that method isn't doing any.
 */
class HauntedBasementValidationTest {
    public static void main(String[] args) {
        HauntedBasement b1 = new HauntedBasement();
        System.out.println(b1);

        // Testing to see if everything sticks: (lower end)
        b1.setDark(false);
        b1.setAge(0);
        b1.setGhostName("JOSH");
        b1.setGhostFriendly(true);
        b1.setCreakVolume(0.0);
        b1.setOwner("Mr.Banana Pants of Saint Louis");
        System.out.println("\n\nTesting to see if sticks (lower end):\n" + b1);

        // Testing to see if everything sticks: (upper end)
        b1.setDark(true);
        b1.setAge(10000);
        b1.setGhostFriendly(false);
        b1.setCreakVolume(1.0);
        System.out.println("\n\nTesting to see if sticks(upper end):\n"+b1);

        // Testing to break on lower end
        b1.setAge(-1);
        b1.setCreakVolume(-0.1);
        System.out.println("\n\nEnsuring we break on lower end:\n" + b1);

        // Testing to break on upper end
        b1.setAge(10001);  // This should take.
        b1.setCreakVolume(1.1);
        System.out.println("\n\nEnsuring we break on upper end:\n" + b1);
    }
}