package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

/**
 * Classe que representa um contador regressivo (seis digitos), seus
 * atributos, construtor, e métodos.
 */
public class RegressiveCounter {

  /**
   * Constantes utilizadas para definir o tamanho máximo, minimo e padrão de
   * tamanho do contador.
   */
  private static final int MAX_COUNTER_SIZE = 100;
  private static final int MIN_COUNTER_SIZE = 20;
  private static final int DEFAULT_COUNTER_SIZE = 40;

  /**
   * Atributos correspondents a classe RegressiveCounter.
   */
  private Draw screen;
  private double[] counterPosition;
  private int counterSize;
  private int[] atualCounterTime;
  private String switchedOnColor;
  private String switchedOffColor;

  /**
   * Cria uma nova instância da classe RegressiveCounter.
   * 
   * @param screen           Região de desenho utilizada para imprimir o
   *                         contador.
   * 
   * @param counterPosition  Coordenadas (x, y) utilizadas para posicionar o
   *                         objeto na tela
   * 
   * @param counterSize      Fator de multiplicação do tamanho do contador,
   *                         utilizado para variar seu tamanho, o fator passado
   *                         deve ser entre 20 e 100, caso seja maior ou menor,
   *                         será utilizado o valor 40 por padrão.
   * 
   * @param atualCounterTime Valor incial utilizado pelo contador para iniciar a
   *                         contagem (decremento), o valor passado deve ser um
   *                         vetor de inteiros onde as 6 posições correspondem
   *                         respecitivamente á: hora (dezena) maximo 9, hora
   *                         (unidade) maximo 9, minuto (dezena) maximo 5, minuto
   *                         (unidade) maximo 9, segundo (dezena) maximo 5,
   *                         segundo (unidade) maximo 9.
   * 
   *                         Caso os valores passados estejam acima do máximo, o
   *                         valor máximo será atribuido.
   * 
   * @param SwitchedOnColor  String correspondente a cor do segmento aceso que
   *                         será impresso.
   * @param SwitchedOffColor String correspondente a cor do segmento apagado que
   *                         será impresso.
   */

  public RegressiveCounter(Draw screen, double[] counterPosition, int counterSize, int[] atualCounterTime,
      String SwitchedOnColor, String SwitchedOffColor) {

    this.screen = screen;
    this.counterPosition = counterPosition;
    this.counterSize = counterSize;
    this.atualCounterTime = atualCounterTime;
    this.switchedOnColor = SwitchedOnColor;
    this.switchedOffColor = SwitchedOffColor;

    if (counterSize > MAX_COUNTER_SIZE || counterSize < MIN_COUNTER_SIZE) {
      this.counterSize = DEFAULT_COUNTER_SIZE;
    }

    if (this.atualCounterTime[5] > 9) {
      this.atualCounterTime[5] = 9;
    }
    if (this.atualCounterTime[4] > 5) {
      this.atualCounterTime[4] = 5;
    }
    if (this.atualCounterTime[3] > 9) {
      this.atualCounterTime[3] = 9;
    }
    if (this.atualCounterTime[2] > 5) {
      this.atualCounterTime[2] = 5;
    }
    if (this.atualCounterTime[1] > 9) {
      this.atualCounterTime[1] = 9;
    }
    if (this.atualCounterTime[0] > 9) {
      this.atualCounterTime[0] = 9;
    }
  }

  /**
   * Imprime o contador na tela a partir de seus aributos.
   * 
   * Metodo utilizado para atualizar o valor na tela após atualizar seu valor de
   * tempo.
   */

