/**
*O(M,N)M,N�ֱ�Ϊ����������
*/
class Solution {
        public int numIslands(char[][] grid) {
            int landNum = 0;// �������
            for (int i = 0; i < grid.length; i++) {// ��������
                for (int j = 0; j < grid[0].length; j++) {// ��������
                    if (grid[i][j] == '1') {
                        landNum++;
                        Queue<String> queue = new LinkedList<String>();
                        queue.offer(i + "," + j); //�������ַ��������
                        grid[i][j] = '0';
                        while (!queue.isEmpty()) {
                            String peek = queue.peek();//��ȡ���е�һ��
                            queue.poll();//������
                            int row = Integer.parseInt(peek.split(",")[0]);// �����ǰ���е�һ�������ڵ���
                            int col = Integer.parseInt(peek.split(",")[1]);// �����ǰ���е�һ�������ڵ���

                            // �����ж���
                            if (row > 0 && grid[row - 1][col] == '1') {
                                queue.offer((row - 1) + "," + col);
                                grid[row - 1][col] = '0';
                            }
                            // �ж��·�
                            if (row + 1 < grid.length && grid[row + 1][col] == '1') {
                                queue.offer((row + 1) + "," + col);
                                grid[row + 1][col] = '0';
                            }
                            // �ж�����
                            if (col > 0 && grid[row][col - 1] == '1') {
                                queue.offer(row + "," + (col - 1));
                                grid[row][col - 1] = '0';
                            }
                            // �ж�����
                            if (col + 1 < grid[0].length && grid[row][col + 1] == '1') {
                                queue.offer(row + "," + (col + 1));
                                grid[row][col + 1] = '0';
                            }
                        }
                    }

                }
            }
            return landNum;
        }
}