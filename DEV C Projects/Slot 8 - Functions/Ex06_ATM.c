#include <stdio.h>

// Prototype function
int traDu(int a);

// Prototype function
int rutTien(int a, int soDu);

// Prototype function
int guiTien(int a, int soDu);

// main function
int main(){
	
	int amount;
	int choice;
	int soDu;
	
	printf("Nhap so du cua ban: ");
	scanf("%d", &soDu);
	
	do{
		printf("\n--- ATM ---\n");
		printf("1. Kiem tra so du\n");
		printf("2. Rut tien\n");
		printf("3. Gui tien\n");
		printf("4. Thoat\n");
		
		printf("Nhap lua chon (1-4): ");
		scanf("%d", &choice);
		printf("\n");
		
		switch(choice){
		case 1:
		printf("Ban da chon tra so du\n");
		traDu(soDu);
		break;
		
		case 2:
		printf("Ban da chon rut tien\n");
		soDu = rutTien(amount, soDu);			// soDu = ... : De cap nhat so du
		break;
		
		case 3:
		printf("Ban da chon gui tien\n");
		soDu = guiTien(amount, soDu);			// soDu = ... : De cap nhat so du
		break;
		}
	} while (choice >= 1 && choice <= 3);
	

}

int traDu(int a){
	
	printf("Ban co: %d\n", a);
}

int rutTien(int a, int soDu){
	
	printf("Nhap so tien muon rut: ");
	scanf("%d", &a);
	soDu = soDu - a; 
	printf("\nBan da rut tien thanh cong\n");
	printf("So du hien tai: %d\n", soDu);
	
	return soDu;									// return soDu 
}

int guiTien(int a, int soDu){
	
	printf("Nhap so tien muon gui: ");
	scanf("%d", &a);
	soDu = soDu + a; 
	printf("\nBan da gui tien thanh cong\n");
	printf("So du hien tai: %d\n", soDu);
	
	return soDu;									// return soDu 
}
