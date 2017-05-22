package first.rcp.application;



import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

public class MainView extends ViewPart {

	public MainView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		Label label = new Label(parent, 1);
		label.setLayoutData(new GridData());
		label.setText("Hello RCP!");

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
