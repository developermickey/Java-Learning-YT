import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);

       int N = sc.nextInt();

int A[] = new int[N];

for (int i = 0; i < N; i++) {
    A[i] = sc.nextInt();
}

int sum = 0;

for (int i=0; i < N; i++) {
    sum += A[i];
}
System.out.println(sum);
        
    }
}