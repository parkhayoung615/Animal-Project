package mainScene;

import java.awt.TextField;
import java.net.URL;
import java.time.LocalDate;
import java.util.Optional;
import java.util.Random;
import java.util.ResourceBundle;

import domain.GetterSetter;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class MainController implements Initializable {
	
	@FXML
	private ListView<GetterSetter> Catlist;
	@FXML
	private ListView<GetterSetter> Doglist;
	@FXML
	private ListView<GetterSetter> Mullist;
	@FXML
	private Button startBtn;
	@FXML
	private Button dogSelectBtn;
	@FXML
	private Button catSelectBtn;
	@FXML
	private Button multiSelectBtn;
	@FXML
	private Button endDogSelectBtn;
	@FXML
	private Button endCatSelectBtn;
	@FXML
	private Button catChangeBtn;
	@FXML
	private Button endMulSelectBtn;
	@FXML
	private Button CatHomeBtn;
	@FXML
	private Button catCloseBtn;
	@FXML
	private Button DogHomeBtn;
	@FXML
	private Button DogChangeBtn;
	@FXML
	private Button dogCloseBtn;
	@FXML
	private Button MulHomeBtn;
	@FXML
	private Button MulChangeBtn;
	@FXML
	private Button mulCloseBtn;
	@FXML
	private TextField catTxtweight;
	@FXML
	private TextField DogTxtweight;
	@FXML
	private TextField MulTxtweight;
	@FXML
	private TextField catTxtMemo;
	@FXML
	private TextField DogTxtMemo;
	@FXML
	private TextField MulTxtMemo;
	@FXML
	private RadioButton catcheckDry;
	@FXML
	private RadioButton catcheckWet;
	@FXML
	private TextField catTxtRice;
	@FXML
	private RadioButton DogcheckDry;
	@FXML
	private RadioButton DogcheckWet;
	@FXML
	private TextField DogTxtRice;
	@FXML
	private RadioButton MulcheckDry;
	@FXML
	private RadioButton MulcheckWet;
	@FXML
	private TextField MulTxtRice;
	@FXML
	private TextField catTxtSnack;
	@FXML
	private TextField DogTxtSnack;
	@FXML
	private TextField MulTxtSnack;
	@FXML
	private TextField catTxtWater;
	@FXML
	private TextField DogTxtWater;
	@FXML
	private TextField MulTxtWater;
	@FXML
	private TextField catTxtPill;
	@FXML
	private DatePicker CatPillDate;
	@FXML
	private TextField DogTxtPill;
	@FXML
	private DatePicker DogPillDate;
	@FXML
	private TextField MulTxtPill;
	@FXML
	private DatePicker MulPillDate;
	@FXML
	private TextField catTxtPee;
	@FXML
	private RadioButton CatCheckNomal;
	@FXML
	private RadioButton CatCheckAbnormal;
	@FXML
	private TextField DogTxtPee;
	@FXML
	private RadioButton DogCheckNomal;
	@FXML
	private RadioButton DogCheckAbnormal;
	@FXML
	private TextField MulTxtPee;
	@FXML
	private RadioButton MulCheckNomal;
	@FXML
	private RadioButton MulCheckAbnormal;
	
	@FXML
	private TextField CatOnlySand;
	@FXML
	private DatePicker CatSandDate;

	
	@FXML
	private TextField DogOnlyWalk;
	@FXML
	private DatePicker DogWalkDate;
	
	@FXML
	private TextField MulDogOnlyWalk;
	@FXML
	private DatePicker MulCatSandDate;

	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	

	
	
	// StartLayout 화면 전환
	public void changeScene() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("/mainScene/SelectLayout.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) startBtn.getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// SelectLayout에서 DogLayout 으로 화면 전환
	public void changeDogScene() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("/mainScene/DogLayout.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) dogSelectBtn.getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// SelectLayout에서 CatLayout 으로 화면 전환
	public void changeCatScene() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("/mainScene/CatLayout.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) catSelectBtn.getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// SelectLayout에서 MulitLayout 으로 화면 전환
	public void changemultiScene() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("/mainScene/MultiLayout.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) multiSelectBtn.getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// DogLayout에서 EndDogLayout 으로 화면 전환
	public void changeEndDogScene() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("/mainScene/EndDog.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) endDogSelectBtn.getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// CatLayout에서 EndCatLayout 으로 화면 전환
	public void changeEndCatScene() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("/mainScene/EndCat.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) endCatSelectBtn.getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// EndCat에서 SelectLayout 으로 넘기기
	public void changeCatSelectScene() {
		try {
			// 경고창
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Warning Dialog");
			alert.setContentText("지금까지 기입했던 정보가 삭제됩니다. 그래도 진행하시겠습니까?");

			ButtonType yesButton = new ButtonType("Yes");
			ButtonType cancelButton = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);

			alert.getButtonTypes().setAll(yesButton, cancelButton);

			Optional<ButtonType> result = alert.showAndWait();
			if (result.get() == yesButton) {
				// 창 가져오기
				Parent login = FXMLLoader.load(getClass().getResource("/mainScene/SelectLayout.fxml"));
				Scene scene = new Scene(login);
				Stage primaryStage = (Stage) catChangeBtn.getScene().getWindow();
				scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
				primaryStage.setScene(scene);

			} else if (result.get() == cancelButton) {
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	// MulLayout에서 EndmulLayout 으로 화면 전환
	public void changeEndMulScene() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("/mainScene/Endmul.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) endMulSelectBtn.getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// EndCat에서 CatLayout 으로 화면 전환
	public void changeCatHomeScene() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("/mainScene/CatLayout.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) CatHomeBtn.getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// EndCat에서 창 닫기
	public void closeCat() { // 현재의 스테이지를 받아서 close를 해주어야 함
		Stage pop = (Stage) catCloseBtn.getScene().getWindow(); // 버튼을 통해서 현재 스테이지를 알아냄
		pop.close();
	}

	// EndDog에서 DogLayout 으로 화면 전환
	public void changeDogHomeScene() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("/mainScene/DogLayout.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) DogHomeBtn.getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// EndDog에서 SelectLayout 으로 화면 전환
	public void changeDogSelectScene() {
		try {
			// 경고창
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Warning Dialog");
			alert.setContentText("지금까지 기입했던 정보가 삭제됩니다. 그래도 진행하시겠습니까?");

			ButtonType yesButton = new ButtonType("Yes");
			ButtonType cancelButton = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);

			alert.getButtonTypes().setAll(yesButton, cancelButton);

			Optional<ButtonType> result = alert.showAndWait();
			if (result.get() == yesButton) {
				// 창 가져오기
				Parent login = FXMLLoader.load(getClass().getResource("/mainScene/SelectLayout.fxml"));
				Scene scene = new Scene(login);
				Stage primaryStage = (Stage) DogHomeBtn.getScene().getWindow();
				scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
				primaryStage.setScene(scene);

			} else if (result.get() == cancelButton) {
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	// EndDog에서 창 닫기
	public void closeDog() { // 현재의 스테이지를 받아서 close를 해주어야 함
		Stage pop = (Stage) dogCloseBtn.getScene().getWindow(); // 버튼을 통해서 현재 스테이지를 알아냄
		pop.close();
	}

	// EndMul에서 MulLayout 으로 화면 전환
	public void changeMulHomeScene() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("/mainScene/MultiLayout.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) MulHomeBtn.getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// EndDog에서 SelectLayout 으로 화면 전환
	public void changeMulSelectScene() {
		try {
			// 경고창
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Warning Dialog");
			alert.setContentText("지금까지 기입했던 정보가 삭제됩니다. 그래도 진행하시겠습니까?");

			ButtonType yesButton = new ButtonType("Yes");
			ButtonType cancelButton = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);

			alert.getButtonTypes().setAll(yesButton, cancelButton);

			Optional<ButtonType> result = alert.showAndWait();
			if (result.get() == yesButton) {
				// 창 가져오기
				Parent login = FXMLLoader.load(getClass().getResource("/mainScene/SelectLayout.fxml"));
				Scene scene = new Scene(login);
				Stage primaryStage = (Stage) MulChangeBtn.getScene().getWindow();
				scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
				primaryStage.setScene(scene);

			} else if (result.get() == cancelButton) {
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	// Endmul에서 창 닫기
	public void closeMul() { // 현재의 스테이지를 받아서 close를 해주어야 함
		Stage pop = (Stage) mulCloseBtn.getScene().getWindow(); // 버튼을 통해서 현재 스테이지를 알아냄
		pop.close();
	}

	// Quiz1 열기
	public void RandomQuiz1() {
		try {
			Random rd = new Random();
			for (int i = 0; i < 6; i++) {
				System.out.println(rd);
			}
			Parent login = FXMLLoader.load(getClass().getResource("/mainScene/MultiLayout.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) MulHomeBtn.getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}