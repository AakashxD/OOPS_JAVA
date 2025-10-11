// Online C++ compiler to run C++ program online
#include <iostream>
#include<cmath>
#include<unordered_map>
#include<sstream>
using namespace std;
/**
 *  long long ans = 0;   // better to use long long, result may overflow int

    while (n--) {
        long long a, b;
        cin >> a >> b;

        // PROBLEM: (double)a*a means ( (double)a ) * a, not (a^2) as double.
        // Safer: cast after squaring.
        double dist = sqrt( (double)a * (double)a + (double)b * (double)b );

        ans += (long long)ceil(dist);
    }
    cout << ans;
     * 
     * 
     * 
     * while(n--){
        string str;
        cin>>str;
       if(followS1S2(str)){
           ans++;
       }
    }
    cout<<ans<<"ans is here ";
 * 
*/
bool isVowel(char ch){
    if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
        return true;
    }
    return false;
}
bool followS1S2(string str){
    //aaabb
    int i=0;
    while(i<str.size() && str[0]==str[i] && str[0]=='a') i++;
    if(i==str.size()) return false;
    int j=i;
    while(j<str.size() && str[i]=='b' && str[i]==str[j]) j++;
    if(j!=str.size()) return false;
    return true;
}
int main() {
    string str;
    cout << "enter the str: ";
    getline(cin,str);
    unordered_map<string,string> mp;
    mp["five"]='5';
    mp["four"]='4';
    mp["six"]='6';
    mp["seven"]='7';
    mp["eight"]='8';
    mp["nine"]='9';
    mp["zero"]='0';
    mp["one"]='1';
    mp["two"]='2';
    mp["three"]='3';
    stringstream ss(str);
    string word,res;
    int i=0;
    string ans="";
    int prev=0;
    while(i<str.size()){
        int j=i;
        string sub="";
        while( j<str.size() && str[j]!=' ') {
            sub+=str[j];
            j++;
        }
        if(sub=="double") {
            prev=1;
            
        }
        else{
            if(prev==1){
                ans+=mp[sub];
                ans+=mp[sub];
                prev=0;
                
            }
            else{
                ans+=mp[sub];
            }
        }
        i=j+1;
    }
    cout<<ans;
    
   
    return 0;
}