package edu.miu.cs.cs425.studentmgmt.model;

import javax.persistence.*;

@Entity
public class Transcript {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transcriptId;
    private String degreeTitle;

    @OneToOne(mappedBy = "transcript")
    private Student student;

    public Transcript() {
    }

    public Transcript(long transcriptId, String degreeTitle, Student student) {
        this.transcriptId = transcriptId;
        this.degreeTitle = degreeTitle;
        this.student = student;
    }

    public Transcript(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    public long getTranscriptId() {
        return transcriptId;
    }

    public void setTranscriptId(long transcriptId) {
        this.transcriptId = transcriptId;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Transcript{" +
                "primaryKey=" + transcriptId +
                ", degreeTitle='" + degreeTitle + '\'' +
                '}';
    }
}
