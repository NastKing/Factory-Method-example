public class fabricaMesa extends fabricaMueble {

    @Override
    public Mueble crearMueble() {
        return new mesa();
    }
}
