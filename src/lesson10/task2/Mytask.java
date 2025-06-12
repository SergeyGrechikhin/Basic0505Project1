package lesson10.task2;

public class Mytask {
    String bed ;
    String wash ;
    String study ;

    public Mytask(String bed, String study, String wash) {
        this.bed = bed;
        this.study = study;
        this.wash = wash;
    }

    public String getBed() {
        return bed;
    }

    public String getStudy() {
        return study;
    }

    public String getWash() {
        return wash;
    }

    @Override
    public String toString() {
        return "Mytask{" +
                "bed='" + bed + '\'' +
                ", wash='" + wash + '\'' +
                ", study='" + study + '\'' +
                '}';
    }
}
