package BackEnd;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class SameFlavorThread implements Runnable{
    SameFlavorThread(Clipboard systemClipboard, DataFlavor prevDataFlavor) {
        this.systemClipboard = systemClipboard;
        this.prevDataFlavor = prevDataFlavor;
    }
    @Override
    public void run() {
        while(true) {
            try {
                Object currentFlavor = systemClipboard.getData(prevDataFlavor);
                if (!currentFlavor.equals(prevFlavor)) {

                }
            } catch (UnsupportedFlavorException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private DataFlavor prevDataFlavor;
    private Clipboard systemClipboard;
    private Object prevFlavor = null;
}
