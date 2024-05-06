package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class TestScanner {
    @Test
    public void testScanner(){
        Scanner scanner = new Scanner("test");
        Assertions.assertEquals("test", scanner.nextLine());
    }
}
