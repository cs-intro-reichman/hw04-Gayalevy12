public class Primes {
    public static void main(String[] args)
    {
        if (args.length == 0) {
            System.out.println("Usage: java Primes [number]");
            return;
        }
        int n = Integer.parseInt(args[0]);
        if (n < 2) {
            System.out.printf("There are 0 primes between 2 and %d\n", n);
            return;
        }
        boolean[] isP = sieve(n);
        print(n, isP);
    }

    public static boolean[] sieve(int n) {
        boolean[] isP = new boolean[n + 1];
        for (int i = 0; i < isP.length; i++) 
            {
            isP[i] = true;
        }
        isP[0] = false;
        isP[1] = false;
        int p = 2;
        while (p * p <= n) {
            if (isP[p]) {
                int i = p * p;
                while (i <= n) {
                    isP[i] = false;
                    i += p;
                }
            }
            p++;
        }
        return isP;
    }

    public static void print(int n, boolean[] isP) {
        int c = 0;
        System.out.printf("Prime numbers up to %d:\n", n);
        for (int i = 2; i <= n; i++) {
            if (isP[i]) {
                System.out.println(i);
                c++;
            }
        }
        double pc = (double) c / n * 100;
        System.out.printf("There are %d primes between 2 and %d (%.0f%% are primes)\n", 
                          c, n, pc);
    }
}

