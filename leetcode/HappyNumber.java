class HappyNumber {
    public static void main(String[] args) {
        int n=23;
        HappyNumber hp = new HappyNumber();
        System.out.println(hp.isHappy(n));
    }
      boolean isHappy(int n) {
        int fast=n;
        int slow=n;
    do{
        slow=findSquare(slow);
        fast=findSquare(findSquare(fast));
        
    }while(slow!=fast);
        if(slow==1){
            return true;
        }
        return false;
    }
    
    public int findSquare(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans=ans+rem*rem;
            num/=10;
        }
        return ans;
    }
   
}