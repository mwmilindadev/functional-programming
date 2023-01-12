import java.util.List;

class Course{
    private String name;
    private String catogory;
    private int reviewCourse;
    private int noOfStudents;


    public Course(String name, String catogory, int reviewCourse, int noOfStudents) {
        this.name = name;
        this.catogory = catogory;
        this.reviewCourse = reviewCourse;
        this.noOfStudents = noOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatogory() {
        return catogory;
    }

    public void setCatogory(String catogory) {
        this.catogory = catogory;
    }

    public int getReviewCourse() {
        return reviewCourse;
    }

    public void setReviewCourse(int reviewCourse) {
        this.reviewCourse = reviewCourse;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", catogory='" + catogory + '\'' +
                ", reviewCourse=" + reviewCourse +
                '}';
    }
}

public class FP04CustomCalss {

    public static void main(String[] args) {
        List<Course> courses= List.of(
                new Course("API","PROGRAAMING",20,4500),
                new Course("SPRING","PROGRAAMING",20,3500),
                new Course("SPRINGBOOT","PROGRAAMING",300,4562),
                new Course("AZURE","CLOUD",2000,5000),
                new Course("AWS","CLOUD",120,2500),
                new Course("JAVA","PROGRAAMING",220,400)

        );

    }




}
