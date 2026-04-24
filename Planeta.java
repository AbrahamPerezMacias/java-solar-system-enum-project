// Planeta.java
package sistemasolar;

public enum Planeta {

    MERCURIO("Mercurio", 57_900_000L),
    VENUS("Venus", 108_200_000L),
    TIERRA("Tierra", 149_600_000L),
    MARTE("Marte", 227_900_000L),
    JUPITER("Júpiter", 777_900_000L),
    SATURNO("Saturno", 1_427_000_000L),
    URANO("Urano", 2_868_900_000L),
    NEPTUNO("Neptuno", 4_496_600_000L);

    private final String nombrePlaneta;
    private final long distanciaSol;

    Planeta(String nombrePlaneta, long distanciaSol) {
        this.nombrePlaneta = nombrePlaneta;
        this.distanciaSol = distanciaSol;
    }

    public String getNombrePlaneta() {
        return nombrePlaneta;
    }

    public long getDistanciaSol() {
        return distanciaSol;
    }
}
