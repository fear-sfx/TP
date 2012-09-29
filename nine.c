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
