#include <stdio.h>
#include <math.h>

const size = 10;

int check( double n );

int main(){
	system("clear");
	
	int x;
	double arr[size], n;
	
	do{
		printf("Enter 0<=x<10 : ");
		scanf("%d", &x);
	}while(x<0 || x>=10);
	
	int i,c;
	for(c=0; c<10; c++){
		do{
			n = cos(i);
			i++;
			
		}while(check(n) != x);
		arr[c] = n;
	}
	
	for(i=0; i<10; i++){
		printf("%.4f \n", arr[i]);
	}
	
	return 0;
}

int check( double n ){
	int intN;				
	n *= 1000;
	intN = (int) n;
	return intN % 10;
}

