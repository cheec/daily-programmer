package main.util;

public class ScoreUtil {
    public static final char STRIKE = 'X';
    public static final int STRIKE_PTS = 10;
    public static final char GUTTER = '-';
    public static final int GUTTER_PTS = 0;
    public static final char SPARE = '/';
    
    public static int toInt(char c) {
        return (int) c - (int) '0';
    }
}
