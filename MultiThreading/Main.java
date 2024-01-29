package MultiThreading;

//multithreading by implementing the runnable class
class childThreadDemo implements Runnable{
    @Override
    public void run(){
        try{
            System.out.println("this message is from inside thread");
            System.out.println("Thread: "+ Thread.currentThread().getName());
        }
        catch(Exception e){
            System.out.println("An exception occured");
        }
    }
}

public class Main{
    public static void main(String[] args){
        System.out.println("Start of main function");

        Thread childThread = new Thread(new childThreadDemo());
        childThread.start();
        
        System.out.println("End of main function");
    }
}