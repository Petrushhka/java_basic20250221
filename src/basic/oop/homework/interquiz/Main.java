package basic.oop.homework.interquiz;

public class Main {

    public static void main(String[] args) {

        //배열 생성
        MediaPlayer player = new MediaPlayer();

        //배열에 넣는 객체를 넣는 과정
        player.addMedia(new AudioPlayer());
        player.addMedia(new ImageDisplay());
        player.addMedia(new VideoPlayer()); //

        player.playAll();

    }
}
