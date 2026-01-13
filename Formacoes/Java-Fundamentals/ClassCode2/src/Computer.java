public abstract class Computer implements VideoPlayer, MusicPlayer{
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
        System.out.println("O Computador está reproduzindo o vídeo");
    };

    public void pauseVideo(){
        System.out.println("O Computador está pausando o vídeo");
    };

    public void stopVideo(){
        System.out.println("O Computador está parando o vídeo");
    };
}
