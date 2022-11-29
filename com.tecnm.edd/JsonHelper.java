package com.tecnm.edd;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.List;

/**
 *
 * @author Mario Rios <jose.rf@culiacan.tecnm.mx>
 */
public class JsonHelper {

    public Personaje[] convertJsonAPersonajes(String json) {

        //@SuppressWarnings("deprecation")
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        JsonElement results = jsonObject.get("results");
        //System.out.println(results);
        return new Gson().fromJson(results, Personaje[].class);

    }
}
