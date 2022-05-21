package de.falke327.day01;

import de.falke327.InputReader;
import de.falke327.ProblemSolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day01Solver implements ProblemSolver {
    Logger log = LoggerFactory.getLogger(Day01Solver.class);

    @Override
    public String solve1(final String inputPath) {
        int result = 0;
        InputReader inputReader = new InputReader(inputPath);

        try {
            List<Integer> inputList = inputReader.getLinesAsInteger();
            result = countHigherDepthValues(inputList);
        } catch (IOException e) {
            log.error("Caught IOException message was: \n" + e.getMessage());
        }

        return String.format("%d measurements are larger than previous ones", result);
    }

    @Override
    public String solve2(final String inputPath) {
        int result = 0;
        InputReader inputReader = new InputReader(inputPath);

        try {
            List<Integer> inputList = slidingWindow(inputReader.getLinesAsInteger());
            log.debug(inputList.toString());
            result = countHigherDepthValues(inputList);
        } catch (IOException e) {
            log.error("Caught IOException message was: \n" + e.getMessage());
        }

        return String.format("%d measurements are larger than previous ones", result);
    }

    private int countHigherDepthValues(final List<Integer> inputList) {
        int result = 0;

        for (int i = 1; i < inputList.size(); i++) {
            result += (inputList.get(i) > inputList.get(i - 1)) ? 1 : 0;
        }

        return result;
    }


    /**
     * TODO: Get this more dynamic for other window sizes
     */
    private List<Integer> slidingWindow(final List<Integer> inputList) {
        final int WINDOW_SIZE = 2;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < inputList.size() - WINDOW_SIZE; i++) {
            result.add(inputList.get(i) + inputList.get(i + 1) + inputList.get(i + 2));
        }

        return result;
    }
}
