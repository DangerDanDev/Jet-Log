package logbook;

import java.sql.Date;

/**
 * Super Class for LogEntry, Discrepancy, and DebriefEntry classes
 */
public class EventParent {

    /**
     * Unique Identifier in the database
     */
    private final long id;

    /**
     * The detail of the event in question
     */
    private String text;

    /**
     * The date the event conspired
     */
    private Date date;

    /**
     * The tail number this event occurred on
     */
    private long tailNumber;

    /**
     * Creates a log ID with
     * @param id
     */
    public EventParent(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(long tailNumber) {
        this.tailNumber = tailNumber;
    }
}
