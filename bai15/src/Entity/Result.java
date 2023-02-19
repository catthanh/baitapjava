package Entity;

public class Result {
    double score;

    int semester;

    public Result(double score, int semester) {
        this.score = score;
        this.semester = semester;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
