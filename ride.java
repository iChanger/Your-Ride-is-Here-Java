
/*
ID: ichangs1
LANG: JAVA
PROG: ride
*/
import java.io.*;
import java.util.*;

class ride {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("ride.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    String str1 = f.readLine();
    String str2 = f.readLine();
    
    if(totalNum(str1) % 47 == totalNum(str2) % 47){
        out.println("GO");
    }
    else{
        out.println("STAY");
    }

    //out.println(i1+i2);                           // output result
    out.close();                                  // close the output file
  }
  
  static int totalNum(String str){
      int modCase = 1;
      for( int i = 0; i < str.length(); i++){
          int totalNum = str.charAt(i) - 64;
          modCase *= totalNum;
          System.out.println(totalNum);
  }
  return modCase;
}
}
