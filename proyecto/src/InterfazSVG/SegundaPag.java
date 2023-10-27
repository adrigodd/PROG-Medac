package InterfazSVG;

import javax.swing.JButton;
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 
import javax.swing.SwingUtilities; 
import javax.xml.parsers.DocumentBuilder; 
import javax.xml.parsers.DocumentBuilderFactory;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout; 
import java.io.File; 
import org.w3c.dom.Document; 
import org.w3c.dom.Element; 
import org.w3c.dom.Node; 
import org.w3c.dom.NodeList; 

public class SegundaPag extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SegundaPag frame = new SegundaPag();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SegundaPag() {
		
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5)); 
			//Establece el diseño de contenido de la ventana.
			JPanel p_datos = new JPanel(); /* Crea un panel para organizar los
			componentes en la interfaz.*/
			GridLayout gl = new GridLayout(9, 1, 0, 5); /*Crea un diseño de cuadrícula
			para el panel, con 9 filas (se pueden poner mas si es necesario) y una
			columna.*/
			p_datos.setLayout(gl); // Aplica el diseño al panel.
			try {
				File archivoXML = new File("C:\\Users\\AlumnoT\\Documents\\GitHub\\PROG-Medac\\proyecto\\src\\InterfazSVG\\ejercicio.xml"); 
				DocumentBuilderFactory XML = DocumentBuilderFactory.newInstance(); 
				DocumentBuilder documentBuilder = XML.newDocumentBuilder(); 
				Document document = (Document) documentBuilder.parse(archivoXML); 
				( (org.w3c.dom.Document) document).getDocumentElement().normalize(); 
				NodeList listaPersonas =   document.getElementsByTagName("Empleados"); 
				for (int i = 0; i < listaPersonas.getLength(); i++) { 
					Node personaNode = (Node) listaPersonas.item(i); 
					if (personaNode.getNodeType() == Node.ELEMENT_NODE) { 
					Element personaElement = (Element) personaNode;
					NodeList ListaEmpleados= personaElement.getElementsByTagName("Empleado");
					for(int j=0;j<ListaEmpleados.getLength();i++) {
						Node Empleado = (Node)	ListaEmpleados.item(i);
						Element Persona=(Element)Empleado;
						String nombre=Persona.getElementsByTagName("Nombre").item(0).getTextContent();
						String apellido=Persona.getElementsByTagName("Apellido1").item(0).getTextContent();
						String apellido2=Persona.getElementsByTagName("Apellido2").item(0).getTextContent();
						JLabel labelNombre = new JLabel(nombre); 
						p_datos.add(labelNombre);
						JLabel labelApellidos = new JLabel(apellido); 
						p_datos.add(labelApellidos); // Agrega la etiqueta al panel.
						JLabel labelApellido2 = new JLabel(apellido2);
						p_datos.add(labelApellido2);

					}
					
					}
				}
					

	}catch(Exception e){
		e.printStackTrace();
	}
			getContentPane().add(p_datos);
	}

}
