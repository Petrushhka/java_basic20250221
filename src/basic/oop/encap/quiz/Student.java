package basic.oop.encap.quiz;

public class Student {

    private String name;
    private int studentId;
    private String department;

    public void setName(String name, int studentId, String department) {
        if (name.equals(" ") || studentId <= 0 || department.equals(" ")) {
            System.out.println("다시 입력하세요.");
        } else
            this.name = name;
        this.department = department;
        this.studentId = studentId;
        System.out.println(this.name + " " + this.studentId + " " + this.department + " ");
    }

    ;

}
