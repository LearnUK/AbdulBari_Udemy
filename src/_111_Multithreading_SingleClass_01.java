class _111_Multithreading_SingleClass_01 extends Thread {
    public void run(){
        int i=1;
        while(i<10){
            System.out.println(i+" Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        _111_Multithreading_SingleClass_01 t = new _111_Multithreading_SingleClass_01();
        t.start();
        int i=1;
        while(i<10){
            System.out.println(i+" World");
            i++;
        }
    }

}
