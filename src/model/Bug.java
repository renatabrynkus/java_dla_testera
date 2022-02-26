package model;

public class Bug {
    private String bugDescription;
    private String email;
    private int priority;
    private boolean isBugClosed;

    public Bug(String bugDescription, String email, int priority) {
        this.bugDescription = bugDescription;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            System.out.println("Please enter a valid email address");
        } else {
            this.email = email;
        }
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


    // additional methods
    public void showAllInfo() {
        System.out.println("Bug description is: " + bugDescription + ", a person who reported is: " + email
                + ", " + "bug priority is: " + priority + ", is this bug closed: " + isBugClosed + ".");
    }

    public void showWhoReportedBug() {

        System.out.println("The person who reported a bug is " + email);
    }

    public void showBugStatus() {
        System.out.println("Is the bug closed? " + isBugClosed);
    }
}