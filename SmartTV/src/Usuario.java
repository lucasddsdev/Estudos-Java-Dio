public class Usuario {

    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        System.out.println(smartTV.ligada);
        System.out.println(smartTV.canal);
        System.out.println(smartTV.volume);


        smartTV.diminuirVolume();
        smartTV.escolheCanal(34);
        smartTV.power();



        System.out.println(smartTV.ligada);
        System.out.println(smartTV.canal);
        System.out.println(smartTV.volume);

    }
}
