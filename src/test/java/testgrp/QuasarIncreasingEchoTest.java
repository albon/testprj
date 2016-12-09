package testgrp;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

/**
 * Increasing-Echo Quasar Text
 *
 * @author circlespainter
 */
public class QuasarIncreasingEchoTest {
    @Test
    public void test() throws Exception {
        Integer actual = QuasarIncreasingEchoApp.doAll();
        assertThat(actual, is(10));
    }

    public static void main(String[] args) throws Exception {
        new QuasarIncreasingEchoTest().test();
    }
}