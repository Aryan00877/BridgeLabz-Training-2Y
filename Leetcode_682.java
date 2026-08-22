class Solution {
    public int calPoints(String[] operations) {
        int[] stack = new int[1000];
        int top = 0;
        int sum = 0;

        for (String op : operations) {
            if (op.equals("C")) {
                sum -= stack[--top];
            } else if (op.equals("D")) {
                stack[top] = stack[top - 1] * 2;
                sum += stack[top++];
            } else if (op.equals("+")) {
                stack[top] = stack[top - 1] + stack[top - 2];
                sum += stack[top++];
            } else {
                stack[top++] = Integer.parseInt(op);
                sum += stack[top - 1];
            }
        }

        return sum;
    }
}