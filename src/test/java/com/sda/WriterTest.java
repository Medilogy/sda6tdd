package com.sda;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WriterTest {

    private Writer writer;

    @Before
    public void init() {
        writer = new Writer();
    }

    @Test
    public void sayHelloWithGivenNameTest() {
        //    Writer writer = new Writer();
        String name = "Michal";

        String result = writer.sayHello(name);

        Assert.assertEquals("Expected hello message is invalid", "Hello, Michal!", result);
    }

    @Test
    public void sayHelloWithNoNameSpecified() {
        //    Writer writer = new Writer();
        String name = " ";

        String result = writer.sayHello("");

        Assert.assertEquals("Message for empty name should be different", "Hello, my friend!", result);
    }

    @Test
    public void sayHelloWithNullName() {
        //    Writer writer = new Writer();
        String name = null;

        String result = writer.sayHello(name);

        Assert.assertEquals("Hello, my friend!", result);
    }

    @Test
    public void sayHelloWithCapitalizedName() {
        //    Writer writer = new Writer();
        String name = "MICHAL";

        String result = writer.sayHello(name);

        Assert.assertEquals("HELLO, MICHAL!", result);
    }

    @Test
    public void sayHelloWithOneSpaceBar() {

        String name = " ";

        String result = writer.sayHello(name);

        Assert.assertEquals("Hello, my friend!", result);
    }

    @Test
    public void sayHelloWithFourSpaceBars() {

        String name = "    ";

        String result = writer.sayHello(name);

        Assert.assertEquals("Hello, my friend!", result);
    }

    @Test
    public void sayHelloWithMultipleNames() {

        String name = "Michal,Agata,Alicja,Igor,Barbara";

        String result = writer.sayHello(name);

        Assert.assertEquals("Hello, Michal, Agata, Alicja, Igor and Barbara!", result);
    }
    
    @Test
    public void sayHelloWithMultipleCapitalizedNames() {

        String name = "MICHAL,AGATA,ALICJA";

        String result = writer.sayHello(name);

        Assert.assertEquals("HELLO, MICHAL, AGATA AND ALICJA!", result);
    }
}
