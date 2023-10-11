package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Draw;

public class SpacerTest {

  @Test
  public void SpacerTest() {

    Draw tela = new Draw();
    double[] posicao = new double[] { 200, 300 };

    // verifica se o display foi criado corretamente;
    Spacer teste = new Spacer(tela, posicao, 30, "BLACK");

    assertEquals(posicao, teste.getSpacerPosition());
    assertEquals(30, teste.getSpacerSize());

  }

}
