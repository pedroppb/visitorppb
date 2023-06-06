package visitorppb;

public class VeiculoPatineteEletrico extends Veiculo{
    public VeiculoPatineteEletrico(String marca, String modelo, String tipoCombustivel, String ano,int aro,int numeroRodas) {
        super(marca, modelo, tipoCombustivel, ano, aro, numeroRodas);
    }
    public String getInfoVeiculo(){
        return "PatineteEletrico: "+marca+" "+modelo+"\nAno: "+ano+"\nCombustivel: "+tipoCombustivel;
    }
    public String aceitar(Visitor visitor) {
        return visitor.exibirPatineteEletrico(this);
    }
}
