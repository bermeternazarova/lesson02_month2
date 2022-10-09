public class Road {

    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        bmw.setDriveSound("Биииип");
        driveCar(bmw);
        bmw.setNewSound("BMW едет");
        System.out.println(bmw.getNewSound());


        Mersedes mersedes = new Mersedes();
        mersedes.setDriveSound("Виииуууу");
        driveCar(mersedes);
        mersedes.setNewSound("Mersedes  едет");
        System.out.println(mersedes.getNewSound());

        CarRepol carRepol = new CarRepol();
        carRepol.getNewSound(mersedes );

        getNewSound(bmw , mersedes);




    }
    public static void  driveCar (Car car){
        car.drive();


    }
    public   static void getNewSound (Bmw bmw , Mersedes mersedes){
        bmw.getNewSound();
        mersedes.getNewSound();


    }
}
