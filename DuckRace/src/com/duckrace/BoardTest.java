package com.duckrace;
import static com.duckrace.Reward.*;

class BoardTest {
    public static void main(String[] args) {
        Board b = new Board();
       // b.dumpStudentIdMap();
        b.show();
        b.updateBoard(4, DEBIT);
        b.updateBoard(4, DEBIT);
        b.updateBoard(14, DEBIT);
        b.updateBoard(14, PRIZES);
        b.updateBoard(1, PRIZES);
        b.updateBoard(8, PRIZES);
        b.updateBoard(9, DEBIT);
        b.updateBoard(8, PRIZES);
        b.updateBoard(3, DEBIT);
        b.show();
    }
}