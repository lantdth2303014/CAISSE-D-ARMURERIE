#include <stdio.h>

int main(){
	
	int i;
	int a;
	int b;
	int c;
	int d;
	// int x;
	// int y;
	// int z;
	
	printf("Enter i: ");
	scanf("%d", &i);
	
	printf("Enter a: ");
	scanf("%d", &a);
	
	printf("Enter b: ");
	scanf("%d", &b);
	
	printf("Enter c: ");
	scanf("%d", &c);
	
	printf("Enter d: ");
	scanf("%d", &d);
	
	/*
	x = 5*(c-3+d);
	y = a*(b+c/d)-22;
	z = i++%7; // tinh du 
	// i++ = i + 1 nhung sau khi da hoan thanh i%7 (++i%7 = i+1%7 luon)
	*/
	
	printf("The answer of 5*(c-3+d) = %d \n", 5*(c-3+d));
	printf("The answer of a*(b+c/d) = %d \n", a*(b+c/d)-22);
	printf("The answer of i++%7 = %d \n", i++%7);
	
	return 0;
}
