class Student{
    int id;
    String name;
    Student(int i,String n){
    id = i;
    name = n;
    }
    void display(){
    	System.out.println("Student ID: "+id+", Name: "+name);
    }
}
public class ParameterizedConstructor{
    public static void main(String args[]){
    Student s1 = new Student(111,"Joseph");
    Student s2 = new Student(222,"John");
    s1.display();
    s2.display();
   }
}
