#include <iostream>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--){
        long long g,k=0;
        cin>>g;
        long long A[g];
        for(int i=0;i<g;i++){
            cin>>A[i];
            k+=A[i];
            k%=998244353;
        }
        cout<<(k*(k-1))%998244353<<endl;
    }
    // your code goes here
    return 0;
}
