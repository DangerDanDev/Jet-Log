package logbook;

public class LogEntry {

    /**
     * The discrepancy that the actions taken in this log entry
     * were intended to fix
     */
    private long parentDiscrepancy;

    /**
     * A description of what remains to be done on the job.
     */
    private String turnover;

    /**
     * The shift that accomplished the work in the log entry
     */
    private Shift shift;

    public LogEntry(long parentDiscrepancy) {
        this.setParentDiscrepancy(parentDiscrepancy);
    }

    public long getParentDiscrepancy() {
        return parentDiscrepancy;
    }

    public void setParentDiscrepancy(long parentDiscrepancy) {
        this.parentDiscrepancy = parentDiscrepancy;
    }

    public String getTurnover() {
        return turnover;
    }

    public void setTurnover(String turnover) {
        this.turnover = turnover;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }
}
