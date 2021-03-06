package eu.bausov.kafkaavro;

import eu.bausov.kafkaavro.avsc.Weather;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * Created by GreenNun on 06.11.2019.
 */
class AvscToPojoTest {

    @Test
    void test() {
        final var weather = new Weather();
        System.out.println(weather);

        final var build = Weather.newBuilder()
                .setTime(1L)
                .setStation("station")
                .setTemp(20)
                .setPrice(new BigDecimal(22))
                .build();
        System.out.println(build);
    }
}
