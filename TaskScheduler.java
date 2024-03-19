
// LeetCode: https://leetcode.com/problems/task-scheduler/


import java.util.Arrays;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] taskCount = new int[26];
        for (char task : tasks) {
            taskCount[task - 'A']++;
        }

        Arrays.sort(taskCount);

        int maxCount = taskCount[25] - 1;
        int idleSlots = maxCount * n;

        for (int i = 24; i >= 0 && taskCount[i] > 0; i--) {
            idleSlots -= Math.min(taskCount[i], maxCount);
        }

        return Math.max(tasks.length, tasks.length + idleSlots);
    }
}
