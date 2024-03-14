import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("""
                        1.Parallelepiped
                        2.Cylinder
                        """);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    try {
                        System.out.print("Write length: ");
                        int length = scanner.nextInt();
                        if (length<0){
                            throw new MyException();

                        }
                        System.out.print("Write width: ");
                        int width = scanner.nextInt();
                        if (width<0){
                            throw new MyException();
                        }
                        System.out.print("Write height: ");
                        int height = scanner.nextInt();
                        if (height<0) {
                            throw new MyException();

                        }
                        Parallelepiped parallelepiped = new Parallelepiped(length, width, height);
                        System.out.println("\nParallelepiped Area: " + parallelepiped.ParallelepipedArea());
                        System.out.println("Parallelepiped Volume:" + parallelepiped.ParallelepipedVolume() + "\n");
                    } catch (MyException e) {
                        System.out.println("Терс сан болбойт ");

                    }
                }
                case 2 -> {
                    try {

                        System.out.print("Write height: ");
                        int height = scanner.nextInt();
                        if (height<0){
                            throw new MyException();
                        }

                        System.out.print("Write radius: ");
                        int radius = scanner.nextInt();
                        if (radius < 0) {
                            throw new MyException();
                        }

                        Cylinder cylinder = new Cylinder(height,radius);
                        System.out.println("\nCylinder Area: " + cylinder.CylinderArea());
                        System.out.println("Cylinder Volume: " + cylinder.CylinderVolume() + "\n");

                    } catch (MyException e) {
                        System.out.println("Терс сан болбойт ");
                    }
                }
            }
        }
    }
}