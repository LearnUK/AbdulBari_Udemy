class _113_Multithread_Runnable_SingleClass_01 implements Runnable {
    public void run(){
        int i=1;
        while(i<10){
            System.out.println(i+" Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        _113_Multithread_Runnable_SingleClass_01 m = new _113_Multithread_Runnable_SingleClass_01();
        Thread t = new Thread(m);
        t.start();
        int i=1;
        while(i<10){
            System.out.println(i+" World");
            i++;
        }
    }

}
