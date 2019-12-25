package Entity;

public class Test {

    private String testid;
    private String tid;
    private String kcid;
    private String kcname;
    private String time;
    private String place;

    public String getTestid() {
        return testid;
    }

    public void setTestid(String testid) {
        this.testid = testid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getKcid() {
        return kcid;
    }

    public void setKcid(String kcid) {
        this.kcid = kcid;
    }

    public String getKcname() {
        return kcname;
    }

    public void setKcname(String kcname) {
        this.kcname = kcname;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }


    @Override
    public String toString() {
        return "Test{" +
                "testid='" + testid + '\'' +
                ", tid='" + tid + '\'' +
                ", kcid='" + kcid + '\'' +
                ", kcname='" + kcname + '\'' +
                ", time='" + time + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}
