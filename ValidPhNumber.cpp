#include<bits/stdc++.h>
using namespace std;
bool preValid(string phNumber){
    if(phNumber.length() == 10){
        if(phNumber.at(0)>=6 && phNumber.at(0)<=9){
            return true;
        }
    }
    else if(phNumber.length()==11){
        if(phNumber.at(0)==0 && phNumber.at(1)>=6 && phNumber.at(1)<=9){
            return true;
        }
    }
    else if(phNumber.length()==12){
        if(phNumber.at(0)==9 && phNumber.at(1)==1 && phNumber.at(2)>=6 && phNumber.at(2)<=9 ){
            return true;
        }
        else if(phNumber.at(0)==0 && phNumber.at(1)== *" " && phNumber.at(2)>=6 && phNumber.at(2)<=9 ){
            return  true;

        }

    }
    else if(phNumber.length()==13){
        if(phNumber.at(0)==9 && phNumber.at(1)==1 && phNumber
    }
}
int main(){
    string phoneNumber;
    cout<<"Enter your phone number to check whether its valid or not: ";
    cin>>phoneNumber;
    preValid(phoneNumber);
    return 0;
}