public class StepTracker {
    private int minSteps;
    private int activeDayCount;
    private int dailySteps;
    private int dayCount;

    public StepTracker(int minSteps){
        this.minSteps = minSteps;
        this.activeDayCount = 0;
        this.dailySteps = 0;
        this.dayCount = 0;
    }
    public void addDailySteps(int num){
        dayCount += 1;
        dailySteps += num;
        if (num >= minSteps) {
            activeDayCount += 1;
        }
    }
    public int activeDays(){
        return activeDayCount;
    }
    public int averageSteps(){
        if(dayCount !=0) {
            return dailySteps / dayCount;
        }
        else return 0;
    }
    public int getDays(){
        return dayCount;
    }
    public int getTotalSteps(){
        return dailySteps;
    }
    public int getStepsForActiveDay(){
        return minSteps;
    }
    public int getActiveDays(){
        return activeDayCount;
    }
}


