package visitorppb;


public class VeiculoVisitor implements Visitor {

    public String exibir(VeiculoI veiculo) {
        return veiculo.aceitar(this);
    }

    @Override
    public String exibirCarro(VeiculoCarro carro) {
        return "carro{"+carro.getMarca()+" "+carro.getModelo()+
                "\nPlaca: "+carro.getPlaca()+
                "\nAno: "+carro.getAno()+
                "\nCombustivel: "+carro.getTipoCombustivel()+
                "\n"+carro.getNumeroRodas()+" rodas aro "+carro.getAro()+
                '}';
    }

    @Override
    public String exibirMoto(VeiculoMoto moto) {
        return "moto{"+moto.getMarca()+" "+moto.getModelo()+
                "\nPlaca: "+moto.getPlaca()+
                "\nAno: "+moto.getAno()+
                "\nCombustivel: "+moto.getTipoCombustivel()+
                "\n"+moto.getNumeroRodas()+" rodas aro "+moto.getAro()+
                '}';
    }

    @Override
    public String exibirPatineteEletrico(VeiculoPatineteEletrico patineteEletrico) {
        return "patineteEletrico{"+patineteEletrico.getMarca()+" "+patineteEletrico.getModelo()+
                "\nAno: "+patineteEletrico.getAno()+
                "\nCombustivel: "+patineteEletrico.getTipoCombustivel()+
                "\n"+patineteEletrico.getNumeroRodas()+" rodas aro "+patineteEletrico.getAro()+
                '}';
    }
}