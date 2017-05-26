package Easy;

/**
 * Created by Srikiran Sistla on 5/20/2017.
 * Frequency to Note
 */
public class FreqToNote {
    private String[] noteStrings = new String[] {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};

    private int midiFromPitch(float frequency ) {
        double noteNum = 12 * (Math.log( frequency / 440 )/Math.log(2) );
        return (int) (Math.round( noteNum ) + 69) % 12;
    }

    private String noteFromPitch(float frequency){
        double noteNum = 12 * (Math.log( frequency / 440 )/Math.log(2) );
        return noteStrings[(int) (Math.round( noteNum ) + 69) % 12];
    }

    private double frequencyFromNoteNumber(int note ) {
        return 440 * Math.pow(2,(note-69)/12);
    }

    private double centsOffFromPitch(double frequency, int note ) {
        return Math.floor( 1200 * Math.log( frequency / frequencyFromNoteNumber( note ))/Math.log(2) );
    }

    public static void main(String[] args) {
        FreqToNote freqToNote = new FreqToNote();
        System.out.println(freqToNote.midiFromPitch(440));
        double d = (double) -1/ (double) 4;
        System.out.println(d);
        System.out.println(Math.pow(2, d));
    }
}
