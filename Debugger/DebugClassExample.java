public class DebugClassExample {
    public static void main(String[] args) {
        Student student1 = new Student("Suzuki", 75);

        student1.addScore(10); // ★ここにブレークポイント

        String grade = student1.getGrade();
        System.out.println(student1.getName() + "さんの成績は " + grade + " です。");
    }
}
