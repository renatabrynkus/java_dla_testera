public class Bug {
    String bugDescription;
    String email;
    int priority;
    boolean isBugClosed;

    Bug(String bugDescription, String email, int priority, boolean isBugClosed) {
        this.bugDescription = bugDescription;
        this.email = email;
        this.priority = priority;
        this.isBugClosed = isBugClosed;
    }

    void showAllInfo() {
        System.out.println("Bug description is: " + bugDescription + ", " + "a person who reported is :" + email
                + ", " + "bug priority is: " + priority + "is this bug closed: " + isBugClosed + ".");
    }

    void showWhoReportedBug() {
        System.out.println("The person who resported a bug is " + email);
    }

    void showBugStatus() {
        System.out.println("Is the bug closed? " + isBugClosed);

    }

    int getBugPriority() {
        return priority;

    }
}
