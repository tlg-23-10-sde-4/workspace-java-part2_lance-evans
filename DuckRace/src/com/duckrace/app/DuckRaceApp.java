package com.duckrace.app;

import com.duckrace.Board;
import com.duckrace.Reward;

import java.util.Scanner;

/*
 *Application controlled
 *
 * It directs the overall flow/sequence of the application,
 * and does all user prompting
 */
public class DuckRaceApp {
    private final Board board = Board.getInstance();
    private final Scanner scanner = new Scanner(System.in);
    private final int maxId = board.maxId();

    public void execute(){
        welcome();
        showBoard();
        int id = promptForId();
        Reward reward = promptForReward();
        updateBoard(id, reward);
        showBoard();
    }

    private void updateBoard(int id, Reward reward) {
        board.updateBoard(id, reward);
    }

    private Reward promptForReward() {
        Reward reward = null;

        boolean validInput = false;
        while (!validInput) {
            System.out.print("Please enter [D]ebit card pr [P]rizes:  ");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.matches("D|P")) {
                validInput = true;
                reward = ("D".equals(input)? Reward.DEBIT : Reward.PRIZES);
            }
        }
        return reward;
    }

    private int promptForId() {
        int id = 0;

        boolean validInput = false;
        while (!validInput){
            System.out.printf("Please enter id of the winner [1-%s]: ", maxId); // dont hardcode 19
            String input = scanner.nextLine().trim();
            if (input.matches("\\d{1,2}")){ // verified that input matches a number with 1 or 2 digits
                id = Integer.parseInt(input);
                if (1 <= id && id <= maxId){ // Dont hardcode 19
                    validInput = true;
                }
            }
        }
        return id;
    }

    private void showBoard() {
        board.show();
    }

    private void welcome() {
        System.out.println();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("W E L C O M E   T O   T H E   D U C K   R A C E   A P P L I C A T I O N");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
    }
}