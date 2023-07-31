#include <bits/stdc++.h>
using namespace std;
// #define int long long

int main() {
    int t;
    cin>>t;
    while(t--){
        string arr;
        cin>>arr;
        int n= arr.size();
        if(arr[0]==arr[n-1])
        cout<<n-2<<endl;
        else
        cout<<2<<endl;
    }
	// your code goes here
	return 0;
}
