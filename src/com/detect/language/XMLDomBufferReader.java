/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.detect.language;

/**
 *
 * @author Telosma
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLDomBufferReader {

    public XMLDomBufferReader() {
    }

    ;
public void DomParse(String input, String output) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setValidating(false);
        DocumentBuilder db = dbf.newDocumentBuilder();

// replace following  path with your input xml path  
        Document doc = db.parse(new FileInputStream(new File(input)));
// replace following  path with your output xml path
        // NodeList list =  doc.getElementsByTagName("textcontent");
        File OutputDOM = new File(output);
        FileOutputStream fostream = new FileOutputStream(OutputDOM);
        OutputStreamWriter oswriter = new OutputStreamWriter(fostream);
        BufferedWriter bwriter = new BufferedWriter(oswriter);

        // if file doesnt exists, then create it
        if (!OutputDOM.exists()) {
            OutputDOM.createNewFile();
        }

        visitRecursively(doc, bwriter);
        bwriter.close();
        oswriter.close();
        fostream.close();

        System.out.println("Done");
    }

    public void visitRecursively(Node node, BufferedWriter bw) throws IOException {

        // get all child nodes  
        NodeList list = node.getChildNodes();
        String nodeValue = new String();
        for (int i = 0; i < list.getLength(); i++) {
            // get child node              
            Node childNode = list.item(i);
            if (childNode.getNodeType() == Node.TEXT_NODE) {
               nodeValue = childNode.getNodeValue().toString();
                   
                //String nodeName = childNode.getFirstChild().getNodeValue();
                nodeValue = nodeValue.replaceAll("[^a-zA-Z0-9]", "").replaceAll("\\s", " ");
                if (!nodeValue.isEmpty()) {
                    //   System.out.println(nodeName);
                    bw.write(nodeValue);
                    bw.newLine();
                }  
                
                // System.out.println("Found Node: " + childNode.getNodeName()           
                //  + " - with value: " + childNode.getNodeValue()+" Node type:"+childNode.getNodeType()); 
                    
//                String nodeValue = childNode.getNodeValue().toString();
//                //String nodeName = childNode.getFirstChild().getNodeValue();
//                nodeValue = nodeValue.replace("\n", " ").replaceAll("\\s", " ");
//                if (!nodeValue.isEmpty()) {
//                    //   System.out.println(nodeName);
//                    bw.write(nodeValue);
//                    bw.newLine();
//                }
            }
            visitRecursively(childNode, bw);

        }

    }

}
