#include<iostream>
using namespace std;
int div_2(int a)
{
	if(a%2==0)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

void div_6(int b)
{
	if(div_2(b)==1 && b%3==0)
	{
		cout<<"Number is divided by 6";
	}
	else
	{
		cout<<"Number isn't divided by 6";
	}
}

int main()
{
	int c;
	cout<<"Please enter the no ";
	cin>>c;
	div_6(c);
	return 0;
}
