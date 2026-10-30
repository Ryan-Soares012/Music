package br.com.principal;
import br.com.reproducao.Favorites;
import br.com.reproducao.Music;
import br.com.reproducao.Podcasts;

public class Main {
    public static void main(String[] args) {
        Music music = new Music();
        music.setName("I'm still standing");
        music.setReleaseYear(1983);
        music.setDuration(182);
        music.setLike(20000);
        music.setTotalPlays(150000);
        music.setMyPlays(101);
        music.setArtist("Elton John");
        music.setMusicGenre("Pop Rock");
        music.setAlbum("Too low for zero");
        music.showTheTechnicalSheet();
        music.playAudio();
        music.likes();
        music.hitSongsQuestion();


        Podcasts podcast = new Podcasts();
        podcast.setName("Flow Podcast");
        podcast.setReleaseYear(2018);
        podcast.setDuration(120);
        podcast.setLike(5000);
        podcast.setTotalPlays(30000);
        podcast.setMyPlays(7);
        podcast.setPodcasterName("Igor");
        podcast.setPodcasterName("Brazilian Podcast");
        podcast.setEpisodeName("Episode I");
        podcast.setEpisodeNumber(1);
        podcast.showTheTechnicalSheet();
        podcast.playAudio();
        podcast.likes();
        podcast.bigPodcast();


        Favorites favorites = new Favorites();
        favorites.includes(music);
        favorites.includes(podcast);






    }
}
