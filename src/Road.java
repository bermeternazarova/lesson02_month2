public class Road {

    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        bmw.setDriveSound("������");
        driveCar(bmw);
        bmw.setNewSound("BMW ����");
        System.out.println(bmw.getNewSound());


        Mersedes mersedes = new Mersedes();
        mersedes.setDriveSound("��������");
        driveCar(mersedes);
        mersedes.setNewSound("Mersedes  ����");
        System.out.println(mersedes.getNewSound());
        CarRepol carRepo = new CarRepol();
        carRepo.newSound(bmw);
        carRepo.newSound(mersedes);






    }
    public static void  driveCar (Car car){
        car.drive();


    }


}
