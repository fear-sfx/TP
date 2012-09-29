#include <stdio.h>

int fib(int x);

const size = 10;

int main(){
	system("clear");
	
	int x, arr[size], sum=0;
	do{
		printf("Enter 0<x<10 : ");
		scanf("%d", &x);
	}while(x<=0 || x>=10);
	
	int i, c=0;
	for(i=0; c<size; i++){
		if( fib(i)%10 == x ){
			arr[c] = fib(i);
			c++;
		}
	}
	
	for(i=0; i<size; i++){
		printf("%d\n", arr[i]);
	}

	return 0;
}

int fib(int x){
	if(x == 0){
		return 0;
	}
	else{
		if(x == 1 || x == 2){
			return 1;
		}
		else{
			return ( fib(x-1) + fib(x-2) );
		}
	}
}
