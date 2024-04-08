package Datos;

public class cls_implementos {
    private String codigoStr;
    private String nombreStr;
    private int cantidadInt;
    private float precioFlt;
    private String fechaStr;
    private String tipoStr;

    public cls_implementos(String codigoStr, String nombreStr, int cantidadInt, float precioFlt, String fechaStr, String tipoStr) {
        this.codigoStr = codigoStr;
        this.nombreStr = nombreStr;
        this.cantidadInt = cantidadInt;
        this.precioFlt = precioFlt;
        this.fechaStr = fechaStr;
        this.tipoStr = tipoStr;
    }

    public String getCodigoStr() {
        return codigoStr;
    }

    public void setCodigoStr(String idStr) {
        this.codigoStr = idStr;
    }

    public String getNombreStr() {
        return nombreStr;
    }

    public void setNombreStr(String nombreStr) {
        this.nombreStr = nombreStr;
    }

    public int getCantidadInt() {
        return cantidadInt;
    }

    public void setCantidadInt(int cantidadInt) {
        this.cantidadInt = cantidadInt;
    }

    public float getPrecioFlt() {
        return precioFlt;
    }

    public void setPrecioFlt(float precioFlt) {
        this.precioFlt = precioFlt;
    }

    public String getFechaStr() {
        return fechaStr;
    }

    public void setFechaStr(String fechaStr) {
        this.fechaStr = fechaStr;
    }

    public String getTipoStr() {
        return tipoStr;
    }

    public void setTipoStr(String tipoStr) {
        this.tipoStr = tipoStr;
    }

   


    
    
}
