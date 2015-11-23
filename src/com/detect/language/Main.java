/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.detect.language;

//import huanpc.learning.eng.Constant;
//import huanpc.learning.eng.LearningWord;
import static java.awt.SystemColor.text;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.text.html.HTML;
import jdk.nashorn.internal.codegen.CompilerConstants;
import org.xml.sax.SAXException;

/**
 *
 * @author Telosma
 */
public class Main {

    public static void main(String[] args) throws SQLException, IOException, Exception {
        
           XMLDomBufferReader a = new XMLDomBufferReader();
           a.DomParse("C:\\Users\\duylx\\Desktop\\test_SPAM_HTML\\1.txt", "C:\\Users\\duylx\\Desktop\\test_SPAM_HTML\\1-1.txt");
           //a.DomParse("./test_GEN.ems", "./test_GEN_out.ems");
//           ParseXML2CSV pr = new ParseXML2CSV();
//           pr.parseContent("./train_GEN.ems");
//        double tmp = 0;
//        double a = 0;
//        for (int i = 1 ; i < 29; i++){
//        try (BufferedReader br = new BufferedReader(new FileReader(i+".txt"))) {
//            StringBuilder sb = new StringBuilder();
//            String line = br.readLine();
//
//            while (line != null) {
//                sb.append(line);
//                sb.append(System.lineSeparator());
//                line = br.readLine();
//            }
//            String everything = sb.toString();
//            WordMatch wm = new WordMatch();
////            SplitWord splw = new SplitWord();
////            splw.display(everything);
//            if (wm.detectVN(everything)) {
//             //   System.out.println("Ngôn ngữ Tiếng Việt");
//             tmp ++;
//            } else {
//              //  System.out.println("Ngôn ngữ tiếng Anh");
//              
//            }
//           // System.out.println("\n" + everything);
//
//        }
//        }
//        System.out.println("So email doan dung "+tmp);

/*888888888888888888888888888888888*/

 // Kiểm tra ngôn ngữ của dữ liệu đầu vào 700eamil
        
//        WordMatch wm = new WordMatch();
//        File dir = new File(Constant.DATA_LEARN_NO_HTML_1[1]);
//		File[] subFile = dir.listFiles();
//		int size = subFile.length;
//		//double numSpam = 0;
//		double i = 0;
//                double j = 0;
//		for (File f : subFile) {
//			
//			String te = LearningWord.preprocessMail(f.getAbsolutePath());
//            if (wm.detectVN(te)) {
//      //         System.out.println("Ngôn ngữ Tiếng Việt");
//                j++;
//            }
//            else {
////               System.out.println("Ngôn ngữ tiếng Anh");
//            	i++;
//            }			
//		}
//		double a = i / size;
//		System.out.println(String.valueOf(a));


           }
       
    }

