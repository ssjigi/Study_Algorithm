import java.util.Scanner;

public class Main {
    private static int N;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        N = in.nextInt();
        Cube cubes[] = new Cube[N];

        for (int i = 0; i < N; i++) {
            cubes[i].bottom = in.nextInt();
            cubes[i].height = in.nextInt();
            cubes[i].gram = in.nextInt();
        }

        System.out.println(solution(cubes));
        return;
    }

    public static int solution(Cube cubes[]) {
        int result = 0;

        for (int i = 1; i <= cubes.length; i++) {
            int height = 0;
            height = calculateHeight(i, cubes);

            if (result < height) {
                result = height;
            }
        }
        return result;
    }

    private static int calculateHeight(int targetIdx, Cube[] cubes) {
        for (int i = 0; i < N; i++) {
            if (targetIdx == i) {
                continue;
            }

            if (cubes[targetIdx].bottom > cubes[i].bottom
                    && cubes[targetIdx].gram > cubes[i].gram) {
                if (cubes[i].dy != 0) {

                }
            } else {
                continue;
            }
        }
    }

    private class Cube {
        int bottom;
        int gram;
        int height;
        int dy; // 이 cube 를 포함 해서 쌓은 가장 높은 height

        public Cube(int bottom, int height, int gram) {
            this.bottom = bottom;
            this.height = height;
            this.gram = gram;
        }

    }
}
