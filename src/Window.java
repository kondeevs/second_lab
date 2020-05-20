
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.*;


public class Window {
    private Controller controller;
    private StudentTable table;
    private Display display = new Display();
    private Shell shell = new Shell(display);

    public Window(Controller controller) {
        this.controller = controller;
    }

    public void start() {
        shell.setText("LAB 2");

        RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
        rowLayout.marginTop = 10;
        rowLayout.marginBottom = 10;
        rowLayout.marginLeft = 5;
        rowLayout.marginRight = 5;
        rowLayout.spacing = 5;
        shell.setLayout(rowLayout);

        Button saveButton = new Button(shell, SWT.PUSH);
        saveButton.setText("Save...");
        saveButton.setLayoutData(new RowData(100, 50));
        SaveListener saveListener = new SaveListener(shell, controller);
        saveButton.addListener(SWT.MouseDown, saveListener);

        Button loadButton = new Button(shell, SWT.PUSH);
        loadButton.setText("Load...");
        loadButton.setLayoutData(new RowData(100, 50));
        LoadListener loadListener = new LoadListener(shell, this, controller);
        loadButton.addListener(SWT.MouseDown, loadListener);

        Button addButton = new Button(shell, SWT.PUSH);
        addButton.setText("Add...");
        addButton.setLayoutData(new RowData(100, 50));
        AddListener addListener = new AddListener(shell, controller, this);
        addButton.addListener(SWT.MouseDown, addListener);

        Button searchButton = new Button(shell, SWT.PUSH);
        searchButton.setText("Search...");
        searchButton.setLayoutData(new RowData(100, 50));
        SearchListener searchListener = new SearchListener(shell, controller);
        searchButton.addListener(SWT.MouseDown, searchListener);

        Button deleteButton = new Button(shell, SWT.PUSH);
        deleteButton.setText("Delete...");
        deleteButton.setLayoutData(new RowData(100, 50));
        DeleteListener deleteListener = new DeleteListener(shell, controller, this);
        deleteButton.addListener(SWT.MouseDown, deleteListener);

        Button exitButton = new Button(shell, SWT.PUSH);
        exitButton.setText("Exit");
        exitButton.setLayoutData(new RowData(100,50));


        Listener exitListener = new Listener() {
            @Override
            public void handleEvent(Event event) {
                System.exit(1);
            }
        };
        exitButton.addListener(SWT.MouseDown, exitListener);
        table = new StudentTable(shell, SWT.NONE, controller);

        shell.pack();
        shell.open();
        while(!shell.isDisposed()) {
            if(!display.readAndDispatch()) display.sleep();
        }
    }

    public void updateTable() {
        table.updateTable();
    }
}