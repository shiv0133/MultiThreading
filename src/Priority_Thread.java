public class Priority_Thread {
    public static void main(String[] args) {
        Thread t1=new Thread();
        System.out.println(t1);
        t1.setPriority(10);
        System.out.println(t1.getPriority());
        System.out.println(t1);
    }
}
