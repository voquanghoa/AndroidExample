package com.quanghoa.usecardview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by osx on 7/7/16.
 */
public class AlbumFactory {
    private static int[] covers = new int[]{
            R.drawable.album1,
            R.drawable.album2,
            R.drawable.album3,
            R.drawable.album4,
            R.drawable.album5,
            R.drawable.album6,
            R.drawable.album7,
            R.drawable.album9,
            R.drawable.album9,
            R.drawable.album10,
            R.drawable.album11};

    public static List<Album> createList(){
        List<Album> albumList = new ArrayList<>();

        albumList.add(new Album("True Romance", 13, covers[0]));
        albumList.add(new Album("Xscpae", 8, covers[1]));
        albumList.add(new Album("Maroon 5", 11, covers[2]));
        albumList.add(new Album("Born to Die", 12, covers[3]));
        albumList.add(new Album("Honeymoon", 14, covers[4]));
        albumList.add(new Album("I Need a Doctor", 1, covers[5]));
        albumList.add(new Album("Loud", 11, covers[6]));
        albumList.add(new Album("Legend", 14, covers[7]));
        albumList.add(new Album("Hello", 11, covers[8]));
        albumList.add(new Album("Greatest Hits", 17, covers[9]));

        return albumList;
    }
}
