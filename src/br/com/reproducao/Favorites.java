package br.com.reproducao;

public class Favorites {

    public void includes(Audio audio){
        if (audio.getRanking() >= 9) {
            System.out.println(audio.getName() + " is one of your favorites");
        }else {
            System.out.println(audio.getName() + " is mid for you");
        }
    }
}
