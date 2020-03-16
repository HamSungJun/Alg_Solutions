package Baekjoon.Lev_28;

public class CNode extends Node {

    public int moveCount;

    public CNode(int _row, int _col, int _moveCount){
        super(_row, _col);
        this.moveCount = _moveCount;
    }
}
