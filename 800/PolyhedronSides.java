import java.util.Scanner;

public class PolyhedronSides {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int sides = 0;
        for (int i = 0; i < n; i++) {
            String choice = sc.nextLine();
            switch (choice) {
            case "Tetrahedron":
                sides = sides+4;
                break;

            case "Cube" :
                sides = sides+6;
                break;

            case "Octahedron":
                sides = sides+8;
                break;
            case "Dodecahedron":
                sides = sides+12;
                break;
            case "Icosahedron":
                sides = sides+20;
                break;
        }
        }
        System.out.println(sides);   
    }
}
