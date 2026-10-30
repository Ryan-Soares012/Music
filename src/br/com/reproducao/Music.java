package br.com.reproducao;

public class Music extends Audio implements Likes, TechnicalSheet {
    private String artist;
    private String album;
    private String musicGenre;
    private String songLyrics;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    public String getSongLyrics() {
        return songLyrics;
    }

    public void setSongLyrics(String songLyrics) {
        this.songLyrics = songLyrics;
    }

    @Override
    public void playAudio() {
        System.out.println("Your music started!");
    }


    @Override
    public void likes() {
        System.out.println("You added this song to the playlist 'Liked Songs'");
    }

    public void hitSongsQuestion() {
        if (totalPlays > 100000 && like > 10000) {
            System.out.println("This is a 2026 top song!");
        }else if (totalPlays >= 50000 && like >= 2500) {
            System.out.println("This is a slightly good song.");
        }else {
            System.out.println("Just a regular song.");
        }
    }

    @Override
    public void showTheTechnicalSheet() {
        System.out.println("Song name: " + getName());
        System.out.println("Release Year: " + getReleaseYear());
        System.out.println("The duration of the song in seconds is: " + getDuration());
    }

    @Override
    public int getRanking() {
        if (getMyPlays() > 100) {
            return 10;
        } else if (getMyPlays() >= 30) {
            return 6;
        }else {
            return 4;
        }
    }
}
