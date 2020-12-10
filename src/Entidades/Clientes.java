package Entidades;


public class Clientes extends Persona{
    
    private String s_id_cliente;
    private String s_codigo_cliente;
    private String s_tipoCliente;
    private String s_id_persona_fk;

    public String getS_id_cliente() {
        return s_id_cliente;
    }

    public void setS_id_cliente(String s_id_cliente) {
        this.s_id_cliente = s_id_cliente;
    }

    public String getS_id_persona_fk() {
        return s_id_persona_fk;
    }

    public void setS_id_persona_fk(String s_id_persona_fk) {
        this.s_id_persona_fk = s_id_persona_fk;
    }

    
    
    public String getS_codigo_cliente() {
        return s_codigo_cliente;
    }

    public void setS_codigo_cliente(String s_codigo_cliente) {
        this.s_codigo_cliente = s_codigo_cliente;
    }

    public String getS_tipoCliente() {
        return s_tipoCliente;
    }

    public void setS_tipoCliente(String s_tipoCliente) {
        this.s_tipoCliente = s_tipoCliente;
    }
    
    
}
