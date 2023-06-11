#include <stdio.h>

int main(){
	
	float Amount = 0; // float values should be set to 0
	float VND = 0;    // to avoid bugs (aka you initialize them first)
	
	printf("Enter amount of USD: ");
	scanf("%f", &Amount); // Scan for user input
	
	VND = Amount *23.358;
	printf("%.3f USD is %.3f VND", Amount, VND);
	
	return 0;
}
