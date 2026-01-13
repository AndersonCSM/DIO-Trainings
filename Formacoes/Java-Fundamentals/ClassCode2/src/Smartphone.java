public abstract class Smartphone implements VideoPlayer, MusicPlayer{
    public void playMusic(){

    };

    public void pauseMusic(){

    };

    public void stopMusic(){

    };

    public void playPlayer(){

    };

    public void pausePlayer(){

    };

    public void stopPlayer(){

    };
    public void playVideo(){
        System.out.println("O smarthphone está reproduzindo o vídeo");
    };

    public void pauseVideo(){
        System.out.println("O smarthphone está pausando o vídeo");
    };

    public void stopVideo(){
        System.out.println("O smarthphone está parando o vídeo");
    };
}
