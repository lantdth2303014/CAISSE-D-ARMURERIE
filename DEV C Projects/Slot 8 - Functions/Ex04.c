#include <stdio.h>

// Prototype function
int parameter(int a, int b);

// Prototype function
int area(int a, int b);

// main function
int main(){
	
	int a;
	int b;
	int p;
	int s;
	int choice;
	
	int i;
	for(i = 0; i < 2; i){
		printf("\nPlease enter the height: ");
		scanf("%d", &a);
		printf("Please enter the width: ");
		scanf("%d", &b);
		
		printf("\nPress 1 to calculate the parameter of the rectangle \n");
		printf("Press 2 to calculate the area of the rectangle \n");
		printf("Enter your choice: ");
		scanf("%d", &choice);
	
		switch(choice){
			case 1:
				p = parameter(a,b);
				printf("\nThe parameter of the rectangle is: %d\n", p);
			break;
		
			case 2:
				s = area(a,b);
				printf("\nThe area of the rectangle is: %d\n", s);
			break;
		
			default:
				printf("\nInvalid choice!\n");
			break;
		}	
	}
	


}

int parameter(int a, int b){
	
	int p;
	
	p = (a + b) * 2;
	return(p);
}

int area(int a, int b){
	int s;
	
	s = a * b;
	return(s);
}
