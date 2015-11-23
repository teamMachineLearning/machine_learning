/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.detect.language;

import com.sun.org.apache.xalan.internal.lib.ExsltStrings;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.sound.midi.Soundbank;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author Telosma
 */
public class SplitWord {

    public String[] parseToArray(String myText){
       
        StringTokenizer st = new StringTokenizer( myText.replace(":", " ").replaceAll("./,:"," ")," ");
        String[] resultString = new String[st.countTokens()];
        int i = 0;
        while(i<15 &&st.hasMoreTokens()){
            resultString[i] = st.nextToken();
            i++;
        }

        return resultString;
    }
    public void display(String text){
        String[] resultArray =  parseToArray(text);
        System.out.println(Arrays.toString(resultArray));
        
    }
//    public static void main(String[] args){
//        LanguegeIdentify l = new LanguegeIdentify();
//        String[] result =  l.parseToArray(text);
//        System.out.println(Arrays.toString(result));
//    }
//    
    
    
    
    
}
