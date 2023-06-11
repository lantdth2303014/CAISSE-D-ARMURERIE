#include <stdio.h>

// Prototype function
void rectangle(int a, int b);		// Proof you can use whatever name for the parameters (there're no a and b)
									// all you need is the right datatype for the parameters

// main function
int main(){
	
	int h;
	int w;
	
	printf("Enter height: ");
	scanf("%d", &h);
	printf("Enter width: ");
	scanf("%d", &w);
	
	rectangle(h,w);					// True reason why "rectangle" function accepts h and w as arguments
	
}

void rectangle(int h, int w){		// here i chose "h" and "w" so i don't have to declare them inside the function
	
	char x = '*';
	int i;
	int j;
	
	for(i = 0; i < h; i++){											// i & j < height & width cuz i & j start from 0
        for(j = 0; j < w; j++){
        	if(i > 0 && i < h - 1 && j > 0 && j < w - 1){  			// Technically printin a smaller rectangle inside
        		printf(" ");										// But instead of "*" it's a rectangle of " "
			}														// The "if" statement checks if current row and  
			else{													// column are not on the border of the rectangle
				printf("%c", x);
			}	
        }
        printf("\n");
    }
    
}
