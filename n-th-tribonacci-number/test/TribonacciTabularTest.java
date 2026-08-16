// Plain-Java test for TribonacciTabular — no external test framework required.
// Run directly with: java -cp <compiled-output> TribonacciTabularTest
// Exits 0 if all assertions pass, exits 1 (and prints failures) otherwise.
public class TribonacciTabularTest {

    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        TribonacciTabular solver = new TribonacciTabular();

        // Known Tribonacci sequence: T0=0, T1=1, T2=1, Tn = Tn-1+Tn-2+Tn-3
        assertEquals("T(0)", 0, solver.Tribonacci(0));
        assertEquals("T(1)", 1, solver.Tribonacci(1));
        assertEquals("T(2)", 1, solver.Tribonacci(2));
        assertEquals("T(3)", 2, solver.Tribonacci(3));
        assertEquals("T(4)", 4, solver.Tribonacci(4));
        assertEquals("T(10)", 149, solver.Tribonacci(10));
        assertEquals("T(20)", 66012, solver.Tribonacci(20));
        assertEquals("T(25)", 1389537, solver.Tribonacci(25));

        System.out.println("\nTribonacciTabularTest: " + passed + " passed, " + failed + " failed.");
        if (failed > 0) {
            System.exit(1);
        }
    }

    private static void assertEquals(String label, long expected, long actual) {
        if (expected == actual) {
            System.out.println("PASS  " + label + " => " + actual);
            passed++;
        } else {
            System.out.println("FAIL  " + label + " => expected " + expected + " but got " + actual);
            failed++;
        }
    }
}
