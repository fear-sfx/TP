#include <stdio.h>
#include <math.h>

void sort(double *arr, int n);

const size = 10;

int main(){
	system("clear");
	
	int x;	
	double arr[size];
	
	do{
		printf("Enter 0<x<10 : ");
		scanf("%d", &x);
	}while(x<0 || x>10);
	
	int i;
	for(i=0; i<10; i++){
		arr[i] = cos(i);
	}
	
	sort(arr, size);
	
	for(i=0; i<10; i++){
		printf("%.4f \n", arr[i]);
	}
	
	return 0;
}

void sort(double *arr, int n){
	int i,j;
	double t;
	for(i=1; i != n; i++){
		for(j=0; j != n-1; j++){
			if(arr[i] > arr[j]){
				t = arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
	}
}

