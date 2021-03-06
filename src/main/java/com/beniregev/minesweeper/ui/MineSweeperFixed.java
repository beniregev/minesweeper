package com.beniregev.minesweeper.ui;

import javax.swing.JFrame;
import com.beniregev.minesweeper.model.MineField;
import com.beniregev.minesweeper.model.VisibleField;

/**
    <div>
    <p>
        <h1>MineSweeperFixed -- main class for a GUI minesweeper game.</h1>
        <div>
            Uses a hard-coded mine field for testing purposes.  For more details about this
            game and how to play it, see the assignment description.
        </div>
    </p>
    <p>
        <div>
            To run it from the command line: <br />
            java MineSweeperFixed
        </div>
    </p>
    </div>
 @author binyamin.regev
 */
public class MineSweeperFixed {
    // You can  modify this program so it uses a different one of the hardcoded mines below,
    // or add a new one, for testing purposes:

    private static boolean[][] smallMineField =
            {{false, false, false, false},
                    {true, false, false, false},
                    {false, true, true, false},
                    {false, true, false, true}};

    private static boolean[][] emptyMineField =
            {{false, false, false, false},
                    {false, false, false, false},
                    {false, false, false, false},
                    {false, false, false, false}};

    private static boolean[][] almostEmptyMineField =
            {{false, false, false, false},
                    {false, false, false, false},
                    {false, false, false, false},
                    {false, true, false, false}};

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 425;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Minesweeper");
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        GameBoardPanel gameBoard = new GameBoardPanel(new VisibleField(new MineField(smallMineField)));
        frame.add(gameBoard);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
