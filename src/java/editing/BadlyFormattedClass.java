/*	Alt + Shift + Arrow Up/Down*/
package editing; import java.io.*;public class BadlyFormattedClass {            public static void copyFileWithBuffer(String sourceFileName , String destFileName ) throws IOException{InputStream inputStream=new FileInputStream( sourceFileName )        ;try{ OutputStream
		outputStream= new FileOutputStream(destFileName
);try {byte [] buffer = new byte[64* 1024]          ;int bytesRead =inputStream  . read( buffer)
		;/*Ctrl + Shift + Arrow Up/Down*/while(bytesRead > 0){outputStream.write(buffer,0,bytesRead )
					;{outputStream.write(buffer,0,bytesRead ) ;}}}finally{outputStream.close();}}finally {         inputStream.close();}}}
				