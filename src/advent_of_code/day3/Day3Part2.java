package advent_of_code.day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Day3Part2 {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines((Paths.get("C:\\Users\\patry\\IdeaProjects\\AOC\\src\\adventOfCode\\day3part2data.txt")));
        List<Character> badges = new ArrayList<>();
        List<Character> occurrencesFirst = new ArrayList<>();
        List<Character> occurrencesSecond = new ArrayList<>();

        int triple = 1;
        for (String line : lines) {
            if (triple == 4) {
                triple = 1;
            }

            for (Character c : line.toCharArray()) {
                if (triple == 1) {
                    occurrencesFirst.add(c);
                } else if (triple == 2) {
                    occurrencesSecond.add(c);
                } else {
                    if (occurrencesFirst.contains(c) && occurrencesSecond.contains(c)) {
                        badges.add(c);
                        occurrencesFirst.clear();
                        occurrencesSecond.clear();
                        break;
                    }
                }
            }
            triple++;

        }

        System.out.println(badges);
        System.out.println("Badges size: " + badges.size());

        int sumOfBadges = 0;
        for (Character c : badges) {
            if (Character.isUpperCase(c)) {
                sumOfBadges += 26;
            }
            int characterValue = 1 + Character.toUpperCase(c) - 'A';
            sumOfBadges += characterValue;
            System.out.println("Character value: " + characterValue);
        }

        System.out.println("Sum: " + sumOfBadges);

        System.out.println(badges);

    }
}
