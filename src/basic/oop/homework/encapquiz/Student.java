package basic.oop.homework.encapquiz;

public class Student {

    private String name;
    private int studentId;
    private String department;

    public void setName(String name){
        if(name != null && name.equals("")){
            this.name = name;
        }
        else{
            System.out.println("다시 입력하세요.");
            return;
        }
    }

    public void setStudentId(int num){
        if(num != 0 ){
            this.studentId = num;
        }
        else{
            System.out.println("다시 입력하세요");
            return;
        }
    }

    public void setDepartment(String department){
        if(department != null && department.equals("")){
            this.department = department;
        }else{
            System.out.println("다시 입력하세요.");
            return;
        }
    }

    public String getName(){
        return this.name;
    }

    public int getStudentId(){
        return this.studentId;
    }

    public String getDepartment(){
        return this.department;
    }

}
