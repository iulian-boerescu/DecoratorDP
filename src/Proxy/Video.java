package Proxy;

public class Video implements IVideo{

    private int calitateVideo;

    public Video(int calitateVideo) {
        this.calitateVideo = calitateVideo;
    }

    public int getCalitateVideo() {
        return calitateVideo;
    }

    public void setCalitateVideo(int calitateVideo) {
        this.calitateVideo = calitateVideo;
    }

    @Override
    public String derulare() {
        return "Se afiseaza videoul la calitatea" + calitateVideo;
    }
}
