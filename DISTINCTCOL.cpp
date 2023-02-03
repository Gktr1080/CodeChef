#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--){
        int s;
        cin>>s;
        int a[s];
        int mx = INT_MIN;
        for(int i=0;i<s;i++){
            cin>>a[i];
            if(a[i]>mx)
            mx=a[i];
        }
        cout<<mx<<endl;
    }
    
	// your code goes here
	return 0;
}
