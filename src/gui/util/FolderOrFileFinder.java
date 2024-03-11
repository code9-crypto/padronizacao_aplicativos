package gui.util;

import java.io.File;

public class FolderOrFileFinder {

	public static String searchFolder(String firstFolderName, String correctFolder) {
		// Encontrando o outro diretório e atrelando numa variável para depois ser usada
		// no encontro do arquivo
		File path = new File(firstFolderName);
		File[] folders = path.listFiles(File::isDirectory);
		String folderName = null;
		for (File folder : folders) {
			if( folder.getName().equals(correctFolder) ) {
				folderName = folder.getName();
			}
			
		}
		return folderName;
	}

	public static String searchFile(String firstFolderName, String lastFolderName) {
		// Foi instanciado outro caminho, mas agora com o diretório que foi encontrado
		// acima, para assim encontrar o arquivo
		File restPath = new File(firstFolderName + "\\" + lastFolderName);
		File[] files = restPath.listFiles(File::isFile);
		String fileName = null;
		for (File file : files) {
			if( !file.getName().equals("uninstall.bat") ) {
				fileName = file.getName();
			}
		}
		return fileName;
	}

}