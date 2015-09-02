import java.util.ArrayList;

public class OncogeneDetector {

	public OncogeneDetector() {
		// TODO Auto-generated constructor stub
	}

	public boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequences, String sequence) {
		double healthySequenceTotal = healthySequences.size();
		double cancerSequenceTotal = cancerSequences.size();
		double healthySequenceCount = 0;
		double cancerSequenceCount = 0;
		
		for (String healthySequence : healthySequences) {

			if (healthySequence.contains(sequence)) {
				healthySequenceCount = healthySequenceCount + 1;
			}
		}
		
		for (String cancerSequence : cancerSequences) {
			if (cancerSequence.contains(sequence)) {
				cancerSequenceCount = cancerSequenceCount + 1;
			}
		}

		System.out.println("hTotal: " + healthySequenceTotal);
		System.out.println("cTotal: " + cancerSequenceTotal);
		System.out.println("hCount: " + healthySequenceCount);
		System.out.println("cCount: " + cancerSequenceCount);
		
		if (healthySequenceCount/healthySequenceTotal > cancerSequenceCount/cancerSequenceTotal) {
			return false;
		} else {
			return true;
		}
	}
}
