import java.util.ArrayList;

public class student_runner {

    public static void main(String[] args) {
        ArrayList<student> student_list = new ArrayList<>();

        // Adds students to the student_list object
        student s1 = new student("Alice", 101);
        s1.add_grade(85); s1.add_grade(90); s1.add_grade(78);
        student_list.add(s1);

        student s2 = new student("Bob", 102);
        s2.add_grade(92); s2.add_grade(88); s2.add_grade(95);
        student_list.add(s2);

        student s3 = new student("Charlie", 103);
        s3.add_grade(70); s3.add_grade(60); s3.add_grade(65);
        student_list.add(s3);

        // Finds and prints student data from student_list
        System.out.println("Processing...");
        for (student temp : student_list) {
            double d = temp.get_average();
            String grade;
            if (d >= 90) grade = "A";
            else if (d >= 80) grade = "B";
            else if (d >= 70) grade = "C";
            else if (d >= 60) grade = "D";
            else grade = "F";

            System.out.println("ID: " + temp.id_num + " | Name: " + temp.name + " | Avg: " + d + " | Grade: " + grade);
        }

        // Finds the student with the highest average and prints their grade.
        double best = -1;
        String name = "";
        for (student temp : student_list) {
            if (temp.get_average() > best) {
                best = temp.get_average();
                name = temp.name;
            }
        }
        System.out.println("Top: " + name + " with " + best);

        // Finds and prints student with a below 70% average.
        System.out.println("Needs Help:");
        for(student temp : student_list) {
            if(temp.get_average() < 70) {
                System.out.println(temp.name);
            }
        }
    }
}