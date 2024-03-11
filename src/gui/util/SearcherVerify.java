package gui.util;

import java.io.File;

public class SearcherVerify {
	
	public static boolean verifyPrograms(String folderName) {
		File path = new File("C:\\Program Files\\");
		File[] foldersPrograms = path.listFiles(File::isDirectory);
		boolean resultProgram = false;
		try {
			for( File folderProgram : foldersPrograms ) {
				if( folderProgram.getName() == folderName ) {
					resultProgram = true;
				}
			}
			return resultProgram;
		}catch(NullPointerException e) {
			e.getMessage();
			return resultProgram;
		}
		
	}
	
	public static boolean verifyPrograms86(String folderName86) {		
		File path86 = new File("C:\\Program Files (x86)");
		File[] foldersPrograms86 = path86.listFiles(File::isDirectory);
		boolean resultProgram86 = false;
		try {
			for( File folderProgram86 : foldersPrograms86 ) {
				if( folderProgram86.getName().equals(folderName86) ) {
					resultProgram86 = true;
				}
			}
			resultProgram86 = true;
		}catch(NullPointerException e) {
			e.getMessage();
		}
		return resultProgram86;
	}
}
