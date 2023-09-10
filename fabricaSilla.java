public class fabricaSilla extends fabricaMueble {

    @Override
    public Mueble crearMueble() {
        return new silla();
    }
}
