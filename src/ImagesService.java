import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class ImagesService {

    /** Расположение изображений */
    private static final String LOCATION_IMAGES = "../Testirovanie/image";


    /**
     * @return картинку пустого аккамулятора.
     */
    public static Icon getImage(String name) {
        try {
            return new ImageIcon(ImageIO.read(new File(LOCATION_IMAGES + "/" + name)));
        } catch (IOException e) {
            return null;
        }
    }

}
