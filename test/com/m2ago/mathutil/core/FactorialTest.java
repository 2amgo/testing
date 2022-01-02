package com.m2ago.mathutil.core;
import org.junit.Assert;
import org.junit.Test; //JUnit 4

public class FactorialTest {
    
        @Test //biến 1 hàm kèm cái Annotation thành hàm main()
        public void checkFactorialGivenRightArgumentReTurnWell(){
            long expected = 120;
            long actual = MathUtil.getFactorial(5);
            Assert.assertEquals(expected, actual);
            
            Assert.assertEquals(720, MathUtil.getFactorial(6));
            Assert.assertEquals(1, MathUtil.getFactorial(0));
        }
        //bat xem co nem ngaoi le nhu ky vong hay khong . 
        //neu dung ham duoc thiet ke phai nem ngoai le , thuc su khi chay la ham dung n
        //nhu ky vong , ngoai le thi co mau xanh
        //Junit 4 coi naoi le khong la gia trik , khon assetEquals 
        @Test (expected = IllegalArgumentException.class)
        public void checkFactorialGivenWrongArgumentThrowsException(){
                 MathUtil.getFactorial(-2); // phai nem ngoai le moi la dung 
        }
        //tổng kết cho xanh đỏ, 
        //xanh khi tất cả các tình huống test là xanh , 
        //tách các case ra. kỳ vọng sai. như kỳ vọng ném ngoại lệ mà lại đặt th đúng
}
