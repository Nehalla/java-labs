package lab2.commandLine;

public class q1 {
        public static void main(String[] args) {
            // Check if two arguments are given
            if (args.length != 2) {
                System.out.println("Please provide exactly two positive integers.");
                return;
            }

            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            // Check if both are positive
            if (a <= 0 || b <= 0) {
                System.out.println("Both numbers must be positive.");
                return;
            }

            // Check if either divides the other
            if (a % b == 0 || b % a == 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }



