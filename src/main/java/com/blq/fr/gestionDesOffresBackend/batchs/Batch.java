package com.blq.fr.gestionDesOffresBackend.batchs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Batch {
	
	ProcessBuilder pb = null;

	
	public Batch(String cheminFichier) {
		
        pb = new ProcessBuilder( cheminFichier );
        
        try {
            Process p = pb.start();
            StringBuilder str = new StringBuilder();
            InputStreamReader isr = new InputStreamReader(p.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            String line;
            
            while ((line = br.readLine()) != null) {
                str.append(line + "\n");
            }
            
            int code = p.waitFor();
            
            if (code == 0) {
                System.out.println(str);
                System.exit(0);
            } 
            
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

	
}
