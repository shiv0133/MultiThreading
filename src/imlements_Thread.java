public class imlements_Thread extends Thread {

    public imlements_Thread(){
        super();
        start();
    }

    public imlements_Thread(String tname){
        super();
        start();
    }
    public imlements_Thread(ThreadGroup tg, String tname){
        super();
        start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " ,Under the thread Group of:"
                    + Thread.currentThread().getThreadGroup().getName());
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
    public static void main(String[] args) {
        ThreadGroup tg= new ThreadGroup("JTC Thread group");
        imlements_Thread th1=new imlements_Thread();
        imlements_Thread th2=new imlements_Thread("JTC-1");
        imlements_Thread th3=new imlements_Thread(tg,"JTC-2");
    }

}
