package Exam;

public class Exam04 {
/*	4.학생을 모델하는 Student 클래스를 설계하라.
	학생은 학번(id)과 이름(name)을 가진다. 
	학생의 학번과 이름을 정할 수 있고 Setld(id), SetName(name)
	학번과 이름을 가져올 수 있어야 한다 Getld(), GetName()   */
     int id;
     String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
     
     
}
