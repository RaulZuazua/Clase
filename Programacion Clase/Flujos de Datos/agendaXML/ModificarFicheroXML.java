package agendaXML;

/*
 * Modificar la estructura del primer elemento Staff
Modificar el atributo id = 2
Modificar el salario a 200000
A�adir un nuevo elemento "Edad" hijo de Staff
Borrar el elemento "nombre" hijo de Staff

A�adir un nuevo elemento staff al final del fichero
con el elemento nombre y edad y el atributo id
*/
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
//import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

import java.io.File;
import java.io.IOException;

public class ModificarFicheroXML {

	public static void main(String argv[]) {
		File ficherosalidaXML;
		File ficheroXML;

		try {

			// Parseamos el fichero original en un nuevo objeto en memoria
			ficheroXML = new File("staff.xml");
			DocumentBuilderFactory dbFactoria = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactoria.newDocumentBuilder();
			Document doc = dBuilder.parse(ficheroXML);

			// Obtener el elemento staff(0) => primer staff
			Node staff = doc.getElementsByTagName("staff").item(0);

			// Modificar el atributo "id"
			NamedNodeMap attr = staff.getAttributes();
			Node nodeAttr = attr.getNamedItem("id");
			nodeAttr.setTextContent("2");

			// Añadir un nuevo elemento a staff
			Element edad = doc.createElement("edad");
			edad.appendChild(doc.createTextNode("28"));
			staff.appendChild(edad);

			// recorrer los elementos hijos de staff
			NodeList listadenodos = staff.getChildNodes();

			for (int i = 0; i < listadenodos.getLength(); i++) {

				Node node = listadenodos.item(i);

				// si el elemento es el salario se modifica su importe
				if ("salario".equals(node.getNodeName())) {
					node.setTextContent("2000000");
				}

				// si el elemento es "nombre" eliminamos el elemento
				if ("nombre".equals(node.getNodeName())) {
					staff.removeChild(node);
							
				}

			}

			// Añadir un nuevo staff
			Element nuevostaff = doc.createElement("staff");
			nuevostaff.setAttribute("id", "100");
			staff.getParentNode().appendChild(nuevostaff);
			// Añadir el elmento nombre al staff
			Element nuevonombre = doc.createElement("nombre");
			nuevonombre.appendChild(doc.createTextNode("Pepe"));
			nuevostaff.appendChild(nuevonombre);
			// Añadir el elemento apellido al staff
			Element nuevoapellido = doc.createElement("apellido");
			nuevoapellido.appendChild(doc.createTextNode("Rodriguez"));
			nuevostaff.appendChild(nuevoapellido);
			// Añadir el elemento edad al staff
			Element nuevaedad = doc.createElement("edad");
			nuevaedad.appendChild(doc.createTextNode("44"));
			nuevostaff.appendChild(nuevaedad);
			// Añadir el elemento correo al staff
			Element nuevocorreo = doc.createElement("correo");
			nuevocorreo.appendChild(doc.createTextNode("peperodriguez@gmail.com"));
			nuevostaff.appendChild(nuevocorreo);
			// Añadir el elemento salario al staff
			Element nuevosalario = doc.createElement("salario");
			nuevosalario.appendChild(doc.createTextNode("10500"));
			nuevostaff.appendChild(nuevosalario);

			// Borrar el nodo que se encuentra en segundo lugar
			Node elementoaborrar = doc.getElementsByTagName("staff").item(1);
			elementoaborrar.getParentNode().removeChild(elementoaborrar);

			// escribimos el documento en un archivo
			ficherosalidaXML = new File("staffmodificado.xml");
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();

			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(ficherosalidaXML);
			transformer.transform(source, result);

			System.out.println("Fin de la modificacion");

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (SAXException saxe) {
			saxe.printStackTrace();
		}
	}
}