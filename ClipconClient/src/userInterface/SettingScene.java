package userInterface;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SettingScene implements Initializable {
	
	@FXML private CheckBox clipboardMonitorNotiCB, uploadNotiCB;
	@FXML private Button XBtn;
	
	public static boolean clipboardMonitorNotiFlag = true;
	public static boolean uploadNotiFlag = true;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		if(clipboardMonitorNotiFlag)
			clipboardMonitorNotiCB.setSelected(false);
		else
			clipboardMonitorNotiCB.setSelected(true);
		
		if(uploadNotiFlag)
			uploadNotiCB.setSelected(false);
		else
			uploadNotiCB.setSelected(true);
		
		
		XBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				MainScene.closeSettingFlag = true;
			}
		});
		
	}
	
	public void checkEvent(ActionEvent event){
        if(clipboardMonitorNotiCB.isSelected()){
        	clipboardMonitorNotiFlag = false;
        	System.out.println("Turn Off Clipboard Monitor Noti Flag");
        } else {
        	clipboardMonitorNotiFlag = true;
        	System.out.println("Turn On Clipboard Monitor Noti Flag");
        }
        
        if(uploadNotiCB.isSelected()){
        	uploadNotiFlag = false;
        	System.out.println("Turn Off Upload Noti Flag");
        } else {
        	uploadNotiFlag = true;
        	System.out.println("Turn On Upload Noti Flag");
        }
    }
}