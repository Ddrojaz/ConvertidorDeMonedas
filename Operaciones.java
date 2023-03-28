package logica;

public class Operaciones {

    private double importe = 0;
    private double resultado = 0;
    private int moneda;


    public Operaciones() {
    }


    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }


    public double convertir() {

        switch (moneda) {
            case 0:
                resultado = importe * 0.0048;
                break;
            case 1:
                resultado = importe * 0.0045;
                break;
            case 2:
                resultado = importe * 0.0039;
                break;
            case 3:
                resultado = importe * 0.63;
                break;
            case 4:
                resultado = importe * 6.26;
                break;
            case 5:
                resultado = importe * 207.43;
                break;
            case 6:
                resultado = importe * 224.21;
                break;
            case 7:
                resultado = importe * 255.20;
                break;
            case 8:
                resultado = importe * 1.58;
                break;
            case 9:
                resultado = importe * 0.16;
                break;
            default:
                break;

        }
        return resultado;
    }

}
