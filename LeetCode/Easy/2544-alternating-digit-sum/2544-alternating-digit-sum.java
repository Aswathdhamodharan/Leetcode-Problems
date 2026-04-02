class Solution {
    public int alternateDigitSum(int n) {
       // if(n==10) return -1;
        // int i=1;
        // int even=0;
        // int dig=0;
        // int odd=0;
        // while(n!=0){
        //     if(i%2==0){
        //     even+=n%10;
        //     n/=10;
        //     }
        //     else{
        //         odd+=n%10;
        //         n/=10;
        //     }
        //     i++;
        // }
        // return Math.abs(odd-even);
        String str=String.valueOf(n);
        int sum=0;
        for(int i=0;i<str.length();i++){
            int ch=str.charAt(i)-'0';
            if(i%2==0){
                sum+=ch;
            }
            else{
                sum-=ch;
            }
        }
        return sum;
    }
}