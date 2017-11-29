package com.company;

/**
 * Created by Veronica Lang on 11/29/2017.
 * im confused
 * char at?? for the ascii
 */
public class cat {
    public static int start;
    public static int end;
    public static String stringanswr;
    public static String cat (int a, int b){
    start = a; //of ascii code
    end = b;
    StringBuffer sb = new StringBuffer();
    int i = 0;
    for (int j = a; j<= b; j++){
        i++;
        sb.append(((char)a + i)); //add the number of counts
        // to the starting value?? to get the characters???
    }
    return stringanswr; //stringanswr is the concatenation of all the characters represented
    }
}
