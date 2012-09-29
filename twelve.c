#include <stdio.h>

const size = 10;

int main(){
	system("clear");
	
	int x, arr[size], sum=0;
	do{
		printf("Enter 0<x<10 : ");
		scanf("%d", &x);
	}while(x<=0 || x>=10);
	
	int i, j, c=0;	
	for(i=0; c<size ; i++){
		if(i%x == 0){
			for(j=0; j<=i; j++){
				sum+=j;
			}
			arr[c]=sum;
			c++;
			sum=0;
		}
	}
	
	for(i=0; i<size; i++){
		printf("%d\n", arr[i]);
	}

	return 0;
}

