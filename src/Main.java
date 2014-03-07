import java.io.File;
import java.io.IOException;

import com.leff.midi.MidiFile;

public class Main
{
    public static void main(String[] args)
    {
        MidiFile mf = null;
        File input = new File("example.mid");

        try
        {
            mf = new MidiFile(input);
            mf.dumpToConsole();
        }
        catch(IOException e)
        {
            System.err.println("Error parsing MIDI file:");
            e.printStackTrace();
            return;
        }
    }
}
