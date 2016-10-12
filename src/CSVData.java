
//A class to read/write numerical CSV files and allow easy access of data.
//d
public class CSVData {
	private double[][] data;
	private String[] columnNames;
	
	public static CSVData readCSVFile (String filename, int numLinesToIgnore, String[] columnNames){
		return null;
	}
	/***
	 * Returns a new CSVData object for a file ignoring lines at the top.
	 * It uses the first row as the column names. All other data is stored as doubles.
	 * @param filename
	 * @param numLinesToIgnore
	 * @return a CSVData object for that file.
	 */
	public CSVData readCSVFile (String filename, int numLinesToIgnore){
		return null;
	}
	public double[] getRow(int rowIndex){
		return null;
	}
	public double [] getColumn(int colIndex){
		return null;
	}
	public double[][] getRows(int []rowsRequested){
		return null;
	}
	public double [][] getColumns(int []columnsRequested){
		return null;
	}
	public void setVal(int row, int col, double value){
		return;
	}
	public void setCol(int colIndex, double[]newCol){
		
	}
	public void setRow(int rowIndex, double[]newRow){
		
	}
	public String[] getColNames(){
		return null;
	}
	
	
	
}
