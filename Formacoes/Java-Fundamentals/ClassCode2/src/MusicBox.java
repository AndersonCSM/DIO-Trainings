public abstract class MusicBox implements VideoPlayer, MusicPlayer{
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
        System.out.println("A MusicBox está reproduzindo o vídeo");
    };

    public void pauseVideo(){
        System.out.println("A MusicBox está pausando o vídeo");
    };

    public void stopVideo(){
        System.out.println("A MusicBox está parando o vídeo");
    };
}
