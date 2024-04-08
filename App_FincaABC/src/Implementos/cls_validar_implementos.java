package Implementos;

public class cls_validar_implementos {
    private boolean val = false;
    private String msn;
    
     public void validarDatosEntrada(
    String codigo, String nom, String can, String pre, String fe, String tipo
    ){
        if(codigo.equals("")||nom.equals("")||can.equals("")||pre.equals("")||fe.equals("")||tipo.equals("")){
            this.msn = "Debe ingresar todos los datos";
        }else{
            this.val = true;
            this.msn = "El implemento "+nom+" ha sido registrado con éxito";
        }
    }
    
    public String getMsn(){return this.msn;}
    public boolean getVal(){return this.val;}
}
