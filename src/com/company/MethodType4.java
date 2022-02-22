package com.company;

public class MethodType4 {
    public static void main(String[] args) {
       int[] ages = {18, 17, 15, 19,32};
       int totalVoters = 0;
       int totalNonVoters = 0;
        for(int age: ages){
            if(age >= getVoterAge()){
                totalVoters = totalVoters + 1;
            }else {
                totalNonVoters = totalNonVoters+1;
            }
        }
        System.out.println("Total No of Voters: "+totalVoters);
        System.out.println("Total No of Non Voters: "+totalNonVoters);
    }

    public static int getVoterAge(){
        return 17;
    }
}
