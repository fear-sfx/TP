#include <stdio.h>

int prime(int x);
int end_three(int x);

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
	for(i=x; i<y; i++){
		if( prime(i) ){
			if( end_three(i) ){
				printf("%d \n", i);
			}
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

int end_three(int x){
	if( x%10 == 3 ){
		return 1;
	}
	return 0;
}
