package chap11;
import javax.sound.midi.*;

public class MusicTest1 {
    public void play() {

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Мы получили синтезатор ");
        } catch (MidiUnavailableException ex) {
            System.out.println("Неудача");
        }
    } //Закрываем play

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    } //Закрываем main
}   //Закрываем class
