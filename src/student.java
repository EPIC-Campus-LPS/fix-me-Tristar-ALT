import java.util.ArrayList;

public class student
{
    public String name;
    public int id_num;
    private final ArrayList<Integer> grade_list;

    /**
     * A constructor for the student object.
     * @param name - The student's first name
     * @param id_num - The students identification number.
     */
    public student(String name, int id_num) {
        this.name=name;
        this.id_num = id_num;
        grade_list= new ArrayList<>();
    }

    /**
     * Adds a new grade to the student's grade list.
     * @param grade - Grade to be added (int)
     */
    public void add_grade(int grade) {
        grade_list.add(grade);
    }

    /**
     * Sums the grades of one student and divides them by the amount, resulting in an average.
     * @return double - Average of the students grades.
     */
    public double get_average() {
        if(grade_list.isEmpty()) return -1.0;
        double total = 0;
        for (Integer grade : grade_list) {
            total += grade;
        }
        return total / grade_list.size();
    }
}