package basic.oop.homework.interquiz;

public class MediaPlayer {

    MediaPlayable[] mediaList = new MediaPlayable[0];

    void addMedia(MediaPlayable media){
//  주어진 media를 medialist배열에 추가

        MediaPlayable[] m = mediaList;

        MediaPlayable[] temp = new MediaPlayable[m.length+1];

        for (int i = 0; i < m.length; i++) {
            temp[i] = m[i];
        }

        temp[temp.length-1] = media;

        mediaList = temp;

    }

    void playAll(){

        for (MediaPlayable m : mediaList) {
            m.play();
        }
    }


}
