package com.stasian4k;

import java.time.LocalDate;

public class Essay {
    private final int id;
    private final int studentId;
    private final String title;
    private final String content;
    private final LocalDate submissionDate;

    public Essay(int id, int studentId, String title, String content, LocalDate submissionDate) {
        this.id = id;
        this.studentId = studentId;
        this.title = title;
        this.content = content;
        this.submissionDate = submissionDate;
    }

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    @Override
    public String toString() {
        return "Essay{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", title='" + title + '\'' +
                ", submissionDate=" + submissionDate +
                '}';
    }

    public String getFullText() {
        return "=== " + title + " ===\n" +
                "Студент ID: " + studentId + "\n" +
                "Дата здачі: " + submissionDate + "\n\n" +
                content;
    }
}
