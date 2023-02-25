public class implements_Thread implements Runnable{

    implements_Thread(){
        Thread t1=new Thread(this);
        t1.start();

    }
    implements_Thread(String tname){
        Thread t2=new Thread(this,tname);
    }
    implements_Thread(String tname,ThreadGroup tg){
        Thread t3=new Thread(tg,this,tname);

    }


    @Override
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
