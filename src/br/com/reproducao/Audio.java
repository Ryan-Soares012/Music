package br.com.reproducao;

public class Audio {
    private String name;
    private int releaseYear;
    private double duration;
    protected int totalPlays;
    protected int like;
    protected int myPlays;

    public int getMyPlays() {
        return myPlays;
    }

    public void setMyPlays(int myPlays) {
        this.myPlays = myPlays;
    }

    private int ranking;

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getLike() {
        return like;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public void setTotalPlays(int totalPlays) {
        this.totalPlays = totalPlays;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public void playAudio(){
        System.out.println("Playing audio");
        totalPlays++;
    }


}
