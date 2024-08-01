#include<iostream>
#include<conio.h>
#include<dos.h>
#include<stdlib.h>
#include<string.h>
#include<windows.h>
#include<time.h>

using namespace std;

void gotoxy(int x, int y)
{
	CursorPosition.X = x;
	CursorPosition.Y = y;
	SetConsoleCursorPosition(console, CursorPosition);
}

void drawBorder(){
	gotoxy(0,0);cout<<"----------------------------------------------------";
	gotoxy(0,SCREEN_HEIGHT);cout<<"-------------------------------------------------";
	
	for(int i=0; i<SCREEN_HEIGHT;i++){
		gotoxy(0,i);cout<<"|";
		gotoxy(SCREEN_WIDTH,i);cout<<"|";
	}
}
int main()
{
	drawBorder();
	return 0;
}
