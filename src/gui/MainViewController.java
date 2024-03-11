package gui;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.FolderOrFileFinder;
import gui.util.SearcherVerify;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class MainViewController {

	// Botões para instalar
	@FXML
	private Button btInstall7zip;

	@FXML
	private Button btInstallAdobeApi;

	@FXML
	private Button btInstallAdobePlugin;

	@FXML
	private Button btInstallAdobeReader;

	@FXML
	private Button btInstallAtualizacaoAdobeReader;

	// Botões para desinstalar
	@FXML
	private Button btUninstall7zip;

	@FXML
	private Button btUninstallAdobeApi;

	@FXML
	private Button btUninstallAdobePlugin;

	@FXML
	private Button btUninstallAdobeReader;

	@FXML
	private Button btUninstallAtualizacaoAdobeReader;

	// Botões para atualizar o programa
	@FXML
	private Button btUpdate7zip;

	@FXML
	private Button btUpdateAdobeApi;

	@FXML
	private Button btUpdateAdobePlugin;

	@FXML
	private Button btUpdateAdobeReader;

	@FXML
	private Button btUpdateAtualizacaoAdobeReader;

	/*
	 * -----------------------------------------------------------------------------
	 * ------------------------------------------
	 */

	// AÇÃO DOS BOTÕES

	// MÉTODOS QUE FARÃO A INSTALAÇÃO DOS PROGRAMAS
	@FXML
	private void onBtInstall7zipAction() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\7zip";
		String correctFolder = "7zip_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctFolder);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);
		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime()
					.exec("cmd.exe /c start C:\\apps_para_padronizacao_V3\\7zip\\" + folderName + "\\" + fileName);
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}

	}

	@FXML
	private void onBtInstallAdobeApiAction() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\adobe_flashplayer";
		String correctFolder = "adobe_flashplayer_ppapi_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctFolder);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);
		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime().exec("cmd.exe /c start C:\\apps_para_padronizacao_V3\\adobe_flashplayer\\" + folderName
					+ "\\" + fileName);
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}

	}

	@FXML
	private void onBtInstallAdobePluginAction() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\adobe_flashplayer";
		String correctFolder = "adobe_flashplayer_plugin_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctFolder);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);

		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime().exec("cmd.exe /c start C:\\apps_para_padronizacao_V3\\adobe_flashplayer\\" + folderName
					+ "\\" + fileName);
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	private void onBtInstallAdobeReaderAction() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\adobe_reader";
		String correctFolder = "adobe_reader_dc_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctFolder);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);

		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\adobe_reader\\" + folderName + "\\" + fileName);
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	private void onBtInstallAtualizacaoAdobeReaderAction() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\adobe_reader";
		String correctPath = "adobe_reader_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctPath);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);

		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\adobe_reader\\" + folderName + "\\" + fileName);
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}
	}

	// MÉTODOS QUE FARÃO A DESINSTALAÇÃO DOS PROGRAMAS
	public void onBtUninstall7zip() {
		String folderName = "7-Zip";
		boolean resultProgram = SearcherVerify.verifyPrograms(folderName);
		boolean resultProgram86 = SearcherVerify.verifyPrograms86(folderName);
		if (resultProgram == false || resultProgram86 == false) {
			this.onBtInstall7zipAction();
		} else {
			Alerts.showAlert("Erro na desinstalação", null, "Este programa não está instalado", AlertType.ERROR);
		}
	}

	public void onBtUninstallAdobeApi() {
		String folderName = "Adobe";
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\adobe_flashplayer\\adobe_flashplayer_ppapi_padrao_atualizado\\uninstall.bat");
		} catch (IOException e) {
			boolean resultProgram = SearcherVerify.verifyPrograms(folderName);
			boolean resultProgram86 = SearcherVerify.verifyPrograms86(folderName);
			if (resultProgram == true || resultProgram86 == true) {
				this.onBtInstall7zipAction();
			} else {
				Alerts.showAlert("Erro na desinstalação", null, "Este programa não está instalado", AlertType.ERROR);
			}
		}
	}

	public void onBtUninstallAdobePlugin() {
		String folderName = "Adobe";
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\adobe_flashplayer\\adobe_flashplayer_plugin_padrao_atualizado\\uninstall.bat");
		} catch (IOException e) {
			boolean resultProgram = SearcherVerify.verifyPrograms(folderName);
			boolean resultProgram86 = SearcherVerify.verifyPrograms86(folderName);
			if (resultProgram == true || resultProgram86 == true) {
				this.onBtInstall7zipAction();
			} else {
				Alerts.showAlert("Erro na desinstalação", null, "Este programa não está instalado", AlertType.ERROR);
			}
		}
	}

	public void onBtUninstallAdobeReader() {
		String folderName = "Adobe";
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\adobe_reader\\adobe_reader_dc_padrao_atualizado\\uninstall.bat");
		} catch (IOException e) {
			boolean resultProgram = SearcherVerify.verifyPrograms(folderName);
			boolean resultProgram86 = SearcherVerify.verifyPrograms86(folderName);
			if (resultProgram == true || resultProgram86 == true) {
				this.onBtInstall7zipAction();
			} else {
				Alerts.showAlert("Erro na desinstalação", null, "Este programa não está instalado", AlertType.ERROR);
			}
		}
	}

	public void onBtUninstallAtualizacaoAdobeReader() {
		String folderName = "Adobe";
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\adobe_reader\\adobe_reader_padrao_atualizado\\atualizacao\\uninstall.bat");
		} catch (IOException e) {
			boolean resultProgram = SearcherVerify.verifyPrograms(folderName);
			boolean resultProgram86 = SearcherVerify.verifyPrograms86(folderName);
			if (resultProgram == true || resultProgram86 == true) {
				this.onBtInstall7zipAction();
			} else {
				Alerts.showAlert("Erro na desinstalação", null, "Este programa não está instalado", AlertType.ERROR);
			}
		}
	}

	// MÉTODOS QUE FARÁ A ATUALIZAÇÃO DO APLICATIVO
	public void onBtUpdate7zip() {
		// Encontrando nome do arquivo na pasta local
		String strPath = "C:\\apps_para_padronizacao_V3\\7zip\\7zip_padrao_atualizado";
		File path = new File(strPath);
		File[] files = path.listFiles(File::isFile);
		String fileName = "";
		for (File file : files) {
			int indBat = file.getName().lastIndexOf("bat");
			if (indBat != 10) {
				fileName = file.getName();
			}
		}

		// Encontrando o nome da pasta remota(servidor)
		String strRemPath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\compactadores\\7zip";
		File remotePath = new File(strRemPath);
		File[] remoteFolders = remotePath.listFiles(File::isDirectory);
		String remoteFolder = "";
		int maiorVersionFolder = 0;
		int maiorBits = 0;
		int firstV = 0;
		int firstDot = 0;
		int lastTrace = 0;
		int firstUnderscore = 0;
		for (File remoteFolderServer : remoteFolders) {
			firstV = remoteFolderServer.getName().indexOf("v") + 1;
			firstDot = remoteFolderServer.getName().indexOf(".");
			lastTrace = remoteFolderServer.getName().lastIndexOf("-") + 1;
			firstUnderscore = remoteFolderServer.getName().indexOf("_");
			if (Integer.parseInt(remoteFolderServer.getName().substring(firstV, firstDot)) > maiorVersionFolder
					&& Integer
							.parseInt(remoteFolderServer.getName().substring(lastTrace, firstUnderscore)) > maiorBits) {
				maiorVersionFolder = Integer.parseInt(remoteFolderServer.getName().substring(firstV, firstDot));
				maiorBits = Integer.parseInt(remoteFolderServer.getName().substring(lastTrace, firstUnderscore));
				remoteFolder = remoteFolderServer.getName();
			}
		}

		// Encontrando o nome do arquivo na pasta remota(servidor)
		String strPathRemoteFile = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\compactadores\\7zip\\"
				+ remoteFolder;
		File pathRemoteFile = new File(strPathRemoteFile);
		File[] remoteFiles = pathRemoteFile.listFiles(File::isFile);
		String remoteFileServer = "";
		for (File remoteFile : remoteFiles) {
			remoteFileServer = remoteFile.getName();
		}

		// Verificando se o arquivo local é igual ao do servidor
		// Caso seja, então o arquivo já está atualizado
		// Caso não, então será atualizado pelo arquivo do servidor
		if (fileName.equals(remoteFileServer)) {
			Alerts.showAlert("Informação", null, "Este arquivo já está atualizado", AlertType.WARNING);
		} else {
			try {
				// Excluindo o arquivo antigo da pasta local
				Runtime.getRuntime().exec(
						"cmd.exe /c del C:\\apps_para_padronizacao_V3\\7zip\\7zip_padrao_atualizado\\" + fileName);

				// Adicionando o arquivo atualizado na pasta local
				Runtime.getRuntime().exec(
						"cmd.exe /c copy /Y \\\\dados\\seplan\\detic_coengi_seserc__softwares\\compactadores\\7zip\\"
								+ remoteFolder + "\\" + remoteFileServer
								+ " C:\\apps_para_padronizacao_V3\\7zip\\7zip_padrao_atualizado");
				Alerts.showAlert("Sucesso na atualização", null, "Arquivo atualizado com sucesso",
						AlertType.INFORMATION);
			} catch (IOException e) {
				Alerts.showAlert("Erro na atualização", null,
						"Houve um erro na atualização: " + e.getMessage(), AlertType.ERROR);
			}
		}

	}

	public void onBtUpdateAdobeApi() {
		// Encontrando nome do arquivo na pasta local
		String strPath = "C:\\apps_para_padronizacao_V3\\adobe_flashplayer\\adobe_flashplayer_ppapi_padrao_atualizado";
		File path = new File(strPath);
		File[] files = path.listFiles(File::isFile);
		String fileName = "";
		for (File file : files) {
			int indBat = file.getName().lastIndexOf("bat");
			if (indBat != 10) {
				fileName = file.getName();
			}
		}

		// Encontrando o nome da pasta remota(servidor)
		String strRemPath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\plugins_e_complementos\\adobe_flashplayer";
		File remotePath = new File(strRemPath);
		File[] remoteFolders = remotePath.listFiles(File::isDirectory);
		String remoteFolder = "";
		for (File remoteFolderServer : remoteFolders) {
			if (remoteFolderServer.getName().indexOf("adobe_flashplayer_ppapi") == -1) {
				remoteFolder = null;
			} else {
				remoteFolder = remoteFolderServer.getName();
			}
		}

		// Verificando se a variável remoteFolder é igual a null
		if (remoteFolder == null) {
			Alerts.showAlert("Informação", null,
					"Não foi possível atualizar, pois não há versões superiores disponívels", AlertType.WARNING);
		} else {
			Alerts.showAlert("Informação", null, "Há versões superiores disponívels", AlertType.WARNING);
		}

	}

	public void onBtUpdateAdobePlugin() {
		// Encontrando nome do arquivo na pasta local
		String strPath = "C:\\apps_para_padronizacao_V3\\adobe_flashplayer\\adobe_flashplayer_plugin_padrao_atualizado";
		File path = new File(strPath);
		File[] files = path.listFiles(File::isFile);
		String fileName = "";
		for (File file : files) {
			int indBat = file.getName().lastIndexOf("bat");
			if (indBat != 10) {
				fileName = file.getName();
			}
		}

		// Encontrando o nome da pasta remota(servidor)
		String strRemPath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\plugins_e_complementos\\adobe_flashplayer";
		File remotePath = new File(strRemPath);
		File[] remoteFolders = remotePath.listFiles(File::isDirectory);
		String remoteFolder = "";
		int maior = 0;
		int indUltPonto = 0;
		for (File remoteFolderServer : remoteFolders) {
			if (remoteFolderServer.getName().indexOf("adobe_flashplayer_plugin") == -1) {
				remoteFolder = null;
			} else {
				remoteFolder = remoteFolderServer.getName();
			}

			// Encontrando a pasta da maior versão da aplicação
			if (remoteFolder != null) {
				indUltPonto = Integer.parseInt(remoteFolder.substring(remoteFolder.lastIndexOf(".") + 1));
				if (indUltPonto > maior) {
					maior = indUltPonto;
				}
			}
		}

		// Pegando o arquivo mais atualizado da pasta em questão
		String strRemotePathUpdated = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\plugins_e_complementos\\adobe_flashplayer\\adobe_flashplayer_plugin-v32.0.0."
				+ String.valueOf(maior);
		File remotePathUpdated = new File(strRemotePathUpdated);
		File[] remoteFilesServer = remotePathUpdated.listFiles(File::isFile);
		String remoteFileServerUpdated = "";
		for (File remoteFileServer : remoteFilesServer) {
			remoteFileServerUpdated = remoteFileServer.getName();
		}
		
		// Deletando o arquivo local e copiando o mais atual do repositório para local
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c del C:\\apps_para_padronizacao_V3\\adobe_flashplayer\\adobe_flashplayer_plugin_padrao_atualizado\\"
							+ fileName);
			Runtime.getRuntime().exec(
					"cmd.exe /c copy /Y \\\\dados\\seplan\\detic_coengi_seserc__softwares\\plugins_e_complementos\\adobe_flashplayer\\adobe_flashplayer_plugin-v32.0.0."
							+ String.valueOf(maior) + " C:\\apps_para_padronizacao_V3\\adobe_flashplayer\\adobe_flashplayer_plugin_padrao_atualizado");
			Alerts.showAlert("Sucesso na atualização", null, "Atualização realizada com sucesso",
					AlertType.INFORMATION);
		} catch (IOException e) {
			Alerts.showAlert("Erro na atualização", null,
					"Houve um erro na atualização: " + e.getMessage(), AlertType.ERROR);
		}
	}
	
	public void onBtUpdateAdobeReader(){
		//Pegando o arquivo da pasta local
		String strLocalPath = "C:\\apps_para_padronizacao_V3\\adobe_reader\\adobe_reader_dc_padrao_atualizado";
		File folderLocal = new File(strLocalPath);
		File[] filesLocal = folderLocal.listFiles(File::isFile);
		String fileName = "";
		for( File fileLocal : filesLocal ) {
			int indBat = fileLocal.getName().lastIndexOf("bat");
			if( indBat != 10 ) {
				fileName = fileLocal.getName();
			}
		}
		
		//Pegando o arquivo da pasta remota
		String strRemotePath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\escritorio\\adobe_reader\\adobe_reader_dc\\adobe_reader_dc-v19.010";
		File folderRemote = new File(strRemotePath);
		File[] filesRemote = folderRemote.listFiles(File::isFile);
		String remoteFileName = "";
		for( File fileRemote : filesRemote ) {
			remoteFileName = fileRemote.getName();
		}
		
		//Verificando se são iguais, caso seja, não precisa atualizar, caso não, será atualizado
		if( fileName.equals(remoteFileName) ) {
			Alerts.showAlert("Informação", null, "Este arquivo já está atualizado", AlertType.WARNING);
		}else {
			try {
				Runtime.getRuntime().exec("cmd.exe /c del C:\\apps_para_padronizacao_V3\\adobe_reader\\adobe_reader_dc_padrao_atualizado\\"+fileName);
				Runtime.getRuntime().exec("cmd.exe /c /Y copy \\\\dados\\seplan\\detic_coengi_seserc__softwares\\escritorio\\adobe_reader\\adobe_reader_dc\\adobe_reader_dc-v19.010\\"+remoteFileName + 
						" C:\\apps_para_padronizacao_V3\\adobe_reader\\adobe_reader_dc_padrao_atualizado\\");
			}catch(IOException e) {
				Alerts.showAlert("Erro na atualização", null,
						"Houve um erro na atualização: " + e.getMessage(), AlertType.ERROR);
			}
		}
	}
}
