package Programmers.lev2;

public class 카카오_프렌즈_컬러링북 {

	static int numberOfArea = 0;
	static int maxSizeOfOneArea = 0;
	static int temp_cnt = 0;
	static int[][] deltas = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m = 6;
		int n = 4;
		int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
		
		solution(m,n,picture);
	}

	public static void dfs(int x, int y, int[][] picture, boolean[][] visited) {
		if (visited[x][y])
			return;

		visited[x][y] = true;
		temp_cnt++;

		for (int i = 0; i < 4; i++) {
			int nx = x + deltas[i][0];
			int ny = y + deltas[i][1];

			if (nx < 0 || nx >= picture.length || ny < 0 || ny >= picture[0].length)
				continue;

			if (picture[x][y] == picture[nx][ny] && !visited[nx][ny]) {
				dfs(nx, ny, picture, visited);
			}
		}
	}

	public static int[] solution(int m, int n, int[][] picture) {
		numberOfArea = 0;
		maxSizeOfOneArea = 0;
		int[] answer = new int[2];

		boolean[][] check = new boolean[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (picture[i][j] != 0 && !check[i][j]) {
					numberOfArea++;
					dfs(i, j, picture, check);
				}
				if (temp_cnt > maxSizeOfOneArea)
					maxSizeOfOneArea = temp_cnt;
				temp_cnt = 0;
			}
		}

		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;
		return answer;
	}

}
