/*
# Технологично училище Електронни системи - http://http://www.elsys-bg.org/
# 11б клас
# №27
# Тодор Маноилов
# Да се разработи програма, която изисква от потребителя да въведе целочислено число x, където 0<x<10. Да се инициализира масив от 100 целочислени елемента. Стойностите на елементите да са случайни числа в интервала [0, 100). Елементите на масива да се подредят така, че числата завършващи на x да са в началото.
*/

#include <stdio.h>
#include <math.h>

const size = 100;

void sort(int *arr, int n, int x);

int main(){
	system("clear");
	srand(time(NULL));
	
	int x,arr[size];
	do{
		printf("Enter 0<x<10 : ");
		scanf("%d", &x);
	}while(x<=0 || x>10);
	
	int i;
	for(i=0; i<size; i++){
		arr[i] = rand()%100;
	}
	
	sort(arr, size, x);
	
	for(i=0; i<size; i++){
		printf("%d \n", arr[i]);
	}
	
	return 0;
}

void sort(int *arr, int n, int x){
	int i,j,t;
	for(i=1; i != n; i++){
		for(j=0; j != n-1; j++){
			if( (arr[i]%10 == x) && (arr[j]%10 != x) ){
				t = arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
	}
}
