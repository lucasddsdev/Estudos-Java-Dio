import org.w3c.dom.ls.LSOutput;

public class SmartTV {

   boolean ligada = false;

   int canal = 0;

   int volume = 50;


    public boolean power(){
        ligada = !ligada;

        if (ligada == true){
            System.out.println("A tv esta Ligada");
        }else {
            System.out.println("A tv esta Desligada");
        }

        return ligada;
    }


    public int aumetarVolume(){

        if (volume != 100){
            ++volume;
        }else {
            System.out.println("Volume maximo");
        }

        return volume;
    }

    public int diminuirVolume(){

        if (volume != 0){
            --volume;
        }else {
            System.out.println("Volume minimo");
        }

        return volume;
    }

    public int aumentaCanal() {


        if (canal < 100) {
            ++canal;

        } else {
            System.out.println("Sem outros canais");
        }

        return canal;
    }

    public int diminuiCanal(){
        if (canal > 0){
            --canal;

        }else {
            System.out.println("Sem outros canais");
        }

        return canal;
    }


    public int escolheCanal(int canalSelecionado){

        canal = canalSelecionado;

        return canal;

    }




}




