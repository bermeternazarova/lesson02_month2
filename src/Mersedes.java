public class Mersedes  extends Car{
    public  String driveSound ;
    public  String newSound ;



    @Override
    void drive() {
        System.out.println(driveSound);
    }



    public String getDriveSound() {
        return driveSound;
    }

    public void setDriveSound(String driveSound) {
        this.driveSound = driveSound;
    }

    @Override
    public String getNewSound() {
        return newSound;
    }

    public void setNewSound(String newSound) {
        this.newSound = newSound;
    }
}






