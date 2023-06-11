#include <stdio.h>
#include <conio.h>

int main(){
	
	float t = 0;
	float b = 0;
	float h = 0;
	
	printf("Enter t: ");
	scanf("%f", &t);
	
	printf("Enter b: ");
	scanf("%f", &b);
	
	printf("Enter h: ");
	scanf("%f", &h);
	
	// In case where t>b, which in impossible btw
	if (t>b){
		printf("Error encoutered");
	}
	else {
		printf("Dien tich hinh thang la: %.2f", (t+b)*h/2);
	}
	
	
	getch();
	return 0;
}
