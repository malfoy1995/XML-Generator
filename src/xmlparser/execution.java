package xmlparser;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class execution extends getEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder;
         try{
        	 dBuilder = dbFactory.newDocumentBuilder();
        	 Document doc = dBuilder.newDocument();
        	 Element rootElement = doc.createElementNS("sample.xml", "Employee");
        	 doc.appendChild(rootElement);
        	 rootElement.appendChild(getEmployee(doc,"1","23","Abhishek","PAT","Male"));
        	 TransformerFactory transformerFactory = TransformerFactory.newInstance();
        	 Transformer transformer = transformerFactory.newTransformer();
        	 transformer.setOutputProperty(OutputKeys.VERSION, "1");
        	 transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        	 DOMSource source = new DOMSource(doc);
        	 StreamResult console = new StreamResult(System.out);
        	 StreamResult file = new StreamResult(new File("C:\\Users\\758202\\Desktop\\samplexml.xml"));
        	 transformer.transform(source, console);
        	 transformer.transform(source, file);
         }
         catch(Exception e){
        	 e.getStackTrace();
         }
	}

}
