#include<iostream>
using namespace std;

float factorial(int a)
{
	if(a==0 || a==1)
	{
		return 1;
	}
	else
	{
		return a*factorial(a-1);
	}
}

int main()
{
	int a;
	cout<<"Please enter the number ";
	cin>>a;
	int fact = factorial(a);
	cout<<fact;
	return 0;
}
