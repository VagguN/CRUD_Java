package Student_Database;

import java.util.ArrayList;
import java.util.List;

import StudentClassModel.Student;

public class database {
	List<Student> s1=new ArrayList<>();
	
	public void insert(Student std) {
		s1.add(std);
	}
	public Student read(int rollnumber) {
		for(Student t1:s1) 
			if(t1.getRollno()==rollnumber) 
				return t1;
		return null;
	}
	public void delete(int rollnumber) {
		for(Student t1:s1) 
			if(t1.getRollno()==rollnumber) 
				s1.remove(t1);
	}
	public void update(Student tempStudent) {	
		for(Student t1:s1) 
			if(t1.getRollno()==tempStudent.getRollno()) {
				t1.setCourse(tempStudent.getCourse());
				t1.setName(tempStudent.getName());
				t1.setYearofjoining(tempStudent.getYearofjoining());
			}
	}
	public List<Student> listall() {
		return s1;
	}
	
}
