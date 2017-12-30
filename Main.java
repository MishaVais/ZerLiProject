package client;

import java.io.IOException;

import CompanyManager.CompanyManagerMain;
import CustomerService.CustomerServiceMain;
import ServiceExpert.ServiceExpertMain;
import ShopWorker.ShopWorkerMain;
import gui.EditPuductInformation;
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application{
	
	// Gui elements handles
	public static final int EditProductInformationSearchBtn = 1;
	public static final int EditProductInformationChangeBtn = 2;
	
	public static final int CreateSurveyInitializeSurveyID = 3;
	public static final int CreateSurveyAddSurveyBtn = 4;
	
	public static final int FillCustomerAnswersInitializeSurveyID = 5;
	public static final int FillCustomerAnswersAddSurveyAnswersBtn = 6;
	public static final int FillCustomerAnswersCheckComboBox = 7;
	
	public static final int PullSurveyResultsInitializeSurveyID = 8;
	public static final int PullSurveyResultsAddConclusionBtn = 9;
	public static final int PullSurveyResultsCheckComboBoxSurveyID = 10;
	
	public static final int SaveSurveyConclusionCheckComboBoxSurveyID = 11;
	public static final int SaveSurveyConclusionGetConclusionText = 12;
	public static final int SaveSurveyConclusionApproveConclusionBtn = 13;
	
	public static final int InitializeCompanyManagerStoreIDcomboBox=50;
	
	
	// Gui controls handles
	private static EditPuductInformation EditPuductInformationControl;
	private static CustomerServiceMain CustomerServiceMainControl;
	private static ShopWorkerMain ShopWorkerMainControl;
	private static CompanyManagerMain CompanyManagerMainControl;
	private static ServiceExpertMain ServiceExpertMainControl;
	

	// Client control handle
	private static ClientConsole clientConsolHandle;

	// Sql command defines
	final public static String SELECTCommandStatement = "SELECT ";
	final public static String UPDATECommandStatement = "UPDATE ";
	final public static String SETCommandStatement = " SET ";
	final public static String FROMCommmandStatement = " FROM ";
	final public static String WHERECommmandStatement = " WHERE ";
	final public static String INSERTCommmandStatement ="INSERT INTO ";
	final public static String VALUESCommmandStatement =" VALUES ";
	
	// Socket properties
	final public static int DEFAULT_PORT = 5555;
	
	// PacketClass defines
	public static final boolean READ = true;
	public static final boolean WRITE = false;
	
	// General defines
	private static String[] arguments;
	
	// Messages color
	public static final String RED = "red";
	public static final String GREEN = "green";
	
	//enums
	public enum GreetingCardIs {yes,no};
	public enum OrderType {SelfDefined,CatalogType};
	public enum ItemType {FlowerArrangement,Pot,BridalBouquet,Bouquet};
	public enum IsOnSale {OnSale,NotOnSale};
	public enum DelivryOrShipping {shipping,delivery};
	public enum Color {none,red,black,yellow};
	
	
	
	public static void main(String[] args) throws Exception {

		String host = "";
		int port; // The port number
		
		try {
			host = args[0];
		} catch (ArrayIndexOutOfBoundsException e) {
			host = "localhost";
		}
		
		
		try {
			port = Integer.parseInt(args[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			port = Main.DEFAULT_PORT;
		}

		try {

			clientConsolHandle = new ClientConsole(host, port);
			System.out.println("Success client connect");
		} catch (IOException ex) {
			System.out.println("Error: Can't setup connection! Check host and port.");
		}
		
		launch(args); 
	}
	
	
	@Override
	public void start(Stage arg0) throws Exception { 
		
		//Test Classes					  		
		CustomerServiceMain frameInstance = new CustomerServiceMain();
				
		CustomerServiceMainControl = frameInstance;
				
		frameInstance.start();
		
		
		/*ServiceExpertMain frameInstance = new ServiceExpertMain();
		
		ServiceExpertMainControl = frameInstance;
				
		frameInstance.start();
		*/
		
		
		
	}
	
	
	public static CustomerServiceMain getCustomerServiceMainControl() {
		return CustomerServiceMainControl;
	}


	public static void setCustomerServiceMainControl(CustomerServiceMain customerServiceMainControl) {
		CustomerServiceMainControl = customerServiceMainControl;
	}


	public static String[] getArguments() {
		return arguments;
	}
	
	
	public static ClientConsole getClientConsolHandle() {
		return clientConsolHandle;
	}


	public static void setClientConsolHandle(ClientConsole clientConsolHandle) {
		Main.clientConsolHandle = clientConsolHandle;
	}
	
	public static ShopWorkerMain getShopWorkerMainControl() {
		return ShopWorkerMainControl;
	}


	public static void setShopWorkerMainControl(ShopWorkerMain shopWorkerMainControl) {
		ShopWorkerMainControl = shopWorkerMainControl;
	}
	
	public static CompanyManagerMain getCompanyManagerMainControl() {
		return CompanyManagerMainControl;
	}


	public static void setCompanyManagerMainControl(CompanyManagerMain companyManagerMainControl) {
		CompanyManagerMainControl = companyManagerMainControl;
	}
	
	public static ServiceExpertMain getServiceExpertMainControl() {
		return ServiceExpertMainControl;
	}


	public static void setServiceExpertMainControl(ServiceExpertMain serviceExpertMainControl) {
		ServiceExpertMainControl = serviceExpertMainControl;
	}
	
}
