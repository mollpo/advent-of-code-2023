package aoc.mollpo;

import aoc.mollpo.puzzle.DayOne;
import aoc.mollpo.puzzle.day2.Day2;
import aoc.mollpo.puzzle.day3.Day3;
import aoc.mollpo.puzzle.day4.Day4;

import java.io.FileNotFoundException;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int puzzleNumber;
        puzzleNumber = args.length > 0 ? Integer.parseInt(args[0]) : LocalDate.now().getDayOfMonth();
        switch (puzzleNumber) {
            case 1 -> {
                System.out.printf("Day %d, part 1: %d\n", puzzleNumber, DayOne.partOne());
            }
            case 2 -> {
                System.out.printf("Day %d, part 1: %d\n", puzzleNumber, Day2.solvePart1());
                System.out.printf("Day %d, part 2: %d\n", puzzleNumber, Day2.solvePart2());

            }
            case 3 -> {
                System.out.printf("Day %d, part 1: %d\n", puzzleNumber, Day3.solvePartOne());
            }
            case 4 -> {
                System.out.printf("Day %d, part 1: %d\n", puzzleNumber, Day4.solvePartOne());
                System.out.printf("Day %d, part 2: %d\n", puzzleNumber, Day4.solvePartTwo());
            }
            default -> System.out.println("No puzzle implemented for today");
        }
    }
}