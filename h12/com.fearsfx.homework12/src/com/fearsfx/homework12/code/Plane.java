package com.fearsfx.homework12.code;

public class Plane {

	private Human[][] seats = new Human[6][27];

	public void addHuman(int rval, Human[] ppl){
		boolean free = false;
		int i = 0, j = 0, flag = 0;
		while(free == false){
			if(seats[j][i] == null){
				if(j+rval <= 6){
					for(int t = 0; t < rval; t++){
						if(seats[j+t][i] != null){
							i++; j = 0;
							break;
						}else{
							free = true;
							if(j<3){
								flag = 1;
							}else{}
						}
					}
				}else{
					i++;j=0;
					if(i >= 27){
						break;
					}
				}
			}else{
				j++;
				if(j == 6){
					i++; j = 0;
					if(i >= 27){
						break;
					}
				}
			}
		}
		if(i<27){
			if(flag == 1 && j + rval > 3){
				j += (3 - j);
			}
			for(int t = 0; t < rval; t++){
				seats[j+t][i] = ppl[t];
			}
		}
	}
	public int getCapacity(){
		int counter = 0;
		for(int i = 0; i < 27; i++){
			for(int j = 0; j < 6; j++){
				if(seats[j][i] == null){
					counter++;
				}
			}
		}
		return counter;
	}
	public void removeHuman(int row, int col){
		seats[col - 1][row - 1] = null;
	}
	public int getMale(){
		int count = 0;
		for(int i = 0; i<27; i++){
			for(int j = 0; j < 6; j++){
				if(seats[j][i].getGender() == "Man"){
					count++;
				}
			}
		}
		return count;
	}
	public int getFemale(){
		int count = 0;
		for(int i = 0; i<27; i++){
			for(int j = 0; j < 6; j++){
				if(seats[j][i].getGender() == "Woman"){
					count++;
				}
			}
		}
		return count;
	}
	public void clear(){
		for(int i = 0; i<27; i++){
			for(int j = 0; j < 6; j++){
				seats[j][i] = null;
			}
		}
	}
}
