package baseball;

public class BaseBallTeam {
    //フィールド
    private String name;
    private int win;
    private int lose;
    private int draw;
    //コンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
       this.name = name;
       this.win = win;
       this.lose =lose;
       this.draw= draw;

    }
    public void report() {

        System.out.println(this.name + "の2022年の成績は"+ this.win + "勝" + this.lose + "敗" + this.draw +"分、勝率は"+ getRate() + "です");
    }
    public double getRate() {
        return (double)this.win / ((double)this.win + (double)this.lose);
    }

}


