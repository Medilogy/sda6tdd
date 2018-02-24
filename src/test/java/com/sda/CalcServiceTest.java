package com.sda;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcServiceTest {

    private CalcService calcService;

    @Before
    public void init () {
        calcService = new CalcService();
    }
    @Test
    public void shouldAddDigitsInStringAndProduceResults(){
        //given - definiujemy dane wejsciowe
        String text = "2;3;4";
        int exxpected = 9;

        //when - kiedy wywoluje akcje
        int actual = calcService.calculate(text);

        //then - wtedy
        Assert.assertEquals(exxpected, actual);
    }

}
