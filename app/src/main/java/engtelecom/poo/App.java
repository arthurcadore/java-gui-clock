package engtelecom.poo;

import java.util.ArrayList;
import edu.princeton.cs.algs4.*;

public class App {

    // Define as constantes que serão utilizadas para a criação da tela e
    // atualização.
    private static final int RELOAD_TIME = 1000;
    private static final int SCREEN_X_LENGHT = 800;
    private static final int SCREEN_Y_LENGHT = 800;

    // atributos utilizados para armazenar a tela de desenho e seus componentes
    private Draw screen;
    private ArrayList<RegressiveCounter> counters;
    private ArrayList<Timer> timers;

    // cria uma nova instância da classe App, onde a tela e objetos são definidos
    // através das constantes utilizadas.
    public App() {
        this.screen = new Draw();
        this.screen.setXscale(0, SCREEN_X_LENGHT);
        this.screen.setYscale(0, SCREEN_Y_LENGHT);
        this.screen.enableDoubleBuffering();
        this.timers = new ArrayList<>();
        this.counters = new ArrayList<>();

    }

    // Método para adicionar um novo cronometro a tela.
    public void printTimer(double[] position, int Size, String ONcolor, String OFFcolor)
            throws Exception {

        Timer newTimer = new Timer(this.screen, position, Size, ONcolor, OFFcolor);
        this.timers.add(newTimer);

    }

    // Método para adicionar um novo contador regressivo a tela.
    public void printCounter(double[] position, int Size, int[] initialTime, String ONcolor, String OFFcolor)
            throws Exception {

        RegressiveCounter newCounter = new RegressiveCounter(this.screen, position, Size, initialTime, ONcolor,
                OFFcolor);
        this.counters.add(newCounter);

    }

    // metodo para atualizar os componentes da tela.
    public void screenUpdate(App app) {
        for (Timer i : this.timers) {
            i.incrementer();
            i.timerPrinter();
        }

        for (RegressiveCounter j : this.counters) {
            j.decrementer();
            j.counterPrinter();
        }
        app.drawPrinter();
    }

    // metodo para impressão dos componentes atualizados.
    public void drawPrinter() {
        this.screen.show();
    }

    // metodo para limpar a tela de desenho.
    public void drawClean() {
        this.screen.clear();
    }

    public static void main(String[] args) throws Exception {

        // instância um novo objeto da classe App.
        App app = new App();

        // define dois vetores de inteiro para ser utilizados pela classe
        // RegressiveCounter
        int[] initalTime_counter1 = { 9, 9, 9, 9, 9, 9 };
        int[] initalTime_counter2 = { 0, 0, 0, 0, 0, 0 };

        // define posições de desenho para dois contadores e dois cronometros.
        double[] position1 = { 30, 50 };
        double[] position2 = { 300, 150 };
        double[] position3 = { 80, 300 };
        double[] position4 = { 30, 500 };

        // adiciona dois cronometros a tela;
        app.printTimer(position1, 20, "BLACK", "GRAY");
        app.printTimer(position2, 40, "RED", "WHITE");

        // adiciona dois contadores regressivos a tela;
        app.printCounter(position3, 60, initalTime_counter1, "BLACK", "YELLOW");
        app.printCounter(position4, 80, initalTime_counter2, "GREEN", "WHITE");

        // Entra em laço de repetição para atualizar a tela.
        while (true) {
            app.screenUpdate(app);
            app.drawPrinter();
            Thread.sleep(RELOAD_TIME);
            app.drawClean();
        }
    }
}