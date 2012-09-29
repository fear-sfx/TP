#include <stdio.h>

int fib(int x);

const size = 10;

int main(){
	system("clear");
	
	int x, arr[size];
	do{
		printf("Enter 0<=x<10 : ");
		scanf("%d", &x);
	}while(x<0 || x>=10);
	
	int i=0,n=0;
	while(n<size){
		if( fib(i)%x == 0 ){
			arr[n]=fib(i);
			n++;
		}
		i++;
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
