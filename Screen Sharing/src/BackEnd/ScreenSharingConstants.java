package BackEnd;

/**
 * @author Deekyech
 * This is a interface which holds alll the constants that represent which type
 * of event is generated at ClientSide.
 */
public interface ScreenSharingConstants {
    int SCREEN_SHARING_PORT = 2048;
    int EVENTS_PORT = 65535;
    int CLIPBOARD_PORT = 65534;
    String MOUSE_MOVE_COMMAND = "mouseMoved";
    String MOUSE_PRESSED_COMMAND = "mousePressed";
    String MOUSE_RELEASED_COMMAND = "mouseReleased";
    String MOUSE_WHEEL_COMMAND = "mouseWheelMoved";
    String KEY_PRESSED_COMMAND = "keyPressed";
    String KEY_RELEASED_COMMAND = "keyReleased";
}