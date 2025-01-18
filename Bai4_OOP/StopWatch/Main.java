public class Main {
    public static void main(String[] args) {
        // Tạo mảng ngẫu nhiên 100,000 phần tử
        int[] arr = ArrayGenerator.generateArray(100000);

        //Tạo đối tượng StopWatch và bắt đầu đo thời gian
        stopWatch stopWatch = new stopWatch();
        stopWatch.start();

        //Thực hiện thuật toán Selection Sort
        SelectionSort.selectionSort(arr);

        //Dừng đo thời gian
        stopWatch.stop();

        //In thời gian thực thi
        System.out.println("Thời gian thực thi của thuật toán Selection Sort: "
                + stopWatch.getElapsedTime() + " ms");
    }
}