  public void counterPrinter() {

    double[] D0vet = this.counterPosition.clone();
    double[] D1vet = this.counterPosition.clone();
    double[] D2vet = this.counterPosition.clone();
    double[] D3vet = this.counterPosition.clone();
    double[] D4vet = this.counterPosition.clone();
    double[] D5vet = this.counterPosition.clone();

    double[] S1vet = this.counterPosition.clone();
    double[] S2vet = this.counterPosition.clone();

    D1vet[0] = D1vet[0] + (this.counterSize * 1.4);

    S1vet[0] = S1vet[0] + (this.counterSize * 2.9);
    S1vet[1] = S1vet[1] + (this.counterSize * 0.5);

    D2vet[0] = D2vet[0] + (this.counterSize * 3.4);
    D3vet[0] = D3vet[0] + (this.counterSize * 4.8);

    S2vet[0] = S2vet[0] + (this.counterSize * 6.3);
    S2vet[1] = S2vet[1] + (this.counterSize * 0.5);

    D4vet[0] = D4vet[0] + (this.counterSize * 6.8);
    D5vet[0] = D5vet[0] + (this.counterSize * 8.2);

    DisplayUnity D0 = new DisplayUnity(this.screen, D0vet, this.counterSize, this.switchedOnColor,
        this.switchedOffColor,
        atualCounterTime[0]);
    DisplayUnity D1 = new DisplayUnity(this.screen, D1vet, this.counterSize, this.switchedOnColor,
        this.switchedOffColor,
        atualCounterTime[1]);

    Spacer S1 = new Spacer(this.screen, S1vet, this.counterSize, this.switchedOnColor);

    DisplayUnity D2 = new DisplayUnity(this.screen, D2vet, this.counterSize, this.switchedOnColor,
        this.switchedOffColor,
        atualCounterTime[2]);
    DisplayUnity D3 = new DisplayUnity(this.screen, D3vet, this.counterSize, this.switchedOnColor,
        this.switchedOffColor,
        atualCounterTime[3]);

    Spacer S2 = new Spacer(this.screen, S2vet, this.counterSize, this.switchedOnColor);

    DisplayUnity D4 = new DisplayUnity(this.screen, D4vet, this.counterSize, this.switchedOnColor,
        this.switchedOffColor,
        atualCounterTime[4]);
    DisplayUnity D5 = new DisplayUnity(this.screen, D5vet, this.counterSize, this.switchedOnColor,
        this.switchedOffColor,
        atualCounterTime[5]);

  }

  /*
   * Metodo decrementador do contador, ao executa-lo, o valor do contador será
   * decrementado em uma unidade.
   */

  public int[] decrementer() {

    if (this.atualCounterTime[5] > 0) {
      this.atualCounterTime[5]--;
      return this.atualCounterTime;
    }

    if (this.atualCounterTime[4] > 0) {
      this.atualCounterTime[5] = 9;
      this.atualCounterTime[4]--;
      return this.atualCounterTime;

    }

    if (this.atualCounterTime[3] > 0) {
      this.atualCounterTime[5] = 9;
      this.atualCounterTime[4] = 5;
      this.atualCounterTime[3]--;
      return this.atualCounterTime;
    }

    if (this.atualCounterTime[2] > 0) {
      this.atualCounterTime[5] = 9;
      this.atualCounterTime[4] = 5;
      this.atualCounterTime[3] = 9;
      this.atualCounterTime[2]--;
      return this.atualCounterTime;
    }

    if (this.atualCounterTime[1] > 0) {
      this.atualCounterTime[5] = 9;
      this.atualCounterTime[4] = 5;
      this.atualCounterTime[3] = 9;
      this.atualCounterTime[2] = 5;
      this.atualCounterTime[1]--;
      return this.atualCounterTime;
    }

    if (this.atualCounterTime[0] > 0) {
      this.atualCounterTime[5] = 9;
      this.atualCounterTime[4] = 5;
      this.atualCounterTime[3] = 9;
      this.atualCounterTime[2] = 5;
      this.atualCounterTime[1] = 9;
      this.atualCounterTime[0]--;
      return this.atualCounterTime;
    }

    if (this.atualCounterTime[0] == 0 && this.atualCounterTime[1] == 0 && this.atualCounterTime[2] == 0
        && this.atualCounterTime[3] == 0 && this.atualCounterTime[4] == 0 && this.atualCounterTime[5] == 0) {
      this.atualCounterTime[5] = 9;
      this.atualCounterTime[4] = 5;
      this.atualCounterTime[3] = 9;
      this.atualCounterTime[2] = 5;
      this.atualCounterTime[1] = 9;
      this.atualCounterTime[0] = 9;
      return this.atualCounterTime;
    }

    return this.atualCounterTime;

  }

  public double[] getCounterPosition() {
    return counterPosition;
  }

  public int getCounterSize() {
    return counterSize;
  }

  public int[] getAtualCounterTime() {
    return atualCounterTime;
  }

  public String getSwitchedOnColor() {
    return switchedOnColor;
  }

  public String getSwitchedOffColor() {
    return switchedOffColor;
  }

}
