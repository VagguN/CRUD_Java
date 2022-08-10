package Nagesh_Maven.Srudent_Project;

import StudentClassModel.Course;
import StudentClassModel.Student;
import StudentServices.StudentServices;


public class App {

    public static void main( String[] args )
    {
        Student objStudent=new Student();
        StudentServices services=new StudentServices();
        objStudent.setName("Nagesh vaggu");
        objStudent.setRollno(211545);
        objStudent.setYearofjoining("2022");
        objStudent.setCourse(new Course(789,"Java"));
        services.insert(objStudent);
        System.out.println("List of data\n "+services.listall().toString());
        
        objStudent=new Student();
        objStudent.setName("Shashi");
        objStudent.setRollno(1234);
        objStudent.setYearofjoining("2011");
        objStudent.setCourse(new Course(789,"Java Core"));
        services.insert(objStudent);
        System.out.println("New student data \n"+ services.listall().toString());
        try {
        System.out.println("Reading Student details "+ services.read(211545).toString());
        }
        catch(NullPointerException exp)
        {
        	System.out.println("Student doesnt exist");
        }
        System.out.println("Listing all Students \n"+ services.listall().toString());
        services.delete(211545);
        System.out.println("After Deleting 12345 student\n"+services.listall().toString());
        
        objStudent=new Student();
        objStudent.setName("Akshay");
        objStudent.setRollno(123456);
        objStudent.setYearofjoining("20121");
        objStudent.setCourse(new Course(789,"Java Core1"));
        services.update(objStudent);
        System.out.println("After updating 123456 student"+services.listall().toString());
    }
}
