package com.lanying.springcloud;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimePatternJUnit {

    @Test
    public void testPattern(){
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(zonedDateTime);
    }
}
