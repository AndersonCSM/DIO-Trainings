public class Main
{
    public static void main(String[] args){
        var musicplayer = new MusicPlayer() {
            @Override
            public void playMusic() {
                System.out.println("Tocando a música");
            }

            @Override
            public void pauseMusic() {

            }

            @Override
            public void stopMusic() {

            }
        };

        musicplayer.playMusic();
    }
}
