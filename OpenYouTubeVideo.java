import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenYouTubeVideo {
    public void openVideo() {
        // Open a YouTube link on deforestation
        String youtubeLink = "https://www.youtube.com/playlist?list=PLrAvYR1pj7PHL2cWgMj_6-XLPjclMsxzg";
        try {
            Desktop.getDesktop().browse(new URI(youtubeLink));
            System.out.println("Opening YouTube video on deforestation...");
        } catch (IOException | URISyntaxException e) {
            System.err.println("Error opening YouTube video: " + e.getMessage());
        }
    }

}