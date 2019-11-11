package xmlparser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;


public class getEmployee extends getEmployeeElements {
     
	public static Node getEmployee(Document doc, String id, String age, String name, String role, String gender)
	{
		Element employee = doc.createElement("Element");
		employee.setAttribute("id", id);
		employee.appendChild(getEmployeeElements(doc,employee,"name",name));
		employee.appendChild(getEmployeeElements(doc,employee,"age",age));
		employee.appendChild(getEmployeeElements(doc,employee,"role",role));
		employee.appendChild(getEmployeeElements(doc,employee,"gender",gender));
		return employee;
	}
	
}
