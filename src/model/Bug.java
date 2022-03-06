package model;

public class Bug implements ConsoleNotification {
    private String bugDescription;
    private BugReporter bugReporter;
    private int priority;
    private boolean isBugClosed;

    public Bug(String bugDescription, BugReporter bugReporter, int priority) {
        this.bugDescription = bugDescription;
        this.bugReporter = bugReporter;
        this.priority = priority;
        this.isBugClosed = false;
    }

    // getters and setters
    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 20) {
            System.out.println("Bug description is too short.");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        if (priority < 1 || priority > 5) {
            System.out.println("Priority must be between 1 and 5.");
        } else {
            this.priority = priority;
        }
    }

    public boolean getIsBugClosed(){
        return isBugClosed;
    }

    public void setIsBugClosed(boolean isBugClosed){
        this.isBugClosed = isBugClosed;
        notifyStatusChange();
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("There was a change of bug status");
    }

    public void showBugStatus() {
        System.out.println("Is the bug closed? " + isBugClosed);
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + bugDescription + '\'' +
                ", bugReporter=" + bugReporter +
                ", priority=" + priority +
                ", isBugClosed=" + isBugClosed +
                '}';
    }
}
