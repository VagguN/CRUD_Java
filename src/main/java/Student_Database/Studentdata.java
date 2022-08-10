package Student_Database;


import java.util.List;

import StudentClassModel.Student;

public interface Studentdata {
	public void insert(Student std);
	public Student read(int rollnumber);
	public void delete(int rollnumber) ;
	public void update(Student tempStudent) ;
	public List<Student> listall() ;
}
