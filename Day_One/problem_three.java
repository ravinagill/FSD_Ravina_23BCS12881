class DNASequencer {

    StringBuilder dna = new StringBuilder(100000);

    public void ingestSequence(char[] sensorData) {

        for (char c : sensorData) {
            dna.append(c);
        }
    }

    public void mutateDNA(String target, String replacement) {

        int index = dna.indexOf(target);

        if (index != -1) {
            dna.replace(index, index + target.length(), replacement);
        }
    }

    public String getDNA() {
        return dna.toString();
    }
}

public class problem_three {
    public static void main(String[] args) {

        DNASequencer d = new DNASequencer();

        d.ingestSequence(new char[] {'A','C','T','G'});

        d.mutateDNA("CT", "GG");

        System.out.println(d.getDNA());
    }
}