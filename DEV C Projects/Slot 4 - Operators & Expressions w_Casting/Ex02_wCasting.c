#include <stdio.h>
#include <conio.h>

// Castin' = y'know, the process of converting the value of one data type to another

int main(){
	
	int x = 10;
	int y = 100;
	// int z = x/y; (result in 0 cuz integer division truncates the result)
	float z = (float) x/ (float) y; // or just (float) x/y;
	
	printf("%f",z);
	
	getch();
	return 0;
}



