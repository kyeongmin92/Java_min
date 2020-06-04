package com.hk.app;

public interface Handle {
	
	// 탈것의 핸들
	final int MAX = 10; // 이동 맥스값
	// int size; X
	public void moveLeft();
	public void moveRight();
	
	public void pullIn();
	public void putOut();
	

}
