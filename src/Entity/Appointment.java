package Entity;

public class Appointment {
    private String sid;
    private String testid;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getTestid() {
        return testid;
    }

    public void setTestid(String testid) {
        this.testid = testid;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "sid='" + sid + '\'' +
                ", testid='" + testid + '\'' +
                '}';
    }
}
