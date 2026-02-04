public class Dice {
    private int sides;
    private int currentRoll;
    private int timesRolled;

    public Dice(int sides){
        sides = this.sides;
        currentRoll = 0;
        timesRolled = 0;
    }

    public void setSides(int sides){
        sides = this.sides;
    }

    public int roll(){
        currentRoll = (int) (Math.random()*sides+1);
        timesRolled++;
        return currentRoll;
    }

    public int getCurrentRoll() {
        return currentRoll;
    }

    public int getTimesRolled() {
        return timesRolled;
    }

    public int getSides() {
        return sides;
    }
}
