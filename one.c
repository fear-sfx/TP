#include <stdio.h>

int main(){
	system("clear");
	
	int x,y,s=0;
	
	printf("Enter x : ");
	scanf("%d", &x);
	do{
//		system("clear");
		printf("Enter y>x : ");
		scanf("%d", &y);
	}while(x>=y);
	
	int i;
	for(i=x; i<=y; i++){
		if(i%2 != 0){
			s += i;
		}
	}
	
	printf("Result : %d \n", s);

	return 0;
}
