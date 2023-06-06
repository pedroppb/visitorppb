package visitorppb;

public class VeiculoMoto extends Veiculo{
    private String placa;
    public VeiculoMoto(String marca, String modelo, String tipoCombustivel, String ano,int aro,int numeroRodas,String placa) {
        super(marca, modelo, tipoCombustivel, ano,aro,numeroRodas);
        this.placa=placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String aceitar(Visitor visitor) {
        return visitor.exibirMoto(this);
    }
    public String getInfoVeiculo(){
        return "Moto: "+marca+" "+modelo+
                "\nPlaca: "+placa+
                "\nAno: "+ano+
                "\nCombustivel: "+tipoCombustivel;
    }
}
