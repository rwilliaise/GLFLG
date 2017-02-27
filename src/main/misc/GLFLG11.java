package main.misc;

import java.util.ArrayList;
import java.util.List;

public class GLFLG11 {

	private static List<int[][]> vertexHolder = new ArrayList<int[][]>();
	
	public static void flgBindVertexArray(int index, int[][] array) {
		vertexHolder.add(new int[][]{});
		vertexHolder.set(index, array);
	}
	
	public static int[][] flgFindVertexArray(int index) {
		return vertexHolder.get(index);
	}
}
