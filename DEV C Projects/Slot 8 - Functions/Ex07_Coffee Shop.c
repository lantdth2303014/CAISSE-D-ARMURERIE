#include <stdio.h>

// Prototype function
void menu();

// Prototype function
float total(int opt, int quant);

// main function
int main(){
	
	float myMoney = 100.0;
	int opt;
	int quant;
	int count_Espresso = 0;
	int count_Cappuccino = 0;
	int count_Latte = 0;
	float cost;
	float total_cost = 0;
	
	do {
		menu();
		printf("Enter your choice (1-4): ");
		scanf("%d", &opt);	
		
		switch(opt){
			case 1:
				printf("You have chosen Espresso\n");
				printf("Enter quantity: ");
				scanf("%d", &quant);
				count_Espresso += quant;
				cost = total(opt,quant);
				total_cost += cost;
				printf("Total cost: $%.2f\n", cost);
			break;
			
			case 2:
				printf("You have chosen Cappuccino\n");
				printf("Enter quantity: ");
				scanf("%d", &quant);
				count_Cappuccino += quant;
				cost = total(opt,quant);
				total_cost += cost;
				printf("Total cost: $%.2f\n", cost);
			break;
			
			case 3:
				printf("You have chosen Latte\n");
				printf("Enter quantity: ");
				scanf("%d", &quant);
				count_Latte += quant;
				cost = total(opt,quant);
				total_cost += cost;
				printf("Total cost: $%.2f\n", cost);
			break;
		}	
	} while (opt >= 1 && opt <= 3);
	
	if(myMoney < total_cost){											
		printf("Sorry but you don\'t have enough money.\n");		
	}
	else{
		printf("\n-- Order Details --\n");
		printf("Espresso: %d\n", count_Espresso);
		printf("Cappuccino: %d\n",count_Cappuccino);
		printf("Latte: %d\n",count_Latte);
		printf("Total: $%.2f\n\n", total_cost);
		printf("Thank you for shopping at our shop!");
		printf("\n");
	}
	
}

void menu(){

	printf("\n--- Coffee Shop ---\n");
	printf("1. Espresso ($2.50)\n");
	printf("2. Cappuccino ($3.00)\n");
	printf("3. Latte ($3.50)\n");
	printf("4. Quit\n");
	printf("\n");
}

float total(int opt, int quant){
    
	float price;
    switch(opt){
        case 1:
            price = 2.50;
            break;
        case 2:
            price = 3.00;
            break;
        case 3:
            price = 3.50;
            break;
        default:
            price = 0;
    }
    return price * quant;
}


