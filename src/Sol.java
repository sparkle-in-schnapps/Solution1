
import java.util.Scanner;
public class Sol {
    public static void main(String... args){
        Scanner in = new Scanner(System.in);
        
        int w = in.nextInt(), h = in.nextInt(); 
        char[][] usl = new char[h][w];
        in.nextLine();
        System.out.println(h + " " + w);
            for(int i = 0; i<h;i++){
                String str = in.nextLine();
                usl[i]=str.toCharArray();
            }
        char[][] nea = new char[2*w][2*h];
            for(int y = 0;y<2*w;y+=2){
                for(int x = 0;x<2*h;x+=2){
                    nea[y][x] = usl[x/2][y/2];
                    nea[y+1][x+1] = nea[y][x];
                    nea[y][x+1] = nea[y][x];
                    nea[y+1][x] = nea[y][x];
                }
            }
            
            for(int y = 0;y<2*w;y++){
                for(int x = 0;x<2*h;x++){
                    System.out.print(nea[y][x]);
                }
                System.out.println();
                }
        }
        
}
