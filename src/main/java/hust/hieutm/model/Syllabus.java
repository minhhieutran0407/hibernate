package hust.hieutm.model;

import javax.persistence.Embeddable;

@Embeddable
public class Syllabus {
    private String content;
    private int duration;

    public Syllabus() {
    }

    public Syllabus(String content, int duration) {
        this.content = content;
        this.duration = duration;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Syllabus{" +
                "content='" + content + '\'' +
                ", duration=" + duration +
                '}';
    }
}
