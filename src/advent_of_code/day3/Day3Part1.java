package advent_of_code.day3;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Day3Part1 {

    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines((Paths.get("C:\\Users\\patry\\IdeaProjects\\AOC\\src\\adventOfCode\\day3part1data.txt")));
            List<String> firstHalf = new ArrayList<>();
            List<String> twice = new ArrayList<>();

            for (String line : lines) {

                for (int i = 0; i < line.length() / 2; i++) {
                    firstHalf.add(line.substring(i, i + 1));
                }

                for (int j = line.length() / 2; j < line.length(); j++) {
                    if (firstHalf.contains(line.substring(j, j + 1))) {
                        twice.add(line.substring(j, j + 1));
                        break;
                    }
                }

                firstHalf.clear();
            }

            int sum = 0;
            for (String str : twice) {
                char c = str.charAt(0);
                if (Character.isUpperCase(c)) {
                    sum += 26;
                }
                int characterValue = 1 + Character.toUpperCase(c) - 'A';
                sum += characterValue;
            }
            System.out.println("Sum: " + sum);

        } catch (Exception ignored) {

        }
    }
}
