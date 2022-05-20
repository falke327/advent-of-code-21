package de.falke327.day01;

import de.falke327.ProblemSolver;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day01SolverTest {
    Logger log = LoggerFactory.getLogger(Day01SolverTest.class);

    @Test
    void testExampleSolution1() {
        String path = "src/test/testResources/day01/testData01.txt";

        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
        log.debug(absolutePath);

        ProblemSolver day01Solver = new Day01Solver();
        String result = day01Solver.solve1(absolutePath);

        assertEquals("7 measurements are larger than previous ones", result);
    }

    @Test
    void testExampleSolution2() {
        String path = "src/test/testResources/day01/testData01.txt";

        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
        log.debug(absolutePath);

        ProblemSolver day01Solver = new Day01Solver();
        String result = day01Solver.solve2(absolutePath);

        assertEquals("5 measurements are larger than previous ones", result);
    }
}
