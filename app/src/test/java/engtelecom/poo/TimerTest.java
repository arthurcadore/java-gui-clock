package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Draw;

public class TimerTest {

  @Test
  public void TimerTest() {

    Draw tela = new Draw();
    double[] posicao = new double[] { 200, 300 };

    // Verifica se o timer foi criado corretamente.
    Timer testeTimer = new Timer(tela, posicao, 30, "BLUE", "WHITE");

    assertEquals("WHITE", testeTimer.getSwitchedOffColor());
    assertEquals("BLUE", testeTimer.getSwitchedOnColor());
    assertEquals(30, testeTimer.getTimerSize());
    assertEquals(posicao, testeTimer.getTimerPosition());

    // verifica tamanho incorreto no timer size

    Timer testeTimer4 = new Timer(tela, posicao, 3100, "BLUE", "WHITE");
    assertEquals(40, testeTimer4.getTimerSize());
    Timer testeTimer5 = new Timer(tela, posicao, 3, "BLUE", "WHITE");
    assertEquals(40, testeTimer5.getTimerSize());

  }

  @Test
  public void incrementerTest() {

    Draw tela = new Draw();
    double[] posicao = new double[] { 200, 300 };

    int[] valorInicial = new int[] { 0, 0, 0, 0, 0, 0 };
    int[] valorIncrementado = new int[] { 0, 0, 0, 0, 0, 1 };

    // verifica se o timer incrementa corretamente.
    Timer testeTimer = new Timer(tela, posicao, 30, "BLUE", "WHITE");
    assertEquals(valorInicial[5], testeTimer.getAtualTimerTime()[5]);
    assertEquals(valorInicial[4], testeTimer.getAtualTimerTime()[4]);
    assertEquals(valorInicial[3], testeTimer.getAtualTimerTime()[3]);
    assertEquals(valorInicial[2], testeTimer.getAtualTimerTime()[2]);
    assertEquals(valorInicial[1], testeTimer.getAtualTimerTime()[1]);
    assertEquals(valorInicial[0], testeTimer.getAtualTimerTime()[0]);

    testeTimer.incrementer();
    assertEquals(valorIncrementado[5], testeTimer.getAtualTimerTime()[5]);
    assertEquals(valorIncrementado[4], testeTimer.getAtualTimerTime()[4]);
    assertEquals(valorIncrementado[3], testeTimer.getAtualTimerTime()[3]);
    assertEquals(valorIncrementado[2], testeTimer.getAtualTimerTime()[2]);
    assertEquals(valorIncrementado[1], testeTimer.getAtualTimerTime()[1]);
    assertEquals(valorIncrementado[0], testeTimer.getAtualTimerTime()[0]);

  }

}
