import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        /*System.out.println("");
        Scanner sc = new Scanner(System.in);
        String name = "1";
        if (sc.hasNextInt()){
            name = sc.next();
            System.out.println("Listik name: " + name);
        }*/


        Size modemSizeObj = new Size (10, 10, 10);
        Board boardObj = new Board (200, "SH327", "FDM346");
        Functionality functionalityObj = new Functionality(true, true, 100);
        Modem modemObj = new Modem("Thomson", "ZV314", "435643", 4, modemSizeObj, boardObj, functionalityObj);

        functionalityObj.tornOnOff();
        functionalityObj.connectionStatus();
        functionalityObj.modemSpeed();

    }

}
