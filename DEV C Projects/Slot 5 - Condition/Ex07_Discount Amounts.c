#include <stdio.h>
#include <conio.h>

// The program to calculate the discount amounts as per this policy: 

// Product --------------------------- Code
// Computer Stationery					1
// Fixed Disks							2
// Computers						    3

// Code ------ Order Amount -------- Discount Rate
//  1			>= 500					12%
//  1			>= 300					8%
//  1			300 < 					2%
//  2			>= 2000					10%
//  2			>= 1500					5%
//  3			>= 5000					10%
//  3			>= 2500					5%

void main(){
 
	int productcode;
	float orderamount, rate = 0.0;
 	
	printf("\nPlease enter the product code: " );
	scanf("%d", &productcode);
	printf("Please enter the order amount: " );
	scanf(" %f" , &orderamount);
	
	// Condition part where Discount Rates are related to Product Code and Order Amount
	if (productcode == 1){
		if (orderamount >= 500)
			rate = 0.12;
		else if (orderamount >= 300)
			rate = 0.08;
		else
			rate = 0.02;
	}
	else if (productcode == 2){
		if (orderamount >= 2000)
			rate = 0.10 ;
		else if (orderamount >= 1500)
			rate = 0.05;
		else
			printf("Gotta put food on the table");
	}
	else if (productcode == 3){ 
		if (orderamount >= 5000)
			rate = 0.10 ;
		else if (orderamount >= 2500)
			rate = 0.05;
		else
			printf("Gotta put food on the table");
	}
    
    // Formulas to calculate the Discounted Order Amount 
	orderamount = orderamount * rate;
	if(orderamount > 0)
		printf("The net order amount is % .2f \n", orderamount);
	else
		
	getch();
}

