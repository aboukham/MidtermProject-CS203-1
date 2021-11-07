public class Video implements Comparable<Video>{
    private String  title;
    private double  durationInMinutes;
    private int     views;
    private int     likes;
    private double  watchTime;

    public Video(){
        title = "java interfaces";
        durationInMinutes = 30;
        views = 2000;
        likes = 300;
        watchTime = 756438.5;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Video(String title, double durationInMinutes, int views, int likes, double watchTime) {
        this.title = title;
        this.durationInMinutes = durationInMinutes;
        this.views = views;
        this.likes = likes;
        this.watchTime = watchTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public double getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(double watchTime) {
        this.watchTime = watchTime;
    }

    @Override
    public String toString() {
        return "\"Title: " + title + ". Duration: " + durationInMinutes + ". Views: "
                + views + ". Likes: " + likes + ". WatchTime: " + watchTime + ".\"";
    }


    @Override
    public int compareTo(Video o) {
        if (this.watchTime < o.watchTime)
            return -1;
        if (this.watchTime > o.watchTime)
            return 1;
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Video))
            return false;
        return this.watchTime == ((Video) obj).watchTime;
    }
}
