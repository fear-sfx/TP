#include <stdio.h>

int fib(int x);

int main(){
	system("clear");
	
	int x,y;
	
	printf("Enter x : ");
	scanf("%d", &x);
	do{
//		system("clear");
		printf("Enter y>x : ");
		scanf("%d", &y);
	}while(x>=y);
	
	int i;
	for(i=x; i<=y; i++){
		if( fib(i)>=x && fib(i)<=y ){
			printf("%d \n", fib(i));
		}
		else{
			break;
		}
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
