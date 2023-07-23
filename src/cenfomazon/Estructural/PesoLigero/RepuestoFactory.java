package cenfomazon.Estructural.PesoLigero;

import cenfomazon.Estructural.PesoLigero.Intrinseco.DataRepuestos;
import cenfomazon.Estructural.PesoLigero.modulo.util;

import java.util.HashMap;
import java.util.Map;

public class RepuestoFactory {

    private static Map<String, DataRepuestos> gPoolRepuesto = new HashMap<>();

    public static DataRepuestos obtenerRepuesto(int tipoRepuesto, String categoria, int marcaRepuesto) {
        DataRepuestos data = null;

        String key = util.generarKey(tipoRepuesto, categoria, marcaRepuesto);
        if(gPoolRepuesto.containsKey(key)) {
            data = gPoolRepuesto.get(key);
            util.imprimirIntegranteMapa(key, data, "Repuesto recuperado");
            System.out.println("----Data recuperada-----");
        } else {
            data = new RepuestoNave(tipoRepuesto, categoria, marcaRepuesto);
            gPoolRepuesto.put(key, data);
        }

        return data;
    }

    public static Map<String, DataRepuestos> getgPoolRepuesto() {
        return gPoolRepuesto;
    }
}
