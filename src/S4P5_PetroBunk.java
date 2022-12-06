import java.util.*;

public class S4P5_PetroBunk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the petrol in litres in car:");
        int cp = sc.nextInt();
        System.out.println("enter the number of petrol Bunks");
        int pb = sc.nextInt();
        System.out.println("enter the distance of each petrol bunk:");
        int[] dist = new int[pb];
        for(int i = 0; i < pb; i++){
            dist[i] = sc.nextInt();
        }
        System.out.println("enter the capacities of each Petrol bunk");
        int[] capacity = new int[pb];
        for(int i = 0; i < pb; i++){
            capacity[i] = sc.nextInt();
        }


        for(int i = 0; i < pb; i++){
            if(cp >= dist[i]){
                cp = cp+capacity[i]-dist[i];
            }else{
                break;
            }
        }


        System.out.println("The remaining petrol in the car: "+cp+" litres");
    }
}
