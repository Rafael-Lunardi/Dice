public class Main {
    public static void main(String[] args) {
        Dice dice1 = new Dice(6);
        System.out.println("--- CREATING A DICE OBJECT WITH " + dice1.getSides() + " SIDES ---");
        System.out.println("initial roll count = " + dice1.getCurrentRoll());

        dice1.getTimesRolled();
        System.out.println("initial roll value = " + dice1.getCurrentRoll());
        System.out.println();
        System.out.println("dice rolled: " + dice1.roll());
        System.out.println("roll count = " + dice1.getTimesRolled());
        System.out.println("most recent roll = " + dice1.getCurrentRoll());
        System.out.println();
        System.out.println("dice rolled: " + dice1.roll());
        System.out.println("roll count = " + dice1.getTimesRolled());
        System.out.println("most recent roll = " + dice1.getCurrentRoll());
        System.out.println();
        System.out.println("dice rolled: " + dice1.roll());
        System.out.println("dice rolled: " + dice1.roll());
        System.out.println("dice rolled: " + dice1.roll());
        System.out.println("roll count = " + dice1.getTimesRolled());
        System.out.println("most recent roll = " + dice1.getCurrentRoll());
        System.out.println();
        System.out.println("--- number of sides updated to 20 ---");
        dice1.setSides(20);
        System.out.println("dice rolled: " + dice1.roll());
        System.out.println("roll count = " + dice1.getTimesRolled());
        System.out.println("most recent roll = " + dice1.getCurrentRoll());
        System.out.println();
        System.out.println("dice rolled: " + dice1.roll());
        System.out.println("roll count = " + dice1.getTimesRolled());
        System.out.println("most recent roll = " + dice1.getCurrentRoll());
        System.out.println();
        System.out.println("dice rolled: " + dice1.roll());
        System.out.println("dice rolled: " + dice1.roll());
        int roll = dice1.roll();
        System.out.println("dice rolled: " + roll);
        System.out.println("roll count = " + dice1.getTimesRolled());
        System.out.println("most recent roll = " + dice1.getCurrentRoll());
        System.out.println();
        if (roll == dice1.getCurrentRoll()) {
            System.out.println("PASS");
        } else {
            System.out.println("!!!!!! FAIL: most recent roll not being tracked correctly ");
        }
        System.out.println();
        System.out.println("--- CREATING A SECOND DICE OBJECT WITH 10 SIDES ---");
        Dice dice2 = new Dice(10);
        System.out.println("dice 2 rolled: " + dice2.roll());
        System.out.println("dice 2 rolled: " + dice2.roll());
        System.out.println("dice 2 rolled: " + dice2.roll());
        System.out.println("dice 2 rolled: " + dice2.roll());
        System.out.println("dice 2 rolled: " + dice2.roll());
        System.out.println("dice 2 rolled: " + dice2.roll());
        System.out.println("dice 2 rolled: " + dice2.roll());
        roll = dice2.roll();
        System.out.println("dice 2 rolled: " + roll);
        System.out.println("dice 2 roll count = " + dice2.getTimesRolled());
        System.out.println("dice 1 roll count = " + dice1.getTimesRolled());
        System.out.println();
        if (roll == dice2.getCurrentRoll()) {
            System.out.println("PASS");
        } else {
            System.out.println("!!!!!! FAIL: most recent roll not being tracked correctly ");
        }
        if (dice1.getTimesRolled() == 10 && dice2.getTimesRolled() == 8) {
            System.out.println("PASS");
        } else {
            System.out.println("!!!!!! FAIL: roll count not being tracked correctly ");
        }

    }
}
