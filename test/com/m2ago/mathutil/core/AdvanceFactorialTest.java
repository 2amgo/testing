/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.m2ago.mathutil.core;

import static com.m2ago.mathutil.core.MathUtil.getFactorial;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
//Data Driven Testing/ Parameter testing
// fill bo data vao trong loi goi ham 
//tach biet data va loi goi ham chech kq
@RunWith(value = Parameterized.class)
public class AdvanceFactorialTest {
    // chuan bi bo data de o file txt, database , excel
    //neu de ngoai thi phai code them mang data de doc data vaof co
    @Parameters
    public static Object[][] initData(){
    return new Integer[][]{
                                {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120},
                                {6, 220},
                                
    };
   }
    @Parameter(value = 0) // n ung voi cot o 
    public int n; // ban muon tinh may giai thua
    @Parameter(value = 1)// ung voi cot 1
    //map trong mang 
    public long expected; //ban ky vong gia tri may!
    @Test
      public void checkFactorialGivenRightArgumentReTurnWell(){
            assertEquals(expected, getFactorial(n));
        }
      //chon 1 unit test framework bat ky c# Nunit, xunit, MsTest
      //j: testNG
      //Js: 
      //demo phai co code
      //game phan tinh toan xu ly, cac class ma co xu ly tra ve gia tri
      //code co y nghia dung choi.
      //TDD test First Development / Unit Test
      // CI continous integration (CI/ CD )
      
      //Dev1 , dev 2 viet tren local 
      //unit test di nhien >>>
      //>> can co sever trung tam chua code .code tren nay phai on . cai them 1 vai 
      //tool tu tong check code 
      //-code khong chuanr  >> on > dong goi >> sever khac
      //>>code khong on tu dong gui mail cho dev , chuio
      // bat ky ai do day code len sever lap tuc qua tirnh tu dong hoa cua sever chay lien 
      //lien tuc nhu th e>> continous integration - tich hop lien tuc.
      //github. gitlab. bitbucket
      //tool kiem tra code: jenkis/action/baambo/ ci/ teamcity/ javis
      
}
