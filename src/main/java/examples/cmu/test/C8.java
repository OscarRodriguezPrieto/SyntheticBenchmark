package examples.cmu.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class C8 {

	public void processFile(String inPath, String outPath) throws IOException {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader(inPath));
			bw = new BufferedWriter(new FileWriter(outPath));
			// Process the input and produce the output
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (bw != null) {
					bw.close();
				}
			} catch (IOException x) {
				// Handle error
			}
		}
	}

	public void CprocessFile(String inPath, String outPath) throws IOException {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader(inPath));
			bw = new BufferedWriter(new FileWriter(outPath));
			// Process the input and produce the output
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException x) {
					// Handle error
				} finally {
					if (bw != null) {
						try {
							bw.close();
						} catch (IOException x) {
							// Handle error
						}
					}
				}
			}
		}
	}
}
