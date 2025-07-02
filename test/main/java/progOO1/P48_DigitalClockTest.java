package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class P48_DigitalClockTest {

    private ArrayList<Integer> clock;

    @Before
    public void setUp() {
        clock = new ArrayList<>();
        P48_DigitalClock.initializeClock(clock);
    }

    @Test
    public void testInitializeClockSize() {
        assertEquals("Clock should have 4 digits", 4, clock.size());
    }

    @Test
    public void testInitializeClockValues() {
        for (int i = 0; i < clock.size(); i++) {
            assertEquals("Digit " + i + " should be 0", 0, (int) clock.get(i));
        }
    }

    @Test
    public void testIncrementHourFrom23() {
        clock.set(0, 2);
        clock.set(1, 3);
        P48_DigitalClock.incrementHour(clock);
        assertEquals("Expected hour tens digit to reset from 2 to 0", 0, (int) clock.get(0));
        assertEquals("Expected hour units digit to reset from 3 to 0", 0, (int) clock.get(1));
    }

    @Test
    public void testIncrementHourFrom12() {
        clock.set(0, 1);
        clock.set(1, 2);
        P48_DigitalClock.incrementHour(clock);
        assertEquals("Expected hour tens digit to remain 1", 1, (int) clock.get(0));
        assertEquals("Expected hour units digit to increment from 2 to 3", 3, (int) clock.get(1));
    }

    @Test
    public void testDecrementHourFrom00() {
        clock.set(0, 0);
        clock.set(1, 0);
        P48_DigitalClock.decrementHour(clock);
        assertEquals("Expected hour tens digit to be 2", 2, (int) clock.get(0));
        assertEquals("Expected hour units digit to be 3", 3, (int) clock.get(1));
    }

    @Test
    public void testDecrementHourFrom15() {
        clock.set(0, 1);
        clock.set(1, 5);
        P48_DigitalClock.decrementHour(clock);
        assertEquals("Expected hour tens digit to be 1", 1, (int) clock.get(0));
        assertEquals("Expected hour units digit to be 4", 4, (int) clock.get(1));
    }

    @Test
    public void testIncrementMinuteFrom2359() {
        clock.set(0, 2); clock.set(1, 3); clock.set(2, 5); clock.set(3, 9);
        P48_DigitalClock.incrementMinute(clock);
        assertEquals("Expected minute tens digit to be 0", 0, (int) clock.get(2));
        assertEquals("Expected minute units digit to be 0", 0, (int) clock.get(3));
        assertEquals("Expected hour tens digit to be 0", 0, (int) clock.get(0));
        assertEquals("Expected hour units digit to be 0", 0, (int) clock.get(1));
    }

    @Test
    public void testIncrementMinuteFrom1259() {
        clock.set(0, 1); clock.set(1, 2); clock.set(2, 5); clock.set(3, 9);
        P48_DigitalClock.incrementMinute(clock);
        assertEquals("Expected minute tens digit to be 0", 0, (int) clock.get(2));
        assertEquals("Expected minute units digit to be 0", 0, (int) clock.get(3));
        assertEquals("Expected hour tens digit to be 1", 1, (int) clock.get(0));
        assertEquals("Expected hour units digit to be 3", 3, (int) clock.get(1));
    }

    @Test
    public void testIncrementMinuteFrom1238() {
        clock.set(0, 1); clock.set(1, 2); clock.set(2, 3); clock.set(3, 8);
        P48_DigitalClock.incrementMinute(clock);
        assertEquals("Expected minute tens digit to be 3", 3, (int) clock.get(2));
        assertEquals("Expected minute units digit to be 9", 9, (int) clock.get(3));
    }

    @Test
    public void testDecrementMinuteFrom0000() {
        clock.set(0, 0); clock.set(1, 0); clock.set(2, 0); clock.set(3, 0);
        P48_DigitalClock.decrementMinute(clock);
        assertEquals("Expected minute tens digit to be 5", 5, (int) clock.get(2));
        assertEquals("Expected minute units digit to be 9", 9, (int) clock.get(3));
        assertEquals("Expected hour tens digit to be 2", 2, (int) clock.get(0));
        assertEquals("Expected hour units digit to be 3", 3, (int) clock.get(1));
    }

    @Test
    public void testDecrementMinuteFrom1500() {
        clock.set(0, 1); clock.set(1, 5); clock.set(2, 0); clock.set(3, 0);
        P48_DigitalClock.decrementMinute(clock);
        assertEquals("Expected minute tens digit to be 5", 5, (int) clock.get(2));
        assertEquals("Expected minute units digit to be 9", 9, (int) clock.get(3));
        assertEquals("Expected hour tens digit to be 1", 1, (int) clock.get(0));
        assertEquals("Expected hour units digit to be 4", 4, (int) clock.get(1));
    }

    @Test
    public void testDecrementMinuteFrom1238() {
        clock.set(0, 1); clock.set(1, 2); clock.set(2, 3); clock.set(3, 8);
        P48_DigitalClock.decrementMinute(clock);
        assertEquals("Expected minute tens digit to be 3", 3, (int) clock.get(2));
        assertEquals("Expected minute units digit to be 7", 7, (int) clock.get(3));
    }
}
