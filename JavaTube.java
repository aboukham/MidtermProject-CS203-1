import java.util.Arrays;
import java.util.Comparator;

public class JavaTube {
    public class SortVideosByTitle implements Comparator<Video> {

        @Override
        public int compare(Video o1, Video o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }

    public class SortVideosByViews implements Comparator<Video> {

        @Override
        public int compare(Video o1, Video o2) {
            return (o1.getViews() - o2.getViews());
        }
    }

    public void  sortCookingVideoByIngredientList(CookingVideo[] arr){
        class SortCookingVideosByIngredients implements Comparator<CookingVideo> {
            @Override
            public int compare(CookingVideo o1, CookingVideo o2) {
                return o1.getIngredientsList().length - o2.getIngredientsList().length;
            }
        }
        SortCookingVideosByIngredients  byIngredients = new SortCookingVideosByIngredients();
        Arrays.sort(arr, byIngredients);
    }

    public void  sortCookingVideoByServingSizeDescending(CookingVideo[] arr){
         Comparator<CookingVideo> byServing = new Comparator<CookingVideo>(){
             @Override
             public int compare(CookingVideo o1, CookingVideo o2) {
                 return (o1.getRecipe().getServings() - o2.getRecipe().getServings()) * -1;
             }
         };
         Arrays.sort(arr, byServing);
    }

    public void printAllCookingRecipies(CookingVideo[] arr){
        for (CookingVideo v : arr)
            v.printRecipe();
    }

    public void printAllGamingVideos(GamingVideo[] arr){
        for (GamingVideo g : arr)
            System.out.println("game name: " + g.getGameName());
    }

    public void videoPrinter(Video[] arr){
        for (Video v : arr)
            System.out.println(v + "\n");
    }

    public static void main(String[] args){
        Recipe          r1 = new Recipe();
        Recipe          r2 = new Recipe("pizza", "tomato,flour,cheese",
                "make a bread. add tomato. add cheese", 10, 20, 5);
        CookingVideo    cv1 = new CookingVideo();
        CookingVideo    cv2 = new CookingVideo("practice english", 25, 3900,
                300, 234561.0, r2);

        CookingVideo    cv3 = new CookingVideo("documentary", 35.5,
                1900, 127, 34567.9, r1);
        GamingVideo     gv1 = new GamingVideo();
        GamingVideo    gv2 = new GamingVideo("american movie", 25, 3900,
                300, 234561.0, "tennis");

        GamingVideo    gv3 = new GamingVideo("turkish movie", 35.5,
                1900, 127, 34567.9, "soccer");
        Video[] allVideos = {cv1, cv2, cv3, gv1, gv2, gv3};
        CookingVideo[] cookingVideos = {cv1, cv2, cv3};
        GamingVideo[] gamingVideos = {gv1, gv2, gv3};
        JavaTube    jt = new JavaTube();
        JavaTube.SortVideosByTitle  byTitle = jt.new SortVideosByTitle();
        JavaTube.SortVideosByViews  byViews = jt.new SortVideosByViews();
        System.out.println("*********************** videos before sorting ************************************");
        jt.videoPrinter(allVideos);
        System.out.println();
        System.out.println("*********************** videos after sorting by title *****************************");
        Arrays.sort(allVideos, byTitle);
        jt.videoPrinter(allVideos);
        System.out.println();
        System.out.println("*********************** videos after sorting by views *****************************");
        Arrays.sort(allVideos, byViews);
        jt.videoPrinter(allVideos);
        System.out.println();
        System.out.println("*********************** All cooking recipes before sorting ************************");
        jt.printAllCookingRecipies(cookingVideos);
        System.out.println("*********************** cooking videos after sorting by ingredients ***************");
        jt.sortCookingVideoByIngredientList(cookingVideos);
        jt.videoPrinter(cookingVideos);
        System.out.println();
        System.out.println("**************** cooking videos after Descending sorting by servings ***************");
        jt.sortCookingVideoByServingSizeDescending(cookingVideos);
        jt.videoPrinter(cookingVideos);
        System.out.println();
        System.out.println("*********************** All cooking recipes after sorting **************************");
        jt.printAllCookingRecipies(cookingVideos);
        System.out.println("************************* All Gaming Videos before sorting *************************");
        jt.printAllGamingVideos(gamingVideos);
        System.out.println("******** All Gaming Videos After sorting by name using the lambda expression ********");
        Arrays.sort(gamingVideos, (o1, o2)-> o1.getGame().compareTo(o2.getGame()));
        jt.printAllGamingVideos(gamingVideos);
        System.out.println("*************************** All videos using videoList ******************************");
        VideoList   vl = new VideoList();
        for (int i = 0; i < cookingVideos.length; i++){
            vl.add(cookingVideos[i]);
        }
        for (int i = 0; i < gamingVideos.length; i++){
            vl.add(gamingVideos[i]);
        }
        System.out.println(vl);
    }
    //instructions to sort videos by views and the sorting process:
    //-Define inner class that implements the comparator interface of video.
    //-Override the compare method that should return the difference between the views number of two objects.
    //-Create the object of this inner class in main Method.
    //-Call the static sort Method from the Arrays class then pass it the allVideos array and the object which we created,
    //the sorting process:
    //-comparison each array element with other elements using the compare Method.
    //-if the result of this method positive we have soap values of the elements.
}
