public class Score {
    String name;
    double score;
    int place;

    public Score(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public int compareTo(Score s) {
        if (s.score == score) {
            return 0;
        } else if (score > s.score) {
            return -1;
        } else {
            return 1;
        }
    }
}