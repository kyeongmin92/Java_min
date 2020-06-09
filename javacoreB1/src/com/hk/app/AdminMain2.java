package com.hk.app;

import java.util.Scanner;
import com.hk.app.dao.*;
import com.hk.app.vo.*;

public class AdminMain2 {

	public static void main(String[] args) {
				
		// 아이디 입력받아서
		System.out.println("검색할 아이디를 입력하시오");
		Scanner scan = new Scanner(System.in);
		String id = scan.next();
		
		// 해당 아이디의 정보를 출력해보자
		WorkerDao worker = new WorkerDao();
		WorkerVo result = new WorkerVo();
		worker.getWorkerById(id);
		
		System.out.println("입력한아이디: "+result.getId());
		System.out.println("입력한비밀번호: "+result.getPwd());
		System.out.println("입력한이름: "+result.getName());
		System.out.println("입력한폰넘버: "+result.getPhone());

	}

}
