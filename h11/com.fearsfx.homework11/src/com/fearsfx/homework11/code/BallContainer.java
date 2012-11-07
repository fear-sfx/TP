package com.fearsfx.homework11.code;

import java.util.*;

public class BallContainer {
	
	int size;
	List<Ball> ballList = new ArrayList<Ball>();
	
	
	public BallContainer(){
		size = 10;
	}

	public BallContainer(int val){
		size = val;
	}
	
	public void add(Ball ball){
		if(!ballList.contains(ball) && ballList.size() < size){
			ballList.add(ball);
		}else{
			System.out.println("Ball is already in the container or the container is full.");
		}
	}
	
	public void remove(Ball ball){
		if(!ballList.contains(ball) || ballList.isEmpty()){
			System.out.println("Ball is not in the container.");
		}else{
			ballList.remove(ball);
		}
	}
	
	public int capacity(){
		return size - ballList.size();
	}
	
	public int size(){
		return size;
	}
	
	public void clear(){
		ballList.clear();
	}
	
	public boolean contains(Ball ball){
		return ballList.contains(ball);
	}
}
