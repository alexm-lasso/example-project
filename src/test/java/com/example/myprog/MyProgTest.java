package com.example.myprog;

import com.example.myprog.MyProg;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyProgTest {

    @Test
    public void testMultiply() {
        assertThat(MyProg.multiply(0, 0)).isEqualTo(0);
        assertThat(MyProg.multiply(0, 1)).isEqualTo(0);
        assertThat(MyProg.multiply(1, 0)).isEqualTo(0);

        assertThat(MyProg.multiply(1, 1)).isEqualTo(1);
        assertThat(MyProg.multiply(1, 2)).isEqualTo(2);
        assertThat(MyProg.multiply(2, 1)).isEqualTo(2);
        assertThat(MyProg.multiply(2, 2)).isEqualTo(4);
    }
}
