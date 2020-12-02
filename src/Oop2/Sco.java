package Oop2;

public class Sco {
    private  String scoolName;
    private  int rommNum;

    Sco(String scoolName, int rommNum) {
        this.scoolName = scoolName;
        this.rommNum = rommNum;
    }

    public String getScoolName() {
        return scoolName;
    }

    public int getRommNum() {
        return rommNum;
    }

    public void setScoolName(String scoolName) {
        this.scoolName = scoolName;
    }

    public void setRommNum(int rommNum) {
        this.rommNum = rommNum;
    }
    public Sco(){

    }

    @Override
    public String toString() {
        return "\n"+"Schule       :"+ scoolName + '\n' +
                "Anzahl lernräume :" + rommNum;
    }
}


