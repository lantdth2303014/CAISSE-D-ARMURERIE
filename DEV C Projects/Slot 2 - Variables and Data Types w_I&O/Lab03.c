#include <stdio.h>

int main(){
	
	float r;
	float d;
	float C;
	float S;
	
	printf("Enter r: ");
	scanf("%f", &r);
	
	printf("Enter d: ");
	scanf("%f", &d);
	
	C = 2*r*3.14;
	S = 3.14*r*r; // 2nd way: 3.14*pow(r,2);
	
	printf("C is: %.2f \n", C);
	printf("S is: %.2f \n", S);
	
	return 0;
	
	
}
