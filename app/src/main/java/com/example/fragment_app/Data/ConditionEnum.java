package com.example.fragment_app.Data;

import android.view.View;

public enum ConditionEnum {
    // define enum with 3 variable
    ACTIVE(1, "Active", true),
    LIST(2, "Fragment List", true),
    DESIRED_FM(3, "Desired Fragment", true);

    private int fragmentID;
    private String conditionTitle;
    private boolean isHistory;
//    private final int VISIBLE = View.VISIBLE;
//    private final int INVISIBLE = View.INVISIBLE;

    /**
     * constructor
     *
     * @param fragmentID
     * @param conditionTitle
     * @param isHistory
     */
    ConditionEnum(int fragmentID, String conditionTitle, boolean isHistory) {
        this.fragmentID = fragmentID;
        this.conditionTitle = conditionTitle;
        this.isHistory = isHistory;
    }

    // getter & setter
    public int getFragmentID() {
        return fragmentID;
    }

    public void setFragmentID(int fragmentID) {
        this.fragmentID = fragmentID;
    }

    public String getConditionTitle() {
        return conditionTitle;
    }

    public void setConditionTitle(String conditionTitle) {
        this.conditionTitle = conditionTitle;
    }

    public boolean isHistory() {
        return isHistory;
    }

    public void setIsHistory(boolean isHistory) {
        this.isHistory = isHistory;
    }
}
