import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/printCupon")
public class PrintCuponServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String lastname = req.getParameter("lastname");
        String dni = req.getParameter("dni");
        String email = req.getParameter("email");
        String band = req.getParameter("band");

        String relativeWebPath = "/images/festivalcapital.jpg";
        InputStream input = getServletContext().getResourceAsStream(relativeWebPath);

        BufferedImage image = ImageIO.read(input);
        Graphics2D graphics = image.createGraphics();
        int width = image.getWidth();
        int height = image.getHeight();
        int xPosition = (int)(width * 0.2);
        int yPosition = (int) (height * 0.1);
        graphics.setFont(graphics.getFont().deriveFont(20f));
        graphics.drawString(lastname + " " + name + " " + dni, xPosition, yPosition);

        double randomDouble = Math.random();
        randomDouble = randomDouble * 1000 + 1;
        int randomInt = (int) randomDouble;
        Integer availableShirts = (Integer) getServletContext().getAttribute("availableShirts");
        if (availableShirts > 0 && randomInt < 500) {
            availableShirts = availableShirts - 1;
            getServletContext().setAttribute("availableShirts", availableShirts);
            graphics.drawString("Ud a ganado una remera de "+ band, xPosition, (int) (height * 0.5));
        }
        resp.setContentType("image/jpeg");
        ImageIO.write(image, "jpg", resp.getOutputStream());
    }
}
