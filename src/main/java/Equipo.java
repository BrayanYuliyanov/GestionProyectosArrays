public class Equipo {

    private Trabajador lider;

    private Trabajador[] participantes = new Trabajador[Ctes.NUM_TRABAJADORES_EMPRESA];

    private int numParticipantes = 0;

    public int getMaxNumeroParticipantes() {
        return Ctes.MAX_NUM_PARTICIPANTES_EQUIPO;
    }

    public Trabajador getParticipante(int numero) {
        if (numero < 1 || numero > 8) {
            return null;
        }
        return participantes[numero - 1];
    }

    public void setParticipante(int numero, Trabajador trabajador) {
        participantes[numero - 1] = trabajador;
    }

    public boolean tieneLider() {
        // TODO 21: Saber si el equipo tiene líder
        return lider != null;
    }

    public Trabajador getLider() {
        // TODO 22: Devolver quién es el líder
        return lider;
    }

    public void setLider(int numeroParticipante) {
        if (numeroParticipante >= 1 && numeroParticipante <= getMaxNumeroParticipantes()) {
            lider = participantes[numeroParticipante - 1];
        }
    }

    public int getNumeroParticipantes() {
        // TODO 24: Calcular el número de participantes utilizando un bucle
        int num = 0;
        for (int i = 0; i < participantes.length; i++) {
            if (participantes[i] != null) {
                num++;
            }
        }

        return num;
    }

    public boolean estaEquipoCompleto() {
        return getNumeroParticipantes() == getMaxNumeroParticipantes();
    }

    public boolean addParticipante(Trabajador trabajador) {
        // TODO 25: Agregar un trabajador como participante si no se ha llegado al límite utilizando un bucle
        if (getNumeroParticipantes() >= getMaxNumeroParticipantes()) {
            return false;
        }

        for (int i = 0; i < participantes.length; i++) {
            if (participantes[i] == null) {
                participantes[i] = trabajador;
                return true;
            }
        }
        return false;
    }

    public void mostrar() {
        // TODO 26: Mostrar los participantes del equipo junto con su número de participante utilizando un bucle
        for (int i = 0; i < participantes.length; i++) {
            if (participantes[i] != null) {
                System.out.println("Participante " + (i + 1) + ": " + participantes[i]);
            }
        }
    }

    public int getPrecioHora() {
        int precio = 0;
        // TODO 27: Calcular el precio de la hora de todos los participantes del equipo utilizando un bucle
        for (int i = 0; i < participantes.length; i++) {
            if (participantes[i] != null) {
                precio += participantes[i].getPrecioHora();
            }
        }

        return precio;
    }

}
