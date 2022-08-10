package StudentClassModel;


public class Student {
	String name;
	int rollno;
	Course course;
	String yearofjoining;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String getYearofjoining() {
		return yearofjoining;
	}
	public void setYearofjoining(String yearofjoining) {
		this.yearofjoining = yearofjoining;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", course=" + course + ", yearofjoining="
				+ yearofjoining + "]";
	}
}
