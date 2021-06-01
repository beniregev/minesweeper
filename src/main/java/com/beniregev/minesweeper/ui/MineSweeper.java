package com.beniregev.minesweeper.ui;

import javax.swing.JFrame;

/**
 *  <div>
 *      <p>
 *          <div><h1>MineSweeper -- main class for a GUI minesweeper game</h1></div>
 *          <div>
 *              Games use a 9 x 9 board with 10 randomly placed mines. For more details about this
 *              game and how to play it, see the assignment description.
 *          </div>
 *      </p>
 *      <p>
 *          To run it from the command line: <br />
 *          java MineSweeper
 *      </p>
 *      <p>
 *          <h2>******* DO NOT CHANGE THIS FILE *******</h2>
 *      </p>
 *  </div>
 * @author binyamin.regev
 */
public class MineSweeper {
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 425;

    private static int SIDE_LENGTH = 9;
    private static int NUM_MINES = 10;


    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setTitle("Minesweeper");

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        GameBoardPanel gameBoard = new GameBoardPanel(SIDE_LENGTH, SIDE_LENGTH, NUM_MINES);

        frame.add(gameBoard);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }
}
