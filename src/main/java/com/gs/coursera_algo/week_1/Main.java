package com.gs.coursera_algo.week_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Receives a new-line-separated list of integers from the standard input and prints the number of inversions to the
 * standard input
 */
public final class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // Create an empty list
        final List<Integer> xs = new ArrayList<>();
        // Populate the list
        while (scanner.hasNextInt()) {
            final int x = scanner.nextInt();
            xs.add(x);
        }

        final MSortingInversionCounter<Integer> inversionCounter = MSortingInversionCounter.withNaturalOrder();

        // Count Inversions
        final long inversionNum = inversionCounter.countInversions(xs);

        // Output the result
        System.out.println(inversionNum);
    }
}
