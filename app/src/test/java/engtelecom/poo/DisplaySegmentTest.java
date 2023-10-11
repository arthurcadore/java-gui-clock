package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Draw;

public class DisplaySegmentTest {

  @Test
  public void DisplaySegmentTest() {

    Draw tela = new Draw();
    double[] posicao = new double[] { 200, 300 };

    // teste de criação de segmento correta;
    DisplaySegment testeDisplay = new DisplaySegment(tela, posicao, 40, "BLACK", false);

    assertEquals(40, testeDisplay.getSegmentSize());
    assertEquals("BLACK", testeDisplay.getSegmentColor());
    assertEquals(posicao, testeDisplay.getSegmentPositon());

    // verifica a cor utilizada na passagem de cor incorreta;
    DisplaySegment testeDisplay2 = new DisplaySegment(tela, posicao, 40, "asasd", false);
    assertEquals("BLACK", testeDisplay.getSegmentColor());

  }

}
