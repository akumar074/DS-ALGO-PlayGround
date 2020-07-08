/*There is a robot starting at position (0, 0), the origin, on a 2D plane.
Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
The move sequence is represented by a string, and the character moves[i] represents its ith move. 
Valid moves are R (right), L (left), U (up), and D (down). 
If the robot returns to the origin after it finishes all of its moves, return true. 
Otherwise, return false.*/

class JudgeCircle {
    public boolean judgeCircle(String moves) {
        // short d[] = new short[86];
        // for(char a:moves.toCharArray()){

        // ++d[a];
        // }
        // return d['L']==d['R']&&d['U']==d['D'];

        int x = 0, y = 0;
        char[] arr = moves.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
            case 'U':
                y += 1;
                break;

            case 'D':
                y -= 1;
                break;

            case 'L':
                x -= 1;
                break;

            case 'R':
                x += 1;
                break;

            default:
                break;
            }
        }
        if (x == 0 && y == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new JudgeCircle().judgeCircle("UDLR"));
    }
}