package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

public class P50_LongJumpCompetitionTest {

    @Test
    public void testSortBy2002Marks() {
        int[][] participants = {
            {101, 500, 510, 480},
            {102, 530, 540, 500},
            {103, 490, 495, 470}
        };

        P50_LongJumpCompetition.sortBy(participants, 3, 3); // field 3 = MARK_2002

        assertEquals(103, participants[0][0]); // lowest 2002 mark first
        assertEquals(101, participants[1][0]);
        assertEquals(102, participants[2][0]);
    }

    @Test
    public void testSortByDorsal() {
        int[][] participants = {
            {105, 400, 410, 420},
            {101, 390, 395, 400},
            {103, 410, 415, 430}
        };

        P50_LongJumpCompetition.sortBy(participants, 3, 0); // field 0 = DORSAL

        assertEquals(101, participants[0][0]);
        assertEquals(103, participants[1][0]);
        assertEquals(105, participants[2][0]);
    }
}
