#include <stdio.h>

int main(){
	
	float h;
	float r;
	float V;
	
	printf("Enter h: ");
	scanf("%f", &h);
	
	printf("Enter r: ");
	scanf("%f", &r);
	
	V = 3.14*r*r*h;
	printf("With h = %.2f and r = %.2f, V is: %.2f", h, r, V);
	
	return 0;
}
