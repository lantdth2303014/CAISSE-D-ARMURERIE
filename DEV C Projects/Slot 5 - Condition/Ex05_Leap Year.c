#include <stdio.h>
#include <conio.h>

// Chuong trinh tinh nam nhuan (Leap year)
// Leap year = year % 4 == 0 && year % 100 != 0

void main(){
 
	int year;
	
	printf("\nPlease enter a year :");
	scanf("%d",&year);
 
	if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
		printf("\n%d is a leap year", year);
 	}
	else{
		printf("\n%d is not a leap year", year);
	}
 
 getch();

}
