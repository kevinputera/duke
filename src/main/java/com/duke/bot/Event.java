package com.duke.bot;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Event extends Task {
    private LocalDate dateAt;

    public Event(String title, boolean isDone, LocalDate dateAt) {
        super(title, isDone);
        this.dateAt = dateAt;
    }

    public Event(String title, LocalDate dateAt) {
        super(title);
        this.dateAt = dateAt;
    }

    public LocalDate getDateAt() {
        return dateAt;
    }

    @Override
    public String toString() {
        return String.format(
                "[E][%s] %s (at: %s)",
                isDone() ? "\u2713" : "\u2717",
                getTitle(),
                dateAt.format(DateTimeFormatter.ofPattern("MMM d yyyy"))
        );
    }
}
