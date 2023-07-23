package cenfomazon.Estructural.PesoLigero.modulo;

import cenfomazon.Estructural.PesoLigero.Extrinseco.Repuesto;
import cenfomazon.Estructural.PesoLigero.Intrinseco.DataRepuestos;
import cenfomazon.Model.Repuesto.RepuestoC;

import java.util.Map;

public class util {

    public static String imprimirMapaRepuestos(Map<String, Repuesto> map) {
        Repuesto repuesto;
        String resultado = "";
        for (Map.Entry m:map.entrySet()) {
            repuesto = (Repuesto) m.getValue();
            resultado += (m.getKey() + " " + repuesto.toString()) + "\n";
        }
        return  resultado;
    }
    public static String imprimirMapaRepuestosC(Map<String, RepuestoC> map) {
        RepuestoC repuesto;
        String resultado = "";
        for (Map.Entry m:map.entrySet()) {
            repuesto = (RepuestoC) m.getValue();
            resultado += (m.getKey() + " " + repuesto.toString()) + "\n";
        }
        return  resultado;
    }

    public static String imprimirIntegranteMapa(String pKey, DataRepuestos dataR) {
        return (pKey+" "+dataR.MostrarCaracteristicas(""));
    }

    public static String imprimirIntegranteMapa(String pKey, DataRepuestos dataR, String pDatos) {
        return pKey + " " + dataR.MostrarCaracteristicas(pDatos);
    }

    public static String generarKey(int tipoRepuesto, String categoria, int marcaRepuesto) {
        return String.valueOf(tipoRepuesto)  + "-" + categoria + "-" + String.valueOf(marcaRepuesto);
    }

    public static String imprimirMapaDatarepuestos(Map<String, DataRepuestos> dataRepuestosMap) {
        String caracteristicas="";
        for(Map.Entry m:dataRepuestosMap.entrySet())
            caracteristicas += imprimirIntegranteMapa (m.getKey().toString(),(DataRepuestos) m.getValue()) +"\n";

        return caracteristicas;
    }
}
