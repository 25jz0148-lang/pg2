public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void addScore(int points) {
        this.score += points;
    }

    public String getGrade() {
        if (this.score >= 80) {
            return "A";
        } else if (this.score >= 60) {
            return "B";
        } else {
            return "C";
        }
    }

    public String getName() {
        return name;
    }
}
