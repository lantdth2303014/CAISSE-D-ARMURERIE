#include <stdio.h>

int main(){
	
	int a;
	int b;
	int c;
	
	printf("Enter a: ");
	scanf("%d", &a);
	
	printf("Enter b: ");
	scanf("%d", &b);
	
	c = a + b;
	printf("With a = %d and b = %d, c is: %d", a, b, c);
	
	return 0;
}
