package Oop2;

public class Rom {
        private int rommNum;
        private int workPlace;
        private String equipment;


        public Rom(int rommNum, int workPlace, String equipment) {
            this.rommNum = rommNum;
            this.workPlace = workPlace;
            this.equipment = equipment;
        }

        public Rom() {

        }

        public void setRommNum(int rommNum) {
            this.rommNum = rommNum;
        }

        public void setWorkPlace(int workPlace) {
            this.workPlace = workPlace;
        }

        public void setEquipment(String equipment) {
            this.equipment = equipment;
        }

        public int getRommNum() {
            return rommNum;
        }

        public int getWorkPlace() {
            return workPlace;
        }

        public String getEquipment() {
            return equipment;
        }

        @Override
        public String toString() {
            return  "Romm Num         : " + rommNum + "\n"+
                    "Maximal Capacity : " + workPlace +"\n"+
                    "Equipment        : " + equipment;
        }
    }

