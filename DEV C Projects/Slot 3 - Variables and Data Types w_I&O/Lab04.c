#include <stdio.h>
#include <conio.h>

int main(){
	
	int C;
	
	printf("Enter C: ");
	scanf("%d", &C);
	
	printf("%d C is %d F", C, C * 9/5 + 32);
	
	getch();
	return 0;
}


