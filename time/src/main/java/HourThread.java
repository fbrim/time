public class HourThread extends Thread{
    private TimeFrame tf;
    private int count;

    public HourThread(TimeFrame tf){
        super();
        this.tf = tf;
        count = 0;
    }

    public void increase(){
        count++;
        tf.setHour(count);
    }

    public void run(){
        while(true){
        try{
        tf.setHour(count);
        }catch(Exception e){System.out.println(e.getStackTrace());}
        }
    }
}