package MVC;

public class Main {
    public static void main(String[] args) {
        Student model = retriveStudentFromDataBase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model,view);
        controller.updateView();
//        controller.setStudentName("Durgesh");
//        controller.updateView();
    }

    private static Student retriveStudentFromDataBase(){
        Student student = new Student();
        student.setName("Durgesh Khot");
        student.setRollNo("1813");
        return student;
    }
}