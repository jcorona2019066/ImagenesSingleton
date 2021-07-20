package org.jairocorona.clases;

import javax.swing.JFrame;
import org.jairocorona.sistema.FRM_Programador;

public class ProgramadorSingleton {
    
    private static JFrame me;
    
    private ProgramadorSingleton(){        
    }
    
    public static JFrame getInstance(){
        if(me == null)
            me = new FRM_Programador();
        
        return me;
    }
            
    
}
