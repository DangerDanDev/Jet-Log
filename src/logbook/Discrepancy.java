package logbook;

/**
 * Represents an issue on an aircraft that needs to be solved. IE: PRD, broken part, T/S required, etc.
 * It is stored in the DiscrepanciesTable.
 */
public class Discrepancy {

    /**
     * Shift that discovered the issue
     */
    private Shift shiftDiscoveredBy;

    /**
     * Whether or not the discrepancy is a Pilot Reported Discrepancy
     */
    private boolean PRD;

    /**
     * Whether or not the discrepancy has been closed out (fixed)
     */
    private boolean open;

    /**
     * The final fix for the problem. What made it go away?
     */
    private String finalFix;

    /**
     * A short and sweet summary of the problem, meant to go on the
     * status board page.
     */
    private String snippet;

    public Shift getShiftDiscoveredBy() {
        return shiftDiscoveredBy;
    }

    public void setShiftDiscoveredBy(Shift shiftDiscoveredBy) {
        this.shiftDiscoveredBy = shiftDiscoveredBy;
    }

    public boolean isPRD() {
        return PRD;
    }

    public void setPRD(boolean PRD) {
        this.PRD = PRD;
    }

    /**
     *
     * @return true if the discrepancy is fixed, false if it has not been fixed.
     */
    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getFinalFix() {
        return finalFix;
    }

    public void setFinalFix(String finalFix) {
        this.finalFix = finalFix;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }
}
