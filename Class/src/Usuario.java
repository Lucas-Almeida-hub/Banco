


public class Usuario{
    public int numconta;
    protected  String tipo;
    private  String dono;
    private float saldo;
    private boolean status =false;
    
    public void AbrirConta(){
        
    }
    public void FecharConta(){

    }
    public void depositarConta(){

    }
    public void Sacar(){

    }
    public void PagarMensal(){

    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

}
