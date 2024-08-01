#include<iostream>
using namespace std;
float average(int num1, int num2);

int main()
{
	int num1;
	int num2;
	float c;
	
	cout<<"Please enter first number \n";
	cin>>num1;
	
	cout<<"Please enter second number \n";
	cin>>num2;
	
	
	c=average(num1, num2);
	cout<<"Average is - "<<c;
	
	return 0;
}

float average(int num1, int num2)
{
	float avg;
	
	avg=(num1+num2)/2.0;
	
	return avg;
}
