class Mydata{
    synchronized public void display(String str){
        for(int i =0;i <str.length();i++){
            System.err.println(str.charAt(i));
            try {
                Thread.sleep(1000);
                
            } catch (Exception e) {
                System.err.println(e);
            }
            }
    }
}
class Mythread1 extends Thread{
    Mydata d;
    public  Mythread1(Mydata d){
        this.d = d;
    }
    public void run(){
        d.display("Hello world");
    }
}

class Mythread2 extends Thread{
    Mydata d;
    public  Mythread2(Mydata d){
        this.d = d;
    }
    public void run(){
        d.display("Wellcome all");
    }
}

public class Syn {
    public static void main(String[] args) {
        Mydata data = new Mydata();
        Mythread1 t1 = new Mythread1(data);
        Mythread2 t2 = new Mythread2(data);
        t1.start();
        t2.start();

    }
    
}
