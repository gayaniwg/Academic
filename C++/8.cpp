#include<iostream>
using namespace std;
int main()
	{
		char vowel;
		cout<<"Enter vowel (a,e,i,o,u)"<<endl;
		cin>>vowel;
		
		switch(vowel)
			{
				case 'a':
				cout<<"A";
				break;
				
				case 'e':
				cout<<"E";
				break;
				
				case 'i':
				cout<<"I";
				break;
				
				case 'o':
				cout<<"O";
				break;
				
				case 'u':
				cout<<"U";
				break;
				
				default:
				cout<<"Not a vowel";
			}
		return 0;
	}
