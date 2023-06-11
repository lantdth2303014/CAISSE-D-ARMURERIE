#include <stdio.h>

int main(){
	
	float h;
	float b;
	float S;
	
	printf("Enter h: ");
	scanf("%f", &h);
	
	printf("Enter b: ");
	scanf("%f", &b);
	
	S = (h*b)/2;
	printf("With h = %.2f and b = %.2f, S is: %.2f", h, b, S);
	
	return 0;
}
