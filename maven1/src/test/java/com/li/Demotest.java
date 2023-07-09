package com.li;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author li
 * @description
 */
public class Demotest {


        @Test
        public void test(){
            Demo demo=new Demo();
            String s = demo.say("mvn");
            Assert.assertEquals("hellomvn",s);
        }


}
