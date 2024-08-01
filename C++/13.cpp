#include<iostream>
using namespace std;
int main()
{
	string food="apple";//food variable
	string &meal=food;
	
	cout<<food<<"\n";
	cout<<meal<<"\n";
	cout<<&food<<"\n";
	cout<<&meal<<"\n";	
}

