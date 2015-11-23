package main;

import abc.MachineLearningVietNamese;
import huanpc.learning.eng.Constant;
import huanpc.learning.eng.LearningWord;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

import nbAlgorithm.NBEngMail;
import nbAlgorithm.NBVieMail;

public class Main {
	// Nếu dùng bộ dữ liệu test mà mail có chứa header thì cần bật cờ này
	public static  boolean NEED_REMOVE_HEADER = false;
	// Chỉ định bộ dữ liệu test cần dùng
	public static String data_test[]=Constant.DATA_TEST_VI;
	// Chỉ định bộ dữ liệu học cần dùng
	public static String data_learn[]=Constant.DATA_LEARN_NO_HTML_2;
	// Chỉ định bảng dữ liệu trong database sẽ dùng
	public static String TABLE = Constant.WORD_TABLE_VI;
//	public static  String f = String.valueOf(10);
	// Điều kiện lọc tập học
//	public static final String condition = " spam_mail>"+f+" and ham_mail>"+f+" and spam_mail <> ham_mail";
//	public static  String condition = " (ham_frequent > "+f+" and spam_frequent < "+f+" ) or (ham_frequent <"+f+" and spam_frequent>"+f+")";
//	public static String condition = " spam_frequent>"+f+" or ham_frequent>"+f+" and spam_frequent <> ham_frequent";
	
	// Chạy chương trình
	public static void main(String[] args){		
//		 Chạy quá trình học bằng hàm này
//		LearningWord learn = new LearningWord(false,Constant.WORD_TABLE_5,Constant.DATA_LEARN_HTML_5);
//		learn.learningEngMail();
		
		// Chạy quá trình test bằng hàm này
                NBVieMail nb = new NBVieMail(TABLE, "1", false);
                nb.mailClassifyTest(data_test[0],data_test[1]);
                
//                nb.mailClassify(data_test[1]+"/0847.2000-03-29.kaminski.ham.txt");
              
//               nb.mailClassify(data_test[0]+"/3279.2005-06-30.SA_and_HP.spam.txt");
//               nb.mailClassify(data_test[0]+"/3304.2005-06-30.SA_and_HP.spam.txt");
/*

Test email tieensg Việt
*/
//		NBVieMail nb = new NBVieMail(TABLE,"1",false);
//nb.mailClassifyTest(data_test[0], data_test[1]);	
//            nb.mailClassify(Constant.DATA_TEST_NO_HTML_2[0]+"/3268.2005-06-30.SA_and_HP.spam.txt");
            

                
	}
}

