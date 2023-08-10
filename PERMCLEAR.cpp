#include <bits/stdc++.h>
using namespace std;

int main() {
    // your code goes here
    int t;
    cin>>t;
    while(t--){
        int z;
        cin>>z;
       vector<int>v(z) ;
       for(int i=0;i<z;i++){
           cin>>v[i];
       }
       int y;
       cin>>y;
       set<int>s;
       for(int i=0;i<y;i++){
           int k;
           cin>>k;
           s.insert(k);
       }
       for(int i=0;i<z;i++){
           if(s.count(v[i]))
               continue;
           
           else
               cout<<v[i]<<" ";
           
       }
       cout<<endl;
    }
    return 0;
}
