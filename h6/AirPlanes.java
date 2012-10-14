// Технологично училище Електронни системи - http://www.elsys-bg.org/
// клас : 11б
// номер : 27
// име : Тодор Маноилов
// задача : Да се разработи програма симулираща местата в самолет (27 реда, 2 колони и по 3 места в колона).
// На случаен принцип се генерират числа (между 1 и 3), определящи броя на пътниците, които ще се качат на самолета,
// като те задължително трябва седят един до друг. Програмата спира, когато целият самолет е пълен.

import java.util.Random;

public class AirPlanes{

	private int[][] seats = new int[6][27];

	public void printSeats(){

		for(int i = 0; i<26; i++){
			for(int j = 0; j < 6; j++){
				System.out.print(seats[j][i]);
				if(j == 2){
					System.out.print("|  |");
				}
			}
			System.out.println();
		}
	}
	public void addPpl(int rval){
		boolean free = false;
		int i = 0, j = 0, flag = 0;
		while(free == false){
			if(seats[j][i] == 0){
				if(j+rval <= 6){
					for(int t = 0; t < rval; t++){
						if(seats[j+t][i] != 0){
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
				seats[j+t][i] = rval;
			}
		}
	}

	public int freeSeats(){
		int counter = 0;
		for(int i = 0; i < 27; i++){
			for(int j = 0; j < 6; j++){
				if(seats[j][i] == 0){
					counter++;
				}
			}
		}
		return counter;
	}


	public static void main(String[] args) throws Exception{

	// GENERATIN NUMS
		AirPlanes plane = new AirPlanes();

		System.out.println("Free seats before : " + plane.freeSeats());

		while(plane.freeSeats() != 0){
			int rval = new Random().nextInt(3) + 1;
			plane.addPpl( rval );
		}
		plane.printSeats();

		System.out.println("Free seats after : " + plane.freeSeats());

	}
}
