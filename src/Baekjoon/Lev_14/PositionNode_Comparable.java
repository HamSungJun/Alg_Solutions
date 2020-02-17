package Baekjoon.Lev_14;

public class PositionNode_Comparable implements Comparable<PositionNode_Comparable> {

    private int xPos;
    private int yPos;

    public PositionNode_Comparable(int xPos, int yPos) {

        this.xPos = xPos;
        this.yPos = yPos;

    }

    public int getX() {
        return this.xPos;
    }

    public int getY() {
        return this.yPos;
    }

    @Override
    public int compareTo(PositionNode_Comparable pc) {
        if (this.getX() - pc.getX() != 0) {
            return this.getX() - pc.getX();
        } else {
            return this.getY() - pc.getY();
        }
    }

}
