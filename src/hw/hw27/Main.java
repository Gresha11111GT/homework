package hw.hw27;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ViewButton viewButton = new ViewButton(0, 0);
        Model model = new Model(viewButton);
        Controller controller = new Controller(model);
        model.setController(controller);
        View view = new View(controller);
        controller.setView(view);
    }
}