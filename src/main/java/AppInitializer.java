import models.Band;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@WebListener
public class AppInitializer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Band guasones = new Band("Guasones", 4);
        Band estelares = new Band("Estelares", 4);
        Band cuartetoDeNos = new Band("Cuarteto de nos", 4);
        Band missBolivia = new Band("Miss Bolivia", 4);
        Band jeites = new Band("Jeites", 4);
        Band muerdo = new Band("Muerdo", 4);
        List<Band> bands = new ArrayList<>();
        bands.add(guasones);
        bands.add(estelares);
        bands.add(cuartetoDeNos);
        bands.add(missBolivia);
        bands.add(jeites);
        bands.add(muerdo);
        sce.getServletContext().setAttribute("bands", bands);
        Integer availableShirts = 500;
        sce.getServletContext().setAttribute("availableShirts", availableShirts);
        HashMap<String, Integer> cupons = new HashMap<>();
        sce.getServletContext().setAttribute("cupons", cupons);
    }
}
