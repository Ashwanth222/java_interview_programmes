package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
        public static List<List<Integer>> generate(int numberOfRows){
            List<List<Integer>> triangle = new ArrayList<>();
            if (numberOfRows == 0) {
                return triangle;
            }
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            triangle.add(firstRow);
            for (int i = 1; i < numberOfRows; i++) {
                List<Integer> preRow = triangle.get(i - 1);
                List<Integer> row = new ArrayList<>();
                row.add(1);
                for (int j = 1; j < i; j++) {
                    row.add(preRow.get(j - 1) + preRow.get(j));
                }
                row.add(1);
                triangle.add(row);
            }
            System.out.println(triangle);
            return triangle;
        }

    public static void main(String[] args) {
        generate(4);
    }
}
