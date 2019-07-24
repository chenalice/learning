public class Exercise40 {

    //40.1
    private static void printWhiteSpaces(int size) {
        int i = 0;
        while (i < size) {
            System.out.print(" ");
            i = i+1;
        }
    }

    //40.2
    public static void printTriangle(int size) {
        int i = 1;
        int space = size;
        while (i <= size) {
            printWhiteSpaces(space);
            Exercise39.printStars(i);
            System.out.println();
            i = i+1;
            space = space-1;
        }

    }

    //40.3
    // looks like an xmas tree, but not sure to keep making it loop so it repeats 10x rather than the last line being 10 stars
    public static void printXmasTree(int size) {
        int i = 1;
        int space = size;
        while (i <= size) {
            printWhiteSpaces(space);
            Exercise39.printStars(i);
            System.out.println();
            i = i+2; //makes it centered
            space = space-1; //spaces it to the center
            }
        //stand of tree
        int s = 0;
        while (s < 2){
            printWhiteSpaces(size-1);
            Exercise39.printStars(3);
            s = s+1;
            System.out.println();
        }

    }


    public static void main(String[] args) {
        //printWhiteSpaces(5);
        printTriangle(4);
        //printXmasTree(10);
    }


}





