package edu.uno.csci2830;

public class Health implements Calories {
    private final int calories;

    public Health(int calories) {
        this.calories = calories;
    }
    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return calories + " calories";
    }


}

