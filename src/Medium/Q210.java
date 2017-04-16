package Medium;

import java.util.*;

/**
 * Created by Srikiran Sistla on 4/9/2017.
 */
public class Q210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[][] matrix = new int[numCourses][numCourses];
        int[] indegree = new int[numCourses];
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i<prerequisites.length; i++){
            int course = prerequisites[i][0];
            int prereq = prerequisites[i][1];
            if (matrix[prereq][course]==0) indegree[course]++;
            matrix[prereq][course] = 1;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i]==0) q.offer(i);
        }
        while (!q.isEmpty()){
            int course = q.poll();
            res.add(course);
            for (int i = 0; i < numCourses; i++) {
                if (matrix[course][i]==1){
                    if (--indegree[i] == 0) q.offer(i);
                }
            }
        }
        if (res.size() == numCourses){
            int[] ret = new int[res.size()];
            Iterator<Integer> iterator = res.iterator();
            for (int i=0; iterator.hasNext(); i++)
            {
                ret[i] = iterator.next();
            }
            return ret;
        }

        return new int[] {};
    }
}
