#include <stdio.h>

const size = 10;

int main(){
	system("clear");
	
	int x, arr[size], sum=0;
	do{
		printf("Enter 0<x<10 : ");
		scanf("%d", &x);
	}while(x<=0 || x>=10);
	
	int i, c=0, div=x;
	do{
		for(i=0; i<1000; i++){
			if( i%div == 0){
				sum += i;
			}
		}
		arr[c] = sum;
		c++;
		div += x;
		sum = 0;
	}while(c<size);
	
	for(i=0; i<size; i++){
		printf("%d\n", arr[i]);
	}

	return 0;
}

