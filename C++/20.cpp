 #include <iostream>
 #include <conio.h>
 #include <string>
 #include <Windows.h>
 using namespace std;

 void goToXY(int x=0,int y=0)
 {
     HANDLE h=GetStdHandle(STD_OUTPUT_HANDLE);
     COORD c;
     c.X=x;
     c.Y=y;
     SetConsoleCursorPosition(h,c);
 }

 int main()
 {

     char symbol='A';
     int X=0, Y=0;

     goToXY(X,Y);
     cout<<symbol;

     for(;;)
     {
         if(kbhit())
         {
             char ch = getch();
             switch(ch)
             {
             case 'w':
                 goToXY(X,Y-1);
                 cout<<symbol;

             case 's':
                 goToXY(X,Y+1);
                 cout<<symbol;

             case 'a':
                 goToXY(X-1,Y);
                 cout<<symbol;

             case 'd':
                 goToXY(X+1,Y);
                 cout<<symbol;
             }
         }

         getch();
         return 0;
    }  
}
