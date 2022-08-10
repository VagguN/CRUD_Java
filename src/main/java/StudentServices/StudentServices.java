package StudentServices;

import java.util.List;

import StudentClassModel.Student;
import Student_Database.Studentdata;
import Student_Database.database;

public class StudentServices implements Studentdata{
	database objDatabase=new database();
	public void insert(Student std) {
		objDatabase.insert(std);
	}
	public Student read(int rollnumber) {
		Student temp=objDatabase.read(rollnumber);
		return temp;
			 
	}
	public void delete(int rollnumber) {	
		objDatabase.delete(rollnumber);
	}
	public void update(Student tempStudent) {
		objDatabase.update(tempStudent);		
	}
	public List<Student> listall() {
		return objDatabase.listall();
	}

}
