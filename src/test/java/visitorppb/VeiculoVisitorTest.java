package visitorppb;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoVisitorTest {
    @Test
    void deveExibirCarro() {
        VeiculoCarro carro = new VeiculoCarro("Fiat", "Uno", "Flex", "2015", 13,4,"asd-1511");

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("carro{Fiat Uno\n" +
                "Placa: asd-1511\n" +
                "Ano: 2015\n" +
                "Combustivel: Flex\n" +
                "4 rodas aro 13}", visitor.exibir(carro));
    }

    @Test
    void deveExibirMoto() {
        VeiculoMoto moto = new VeiculoMoto("Honda", "XRE 190", "Gasolina", "2015",19,2, "hed-1570");

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("moto{Honda XRE 190\n" +
                "Placa: hed-1570\n" +
                "Ano: 2015\n" +
                "Combustivel: Gasolina\n" +
                "2 rodas aro 19}", visitor.exibir(moto));
    }

    @Test
    void deveExibirPatineteEletrico() {
        VeiculoPatineteEletrico patineteEletrico = new VeiculoPatineteEletrico("foston", "s09 pro", "Eletrico", "2022",8,2);

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("patineteEletrico{foston s09 pro\n" +
                "Ano: 2022\n" +
                "Combustivel: Eletrico\n" +
                "2 rodas aro 8}", visitor.exibir(patineteEletrico));
    }
}
