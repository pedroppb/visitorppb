package visitorppb;

public interface Visitor {

    String exibirCarro(VeiculoCarro carro);
    String exibirMoto(VeiculoMoto moto);
    String exibirPatineteEletrico(VeiculoPatineteEletrico patineteEletrico);

}