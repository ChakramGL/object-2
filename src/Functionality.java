public class Functionality {

   private boolean power;
    private boolean connect;
    private int speedInt;

    public Functionality( boolean power, boolean connect, int speedInt){

    }

    public void tornOnOff() {
        if (power != true)
            System.out.println("Router has worked...");
        else
            System.out.println("Router not work...");

    }

    public void connectionStatus(){
        if (connect == true)
            System.out.println("Router connected, wait....");
        else
            System.out.println("Connection is not found!");
    }

    public void modemSpeed(){
        if ( power == true && connect == true)
            System.out.println("Internet speed = " + speedInt);
        else
            System.out.println("Router is not connected");
    }



}
