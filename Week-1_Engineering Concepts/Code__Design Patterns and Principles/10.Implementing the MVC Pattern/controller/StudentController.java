package controller;

import model.Student;
import view.StudentView;

public class StudentController {


    private Student model;
    private StudentView view;

    public StudentController(Student model,StudentView view){
        this.model=model;
        this.view=view;
    }

    public void setid(int id){
        model.setid(id);
    }
    public void setname(String name){
        model.setname(name);
    }
    public void setgrade(String grade){
        model.setgrade(grade);
    }

    public int getid(){
        return model.getid();
    }
    public String getname(){
        return model.getname();
    }
    public String getgrade(){
        return model.getgrade();
    }

    public void updateview(){
          view.displayStudent(model.getid(), model.getname(), model.getgrade());
    }



    
}
