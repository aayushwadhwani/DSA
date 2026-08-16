import java.util.HashMap;

public class TribonacciMemo {

    public int recursive_tribonacci(HashMap<Integer, Integer> map, int n) {
        if (map.containsKey(n))
            return map.get(n);
        
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        
        int result = recursive_tribonacci(map, n-1) + recursive_tribonacci(map, n-2) + recursive_tribonacci(map, n-3);
        
        map.put(n,result);
        return result;
    }

    public int Tribonacci(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return recursive_tribonacci(map, n);
    }
}