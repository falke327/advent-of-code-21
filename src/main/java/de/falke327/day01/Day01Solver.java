package de.falke327.day01;

import de.falke327.InputReader;
import de.falke327.ProblemSolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class Day01Solver implements ProblemSolver {
    Logger log = LoggerFactory.getLogger(Day01Solver.class);
    @Override
    public String solve1(String inputPath) {
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

    private int countHigherDepthValues(List<Integer> inputList) {
        int result = 0;
        for (int i = 1; i < inputList.size(); i++){
            result += (inputList.get(i) > inputList.get(i - 1)) ? 1 : 0;
        }
        return result;
    }

    @Override
    public String solve2(String inputPath) {
        return null;
    }
}
