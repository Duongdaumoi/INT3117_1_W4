import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class calFactorialTest {
    @Test
    void calFactorialTest1(){
        assertEquals(1, calFactorial(0));
    }
    @Test
    void calFactorialTest2(){
        assertEquals(1, calFactorial(1));
    }
    @Test
    void calFactorialTest3(){
        assertEquals(2, calFactorial(2));
    }
    @Test
    void calFactorialTest4(){
        assertEquals(6, calFactorial(3));
    }
    @Test
    void calFactorialTest5(){
        assertEquals(3628800, calFactorial(10));
    }
    int calFactorial (int n){
        int result = 1;
        int i=1;
        while (i <= n) {
            result = result * i;
            i++; // i=i+1;
        }
        return result;
    }

}
