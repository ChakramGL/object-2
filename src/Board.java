public class Board {

    private String centralModule;
    private int systemModule;
    private String connectionModule;
    private int voltage;
    private boolean verify;


    public Board ( int voltage, String connectionModule, String centralModule, int systemModule){
        this.voltage = voltage;
        this.connectionModule = connectionModule;
        this.centralModule = centralModule;
        this.systemModule = systemModule;
    }

    private void verification(){
        if (centralModule.equals("FDM346") && connectionModule.equals("SH327") && systemModule == 7888 )
            verify = true;
    }


    public void connectionMod(){
        if (voltage == 220 && verify == true)
            System.out.println("This router uses central module FDM346, system module 7888, connection Module SH327");
        else
            if (voltage == 220)
                System.out.println("Components not identified");
            else
                System.out.println("Error!");
        }

    }

