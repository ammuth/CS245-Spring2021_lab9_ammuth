import java.util.ArrayList;
import java.util.List;

public class Graph {
    public static void allPathsSourceTarget(int[][] graph, int node, List<Integer> currentList, List<List<Integer>> result) {
        currentList.add(node);
        if (node == graph.length - 1) {
            result.add(new ArrayList<>(currentList));
        } else {
            for (int i = 0; i < graph[node].length; i++) {
                allPathsSourceTarget(graph, graph[node][i], currentList, result);
            }
        }
        currentList.remove(currentList.size() - 1);
    }

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        if (graph.length == 0) {
            return new ArrayList<>();
        }
        List<Integer> intList = new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>();
        allPathsSourceTarget(graph, 0, intList, resultList);
        System.out.println(resultList);
        return resultList;
    }

    public static void main(String[] args) {
        int arr1[][] = {{1,2},{3},{3},{}};
        List<List<Integer>> n_of_arr1 = allPathsSourceTarget(arr1);

        int arr2[][] = {{1},{}};
        List<List<Integer>> n_of_arr2 = allPathsSourceTarget(arr2);

        int arr3[][] = {{4,3,1},{3,2,4},{3},{4},{}};
        List<List<Integer>> n_of_arr3 = allPathsSourceTarget(arr3);


        System.out.println("The output of arr 1 is: " +  n_of_arr1);
        System.out.println("The output of arr 2 is: "+ n_of_arr2);
        System.out.println("The output of arr 3 is: "+ n_of_arr3);





    }

}

