package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Draw;

public class RegressiveCounterTest {

  @Test
  public void RegressiveCounterTest() {

    Draw tela = new Draw();
    double[] posicao = new double[] { 200, 300 };

    int[] valorInicial = new int[] { 0, 0, 0, 0, 0, 1 };

    // Verifica se o contador foi criado corretamente.
    RegressiveCounter testeContador = new RegressiveCounter(tela, posicao, 40, valorInicial, "BLACK", "WHITE");

    assertEquals("WHITE", testeContador.getSwitchedOffColor());
    assertEquals("BLACK", testeContador.getSwitchedOnColor());
    assertEquals(40, testeContador.getCounterSize());
    assertEquals(posicao, testeContador.getCounterPosition());

    // verifica tamanho incorreto no contador size
    RegressiveCounter testeContador1 = new RegressiveCounter(tela, posicao, 4000, valorInicial, "BLACK", "WHITE");
    assertEquals(40, testeContador1.getCounterSize());
    // verifica tamanho incorreto no contador size
    RegressiveCounter testeContador2 = new RegressiveCounter(tela, posicao, 3, valorInicial, "BLACK", "WHITE");
    assertEquals(40, testeContador2.getCounterSize());

  }

  @Test
  public void decrementerTest() {

    Draw tela = new Draw();
    double[] posicao = new double[] { 200, 300 };

    int[] valorInicial = new int[] { 9, 9, 5, 9, 5, 9 };
    int[] valordecrementado = new int[] { 9, 9, 5, 9, 5, 8 };
    int[] valorMaximo = new int[] { 0, 0, 0, 0, 0, 0 };

    // verifica se o contador incrementa corretamente.
    RegressiveCounter testeContador = new RegressiveCounter(tela, posicao, 40, valorInicial, "BLACK", "WHITE");
    assertEquals(valorInicial[5], testeContador.getAtualCounterTime()[5]);
    assertEquals(valorInicial[4], testeContador.getAtualCounterTime()[4]);
    assertEquals(valorInicial[3], testeContador.getAtualCounterTime()[3]);
    assertEquals(valorInicial[2], testeContador.getAtualCounterTime()[2]);
    assertEquals(valorInicial[1], testeContador.getAtualCounterTime()[1]);
    assertEquals(valorInicial[0], testeContador.getAtualCounterTime()[0]);

    testeContador.decrementer();
    assertEquals(valordecrementado[5], testeContador.getAtualCounterTime()[5]);
    assertEquals(valordecrementado[4], testeContador.getAtualCounterTime()[4]);
    assertEquals(valordecrementado[3], testeContador.getAtualCounterTime()[3]);
    assertEquals(valordecrementado[2], testeContador.getAtualCounterTime()[2]);
    assertEquals(valordecrementado[1], testeContador.getAtualCounterTime()[1]);
    assertEquals(valordecrementado[0], testeContador.getAtualCounterTime()[0]);

    // verifica a transição do contador do valor minimo para o máximo;

    RegressiveCounter testeContador2 = new RegressiveCounter(tela, posicao, 40, valorMaximo, "BLACK", "WHITE");

    int[] valorTransicao = new int[] { 9, 9, 5, 9, 5, 9 };
    testeContador2.decrementer();
    assertEquals(valorTransicao[5], testeContador2.getAtualCounterTime()[5]);
    assertEquals(valorTransicao[4], testeContador2.getAtualCounterTime()[4]);
    assertEquals(valorTransicao[3], testeContador2.getAtualCounterTime()[3]);
    assertEquals(valorTransicao[2], testeContador2.getAtualCounterTime()[2]);
    assertEquals(valorTransicao[1], testeContador2.getAtualCounterTime()[1]);
    assertEquals(valorTransicao[0], testeContador2.getAtualCounterTime()[0]);
  }

}
