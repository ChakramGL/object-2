public class Modem {

    private String modemBrand;
    private String modemName;
    private String modemSerial;
    private int countInputs;
    private boolean antenna;
    private Size modemSize;
    private Board modemBoard;
    private Functionality modemFunctionality;

    public Modem(String modemBrand, String modemName, String modemSerial, int countInputs,
                 Size modemSize, Board modemBoard, Functionality modemFunctionality) {
        this.modemBrand = modemBrand;
        this.modemName = modemName;
        this.modemSerial = modemSerial;
        this.countInputs = countInputs;
        this.antenna = antenna;
        this.modemSize = modemSize;
        this.modemBoard = modemBoard;
        this.modemFunctionality = modemFunctionality;
    }



    public String getModemBrand() {
        return modemBrand;
    }

    public String getModemName() {
        return modemName;
    }

    public String getModemSerial() {
        return modemSerial;
    }

    public int getCountInputs() {
        return countInputs;
    }

    public Size getModemSize() {
        return modemSize;
    }

    public Board getModemBoard() {
        return modemBoard;
    }

    public Functionality getModemFunctionality() {
        return modemFunctionality;
    }
}


