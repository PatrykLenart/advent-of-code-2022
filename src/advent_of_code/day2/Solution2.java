package advent_of_code.day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        final List<String> fileContent = Files.readAllLines(Path.of("src/advent_of_code/day2/input"), UTF_8);
        System.out.println("Part 1 solution:" + part1(fileContent));
        System.out.println("Part 2 solution:" + part2(fileContent));
    }

    private static int part1(List<String> fileContent) {
        int sum = 0;
        for (String s : fileContent) {
            String[] moves = s.split(" ");
            if (moves[1].equals("X")) {
                if (moves[0].equals("A")) {
                    sum += 4;
                } else if (moves[0].equals("B")) {
                    sum += 1;
                } else {
                    sum += 7;
                }
            } else if ("Y".equals(moves[1])) {
                if (moves[0].equals("A")) {
                    sum += 8;
                } else if (moves[0].equals("B")) {
                    sum += 5;
                } else {
                    sum += 2;
                }
            } else {
                if (moves[0].equals("A")) {
                    sum += 3;
                } else if (moves[0].equals("B")) {
                    sum += 9;
                } else {
                    sum += 6;
                }
            }
        }
        return sum;
    }

    private static int part2(List<String> fileContent) {
        int sum = 0;
        for (String s : fileContent) {
            String[] moves = s.split(" ");
            if (moves[1].equals("X")) {
                if (moves[0].equals("A")) {
                    sum += 3;
                } else if (moves[0].equals("B")) {
                    sum += 1;
                } else {
                    sum += 2;
                }
            } else if ("Y".equals(moves[1])) {
                if (moves[0].equals("A")) {
                    sum += 4;
                } else if (moves[0].equals("B")) {
                    sum += 5;
                } else {
                    sum += 6;
                }
            } else {
                if (moves[0].equals("A")) {
                    sum += 8;
                } else if (moves[0].equals("B")) {
                    sum += 9;
                } else {
                    sum += 7;
                }
            }
        }
        return sum;
    }


}
