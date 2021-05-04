package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		String ville = null;
		String codeD = null;
		int nbpop = 0 ;
		
		Path path = Paths.get("C:/Users/dimit/OneDrive/Bureau/bordel/projet/recensement.csv");
		Path pathDestination = Paths.get("C:/Users/dimit/OneDrive/Bureau/bordel/projet/recensement2.csv");
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		ArrayList<String> outLines = new ArrayList<>(); 
		
		for (int i = 1; i <= lines.size() - 1; i++) {
			String line = lines.get(i);
			String[] morceau = line.split(";");
			String morceauDeChoixVraiment = morceau[9].trim().replaceAll(" ", "");
			int morceauDeChoix = Integer.parseInt(morceauDeChoixVraiment);
			//System.out.println(line);
			if (morceauDeChoix > 25000) {
				ville = morceau[6];
				codeD = morceau[2];
				nbpop = morceauDeChoix;
				outLines.add(ville+';'+codeD+';'+nbpop);
			}

		} 
		System.out.println(outLines);
		Files.copy(path, pathDestination, StandardCopyOption.REPLACE_EXISTING);
		Files.write(pathDestination,outLines);
	}

	

}
