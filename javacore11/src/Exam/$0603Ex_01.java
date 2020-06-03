package Exam;

public class $0603Ex_01 {
/*	캡슐화, 클래스 작성하시오
	hour, rate 멤버변수 (시간, 시간당 단가)
	생성자를 통해서 시간은 0과 시간당 단가를 10000원으로 초기화
	calPay()함수 - 페이를 계산하는 함수
	getHour() setHour() 함수작성
	getRate() setRate() 함수작성
	
	setRate(Stringid, String pw, int rate) 함수 오버로딩을 통하여 id가
	admin이고 pw 8090인 경우에만 rate를 변경하도록 하고 아니면 "관리자만 변경가능합니다!!"라고
	출력하는 함수 작성  */
	int hour;
	int rate;
	
	$0603Ex_01() {
		hour = 0;
		rate = 10000;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	
	public void setRate(String id, String pw, int rate) {
		if(id.equals("admin") && pw.equals("8090")) {
			this.rate =rate;
		} else {
			System.out.println("관리자만 변경가능합니다!!");
		}
	}
		
	 public void calPay() {
		int result = hour*rate;
		System.out.println(result);
	}
	 
	 
	 public static void main(String[] args) {
		 $0603Ex_01 test = new $0603Ex_01();
		 
		 test.setRate("admin","8090",6000);
		 System.out.println("변경된 금액: "+test.rate+"원");
		 test.setRate("admin","7000",15000);
		
		
		 
		 
	 }

}
