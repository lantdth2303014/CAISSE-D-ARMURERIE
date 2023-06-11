#include <stdio.h>
#include <conio.h>

int main(){
	
	int myRunes = 96367;
	int order;
	int total = 0;
	int count_radagon = 0;
	int count_shabriri = 0;
	int count_erdtree = 0;
	int count_starscourge = 0;
	
	do{
		printf("--- Shop ---\n");
		printf("1. Radagon's Soreseal (20,000 Runes)\n");
		printf("2. Shabriri Grapes (2,000 Runes)\n");
		printf("3. Erdtree's Favor (30,000 Runes)\n");
		printf("4. Starscourge Heirloom (5,000 Runes)\n");
		printf("5. Quit\n");
		printf("\nYou have: %d Runes.\n", myRunes);
		printf("Enter your choice (1-5): ");
		scanf("%d", &order);
		printf("\n");
		
		switch(order){
			case 1: 
			printf("You have bought Radagon's Soreseal\n\n");
			total += 20000;											// increase total runes by price
			count_radagon++;										// increase item bought count by 1
			myRunes -= 20000;
			break;
			
			case 2: 
			printf("You have bought Shabriri Grapes\n\n");
			total += 2000;											// increase total runes by price	
			count_shabriri++;										// increase item bought count by 1
			myRunes -= 2000;
			break;
			
			case 3: 
			printf("You have bought Erdtree's Favor\n\n");
			total += 30000;											// increase total runes by price
			count_erdtree++;										// increase item bought count by 1
			myRunes -= 30000;
			break;
			
			case 4: 
			printf("You have bought Starscourge Heirloom\n\n");
			total += 5000;											// increase total runes by price
			count_starscourge++;									// increase item bought count by 1
			myRunes -= 5000;
			break;
		}
	} while (order >= 1 && order <= 4);								// order <= 4 cuz ye need to press 5 to exit
	
	if(myRunes < total){											// if & else to check whether i've enough rune
		printf("M\'Lord... I could not deliver thy wish.\n");		// or not
	}
	else{
		printf("-- Order Details --\n");
		printf("Radagon's Soreseal: %d\n", count_radagon);
		printf("Shabriri Grapes: %d\n",count_shabriri);
		printf("Erdtree's Favor: %d\n",count_erdtree);
		printf("Starscourge Heirloom: %d\n",count_starscourge);
		printf("Total: %d Runes\n\n", total);
		printf("M\'Lord! I hope these items will help thou be the next Elden Lord.");
		printf("\n");
	}
	
	
	getch();
	return 0;
}
