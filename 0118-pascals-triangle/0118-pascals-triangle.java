// public class Solution {
// public List<List<Integer>> generate(int numRows)
// {
// 	List<List<Integer>> allrows = new ArrayList<List<Integer>>();
// 	ArrayList<Integer> row = new ArrayList<Integer>();
// 	for(int i=0;i<numRows;i++)
// 	{
// 		row.add(0, 1);
// 		for(int j=1;j<row.size()-1;j++)
// 			row.set(j, row.get(j)+row.get(j+1));
// 		    allrows.add(new ArrayList<Integer>(row));
// 	}
// 	return allrows;
	
// }
// }




class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) {
            return triangle;
        }

        // Initialize the first row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i - 1);

            row.add(1); // First element is always 1

            for (int j = 1; j < i; j++) {
                int sum = prevRow.get(j - 1) + prevRow.get(j);
                row.add(sum);
            }

            row.add(1); // Last element is always 1
            triangle.add(row);
        }

        return triangle;
    }
}