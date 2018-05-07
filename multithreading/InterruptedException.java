package multithreading;

    class InterruptedException extends Thread{  
    public void run(){  
    try{  
    Thread.sleep(1000);  
    System.out.println("task");  
    }catch(Exception e){  
    System.out.println("Exception handled "+e);  
    }  
    System.out.println("thread is running...");  
    }  
      
    public static void main(String args[]){  
    InterruptedException t1=new InterruptedException();  
    t1.start();  
      
    t1.interrupt();  
      
    }  
    }  
