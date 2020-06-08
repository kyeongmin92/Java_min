package com.hk.app;

import java.util.Scanner;

import com.hk.app.dao.WorkerDao;

public class AdminMain {

	public static void main(String[] args) {
		
		System.out.println("관리자프로그램");
		Scanner scan = new Scanner(System.in);
	/*	System.out.print("id를 입력하시오: ");
		String id = scan.next(); // next는 공백있으면 안됨
		
		System.out.print("pw를 입력하시오: ");
		String pw = scan.next(); */
						
		
		WorkerDao wd = new WorkerDao(); // worker 테이블에 sql 문
		// int result=wd.getTotalWorker();
		// System.out.println("총 인원=" + result);
	/*	int login =wd.checkLogin(id, pw);
		if(login==1) {
			System.out.println("로그인성공!");
		} else {
			System.out.println("로그인실패!");
		}   */
		
		//id 입력하면 전화번호를 수정하시오(연습)
		//id, phone
		// updatePhone(id, phone)
		System.out.print("id를 입력하시오: ");
		String id = scan.next(); 
		
		System.out.print("수정할 폰번호를 입력하시오: ");
		String phone = scan.next();
		
		int chg =wd.updatePhone(id, phone);
		if(chg==1) {
			System.out.println("변경성공!");
		} else {
			System.out.println("변경실패!");
		}

	}

}
