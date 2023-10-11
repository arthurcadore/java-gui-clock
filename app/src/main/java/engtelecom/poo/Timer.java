package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

/**
 * Classe que representa um cronometro (seis digitos), seus
 * atributos, construtor, e métodos.
 */
public class Timer {

  /**
   * Constantes utilizadas para definir o tamanho máximo, minimo e padrão de
   * tamanho do cronometro.
   */
  private static final int MAX_TIMER_SIZE = 100;
  private static final int MIN_TIMER_SIZE = 20;
  private static final int DEFAULT_TIMER_SIZE = 40;

  /**
   * Atributos correspondents a classe Timer.
   */

  private Draw screen;
  private double[] timerPosition;
  private int timerSize;
  private int[] atualTimerTime;
  private String switchedOnColor;
  private String switchedOffColor;

  /**
   * Cria uma nova instância da classe RegressiveCounter.
   * 
   * @param screen           Região de desenho utilizada para imprimir o
   *                         cronometro.
   * 
   * @param timerPosition    Coordenadas (x, y) utilizadas para posicionar o
   *                         objeto na tela
   * 
   * @param timerSize        Fator de multiplicação do tamanho do cronometro,
   *                         utilizado para variar seu tamanho, o fator passado
   *                         deve ser entre 20 e 100, caso seja maior ou menor,
   *                         será utilizado o valor 40 por padrão.
   * 
   * @param SwitchedOnColor  String correspondente a cor do segmento aceso que
   *                         será impresso.
   * @param SwitchedOffColor String correspondente a cor do segmento apagado que
   *                         será impresso.
   */

  public Timer(Draw screen, double[] timerPosition, int timerSize, String switchedOnColor,
      String switchedOffColor) {

    this.screen = screen;
    this.timerPosition = timerPosition;
    this.timerSize = timerSize;
    this.atualTimerTime = new int[] { 0, 0, 0, 0, 0, 0 };
    this.switchedOnColor = switchedOnColor;
    this.switchedOffColor = switchedOffColor;

    if (timerSize > MAX_TIMER_SIZE || timerSize < MIN_TIMER_SIZE) {
      this.timerSize = DEFAULT_TIMER_SIZE;
    }
  }

  /**
   * Imprime o cronometro na tela a partir de seus aributos.
   * 
   * Metodo utilizado para atualizar o valor na tela após atualizar seu valor de
   * tempo.
   */
  public void timerPrinter() {

    double[] D0vet = this.timerPosition.clone();
    double[] D1vet = this.timerPosition.clone();
    double[] D2vet = this.timerPosition.clone();
    double[] D3vet = this.timerPosition.clone();
    double[] D4vet = this.timerPosition.clone();
    double[] D5vet = this.timerPosition.clone();

    double[] S1vet = this.timerPosition.clone();
    double[] S2vet = this.timerPosition.clone();

    D1vet[0] = D1vet[0] + (this.timerSize * 1.4);

    S1vet[0] = S1vet[0] + (this.timerSize * 2.9);
    S1vet[1] = S1vet[1] + (this.timerSize * 0.5);

    D2vet[0] = D2vet[0] + (this.timerSize * 3.4);
    D3vet[0] = D3vet[0] + (this.timerSize * 4.8);

    S2vet[0] = S2vet[0] + (this.timerSize * 6.3);
    S2vet[1] = S2vet[1] + (this.timerSize * 0.5);

    D4vet[0] = D4vet[0] + (this.timerSize * 6.8);
    D5vet[0] = D5vet[0] + (this.timerSize * 8.2);

    DisplayUnity D0 = new DisplayUnity(this.screen, D0vet, this.timerSize, this.switchedOnColor, this.switchedOffColor,
        atualTimerTime[0]);
    DisplayUnity D1 = new DisplayUnity(this.screen, D1vet, this.timerSize, this.switchedOnColor, this.switchedOffColor,
        atualTimerTime[1]);

    Spacer S1 = new Spacer(this.screen, S1vet, this.timerSize, this.switchedOnColor);

    DisplayUnity D2 = new DisplayUnity(this.screen, D2vet, this.timerSize, this.switchedOnColor, this.switchedOffColor,
        atualTimerTime[2]);
    DisplayUnity D3 = new DisplayUnity(this.screen, D3vet, this.timerSize, this.switchedOnColor, this.switchedOffColor,
        atualTimerTime[3]);

    Spacer S2 = new Spacer(this.screen, S2vet, this.timerSize, this.switchedOnColor);

    DisplayUnity D4 = new DisplayUnity(this.screen, D4vet, this.timerSize, this.switchedOnColor, this.switchedOffColor,
        atualTimerTime[4]);
    DisplayUnity D5 = new DisplayUnity(this.screen, D5vet, this.timerSize, this.switchedOnColor, this.switchedOffColor,
        atualTimerTime[5]);

  }

  /*
   * Metodo incrementador do cronometro, ao executa-lo, o valor do cronometro será
   * incrementado em uma unidade.
   */

  public int[] incrementer() {

    if (this.atualTimerTime[5] < 9) {
      this.atualTimerTime[5]++;
      return this.atualTimerTime;
    }

    if (this.atualTimerTime[4] < 5) {
      this.atualTimerTime[5] = 0;
      this.atualTimerTime[4]++;
      return this.atualTimerTime;

    }

    if (this.atualTimerTime[3] < 9) {
      this.atualTimerTime[5] = 0;
      this.atualTimerTime[4] = 0;
      this.atualTimerTime[3]++;
      return this.atualTimerTime;
    }

    if (this.atualTimerTime[2] < 5) {
      this.atualTimerTime[5] = 0;
      this.atualTimerTime[4] = 0;
      this.atualTimerTime[3] = 0;
      this.atualTimerTime[2]++;
      return this.atualTimerTime;
    }

    if (this.atualTimerTime[1] < 9) {
      this.atualTimerTime[5] = 0;
      this.atualTimerTime[4] = 0;
      this.atualTimerTime[3] = 0;
      this.atualTimerTime[2] = 0;
      this.atualTimerTime[1]++;
      return this.atualTimerTime;
    }

    if (this.atualTimerTime[0] < 9) {
      this.atualTimerTime[5] = 0;
      this.atualTimerTime[4] = 0;
      this.atualTimerTime[3] = 0;
      this.atualTimerTime[2] = 0;
      this.atualTimerTime[1] = 0;
      this.atualTimerTime[0]++;
      return this.atualTimerTime;
    }

    if (this.atualTimerTime[0] == 9) {
      this.atualTimerTime[5] = 0;
      this.atualTimerTime[4] = 0;
      this.atualTimerTime[3] = 0;
      this.atualTimerTime[2] = 0;
      this.atualTimerTime[1] = 0;
      this.atualTimerTime[0] = 0;
      return this.atualTimerTime;
    }

    return this.atualTimerTime;

  }

  public double[] getTimerPosition() {
    return timerPosition;
  }

  public int getTimerSize() {
    return timerSize;
  }

  public int[] getAtualTimerTime() {
    return atualTimerTime;
  }

  public String getSwitchedOnColor() {
    return switchedOnColor;
  }

  public String getSwitchedOffColor() {
    return switchedOffColor;
  }

}
