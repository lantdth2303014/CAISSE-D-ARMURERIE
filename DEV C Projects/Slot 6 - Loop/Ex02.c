#include <stdio.h>
#include <conio.h>

int main(){
	
	int a;
	int b;
	
	for(a = 1; a >= 1 && a <= 9; a++){
		for(b = 1; b >= 1 && b <= 10; b++){
			printf("\n%d x %d = %d\n", a, b, a*b);
		}
		
	}
	
	return 0;
}
