package seedu.duke.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ControllerTest {
    @Test
    public void testHaveExitOption() {
        Controller[] controllers = {
            new MainController(),
            // new DishController(),
        };

        for (Controller c : controllers) {
            // Each controller should have at least one choice.
            assertTrue(c.choices.length >= 1);
            // The first choice should always be to exit.
            assertTrue(c.choices[0].toLowerCase().contains("exit"));
        }
    }
}