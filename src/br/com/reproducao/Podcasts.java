package br.com.reproducao;

public class Podcasts extends Audio implements Likes, TechnicalSheet {
    private String podcasterName;
    private String podcastGenre;
    private String episodeName;
    private int episodeNumber;

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public String getPodcasterName() {
        return podcasterName;
    }

    public void setPodcasterName(String podcasterName) {
        this.podcasterName = podcasterName;
    }

    public String getPodcastGenre() {
        return podcastGenre;
    }

    public void setPodcastGenre(String podcastGenre) {
        this.podcastGenre = podcastGenre;
    }

    @Override
    public void playAudio() {
        System.out.println("Your podcast started!");

    }

    @Override
    public void likes() {
        System.out.println("You clicked 'like' on Youtube or Spotify");
    }

    public void bigPodcast() {
        if (totalPlays > 20000 && like > 1000) {
            System.out.println("This is a very famous podcast!");
        }else if (totalPlays >= 8500 && like >= 500) {
            System.out.println("Mid podcast.");
        }else {
            System.out.println("Just a regular talk show.");
        }
    }

    @Override
    public void showTheTechnicalSheet() {
        System.out.println("Podcast name: " + getName());
        System.out.println("Release Year: " + getReleaseYear());
    }

    @Override
    public int getRanking() {
        if (getMyPlays() > 10) {
            return 10;
        }else if (getMyPlays() >= 4) {
            return 7;
        }else {
            return 4;
        }
    }
}

