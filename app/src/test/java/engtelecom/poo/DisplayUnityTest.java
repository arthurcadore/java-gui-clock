package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Draw;

public class DisplayUnityTest {

  @Test
  public void DisplayUnityTest() {

    Draw tela = new Draw();
    double[] posicao = new double[] { 200, 300 };

    // verifica se o display foi criado corretamente;
    DisplayUnity testeDisplay = new DisplayUnity(tela, posicao, 30, "BLACK", "WHITE", 9);

    assertEquals(posicao, testeDisplay.getDisplayPosition());
    assertEquals(30, testeDisplay.getDisplaySize());

  }

}
