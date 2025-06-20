package model;

public class Student{
    private int id;
    private String name;
    private String grade;

    public Student(int id,String name,String grade){
        this.id=id;
        this.name=name;
        this.grade=grade;
    }
    public  void setid(int id){
        this.id=id;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setgrade(String grade){
        this.grade=grade;
    }

    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getgrade(){
        return grade;
    }

}