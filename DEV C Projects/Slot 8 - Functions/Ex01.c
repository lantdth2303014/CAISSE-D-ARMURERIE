#include <stdio.h>

// Prototype function
int squareF(int a);				

// main function
int main(){
	int a;
	int square;
	
	printf("Enter a number: ");
	scanf("%d", &a);
	
	square = squareF(a);
	
	printf("\nSquare of %d is: %d", a, square);
}

// squareF function
int squareF(int a){
	int s;
	
	s = a*a;
	
	return (s);
}
