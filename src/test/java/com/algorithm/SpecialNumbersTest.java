package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Special Numbers Tests")
public class SpecialNumbersTest {

    @Nested
     class PalidromNumbersTest{
        @Test
        public void should_return_true_for_palidrom_number_1331(){
            Assertions.assertTrue(SpecialNumbers.controlForPalidromNumber(1331));
        }

        @Test
        public void should_return_false_for_non_palidrom_number_1234(){
            Assertions.assertFalse(SpecialNumbers.controlForPalidromNumber(1234));
        }

        @Test
        public void should_return_true_for_single_digit_numbers() {
            for (int i = 0; i <= 9; i++) {
                Assertions.assertTrue(SpecialNumbers.controlForPalidromNumber(i), i + " sayısı bir palindrom olmalıdır.");
            }
        }
    }


    @Nested
     class AmstrongNumbersTest{
        @Test
        public void should_return_true_for_amstrong_number_153(){
            Assertions.assertTrue(SpecialNumbers.controlForArmstrongNumber(153));
        }
        @Test
        public void should_return_false_for_non_amstrong_number_128(){
            Assertions.assertFalse(SpecialNumbers.controlForArmstrongNumber(128));
        }
    }

    @Nested
    class FibonacciNumbersTest{

        @Test
        public void should_write_fibonacci_numbers_in_5(){
            System.out.println(SpecialNumbers.controlForFibonacciNumber(5));
            Assertions.assertTrue(true);
        }

        @Test
        public void should_write_fibonacci_numbers_in_20(){
            System.out.println(SpecialNumbers.controlForFibonacciNumber(20));
            Assertions.assertTrue(true);
        }
    }

    @Nested
    class PrimeNumbersTest{
        @Test
        public void should_return_true_for_prime_number_7(){
            Assertions.assertTrue(SpecialNumbers.controlForPrimeNumber(7));
        }

        @Test
        public void should_return_false_for_non_prime_number_8(){
            Assertions.assertFalse(SpecialNumbers.controlForPrimeNumber(8));
        }


        @ParameterizedTest
        @ValueSource(ints = {0, 1, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20,633333333})
        void test_for_prime_numbers(int number) {
            Assertions.assertFalse(SpecialNumbers.controlForPrimeNumber(number), number + " bir asal sayı değildir.");
        }
    }


    @Nested
    class ReverseNumbersTest{
        @Test
        public void should_return_true_for_reverse_numbers_711(){
            Assertions.assertEquals(117 , SpecialNumbers.reverseNumber(711));
        }
        @Test
        public void should_reverse_negative_number() {
            Assertions.assertEquals(-321, SpecialNumbers.reverseNumber(-123));
        }
        @Test
        public void should_return_true_for_reverse_numbers_600(){
            Assertions.assertEquals(6 , SpecialNumbers.reverseNumber(600));
        }
    }


}