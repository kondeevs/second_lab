import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.*;


import java.util.ArrayList;
import java.util.List;

public class DeleteListener implements Listener {

    private Controller controller;
    private Window window;
    private Shell parent;

    public DeleteListener(Shell parent, Controller controller, Window window) {
        this.parent = parent;
        this.controller = controller;
        this.window = window;
    }

    @Override
    public void handleEvent(Event e) {
        Shell child = new Shell(parent, SWT.SHELL_TRIM | SWT.RESIZE);
        child.setText("Deletion...");

        RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
        rowLayout.marginTop = 10;
        rowLayout.marginBottom = 10;
        rowLayout.marginLeft = 5;
        rowLayout.marginRight = 5;
        rowLayout.spacing = 5;
        child.setLayout(rowLayout);

        Label nameLabel = new Label(child, SWT.NONE);
        nameLabel.setText("Student name:");

        Text nameText = new Text(child, SWT.NONE);
        nameText.setLayoutData(new RowData(200, 20));

        Button nameSearchCheck = new Button(child, SWT.CHECK);
        nameSearchCheck.setText("Delete by name");

        Label groupLabel = new Label(child, SWT.NONE);
        groupLabel.setText("Group:");

        Text groupText = new Text(child, SWT.NONE);
        groupText.setLayoutData(new RowData(200, 20));

        Button groupSearchCheck = new Button(child, SWT.CHECK);
        groupSearchCheck.setText("Delete by group");

        Label totalWork = new Label(child, SWT.NONE);
        totalWork.setText("The upper bound of all the work\n");

        Text totalWorkText = new Text(child, SWT.NONE);
        totalWorkText.setLayoutData(new RowData(200, 20));

        Label totalMinWork = new Label(child, SWT.NONE);
        totalMinWork.setText("Lower bound of all work\n");

        Text totalMinWorkText = new Text(child, SWT.NONE);
        totalMinWorkText.setLayoutData(new RowData(200, 20));

        Button totalMinWorkButton = new Button(child, SWT.CHECK);
        totalMinWorkButton.setText("Delete by lower bound and upper bound of all work\n");

        Button deleteButton = new Button(child, SWT.NONE);
        deleteButton.setText("Delete");

        Listener proceedListener = new Listener() {
            @Override
            public void handleEvent(Event e) {

                List<Student> students = new ArrayList<>();
                if (groupSearchCheck.getSelection()) {
                    String group = groupText.getText();
                    students.addAll(controller.findByGroup(group, controller.getAllStudents()));
                }


                if (nameSearchCheck.getSelection()) {
                    String name = nameText.getText();
                    students = controller.findByName(name, controller.getAllStudents());
                }

                if(totalMinWorkButton.getSelection()){
                    String boundUp = totalWorkText.getText();
                    String boundLow = totalMinWorkText.getText();
                    students.addAll(controller.findAll(boundLow,boundUp, controller.getAllStudents()));

                }
                // put deleted students into a `students`
                Shell dialog = new Shell(child);
                dialog.setText("Action");
                dialog.setLayout(new FillLayout());
                Label resultLabel = new Label(dialog, SWT.NONE);
                if (students.size() != 0) {
                    controller.deleteStudents(students);
                    window.updateTable();
                    resultLabel.setText("Was deleted " + students.size() + " students.");
                } else resultLabel.setText("No such students.");
                dialog.pack();
                dialog.open();
            }

        };
        deleteButton.addListener(SWT.MouseDown, proceedListener);
        child.pack();
        child.open();
    }
}
