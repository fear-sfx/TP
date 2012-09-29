#include <stdio.h>

int prime(int x);

const size = 10;

int main(){
	system("clear");
	
	int x, arr[size], sum=0;
	do{
		printf("Enter x>0 : ");
		scanf("%d", &x);
	}while(x<=0);
	
	int i, c=0;
	for(i=1; c<size; i++){
		if( x%i == 0 ){
			if( i%2 != 0 ){
				arr[c] = i;
				c++;
			}
		}
	}
	
	for(i=0; i<size; i++){
		printf("%d\n", arr[i]);
	}
	
	printf("\nPrimes : \n");
	
	for(i=0; i<size; i++){
		if( prime(arr[i]) ){
			printf("%d\n", arr[i]);
		}
	}

	return 0;
}

int prime(int x){
	int i;
	for (i=2; i<x; i++)
    {
      if (x%i == 0 && i != x)
        return 0;
    }
    return 1;
}
