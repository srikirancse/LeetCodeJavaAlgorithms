package Medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Srikiran Sistla on 4/9/2017.
 */
public class Q207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] matrix = new int[numCourses][numCourses];
        int[] indegree = new int[numCourses];
        for (int i = 0; i<prerequisites.length; i++){
            int course = prerequisites[i][0];
            int prereq = prerequisites[i][1];
            if (matrix[prereq][course]==0) indegree[course]++;
            matrix[prereq][course] = 1;
        }
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i]==0) q.offer(i);
        }
        while (!q.isEmpty()){
            int course = q.poll();
            count++;
            for (int i = 0; i < numCourses; i++) {
                if (matrix[course][i]==1){
                    System.out.println(i);
                    if (--indegree[i] == 0) q.offer(i);
                }
            }
        }
        return count == numCourses;
    }

    public static void main(String[] args) {
        Q207 q207 = new Q207();
        System.out.println(q207.canFinish(3, new int[][] {{2,0}, {2,1}}));
    }
}
