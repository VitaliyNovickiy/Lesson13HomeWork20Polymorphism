public class ProgramMusic {
    public static void main(String[] args) {
        MusicStyles abba = new PopMusic();
        MusicStyles scorpions = new RockMusic();
        MusicStyles queen = new ClassicMusic();

        MusicStyles[] musicBands = {abba, scorpions, queen};
        for (MusicStyles band : musicBands) {
            band.playMusic();

        }

    }
}
