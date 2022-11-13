package ru.netology.sqr.HWJava5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void MaxMoreMin () {
        SQRService service = new SQRService();

        int actual = service.calSQRService(200, 300);
        int expected =3;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void MaxLessMin () {
        SQRService service = new SQRService();

        int actual = service.calSQRService(300, 200);
        int expected =0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void MaxEqualToMin () {
        SQRService service = new SQRService();

        int actual = service.calSQRService(200, 200);
        int expected =0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void MaxDifferent300 () {
        SQRService service = new SQRService();

        int actual = service.calSQRService(200, 400);
        int expected =6;

        Assertions.assertEquals(expected, actual);
    }

}