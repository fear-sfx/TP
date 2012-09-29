#include <stdio.h>

const size = 10;

int main(){
	system("clear");
	
	int x;
	do{
		printf("Enter 0<x<10 : ");
		scanf("%d", &x);
	}while(x<=0 || x>=10);
	
	int beg=0, end=x, i, z;
	float n, arr[size];
	
	for(i=0; i<size; i++){
		n =0;
		for(z=beg; z<end; z++){
			n += cos(z);
		}
		beg += x;
		end += x;
		arr[i] = n;
	}
	
	for(i=0; i<size; i++){
		printf("%f\n", arr[i]);
	}

	return 0;
}

