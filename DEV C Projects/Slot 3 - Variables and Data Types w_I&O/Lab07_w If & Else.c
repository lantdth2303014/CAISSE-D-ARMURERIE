#include <stdio.h>
#include <conio.h>

int main(){
	
	float r;
	float d;
	float a;
	float b;
	int choice;
	
	printf("Press 1 if you want to calculate a circle, \nPress 2 if you want to calculate a square, \nPress 3 if you want to calculate a rectangle");
	printf("\nYour input: ");
	scanf("%d", &choice);
	
	if(choice == 1){
		printf("Enter r: ");
		scanf("%f", &r);
	
		printf("Enter d: ");
		scanf("%f", &d);
		
		printf("Parameter of the Circle is: %.1f \n", 2*r*3.14);
		printf("Area of the Circle is: %.1f \n", 3.14*r*r);
	}
	else if(choice == 2){
		printf("Enter a: ");
		scanf("%f", &a);
	
		printf("Parameter of the Square is: %.1f \n", a*4);
		printf("Area of the Square is: %.1f \n", a*a);
	}
	else if(choice == 3){
		printf("Enter a: ");
		scanf("%f", &a);
		
		printf("Enter b: ");
		scanf("%f", &b);
	
		printf("Parameter of the Rectangle is: %.1f \n", (a+b)*2);
		printf("Area of the Rectangle is: %.1f \n", a*b);
	}
	else{
		printf("Invalid input. Please try again.\n");
	}
	
	getch();
	return 0;
}
