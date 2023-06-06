package visitorppb;

public class VeiculoCarro extends Veiculo{
    private String placa;
    public VeiculoCarro(String marca, String modelo, String tipoCombustivel, String ano,int aro,int numeroRodas,String placa) {
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
        return visitor.exibirCarro(this);
    }

    public String getInfoVeiculo(){
        return "Carro: "+marca+" "+modelo+
                "\nPlaca: "+placa+
                "\nAno: "+ano+
                "\nCombustivel: "+tipoCombustivel;
    }
}
