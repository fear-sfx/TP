/*
# Технологично училище Електронни системи - http://http://www.elsys-bg.org/
# 11б клас
# №27
# Тодор Маноилов
# Да се разработи програма, която изисква от потребителя да въведе число x, където 0<x<1. Да се намери числото пи чрез следното развитие в ред:
4-4/3+4/5-4/7+4/9-4/11+...4/N. Развитието в ред спира при 4/N<x. Получената стойност за пи да се изведе на екрана.
*/

#include <stdio.h>

int main(){
	system("clear");
	
	float x,N,res,i=3;
	
	do{
		printf("Enter 0<x<1 : ");
		scanf("%f", &x);
	}while(x>=1 || x<=0);
	
	res=4;
	do{
		N = 4/i;
		res -= N;
		i += 2;
		N = 4/i;
		res += N;
		i += 2;
	}while(N>=x);
	
	printf("Result : %f \n", res);

	return 0;
}
