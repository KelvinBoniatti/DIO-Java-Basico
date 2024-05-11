public class Usuario {
    public static void main(String[] args) throws Exception {
    
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Qual canal? " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Aumentar volume: " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Aumentar volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Diminuir volume: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal alterado para: " + smartTv.canal);

    }
}
