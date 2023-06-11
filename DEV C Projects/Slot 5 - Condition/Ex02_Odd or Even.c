#include <stdio.h>
#include <conio.h>

// Program to check whether a number is odd or even

void main(){
	
	int num , result ;

	printf("Enter a number: ");
	scanf("%d",&num);

	result = num % 2;
	
	if (result == 0){
		printf("Then number is Even");
	}
	else{
		printf("The number is Odd");	
	}
	
	getch();
}


