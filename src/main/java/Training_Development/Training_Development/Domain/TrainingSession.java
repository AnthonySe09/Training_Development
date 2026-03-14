package Training_Development.Training_Development.Domain;

import java.util.Date;

public class TrainingSession {

    private int sessionId;
    private String topic;
    private Date date;
    private int duration;

    public TrainingSession() {
    }

    public TrainingSession(int sessionId, String topic, Date date, int duration) {
        this.sessionId = sessionId;
        this.topic = topic;
        this.date = date;
        this.duration = duration;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}