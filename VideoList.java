import java.util.Arrays;

public class VideoList {
    private Video[] videos;
    private int     size;

    public VideoList() {
        videos = new Video[10];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(Video input) {
        videos[size] = input;
        size++;
        if(size == videos.length)
            resize();
    }

    private void resize() {
        videos = Arrays.copyOf(videos, videos.length*2);
    }

    @Override
    public String toString() {
        String  str = "[";
        for (int i = 0; i < size; i++)
            str += "video" + (i + 1) + ": " + videos[i].toString() + "\n";
        str += "]";
        return str;
    }
}
