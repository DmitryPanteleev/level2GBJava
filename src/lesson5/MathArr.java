package lesson5;

public class MathArr extends Thread {
    public float[] arr2;

    public MathArr(float[] arr, int starts, int end) {
        mathArray(arr, starts, end);
    }

    private void mathArray(float[] arr, int starts, int end) {
        arr2 = new float[end - starts];
        System.arraycopy(arr, starts, arr2, 0, end - starts);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5)
                    * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.arraycopy(arr2, 0, arr, starts, arr2.length);

    }

}
