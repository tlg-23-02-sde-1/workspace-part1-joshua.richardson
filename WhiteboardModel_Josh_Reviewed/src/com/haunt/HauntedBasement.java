package com.haunt;

/**
 * JR: very good overall, demonstrates strong understanding of program concepts.
 * Like the creativity you applied, and the ascii art is a real nice touch.
 * Minor improvements needed in several areas, and class constants not used for min/max creakVolume.
 *
 * Make better use of your accessor (get/set) methods from the other methods.
 *
 * Code formatting needs a bit of improvement.
 *  Include a blank line between each method, otherwise looks too crowded,
 *  and there are some minor tabbing irregularities.
 *
 * See comments below and in the other classes.
 *
 * Class participation is excellent, keep it up.
 *
 * Class names, package names, and overall structure are not correct.
 *  Incorrect ClientArgs class name, should be HauntedBasementClientArgs.
 */
public class HauntedBasement {
//        Properties:
    private boolean dark = true;    // JR: perhaps 'isDark' is better
    private int age;
    private GhostName ghostName;
    private boolean ghostFriendly;  // JR: 'isGhostFriendly'
    private double creakVolume;
    private String owner = "No one";

//    Constructors
    public HauntedBasement() {}
    public HauntedBasement(GhostName ghostName){
        setGhostName(ghostName);
    }
    public HauntedBasement(GhostName ghostName, boolean ghostFriendly){
        this(ghostName);
        setGhostFriendly(ghostFriendly);
    }
    public HauntedBasement(boolean dark, int age, GhostName ghostName,
                           boolean ghostFriendly, double creak, String owner){
        this(ghostName, ghostFriendly);
        setDark(dark);
        setAge(age);
        setCreakVolume(creak);
        setOwner(owner);
    }


//    Methods:
    // JR: setDark(false)
    public void turnLightOn() {
        this.dark = false;
    }
    public void speakToGhost(String name) {
        // JR: if (isGhostFriendly())
         if(this.ghostFriendly){
           System.out.println("The friendly ghost, " + name + ", shows the hidden money");
         }
         else {
            System.out.println("Demi Lovato begins to sing to " + name + " in an attempt to heal the ghost's trauma.");
             // JR: setGhostFriendly(true)
             this.ghostFriendly = true;
         }
    }
    public void openDoor(){
        // JR: if (getCreakVolume() >= 0.5)
         if(this.creakVolume >= .5){
             System.out.println("As we opened the door to " + this.owner + "'s basement, the creaking sound explodes all around us");
         }
        else{
            System.out.println("The door to " + this.owner + "'s basement swings open with a gentle sound of its age.");
         }
    }
    public void sayGoodBye(){
        // JR: if (isDark())
         if (this.dark) {
             System.out.println("We don't bother turning the lights on, but still say goodbye to " + getGhostName() + "!");
         }
         else {
             System.out.println("Too afraid to turn off the lights, we wave goodbye to " + getGhostName() + ".");
         }

    }




    //    Getters and Setters
    public boolean isDark() {
        return dark;
    }
    public void setDark(boolean dark) {
        this.dark = dark;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public GhostName getGhostName() {
        return this.ghostName;
    }
    public void setGhostName(GhostName ghostName) {
        this.ghostName = ghostName;
    }

    // JR: unnecessary, since you have an enum for this and the setter above
    public void setGhostName(String name) {
        if (name.equals("BRANDON") ||
                name.equals("CALEB") ||
                name.equals("CAT") ||
                name.equals("CHAD") ||
                name.equals("CHANCE") ||
                name.equals("CHRIS") ||
                name.equals("JESSICA") ||
                name.equals("JORDAN") ||
                name.equals("JORGE") ||
                name.equals("JOSH") ||
                name.equals("JUSTIN") ||
                name.equals("LILY") ||
                name.equals("STEPHEN")) {
            // JR: you could delegate to the other setter for this
            // setGhostName(GhostName.valueOf(name));
            this.ghostName = GhostName.valueOf(name);
        } else {
            System.out.println("You failed to give an appropriate ghost name");
        }
    }
    public boolean isGhostFriendly() {
        return ghostFriendly;
    }
    public void setGhostFriendly(boolean ghostFriendly) {
        this.ghostFriendly = ghostFriendly;
    }
    public double getCreakVolume() {
        return creakVolume;
    }

    // JR: no magic numbers (0.0 and 1.0), use class constants instead MIN/MAX_CREAK_VOLUME
    public void setCreakVolume(double creakVolume) {
        if (0.0 <= creakVolume && creakVolume <= 1.0) {
            this.creakVolume = creakVolume;
        } else {
            System.out.println("creakVolume constrains between 0.0 and 1.0");
        }
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    // JR: no line breaks ("\n") in this string, it should render as one long line
    public String toString(){
        return String.format(
            "Basement is dark: %s, House Age: %d, Ghost Name: %s, \nGhost Friendly: %s, creak volume: %f, House Owner: %s",
                isDark(), getAge(), getGhostName(), isGhostFriendly(), getCreakVolume(), getOwner());

    }
}