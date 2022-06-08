package com.example;

public class StudentController {
    private  Student model;
    private StudentView view;

    //All args constructor
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    public void setStudentName( String name){
        model.setName(name);
    }
    public String getStudentName(){
        return model.getName();
    }
    public void setStudentRollNo(String rollNo){
        model.setRollno(rollNo);
    }
    public String getStudentRollNo(){
        return model.getRollno();
    }
    public void updatedView(){
        view.printStudentDetails(model.getName(), model.getRollno());
    }
}
