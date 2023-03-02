package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        // Bước 2: Nhập X là số cần chèn
        System.out.print("Enter the element to insert: ");
        int x = sc.nextInt();

        // Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
        System.out.print("Enter the index to insert the element: ");
        int index = sc.nextInt();

        // Bước 4: Nếu index <= -1 và index >= array.length – 1 thì hiển thị không chèn được phần tử vào mảng.
        if (index < 0 || index > n) {
            System.out.println("Cannot insert the element into the array.");
            return;
        }

        // Bước 5: Thực hiện chèn phần tử X ở vị trí index vào mảng
        int[] newArr = new int[n + 1]; // Khởi tạo mảng mới có kích thước n + 1 để chứa phần tử X
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = x;
        for (int i = index + 1; i < n + 1; i++) {
            newArr[i] = arr[i - 1];
        }
        n++; // Tăng số phần tử của mảng đi 1
        arr = newArr; // Gán mảng cũ bằng mảng mới để lưu trữ phần tử đã được chèn

        // Bước 6: In ra mảng
        System.out.print("The updated array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
