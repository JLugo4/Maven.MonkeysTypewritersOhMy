package io.zipcoder;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {

    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {
        //StringBuilder s = new StringBuilder();
        while(stringIterator.hasNext()){
            copied += stringIterator.next() + " ";
            //s.append(stringIterator.next()).append(" ");
        }
       // copied = s.toString();
        //System.out.println(copied);
    }
}
