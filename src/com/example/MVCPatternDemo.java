package com.example;

public class MVCPatternDemo {

    public static void main(String[] args) {

        //Fetch student record based on his roll number from the database
        Student model = retrieveStudentFromDatabase();

        // Create a view : to write student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updatedView();


        //update model data
        controller.setStudentName("Abdi");

        controller.updatedView();

    }
    private static Student retrieveStudentFromDatabase() {
        Student student  = new Student();
        student.setName("Robert");
        student.setRollno("10");
        return student;

    }

}
