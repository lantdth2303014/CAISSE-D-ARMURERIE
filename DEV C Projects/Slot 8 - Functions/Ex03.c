#include <stdio.h>

// Prototype function
int sumF(int a, int b);

// main function
int main(){
	int a, b;
	int sum;
	
	printf("Enter a: ");
	scanf("%d", &a);
	printf("Enter b: ");
	scanf("%d", &b);
	
	sum = sumF(a,b);
	
	printf("Sum of %d and %d is: %d", a, b, sum);
}

int sumF(int a, int b){
	int t;
	
	t = a + b;
	
}
