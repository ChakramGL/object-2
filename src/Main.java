import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Scanner name = new Scanner(System.in);
        String modemName = "1";
        if (name.hasNext()){
            modemName = name.next();
        }
        Scanner sc = new Scanner(System.in);
        String modemBrand = "1";
        if (sc.hasNext()){
            modemName = sc.next();
        }


        Size modemSizeObj = new Size (10, 10, 10);
        Board boardObj = new Board (220, "SH327", "FDM346", 7888);
        Functionality functionalityObj = new Functionality(true, true, 100);
        Modem modemObj = new Modem(modemBrand, modemName , "435643", 4, modemSizeObj, boardObj, functionalityObj);

        functionalityObj.tornOnOff();
        functionalityObj.connectionStatus();
        functionalityObj.modemSpeed();
        boardObj.connectionMod();
        modemObj.showInfo();
        modemSizeObj.showInfo();


    }

}
