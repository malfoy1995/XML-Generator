package xmlparser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;


public class getEmployeeElements {
	
	public static Node getEmployeeElements(Document doc, Element element, String name, String value)
	{
		Element node =  doc.createElement(name);
		node.appendChild(doc.createTextNode(value));
		return node;
	}

}
