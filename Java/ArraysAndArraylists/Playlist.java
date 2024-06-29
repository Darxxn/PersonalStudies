package Java.ArraysAndArraylists;

import java.util.Arrays;
import java.util.ArrayList;

class Playlist {
  public static void main(String[] args) {

    // Array of my favorite songs
    String[] favoriteSongs = {"BTS ft. Juice WRLD - All Night", "The Kid Laroi - Forever & Again", "Juice WRLD - Graduation", "Taeyang (feat. LISA of BLACKPINK - Shoong!", "Post Malone - I Like You (A Happier Song) [feat. Doja Cat]", "Juice WRLD - Fast", "The Kid Laroi & Justin Bieber - STAY", "Juice WRLD & The Kid Laroi - Reminds Me of You", "ENHYPEN - 10 Months", "Zachary Knowles - dancing in the kitchen"};

    // printing the top 3 songs
    System.out.println("Top 3 Songs: ");
    for (int i = 0; i < 3; i++) {
    System.out.println(favoriteSongs[i]);
    }
    System.out.println();

    // 5 songs to bring to the desert
    ArrayList<String> desertIslandPlaylist = new ArrayList<>();
    desertIslandPlaylist.add("Surfaces - Wave of You");
    desertIslandPlaylist.add("Post Malone - Enemies (feat. DaBaby)");
    desertIslandPlaylist.add("Jack Harlow - WHATS POPPIN (Remix) [feat. DaBaby, Tory Lanez & Lil Wayne]");    desertIslandPlaylist.add("Jung Kook & Latto - Seven");    desertIslandPlaylist.add("League of Legends Music & NewJeans - GODS");

    // print out the desert playlist
    System.out.println("Desert Playlist");
    System.out.println(desertIslandPlaylist);

    // bringing all my favorite songs to the desert playlist
    desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));

    // You can now only bring 10 songs, so let's check the size
    System.out.println();
    System.out.println("Desert Playlist & Favorite Songs");
    System.out.println("Size of the playlist right now: " + desertIslandPlaylist.size());
    System.out.println(desertIslandPlaylist);


    System.out.println();

    // removing songs until there's only 10 left
    desertIslandPlaylist.remove(0);
    desertIslandPlaylist.remove(0);
    desertIslandPlaylist.remove(0);
    desertIslandPlaylist.remove(0);
    desertIslandPlaylist.remove(0);    

    System.out.println("Downsized Playlist");
    System.out.println(desertIslandPlaylist);
    
    System.out.println();
    System.out.println("Size of the playlist right now: " + desertIslandPlaylist.size());

    // song swapping
    // find the index of specific songs and swap them
    int SongA = desertIslandPlaylist.indexOf("Juice WRLD - Graduation");
    int SongB = desertIslandPlaylist.indexOf("Juice WRLD & The Kid Laroi - Reminds Me of You");

    String tempA = "Juice WRLD - Graduation";

    desertIslandPlaylist.set(SongA, "Juice WRLD & The Kid Laroi - Reminds Me of You");

    // System.out.println();
    // System.out.println(desertIslandPlaylist);

    desertIslandPlaylist.set(SongB, tempA);

    System.out.println();
    System.out.println("Swapped Songs");
    System.out.println(desertIslandPlaylist);
  }
}
