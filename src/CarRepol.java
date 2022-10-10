public class CarRepol implements  CarRepo {

    @Override
    public void newSound(Car car) {
        System.out.println(car.getNewSound());
    }
    public void newSound(Mersedes mersedes, Bmw bmw) {
        System.out.println(mersedes.getNewSound());
        System.out.println(bmw.getNewSound());
    }}


