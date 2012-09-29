#include <stdio.h>

int main(){
	system("clear");
	
	int x,y,s=0;
	
	printf("Enter x : ");
	scanf("%d", &x);
	
	
		printf("Enter y>x : ");
		scanf("%d", &y);
		
	s = x / y;
	
	printf("Result : %d \n", s);

	return 0;
}
