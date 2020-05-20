import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class AddListener implements Listener {

    private Controller controller;
    private Window window;
    private Shell parent;

    public AddListener(Shell parent, Controller controller, Window window) {
        this.parent = parent;
        this.controller = controller;
        this.window = window;
    }

    @Override
    public void handleEvent(Event e) {
        Shell child = new Shell(parent);
        child.setText("Adding...");

        RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
        rowLayout.marginTop = 10;
        rowLayout.marginBottom = 10;
        rowLayout.marginLeft = 5;
        rowLayout.marginRight = 5;
        rowLayout.spacing = 5;
        child.setLayout(rowLayout);

        Label studentNameLabel = new Label(child, SWT.NONE);
        studentNameLabel.setText("Put student name:");

        Text studentNameText = new Text(child, SWT.NONE);
        studentNameText.setLayoutData(new RowData(200, 20));

        Label group = new Label(child, SWT.NONE);
        group.setText("Put student's group:");

        Text groupText = new Text(child, SWT.NONE);
        groupText.setLayoutData(new RowData(200, 20));

        Label first = new Label(child, SWT.NONE);
        first.setText("Put first semestr:");

        Text firstText = new Text(child, SWT.NONE);
        firstText.setLayoutData(new RowData(200, 20));

        Label second = new Label(child, SWT.NONE);
        second.setText("Put second semestr:");

        Text secondText = new Text(child, SWT.NONE);
        secondText.setLayoutData(new RowData(200, 20));

        Label third = new Label(child, SWT.NONE);
        third.setText("Put third semestr:");

        Text thirdText = new Text(child, SWT.NONE);
        thirdText.setLayoutData(new RowData(200, 20));

        Label fourth = new Label(child, SWT.NONE);
        fourth.setText("Put fourth semestr:");

        Text fourthText = new Text(child, SWT.NONE);
        fourthText.setLayoutData(new RowData(200, 20));

        Label five = new Label(child, SWT.NONE);
        five.setText("Put fiveth semestr:");

        Text fiveText = new Text(child, SWT.NONE);
        fiveText.setLayoutData(new RowData(200, 20));

        Label six = new Label(child, SWT.NONE);
        six.setText("Put sixth semestr:");

        Text sixText = new Text(child, SWT.NONE);
        sixText.setLayoutData(new RowData(200, 20));

        Label seventh = new Label(child, SWT.NONE);
        seventh.setText("Put seventh semestr:");

        Text seventhText = new Text(child, SWT.NONE);
        seventhText.setLayoutData(new RowData(200, 20));

        Label eighth = new Label(child, SWT.NONE);
        eighth.setText("Put eighth semestr:");

        Text eighthText = new Text(child, SWT.NONE);
        eighthText.setLayoutData(new RowData(200, 20));

        Label ninth = new Label(child, SWT.NONE);
        ninth.setText("Put ninth semestr:");

        Text ninthText = new Text(child, SWT.NONE);
        ninthText.setLayoutData(new RowData(200, 20));

        Label tenth = new Label(child, SWT.NONE);
        tenth.setText("Put tenth semestr:");

        Text tenthText = new Text(child, SWT.NONE);
        tenthText.setLayoutData(new RowData(200, 20));

        Button proceedButton = new Button(child, SWT.PUSH);
        proceedButton.setText("Add");
        proceedButton.setLayoutData(new RowData(100, 30));

        Listener proceedListener = new Listener() {

            @Override
            public void handleEvent(Event arg0) {

                String stName = studentNameText.getText();
                String stGroup = groupText.getText();
                int first = Integer.parseInt(firstText.getText());
                int second = Integer.parseInt(secondText.getText());
                int three = Integer.parseInt(thirdText.getText());
                int fourth = Integer.parseInt(fourthText.getText());
                int five = Integer.parseInt(fiveText.getText());
                int six = Integer.parseInt(sixText.getText());
                int seven = Integer.parseInt(seventhText.getText());
                int eight = Integer.parseInt(eighthText.getText());
                int nine = Integer.parseInt(ninthText.getText());
                int ten = Integer.parseInt(tenthText.getText());

                controller.addStudent(stName,
                        stGroup,
                        first,
                        second,
                        three,
                        fourth,
                        five,
                        six,
                        seven,
                        eight,
                        nine,
                        ten);
                window.updateTable();
                child.dispose();
            }

        };
        proceedButton.addListener(SWT.MouseDown, proceedListener);

        child.pack();
        child.open();
    }
}
