import java.util.Scanner;

public class MeetingFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int friends[] = new int[3];
        int minDistance;
        for (int i = 0; i < friends.length; i++) {
            friends[i]=sc.nextInt();
        }
        int first = Math.abs(friends[0]-friends[1])+Math.abs(friends[0]-friends[2]);
        int second = Math.abs(friends[1]-friends[0])+Math.abs(friends[1]-friends[2]);
        int third = Math.abs(friends[2]-friends[0])+Math.abs(friends[2]-friends[1]);
        if(first<=second && first<=third){
            minDistance=first;
        }else if(second<=first && second<=third){
            minDistance=second;
        }else{
            minDistance=third;
        }

        //math.min use it later

        System.out.println(minDistance);
    }
}
