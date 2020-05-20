import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.*;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new ArrayList<Student>());
        Window window = new Window(controller);

        window.start();
}
}
