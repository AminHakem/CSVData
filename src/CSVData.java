
//A class to read/write numerical CSV files and allow easy access of data.
//d
public class CSVData {
	private double[][] data;
	private String[] columnNames;

	public static CSVData readCSVFile(String filename, int numLinesToIgnore, String[] columnNames) {
		return null;
	}

	/***
	 * Returns a new CSVData object for a file ignoring lines at the top. It
	 * uses the first row as the column names. All other data is stored as
	 * doubles.
	 * 
	 * @param filename
	 * @param numLinesToIgnore
	 * @return a CSVData object for that file.
	 */
	public CSVData readCSVFile(String filename, int numLinesToIgnore) {

		// CSVData out = new CSVData(filename,numlinesToIgnore,)

		return null;
	}

	/***
	 * returns requested row
	 * 
	 * @param rowIndex
	 * @return requested row
	 */
	public double[] getRow(int rowIndex) {
		return this.data[rowIndex];
	}

	/***
	 * returns a requested column
	 * 
	 * @param colIndex
	 * @return requested column
	 */
	public double[] getColumn(int colIndex) {
		double[] out = new double[this.data.length];
		for (int i = 0; i < out.length; i++) {
			out[i] = this.data[i][colIndex];
		}
		return out;
	}

	/***
	 * returns multiple rows from an int array of their indexes
	 * 
	 * @param rowsRequested
	 * @return rows requested by the user
	 */
	public double[][] getRows(int[] rowsRequested) {
		double[][] out = new double[rowsRequested.length][this.data.length];
		for (int i = 0; i < rowsRequested.length; i++) {
			out[i] = this.data[i];
		}
		return out;
	}

	/***
	 * returns multiple columns from an int array of their indexes
	 * 
	 * @param columnsRequested
	 * @return
	 */
	public double[][] getColumns(int[] colsRequested) {
		double[][] out = new double[colsRequested.length][this.data.length];
		for (int i = 0; i < colsRequested.length; i++) {
			for (int j = 0; i < this.data.length; i++) {
				out[i][j] = this.data[i][j];
			}
		}
		return out;
	}

	/***
	 * sets the value of a data point
	 * 
	 * @param row
	 * @param col
	 * @param value
	 */
	public void setVal(int row, int col, double value) {
		this.data[row][col] = value;
	}

	/***
	 * sets an entire column
	 * 
	 * @param colIndex
	 * @param newCol
	 */
	public void setCol(int colIndex, double[] newCol) {
		for (int i = 0; i < this.data.length; i++) {
			this.data[colIndex][i] = newCol[i];
		}
	}

	/***
	 * sets an entire row
	 * 
	 * @param rowIndex
	 * @param newRow
	 */
	public void setRow(int rowIndex, double[] newRow) {
		this.data[rowIndex] = newRow;
	}

	/***
	 * returns the names of all the columns
	 * 
	 * @return
	 */
	public String[] getColNames() {
		String[] out = new String[this.data.length];
		for (int i = 0; i < this.data.length; i++) {
			out[i] = this.data[1][i];
		}
		return out;
	}

	/***
	 * saves the file
	 * 
	 * @param filename
	 */
	public void saveToFile(String filename) {

	}

}
