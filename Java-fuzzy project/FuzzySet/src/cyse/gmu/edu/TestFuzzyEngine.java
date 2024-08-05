package cyse.gmu.edu;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.*;

/**
 * Test parsing an FCL file
 * @author pcingola@users.sourceforge.net
 */
public class TestFuzzyEngine {
    public static void main(String[] args) throws Exception {
        // Load from 'FCL' file
        String fileName = "..//solution/final.fcl";
        FIS fis = FIS.load(fileName,true);

        // Error while loading?
        if( fis == null ) { 
            System.err.println("Can't load file: '" + fileName + "'");
            return;
        }

        // Show 
        JFuzzyChart.get().chart(fis.getFunctionBlock("final"));

        // Set inputs
        fis.setVariable("threat_exploitation", 7);
        fis.setVariable("failure_logins_attempt", 100);
        fis.setVariable("cpu_load", 80);
        fis.setVariable("memory_load", 90);
        fis.setVariable("interface_io", 80);
       
        // Evaluate
        fis.evaluate();
        
        // Show output variable's chart
        Variable per = fis.getFunctionBlock("final").getVariable("node_resilience");
        JFuzzyChart.get().chart(per, per.getDefuzzifier(), true);

        // Print ruleSet
        System.out.println(fis);
        
 
    }
}