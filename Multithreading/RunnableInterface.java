public class RunnableInterface implements Runnable {
    public void run(){
        int i=1; 
        while(true){
            System.out.println("hello "+i);
            i++;
        }
    }
    public static void main(String[] args) {
        RunnableInterface ri = new RunnableInterface();
        Thread t = new Thread(ri);
        t.start();
        int i=1; 
        while(true){
            System.out.println("world "+i);
            i++;
        }
    }
}
