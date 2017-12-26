// This file contains material supporting section 3.7 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

package client;

import ocsf.client.*;

import java.io.*;
import java.util.ArrayList;

import clientServerCommon.*;
import gui.EditPuductInformation;
import javafx.application.Platform;

/**
 * This class overrides some of the methods defined in the abstract superclass
 * in order to give more functionality to the client.
 *
 * @author Dr Timothy C. Lethbridge
 * @author Dr Robert Lagani&egrave;
 * @author Fran&ccedil;ois B&eacute;langer
 * @version July 2000
 */
public class ChatClient extends AbstractClient {
	// Instance variables **********************************************

	/**
	 * The interface type variable. It allows the implementation of the display
	 * method in the client.
	 */
	ChatIF clientUI;

	// Constructors ****************************************************

	/**
	 * Constructs an instance of the chat client.
	 *
	 * @param host
	 *            The server to connect to.
	 * @param port
	 *            The port number to connect on.
	 * @param clientUI
	 *            The interface type variable.
	 */

	public ChatClient(String host, int port, ChatIF clientUI) throws IOException {
		super(host, port); // Call the superclass constructor
		this.clientUI = clientUI;
		openConnection();
	}

	// Instance methods ************************************************

	/**
	 * This method handles all data that comes in from the server.
	 *
	 * @param msg
	 *            The message from the server.
	 */
	public void handleMessageFromServer(Object msg) {

		//EditPuductInformation aFrame = Main.getFrameHandle();

		switch (((PacketClass) msg).getGuiHandle()) {
		case Main.EditProductInformationSearchBtn :
			//aFrame.EditProductInformation_SearchBtn_HandleMessageFromServer((PacketClass)msg);
			break;
		case Main.EditProductInformationChangeBtn:
			//aFrame.EditProductInformation_ChangeBtn_HandleMessageFromServer((PacketClass)msg);
			break;
		case Main.CreateSurveyInitializeSurveyID:
			Main.getCustomerServiceMainControl().getCreateSurveyControl().initializeGUI_SurveyIDCheck_FromServer((PacketClass)msg);
			break;
		case Main.CreateSurveyAddSurveyBtn:
			Main.getCustomerServiceMainControl().getCreateSurveyControl().addSurveyClicked_handleFromServer((PacketClass)msg);
			break;
		case Main.FillCustomerAnswersInitializeSurveyID:
			Main.getShopWorkerMainControl().getFillCustomerAnswersHandle().initializeGUI_GetSurveysID_FromServer((PacketClass)msg);
			break;
		case Main.FillCustomerAnswersAddSurveyAnswersBtn:
			Main.getShopWorkerMainControl().getFillCustomerAnswersHandle().click_FillCustomerAnswers_SaveAnswersBtn_FromServer((PacketClass)msg);
			break;
		case Main.FillCustomerAnswersCheckComboBox:
			Main.getShopWorkerMainControl().getFillCustomerAnswersHandle().click_FillCustomerAnswers_ComboBoxID_FromServer((PacketClass)msg);
			break;
		default:
		}
			/*try {
		}

		}catch(Exception ex) {System.out.println("Unknown error handleMessageFromServer");}
		*/

	}

	/**
	 * This method handles all data coming from the UI
	 *
	 * @param message
	 *            The message from the UI.
	 */
	public void handleMessageFromClientUI(PacketClass packet) throws Exception{
		try {
			sendToServer(packet);
		} catch (Exception e) {
			System.out.println("Could not send message to server.  handleMessageFromClientUI.");
			throw e;
		} 
	}

	/**
	 * This method terminates the client.
	 */
	public void quit() {
		try {
			closeConnection();
		} catch (IOException e) {
		}
		System.exit(0);
	}
}
// End of ChatClient class
