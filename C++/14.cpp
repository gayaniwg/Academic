#include<iostream>
using namespace std;
float average(int num1, int num2);//declaring a function

int main()
{
	int num1, num2;
	float c;
	cout<<"Please eneter first number "<<endl;
	cin>>num1;
	
	cout<<"Please enter second number "<<endl;
	cin>>num2;
	
	c=average(num1, num2);
	cout<< "Average is \n"<<c;
	return 0;
}

float average(int num1, int num2)
{
	float avg;
	avg=(num1+num2)/2.0;
	return avg;
}
