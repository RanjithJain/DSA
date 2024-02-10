package com.java.sample;

public class MorganExample implements Runnable {

    int [] numberArray={1,2,3,4,5,6,7,8,9};
    int counter=0;

    public static void main(String[] args) throws InterruptedException {

        MorganExample morganExample=new MorganExample();
        Thread t1=new Thread(morganExample);
        Thread t2=new Thread(morganExample);
        Thread t3=new Thread(morganExample);

        t1.start();
        t2.start();
        t3.start();


    }
    @Override
    public void run() {

       synchronized (this){
           while(counter<9) {
               try {

                   System.out.println(Thread.currentThread().getName() + " " + numberArray[counter++]);
                   wait(100);

               }catch(Exception e){
                   System.out.println(e.toString());
               }
           }

       }


    }
}
