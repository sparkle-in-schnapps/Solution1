
import java.util.Scanner;

public class Solution {

    static Song[] songs;

    public static void main(String... args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), k = in.nextInt();
        songs = new Song[n];
        for (int i = 0; i < n; i++) {
            songs[i] = new Song();
            songs[i].time = in.nextInt();
            songs[i].timer = in.nextInt();
            if (i < k) {
                songs[i].endtime = songs[i].time + songs[i].timer;
            } else {
                songs[i].endtime = min(i - k, i) + songs[i].timer;
            }
        }

        for (Song s : songs) {
            System.out.println(s.endtime);
        }
    }

    static long min(int x, int y) {
        long min = songs[x].endtime;
        for (int i = x; i < y; i++) {
            if (songs[i].endtime < min) {
                min = songs[i].endtime;
            }
        }
        return min;
    }

    private static class Song {
        long timer, time, endtime;
    }
}
