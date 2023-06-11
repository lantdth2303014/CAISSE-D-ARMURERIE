#include <stdio.h>
#include <conio.h>

int main(){
	printf("/*===== Kich thuoc cua cac kieu du lieu =====*/");
	
	printf("\n\nKieu int: %lu Byte", sizeof(int));
	printf("\nSo nguyen: 15");
	
	printf("\n\nKieu float: %lu Byte", sizeof(float));
	printf("\nSo thuc: 3.456000");
	
	printf("\n\nKieu double: %lu Byte", sizeof(double));
	printf("\nSo thuc kieu double: 3.4567891023");
	
	printf("\n\nKieu char: %lu Byte", sizeof(char));
	printf("\nKy tu: E");
	
	printf("\n\nKieu long int: %lu Byte", sizeof(long int));
	
	printf("\n\nKieu long double: %lu Byte", sizeof(long double));
	
	printf("\n\n/*============================================*/");
	
	getch();
	return 0;
}
