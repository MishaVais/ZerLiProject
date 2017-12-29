package CustomerService;


import client.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CustomerServiceMain {

	private static CreateSurvey CreateSurveyControl;
	private static SaveSurveyConclusion SaveSurveyConclusionControl;
	private static OpenNewComplaint OpenNewComplaintControl;
	private static FollowComplaint FollowComplaintControl;
	

	public void start() throws Exception {

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CustomerServiceMain.fxml"));
		Parent root1 = (Parent) fxmlLoader.load();
		Stage stage = new Stage();
		stage.setScene(new Scene(root1));
		stage.setTitle("Customer service panel");
		stage.show();

		Main.setCustomerServiceMainControl(fxmlLoader.getController());
		CreateSurveyControl = new CreateSurvey();
		SaveSurveyConclusionControl = new SaveSurveyConclusion();
		FollowComplaintControl = new FollowComplaint();
		OpenNewComplaintControl = new OpenNewComplaint();
	}

	public void click_CreateNewSurvey_btn(ActionEvent event) {

		((Node) event.getSource()).getScene().getWindow().hide();

		
		try {
			CreateSurveyControl.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void click_SaveSurveyConclusion_btn(ActionEvent event) {

		((Node) event.getSource()).getScene().getWindow().hide();

		
		try {
			SaveSurveyConclusionControl.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void click_FollowComplaint_btn(ActionEvent event) {

		((Node) event.getSource()).getScene().getWindow().hide();

		
		try {
			FollowComplaintControl.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void click_OpenNewComplaint_btn(ActionEvent event) {

		((Node) event.getSource()).getScene().getWindow().hide();

		
		try {
			OpenNewComplaintControl.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static CreateSurvey getCreateSurveyControl() {
		return CreateSurveyControl;
	}

	public static void setCreateSurveyControl(CreateSurvey createSurveyControl) {
		CreateSurveyControl = createSurveyControl;
	}

	public static SaveSurveyConclusion getSaveSurveyConclusionControl() {
		return SaveSurveyConclusionControl;
	}

	public static void setSaveSurveyConclusionControl(SaveSurveyConclusion saveSurveyConclusionControl) {
		SaveSurveyConclusionControl = saveSurveyConclusionControl;
	}

	public static OpenNewComplaint getOpenNewComplaintControl() {
		return OpenNewComplaintControl;
	}

	public static void setOpenNewComplaintControl(OpenNewComplaint openNewComplaintControl) {
		OpenNewComplaintControl = openNewComplaintControl;
	}

	public static FollowComplaint getFollowComplaintControl() {
		return FollowComplaintControl;
	}

	public static void setFollowComplaintControl(FollowComplaint followComplaintControl) {
		FollowComplaintControl = followComplaintControl;
	}
	

}
