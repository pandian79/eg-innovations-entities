package org.grassfield.eg.validation;

public class ValidationUtilities {

    public static boolean checkForError(String s){
        if (s==null)
            throw new RuntimeException("NULL VALUE");
        if (s.startsWith(" "))
            throw new RuntimeException("STARTING SPACE");
        if (s.endsWith(" "))
            throw new RuntimeException("TRAILING SPACE");
        if (s.indexOf(" ")!=-1)
            throw new RuntimeException("SPACE FOUND");
        if (s.indexOf("-")!=-1)
            throw new RuntimeException("HIPHEN FOUND");
        return true;
    }
}