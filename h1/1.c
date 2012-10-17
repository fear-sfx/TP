/*
# Технологично училище Електронни системи - http://http://www.elsys-bg.org/
# 11б клас
# №27
# Тодор Маноилов
# Да се разработи програма, която изисква от потребителя да въведе две целочислени числа, x и y, където x < y. 
Да се намери сумата на всички нечетни числа в интервала [x,y].
*/

#include <stdio.h>

int main(){
	system("clear");
	
	int x,y,s=0;
	
	printf("Enter x : ");
	scanf("%d", &x);
	do{
//		system("clear");
		printf("Enter y>x : ");
		scanf("%d", &y);
	}while(x>=y);
	
	int i;
	for(i=x; i<=y; i++){
		if(i%2 != 0){
			s += i;
		}
	}
	
	printf("Result : %d \n", s);

	return 0;
}
