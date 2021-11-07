public class GamingVideo extends Video implements GamingVideos{
    private String  game;

    public GamingVideo() {
        super();
        this.game = "chess";
    }

    public GamingVideo(String title, double durationInMinutes, int views, int likes, double watchTime, String game) {
        super(title, durationInMinutes, views, likes, watchTime);
        this.game = game;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    @Override
    public String getGameName() {
        return game;
    }
}
