package MultiThreading;

//multithreading by extending the thread class
 class ChildThread extends Thread{

    @Override
    public void run(){
        try{
            System.out.println("this message is from inside the thread");
            System.out.println("thread: "+ Thread.currentThread().getName());
        }
        catch(Exception e){
            System.out.println("an exception occured");
        }
    }
}

public class Main2 {
    public static void main(String[] args){
        System.out.println("start of main function");
        ChildThread demo = new ChildThread();
        demo.start();
        System.out.println("start of end function");
    }
}
