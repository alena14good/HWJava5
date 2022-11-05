package ru.netology.sqr;

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
        int expected =3;
        Assertions.assertEquals(expected, actual);
    }
        @Test
        public void MaxEqualToMin () {
            SQRService service = new SQRService();

            int actual = service.calSQRService(200, 200);
            int expected =3;

            Assertions.assertEquals(expected, actual);
}
    @Test
    public void MaxMoreMinExpected1 () {
        SQRService service = new SQRService();

        int actual = service.calSQRService(200, 300);
        int expected =1;

        Assertions.assertEquals(expected, actual);
}
}