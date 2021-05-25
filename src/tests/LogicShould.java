package tests;

import org.junit.jupiter.api.Test;
import xyz.eric.Logic;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LogicShould {

    @Test
    void shouldGiveMeTheAnswerToLifeTheUniverseAndEverything() {
        assertEquals(42, new Logic().theAnswerToLifeTheUniverseAndEverything());
    }
}
