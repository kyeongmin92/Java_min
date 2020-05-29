package Exam;

public class Exam05 {
	/*
	5. 텔레비전을 모델하는 Monitor클래스를 설계하라
	텔레비전은 브랜드명(brand) 색상(color)과 화면크기(size)를 가진다
	( 화면크기는 double 로 선언한다 )
	
	텔레비전이 브랜드명, 색상과 화면크기를 알 수 있는 함수
	GetBrand(),	GetColor(),	GetSize()
	
	브랜드명, 색상, 화면크기를 정할 수 있는 함수를 가진다
	SetBrand(brand),SetColor(color),SetSize(size)
	*/
	
	String brand;
	String color;
	double size;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
	
	

}
