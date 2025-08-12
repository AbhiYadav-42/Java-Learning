/*  How arr[row].length; works in a For loop ???
 * In a two-dimensional array in Java, such as int[][] arr,
 *  each element of the outer array (arr[row]) is itself an array representing a row.
 *  The expression arr[row].length gives the number of columns in that specific row. 
 * This is especially useful because Java allows 2D arrays to have rows of different lengths (known as "jagged arrays").
 * 
 *  When you use arr[row].length inside a for loop, 
 * you are dynamically accessing the length of the current row,
 *  ensuring that your loop iterates over all columns in that row, regardless of how many columns it contains. 
 * This prevents errors like ARRAYINDEXOUTOFBOUNDSEXCEPTION and makes your code flexible for arrays where rows may not all have the same number of columns.
*/