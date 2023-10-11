package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Draw;

public class SpacerSegmentTest {

  @Test
  public void SpacerSegmentTest() {

    Draw tela = new Draw();
    double[] posicao = new double[] { 200, 300 };

    // teste de criação de segmento correta;
    SpacerSegment teste = new SpacerSegment(tela, posicao, 40, "BLACK");

    assertEquals(40, teste.getSegmentSize());
    assertEquals("BLACK", teste.getSegmentColor());
    assertEquals(posicao, teste.getSegmentPositon());

    // verifica a cor utilizada na passagem de cor incorreta;
    SpacerSegment teste2 = new SpacerSegment(tela, posicao, 40, "asasdas");
    assertEquals("BLACK", teste2.getSegmentColor());

  }

}
