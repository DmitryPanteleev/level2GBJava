package lesson5;

public class Lesson5Main {

    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];

    public static void main(String[] args) {
        initialArr(arr);
        mathMetod(arr);
        initialArr(arr);
        runThread(arr, 400);
//        System.out.println(checkArray(arr));
    }

    private static boolean checkArray(float[] arr) {
        int i = 0;
        for (float f :
                arr) {
            if (f == 0.0) i++;
        }
//        System.out.println(i);
        if (i == 0) {
            return true;
        } else {
            return false;
        }
    }


    private static void runThread(float[] arr, int thread) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < thread; i++) {
            int in = i * (arr.length / thread);
            int out = ((i + 1) * (arr.length / thread));
            MathArr mathArr;
            Thread t1 = new Thread(mathArr = new MathArr(arr, in, out));
            t1.start();
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

/*        MathArr mathArr1;
        MathArr mathArr2;
        MathArr mathArr3;
        MathArr mathArr4;
        Thread t1 = new Thread(mathArr1 = new MathArr(arr, 0, arr.length / 4));
        Thread t2 = new Thread(mathArr2 = new MathArr(arr, arr.length / 4, arr.length / 2));
        Thread t3 = new Thread(mathArr3 = new MathArr(arr, arr.length / 2, arr.length - arr.length / 4));
        Thread t4 = new Thread(mathArr4 = new MathArr(arr, arr.length - arr.length / 4, arr.length));
        long finish = System.currentTimeMillis();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
//        System.arraycopy(mathArr1.arr2, 0, arr, 0, mathArr1.arr2.length);
//        System.arraycopy(mathArr2.arr2, 0, arr, mathArr1.arr2.length, mathArr2.arr2.length);
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */
        long finish = System.currentTimeMillis();

        System.out.println("Время выполнения метода в " + thread + " потоков:" + (finish - start) + " миллисекунды");


    }

    private static void mathMetod(float[] arr) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5)
                    * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long finish = System.currentTimeMillis();
        System.out.println("Время выполнения метода в один поток : " + (finish - start) + " миллисекунды");
    }


    private static void initialArr(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }

    }

}
