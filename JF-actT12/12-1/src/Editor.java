public class Editor extends SkilledEmployee{
    private boolean prefersPaperEditing;

    public void setPrefersPaperEditing(boolean prefer) {
        this.prefersPaperEditing = prefer;
    }

    public String getEditingPreference() {
        if (prefersPaperEditing) {
            return "Paper";
        } else {
            return "Electronic";
        }
    }

    public void print() {
        super.print();
        System.out.println("This editor prefers to edit on " + this.getEditingPreference());
    }
}
