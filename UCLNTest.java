import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class UCLNTest {
    @Test
    void UCLN1(){
        assertEquals(1, UCLN(0,1));
    }
    @Test
    void UCLN2(){
        assertEquals(1, UCLN(-3,-2));
    }
    @Test
    void UCLN3(){
        assertEquals(1, UCLN(-1,1));
    }
    @Test
    void UCLN4(){
        assertEquals(1, UCLN(1,0));
    }
    @Test
    void UCLN5(){
        assertEquals(1, UCLN(2,1));
    }
    @Test
    void UCLN6(){
        assertEquals(1, UCLN(1,2));
    }
    @Test
    void UCLN7(){
        assertEquals(1, UCLN(-1,0));
    }
    @Test
    void UCLN8(){
        assertEquals(1, UCLN(-2,1));
    }
    @Test
    void UCLN9(){
        assertEquals(1, UCLN(-1,2));
    }
    @Test
    void UCLN10(){
        assertEquals(1, UCLN(3,2));
    }
    @Test
    void UCLN11(){
        assertEquals(1, UCLN(0,-1));
    }
    @Test
    void UCLN12(){
        assertEquals(1, UCLN(0,1));
    }
    @Test
    void UCLN13(){
        assertEquals(1, UCLN(2,-1));
    }
    @Test
    void UCLN14(){
        assertEquals(1, UCLN(1,-2));
    }
    @Test
    void UCLN15() {
        assertEquals(1, UCLN(1, 3));
    }
    private int UCLN (int m, int n){
        if (m < 0){
            m = -m;
        }
        if (n < 0){
            n = -n;
        }
        if (m == 0){
            return n;
        }
        if (n == 0){
            return m;
        }
        while (m != n) {
            if (m > n){
                m = m - n;
            }else {
                n = n - m;
            }
        }
        return m;
    }
}
