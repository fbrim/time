public class SecondThread extends Thread{
    private TimeFrame tf;
    private MinuteThread mtd;
    private int count;

    public SecondThread(TimeFrame tf, MinuteThread mtd){
        super();
        this.tf = tf;
        this.mtd = mtd;
        count = 0;
    }

    public void run(){
        while(true){
        try{
        this.sleep(1000);
        count++;
        if(count == 60){
        count = 0;
        mtd.increase();
        }
        tf.setSecond(count);
        }catch(Exception e){
        System.out.println(e.getStackTrace());
        }
        }
    }
}