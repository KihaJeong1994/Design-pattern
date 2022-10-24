import factory.Dialog;
import factory.HtmlDialog;
import factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;
    public static void main(String[] args) throws Exception {
        configure();
        runBusinessLogic();
    }
    private static void configure() {
        if(System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        }else{
            dialog = new HtmlDialog();
        }
    }

    // All of the client code should work with factories and products through abstract interfaces.
    // => not care which factory it works with and what kind of product it returns
    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
