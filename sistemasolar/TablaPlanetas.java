// TablaPlanetas.java
package sistemasolar;

public class TablaPlanetas {

    public void mostrarTabla() {

        System.out.printf("%-12s %25s%n", "Planeta", "Distancia al Sol (km)");
        System.out.println("-----------------------------------------------------");

        for (Planeta p : Planeta.values()) {
            System.out.printf("%-12s %,25d%n",
                    p.getNombrePlaneta(),
                    p.getDistanciaSol());
        }
    }
}
