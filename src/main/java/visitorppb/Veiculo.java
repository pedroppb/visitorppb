package visitorppb;

public abstract class Veiculo implements VeiculoI{
    protected String marca;
    protected String modelo;
    protected String tipoCombustivel;
    protected String ano;
    protected int aro;
    protected int numeroRodas;

    public Veiculo(String marca, String modelo, String tipoCombustivel, String ano, int aro, int numeroRodas) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.ano = ano;
        this.aro=aro;
        this.numeroRodas=numeroRodas;
    }

    public abstract String getInfoVeiculo();
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public String getAno() {
        return ano;
    }
    public int getAro() {
        return aro;
    }
    public int getNumeroRodas() {
        return numeroRodas;
    }
}
