import java.util.*;
import cern.colt.matrix.ObjectFactory2D;
import cern.colt.matrix.ObjectMatrix2D;
import cern.colt.matrix.DoubleFactory2D;
import cern.colt.matrix.DoubleMatrix2D;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class AntSimulation {

    public AntSimulation(String arg){
        System.out.println("This is the ant simulation");
        System.out.println("This is a "+arg);
    }
   
    // Build CLI using jOptSimple library
    public OptionParser buildCLI() {
        System.out.println("Building the parser object");
        OptionParser parser = new OptionParser();
        parser.acceptsAll(Arrays.asList("h","?","help"),"show help message").forHelp();
        parser.accepts("max_ants").withRequiredArg().ofType(Integer.class).describedAs("The maximum number of ants in the simulation").defaultsTo(25);         
        parser.accepts("grid").withRequiredArg().ofType(Integer.class).describedAs("The dimensions of the square simulation grid").defaultsTo(100);   
        return parser;
    }
   
    public static void main(String []args) throws Exception {
        AntSimulation antsim = new AntSimulation("test");
        OptionParser parser = antsim.buildCLI();
        OptionSet options = parser.parse(args);
        
        if ( options.has("help") ) {
            parser.printHelpOn(System.out);
            System.exit(0);
        }

        System.out.println(options.valueOf("max_ants"));
        System.out.println(options.valueOf("grid"));
        
        // Make the grid for the simulation
        Integer size = (Integer) options.valueOf("grid");
        ObjectMatrix2D grid = ObjectFactory2D.dense.make(size,size);
        
        // Place the ant hill
    }   
}
