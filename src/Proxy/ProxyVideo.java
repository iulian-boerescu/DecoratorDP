package Proxy;

public class ProxyVideo implements IVideo{
    private Video video;

    public ProxyVideo(Video video) {
        this.video = video;
    }


    @Override
    public String derulare() {
        if (video.getCalitateVideo() > 820){
            return video.derulare();
        }
        else{
            return "Videoul nu s epoate derula din cauza caliatii zcazute";
        }
    }
}
