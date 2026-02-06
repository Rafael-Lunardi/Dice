public class ActivityTracker {
    private int targetGoal;
    private int totalMinutes;
    private int session;
    private int maxMinutes;


    public ActivityTracker(int targetGoal) {
        this.targetGoal = targetGoal;
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }

    public int getSessions() {
        return session;
    }

    public int getMaxMinutes() {
        return maxMinutes;
    }

    public boolean goalAchieved() {
        return (totalMinutes >= targetGoal);
    }

    public void logMinutes(int min) {
        totalMinutes += min;
        if (min > maxMinutes) maxMinutes = min;
        session++;
    }
}
