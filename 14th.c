#include <stdio.h>

int prime(int x);

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
		if( prime(i) ){
			if( i%10 == x ){
				arr[c] = i;
				c++;
			}
		}
	}
	
	for(i=0; i<size; i++){
		printf("%d\n", arr[i]);
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

