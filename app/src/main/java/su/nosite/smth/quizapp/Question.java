package su.nosite.smth.quizapp;

/**
 * Created by Mi Notebok on 11.03.2018.
 */

public class Question {
    String q="empty";Boolean True=false;

    public Question(String q, Boolean aTrue) {
        this.q = q;
        True = aTrue;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public void setQ(String q, Boolean aTrue) {
        this.q = q;
        setTrue(aTrue);
    }


    public Boolean getTrue() {
        return True;
    }

    public void setTrue(Boolean aTrue) {
        True = aTrue;
    }
}
