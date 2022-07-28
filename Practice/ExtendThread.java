package com.company;

class NewThread2 extends Thread{
    Thread t;
    NewThread2()
    {
        //create a new second thread

        super("DemoThread");
        System.out.println("Child Thread :"+this);
        start();
    }
    public void run(){
        try{
            for(int i=5;i>0;i--)
            {
                System.out.println("Child Thread :"+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Child Thread Interrupted");
        }

    }//run ends here
}
class ExtendThread {
    public static void main(String[] args)
    {
        new NewThread2();
        try{
            for(int i=5;i>0;i--)
            {
                System.out.println("Main Thread :"+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread Exiting ");
    }//main ends here
}//class ends here