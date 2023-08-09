#include <iostream>
using namespace std;

int main() {
    int x,y,t;
    cin>>t;
    while(t--){
        cin>>x>>y;
        cout<<min(3*x-2*y,y)<<" "<<y<<" "<<max(3*x-2*y,y)<<endl;
    }
	// your code goes here
	return 0;
}
