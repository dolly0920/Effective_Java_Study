package com.example.sypark9646.item09;

import static org.apache.tomcat.util.http.fileupload.IOUtils.copy;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TryCatchFinallyTest {

		private static String root =
				"/Users/soyeon/Documents/GitHub/Effective_Java_Study/sypark9646/src/main/java/com/example/sypark9646/item09";
		private static String inputFileName = root + "/testin.txt";
		private static String outputFileName = root + "/testout_try_catch_finally.txt";

		public static void main(String[] args) throws IOException {

				try {
						final InputStream in = new FileInputStream(inputFileName);
						try {
								final OutputStream out = new FileOutputStream(outputFileName);
								try {
										copy(in, out);
										out.flush();
								} finally {
										out.close();
								}
						} finally {
								in.close();
						}
				} catch (IOException exc) {
						throw new IOException(exc);
				}
		}
}
