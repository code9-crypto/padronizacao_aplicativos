package gui;

import java.io.File;
import java.io.IOException;
import java.rmi.server.UnicastRemoteObject;

import gui.util.Alerts;
import gui.util.FolderOrFileFinder;
import gui.util.SearcherVerify;
import javafx.fxml.FXML;
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

	@FXML
	private Button btInstallAdobeShockWave;

	@FXML
	private Button btInstallGoogleChrome;

	@FXML
	private Button btInstallClienteOCS;

	@FXML
	private Button btInstallFreePDF;

	@FXML
	private Button btInstallHpScanTwain;

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

	@FXML
	private Button btUninstallAdobeShockWave;

	@FXML
	private Button btUninstallGoogleChrome;

	@FXML
	private Button btUninstallClienteOCS;

	@FXML
	private Button btUninstallFreePDF;

	@FXML
	private Button btUninstallHpScanTwain;

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

	@FXML
	private Button btUpdateAdobeShockWave;

	@FXML
	private Button btUpdateGoogleChrome;

	@FXML
	private Button btUpdateClienteOCS;

	@FXML
	private Button btUpdateFreePDF;

	@FXML
	private Button btUpdateHpScanTwain;

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

	@FXML
	private void onBtInstallAdobeShockWaveAction() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\adobe_shockwave";
		String correctPath = "adobe_shockwave_player_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctPath);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);

		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\adobe_shockwave\\" + folderName + "\\" + fileName);
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	private void onBtInstallGoogleChromeAction() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\chrome";
		String correctPath = "google_chrome_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctPath);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);

		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime()
					.exec("cmd.exe /c start C:\\apps_para_padronizacao_V3\\chrome\\" + folderName + "\\" + fileName);
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	private void onBtInstallClienteOCSAction() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\cliente_ocs";
		String correctPath = "cliente_ocs_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctPath);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);

		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\cliente_ocs\\" + folderName + "\\" + fileName);
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	private void onBtInstallFreePDFAction() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\freepdf";
		String correctPath = "freepdf_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctPath);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);

		try {
			Runtime.getRuntime()
					.exec("cmd.exe /c start C:\\apps_para_padronizacao_V3\\freepdf\\" + folderName + "\\gs907w64.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Este código será fará um pequeno delay de 12 segundos, para depois executar a
		// próxima instalação
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime()
					.exec("cmd.exe /c start C:\\apps_para_padronizacao_V3\\freepdf\\" + folderName + "\\" + fileName);
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}

	}

	@FXML
	private void onBtInstallHpScanTwainAction() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\hp_scan_twain";
		String correctPath = "hp_scan_twain_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctPath);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);

		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\hp_scan_twain\\" + folderName + "\\" + fileName);
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
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\adobe_reader\\adobe_reader_padrao_atualizado\\uninstall.bat");
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

	public void onBtUninstallAdobeShockWavePlayer() {
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\adobe_shockwave\\adobe_shockwave_player_padrao_atualizado\\uninstall.bat");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
		}

	}

	public void onBtUninstallGoogleChrome() {
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\chrome\\google_chrome_padrao_atualizado\\uninstall.bat");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
		}

	}

	public void onBtUninstallClienteOCS() {
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\cliente_ocs\\cliente_ocs_padrao_atualizado\\uninstall.bat");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
		}

	}

	public void onBtUninstallFreePDF() {
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\freepdf\\freepdf_padrao_atualizado\\uninstall.bat");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
		}

	}

	public void onBtUninstallHPScanTwain() {
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\hp_scan_twain\\hp_scan_twain_padrao_atualizado\\uninstall.bat");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
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
				Alerts.showAlert("Erro na atualização", null, "Houve um erro na atualização: " + e.getMessage(),
						AlertType.ERROR);
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
							+ String.valueOf(maior) + "\\" + remoteFileServerUpdated
							+ " C:\\apps_para_padronizacao_V3\\adobe_flashplayer\\adobe_flashplayer_plugin_padrao_atualizado");
			Alerts.showAlert("Sucesso na atualização", null, "Atualização realizada com sucesso",
					AlertType.INFORMATION);
		} catch (IOException e) {
			Alerts.showAlert("Erro na atualização", null, "Houve um erro na atualização: " + e.getMessage(),
					AlertType.ERROR);
		}
	}

	public void onBtUpdateAdobeReader() {
		// Pegando o arquivo da pasta local
		String strLocalPath = "C:\\apps_para_padronizacao_V3\\adobe_reader\\adobe_reader_dc_padrao_atualizado";
		File folderLocal = new File(strLocalPath);
		File[] filesLocal = folderLocal.listFiles(File::isFile);
		String fileName = "";
		for (File fileLocal : filesLocal) {
			int indBat = fileLocal.getName().lastIndexOf("bat");
			if (indBat != 10) {
				fileName = fileLocal.getName();
			}
		}

		// Pegando o arquivo da pasta remota
		String strRemotePath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\escritorio\\adobe_reader\\adobe_reader_dc\\adobe_reader_dc-v19.010";
		File folderRemote = new File(strRemotePath);
		File[] filesRemote = folderRemote.listFiles(File::isFile);
		String remoteFileName = "";
		for (File fileRemote : filesRemote) {
			remoteFileName = fileRemote.getName();
		}

		// Verificando se são iguais, caso seja, não precisa atualizar, caso não, será
		// atualizado
		if (fileName.equals(remoteFileName)) {
			Alerts.showAlert("Informação", null, "Este arquivo já está atualizado", AlertType.WARNING);
		} else {
			try {
				Runtime.getRuntime().exec(
						"cmd.exe /c del C:\\apps_para_padronizacao_V3\\adobe_reader\\adobe_reader_dc_padrao_atualizado\\"
								+ fileName);
				Runtime.getRuntime().exec(
						"cmd.exe /c copy /Y \\\\dados\\seplan\\detic_coengi_seserc__softwares\\escritorio\\adobe_reader\\adobe_reader_dc\\adobe_reader_dc-v19.010\\"
								+ remoteFileName
								+ " C:\\apps_para_padronizacao_V3\\adobe_reader\\adobe_reader_dc_padrao_atualizado");
				Alerts.showAlert("Sucesso na atualização", null, "Atualização realizada com sucesso",
						AlertType.INFORMATION);
			} catch (IOException e) {
				Alerts.showAlert("Erro na atualização", null, "Houve um erro na atualização: " + e.getMessage(),
						AlertType.ERROR);
			}
		}
	}

	public void onBtUpdateAtualizacaoAdobeReader() {
		// Pegando a versão e nome do arquivo da pasta local
		String strLocalPath = "C:\\apps_para_padronizacao_V3\\adobe_reader\\adobe_reader_padrao_atualizado";
		File folderLocal = new File(strLocalPath);
		File[] filesLocal = folderLocal.listFiles(File::isFile);
		String fileName = "";
		int versaoLocal = 0;
		int indPri = 0;
		int indSec = 0;
		for (File fileLocal : filesLocal) {
			int indBat = fileLocal.getName().lastIndexOf("bat");
			if (indBat != 10) {
				fileName = fileLocal.getName();
				indPri = fileName.indexOf("r") + 1;
				indSec = fileName.indexOf("_");
				versaoLocal = Integer.parseInt(fileName.substring(indPri, indSec));
			}
		}

		// Pegando a versão mais atualizada da pasta do reposótorio
		String strRemoteFolder = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\escritorio\\adobe_reader";
		File remoteFolder = new File(strRemoteFolder);
		File[] remoteFolders = remoteFolder.listFiles(File::isDirectory);
		int indFolSer = 0;
		double indFolSerVer = 0.0;
		double maiorVersao = 0.0;
		for (File remote : remoteFolders) {
			indFolSer = remote.getName().indexOf("-");
			if (indFolSer == 12) {
				indFolSerVer = Double.parseDouble(remote.getName().substring(indFolSer + 2));
			}

			if (indFolSerVer > maiorVersao) {
				maiorVersao = indFolSerVer;
			}
		}

		// Pegando a versão e nome mais atualizado do arquivo na pasta do repositório
		String strRemotePath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\escritorio\\adobe_reader\\adobe_reader-v"
				+ maiorVersao;
		File folderRemote = new File(strRemotePath);
		File[] filesRemote = folderRemote.listFiles(File::isFile);
		String fileServerName = "";
		int versaoServer = 0;
		int indPriSer = 0;
		int indSecSer = 0;
		for (File fileServer : filesRemote) {
			int indBat = fileServer.getName().lastIndexOf("bat");
			if (indBat != 10) {
				fileServerName = fileServer.getName();
				indPriSer = fileName.indexOf("r") + 1;
				indSecSer = fileName.indexOf("_");
				versaoServer = Integer.parseInt(fileServerName.substring(indPriSer, indSecSer));
			}
		}

		if (versaoLocal == versaoServer) {
			Alerts.showAlert("Informação", null, "Este arquivo já está atualizado", AlertType.WARNING);
		} else {
			try {
				Runtime.getRuntime().exec(
						"cmd.exe /c del C:\\apps_para_padronizacao_V3\\adobe_reader\\adobe_reader_padrao_atualizado\\"
								+ fileName);
				Runtime.getRuntime().exec(
						"cmd.exe /c copy /Y \\\\dados\\seplan\\detic_coengi_seserc__softwares\\escritorio\\adobe_reader\\adobe_reader-v"
								+ maiorVersao + fileServerName
								+ " C:\\apps_para_padronizacao_V3\\adobe_reader\\adobe_reader_padrao_atualizado");
				Alerts.showAlert("Sucesso na atualização", null, "Atualização realizada com sucesso",
						AlertType.INFORMATION);
			} catch (IOException e) {
				Alerts.showAlert("Erro na atualização", null, "Houve um erro na atualização: " + e.getMessage(),
						AlertType.ERROR);
			}
		}
	}

	public void onBtUpdateAdobeShockWavePlayer() {
		// Pegando o arquivo da pasta local
		String strLocalPath = "C:\\apps_para_padronizacao_V3\\adobe_shockwave\\adobe_shockwave_player_padrao_atualizado";
		File folderLocal = new File(strLocalPath);
		File[] filesLocal = folderLocal.listFiles(File::isFile);
		String fileLocalName = "";
		for (File fileLocal : filesLocal) {
			int indBat = fileLocal.getName().lastIndexOf("bat");
			if (indBat != 10) {
				fileLocalName = fileLocal.getName();
			}
		}

		// Encontrando o nome da pasta remota(servidor)
		String strRemPath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\plugins_e_complementos\\adobe_shockwave";
		File remotePath = new File(strRemPath);
		File[] remoteFolders = remotePath.listFiles(File::isDirectory);
		String remoteFolder = "";
		for (File remoteFolderServer : remoteFolders) {
			if (remoteFolderServer.getName().indexOf("adobe_shockwave_player") == -1) {
				remoteFolder = null;
			} else {
				remoteFolder = remoteFolderServer.getName();
			}
		}

		// Pegando o arquivo da pasta remota
		String strRemotePath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\plugins_e_complementos\\adobe_shockwave\\"
				+ remoteFolder;
		File folderRemote = new File(strRemotePath);
		File[] filesRemote = folderRemote.listFiles(File::isFile);
		String remoteFileName = "";
		for (File fileRemote : filesRemote) {
			remoteFileName = fileRemote.getName();
		}

		// Verificando se o arquivo local é igual ao arquivo remoto
		// Caso seja, então arquivo já atualizado, caso não, será atualizado pelo do
		// remoto
		if (fileLocalName.equals(remoteFileName)) {
			Alerts.showAlert("Informação", null, "Este arquivo já está atualizado", AlertType.WARNING);
		} else {
			try {
				Runtime.getRuntime().exec(
						"cmd.exe /c del C:\\apps_para_padronizacao_V3\\adobe_shockwave\\adobe_shockwave_player_padrao_atualizado\\"
								+ fileLocalName);
				Runtime.getRuntime().exec(
						"cmd.exe /c copy /Y \\\\dados\\seplan\\detic_coengi_seserc__softwares\\plugins_e_complementos\\adobe_shockwave\\"
								+ remoteFolder + "\\" + remoteFileName
								+ " C:\\apps_para_padronizacao_V3\\adobe_shockwave\\adobe_shockwave_player_padrao_atualizado");
				Alerts.showAlert("Sucesso na atualização", null, "Atualização realizada com sucesso",
						AlertType.INFORMATION);
			} catch (IOException e) {
				Alerts.showAlert("Erro na atualização", null, "Houve um erro na atualização: " + e.getMessage(),
						AlertType.ERROR);
			}
		}
	}

	public void onBtUpdateGoogleChrome() {
		// Pegando o arquivo da pasta local
		String strLocalPath = "C:\\apps_para_padronizacao_V3\\chrome\\google_chrome_padrao_atualizado";
		File folderLocal = new File(strLocalPath);
		File[] filesLocal = folderLocal.listFiles(File::isFile);
		String fileLocalName = "";
		for (File fileLocal : filesLocal) {
			int indBat = fileLocal.getName().lastIndexOf("bat");
			if (indBat != 10 && !fileLocal.getName().equals("remove-aviso.exe")) {
				fileLocalName = fileLocal.getName();
			}
		}

		// Encontrando o nome mais atualizado da pasta remota(servidor)
		String strRemPath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\navegadores\\google_chrome";
		File remotePath = new File(strRemPath);
		File[] remoteFolders = remotePath.listFiles(File::isDirectory);
		String remoteFolder = "";
		int maior = 0;
		for (File remoteFolderServer : remoteFolders) {
			int versao = Integer
					.parseInt(remoteFolderServer.getName().substring(15, remoteFolderServer.getName().indexOf(".")));
			int bits = Integer.parseInt(remoteFolderServer.getName().substring(
					remoteFolderServer.getName().lastIndexOf("-") + 1, remoteFolderServer.getName().lastIndexOf("b")));
			if (versao > maior && bits == 64) {
				maior = versao;
				remoteFolder = remoteFolderServer.getName();
			}
		}

		// Pegando o arquivo da pasta remota
		String strRemotePath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\navegadores\\google_chrome\\"
				+ remoteFolder;
		File folderRemote = new File(strRemotePath);
		File[] filesRemote = folderRemote.listFiles(File::isFile);
		String remoteFileName = "";
		for (File fileRemote : filesRemote) {
			if (!fileRemote.getName().equals("remove-aviso.exe")) {
				remoteFileName = fileRemote.getName();
			}
		}

		// Verificando se o arquivo local é igual ao arquivo remoto
		// Caso seja, então arquivo já atualizado, caso não, será atualizado pelo do
		// remoto
		if (fileLocalName.equals(remoteFileName)) {
			Alerts.showAlert("Informação", null, "Este arquivo já está atualizado", AlertType.WARNING);
		} else {
			try {
				Runtime.getRuntime()
						.exec("cmd.exe /c del C:\\apps_para_padronizacao_V3\\chrome\\google_chrome_padrao_atualizado\\"
								+ fileLocalName);
				Runtime.getRuntime().exec(
						"cmd.exe /c copy /Y \\\\dados\\seplan\\detic_coengi_seserc__softwares\\navegadores\\google_chrome\\"
								+ remoteFolder + "\\" + remoteFileName
								+ " C:\\apps_para_padronizacao_V3\\chrome\\google_chrome_padrao_atualizado");
				Alerts.showAlert("Sucesso na atualização", null, "Atualização realizada com sucesso",
						AlertType.INFORMATION);
			} catch (IOException e) {
				Alerts.showAlert("Erro na atualização", null, "Houve um erro na atualização: " + e.getMessage(),
						AlertType.ERROR);
			}
		}
	}

	public void onBtUpdateClienteOCS() {
		// Pegando o arquivo da pasta local
		String strLocalPath = "C:\\apps_para_padronizacao_V3\\cliente_ocs\\cliente_ocs_padrao_atualizado";
		File folderLocal = new File(strLocalPath);
		File[] filesLocal = folderLocal.listFiles(File::isFile);
		String fileLocalName = "";
		for (File fileLocal : filesLocal) {
			int indBat = fileLocal.getName().lastIndexOf("bat");
			if (indBat != 10) {
				fileLocalName = fileLocal.getName();
			}
		}

		// Encontrando o nome mais atualizado da pasta remota(servidor)
		String strRemPath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\inventario\\cliente_ocs";
		File remotePath = new File(strRemPath);
		File[] remoteFolders = remotePath.listFiles(File::isDirectory);
		String remoteFolder = "";
		double maior = 0.0;
		double indVersao = 0.0;
		for (File remoteFolderServer : remoteFolders) {
			// Recortando o nome da pasta para pegar apenas a versão para verificar depois
			// qual é a mais atualizada
			indVersao = Double.parseDouble(remoteFolderServer.getName().substring(
					remoteFolderServer.getName().indexOf("v") + 1, remoteFolderServer.getName().indexOf("v") + 4));

			if (indVersao > maior) {
				maior = indVersao;
				remoteFolder = remoteFolderServer.getName();
			}
		}

		// Pegando o arquivo da pasta remota
		String strRemotePath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\inventario\\cliente_ocs\\"
				+ remoteFolder;
		File folderRemote = new File(strRemotePath);
		File[] filesRemote = folderRemote.listFiles(File::isFile);
		String remoteFileName = "";
		for (File fileRemote : filesRemote) {
			remoteFileName = fileRemote.getName();
		}

		// Verificando se o arquivo local é igual ao arquivo remoto
		// Caso seja, então arquivo já atualizado, caso não, será atualizado pelo do
		// remoto
		if (fileLocalName.equals(remoteFileName)) {
			Alerts.showAlert("Informação", null, "Este arquivo já está atualizado", AlertType.WARNING);
		} else {
			try {
				Runtime.getRuntime().exec(
						"cmd.exe /c del C:\\apps_para_padronizacao_V3\\cliente_ocs\\cliente_ocs_padrao_atualizado\\"
								+ fileLocalName);
				Runtime.getRuntime().exec(
						"cmd.exe /c copy /Y \\\\dados\\seplan\\detic_coengi_seserc__softwares\\inventario\\cliente_ocs\\"
								+ remoteFolder + "\\" + remoteFileName
								+ " C:\\apps_para_padronizacao_V3\\cliente_ocs\\cliente_ocs_padrao_atualizado");
				Alerts.showAlert("Sucesso na atualização", null, "Atualização realizada com sucesso",
						AlertType.INFORMATION);
			} catch (IOException e) {
				Alerts.showAlert("Erro na atualização", null, "Houve um erro na atualização: " + e.getMessage(),
						AlertType.ERROR);
			}
		}
	}

	public void onBtUpdateFreePDF() {
		// Pegando o arquivo da pasta local
		String strLocalPath = "C:\\apps_para_padronizacao_V3\\freepdf\\freepdf_padrao_atualizado";
		File folderLocal = new File(strLocalPath);
		File[] filesLocal = folderLocal.listFiles(File::isFile);
		String fileLocalName = "";
		for (File fileLocal : filesLocal) {
			int indBat = fileLocal.getName().lastIndexOf("bat");
			if (indBat != 10 && !fileLocal.getName().equals("uninstall.bat") && !fileLocal.getName().equals("setup.exe")
					&& !fileLocal.getName().equals("gs907w64.exe") && !fileLocal.getName().equals("gs907w32.exe")) {
				fileLocalName = fileLocal.getName();
			}
		}

		// Encontrando o nome mais atualizado da pasta remota(servidor)
		String strRemPath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\escritorio\\freepdf";
		File remotePath = new File(strRemPath);
		File[] remoteFolders = remotePath.listFiles(File::isDirectory);
		String remoteFolder = "";
		double maior = 0.0;
		double indVersao = 0.0;
		for (File remoteFolderServer : remoteFolders) {
			// Recortando o nome da pasta para pegar apenas a versão para verificar depois
			// qual é a mais atualizada
			indVersao = Double
					.parseDouble(remoteFolderServer.getName().substring(remoteFolderServer.getName().indexOf("v") + 1));
			if (indVersao > maior) {
				maior = indVersao;
				remoteFolder = remoteFolderServer.getName();
			}
		}

		// Pegando o arquivo da pasta remota
		String strRemotePath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\escritorio\\freepdf\\"
				+ remoteFolder;
		File folderRemote = new File(strRemotePath);
		File[] filesRemote = folderRemote.listFiles(File::isFile);
		String remoteFileName = "";
		for (File fileRemote : filesRemote) {
			if (!fileRemote.getName().equals("setup.exe") && !fileRemote.getName().equals("gs907w64.exe")
					&& !fileRemote.getName().equals("gs907w32.exe")) {
				remoteFileName = fileRemote.getName();
			}
		}

		// Verificando se o arquivo local é igual ao arquivo remoto
		// Caso seja, então arquivo já atualizado, caso não, será atualizado pelo do
		// remoto
		if (fileLocalName.equals(remoteFileName)) {
			Alerts.showAlert("Informação", null, "Este arquivo já está atualizado", AlertType.WARNING);
		} else {
			try {
				Runtime.getRuntime()
						.exec("cmd.exe /c del C:\\apps_para_padronizacao_V3\\freepdf\\freepdf_padrao_atualizado\\"
								+ fileLocalName);
				Runtime.getRuntime().exec(
						"cmd.exe /c copy /Y \\\\dados\\seplan\\detic_coengi_seserc__softwares\\escritorio\\freepdf\\"
								+ remoteFolder + "\\" + remoteFileName
								+ " C:\\apps_para_padronizacao_V3\\freepdf\\freepdf_padrao_atualizado");
				Alerts.showAlert("Sucesso na atualização", null, "Atualização realizada com sucesso",
						AlertType.INFORMATION);
			} catch (IOException e) {
				Alerts.showAlert("Erro na atualização", null, "Houve um erro na atualização: " + e.getMessage(),
						AlertType.ERROR);
			}
		}
	}

	public void onBtUpdateHPScanTwain() {
		// Pegando o arquivo da pasta local
		String strLocalPath = "C:\\apps_para_padronizacao_V3\\hp_scan_twain\\hp_scan_twain_padrao_atualizado";
		File folderLocal = new File(strLocalPath);
		File[] filesLocal = folderLocal.listFiles(File::isFile);
		String fileLocalName = "";
		for (File fileLocal : filesLocal) {
			int indBat = fileLocal.getName().lastIndexOf("bat");
			if (indBat != 10 && !fileLocal.getName().equals("uninstall.bat")) {
				fileLocalName = fileLocal.getName();
			}
		}

		// Encontrando o nome mais atualizado da pasta remota(servidor)
		String strRemPath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\impressao\\hp_scan_twain";
		File remotePath = new File(strRemPath);
		File[] remoteFolders = remotePath.listFiles(File::isDirectory);
		String remoteFolder = "";
		int priMaior = 0;
		int secMaior = 0;
		int terMaior = 0;
		for (File remoteFolderServer : remoteFolders) {
			// Recortando o nome da pasta para pegar apenas a versão para verificar depois
			// qual é a mais atualizada
			int priInd = Integer.parseInt(remoteFolderServer.getName().substring(
					(remoteFolderServer.getName().indexOf("v") + 1), remoteFolderServer.getName().indexOf(".")));
			int secInd = Integer.parseInt(remoteFolderServer.getName().substring(17, 18));
			int terInd = Integer.parseInt(remoteFolderServer.getName().substring(19));
			if (priInd > priMaior || secInd > secMaior || terInd > terMaior) {
				priMaior = priInd;
				secMaior = secInd;
				terMaior = terInd;
				remoteFolder = remoteFolderServer.getName();
			}
		}

		// Pegando o arquivo da pasta remota
		String strRemotePath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\impressao\\hp_scan_twain\\"
				+ remoteFolder;
		File folderRemote = new File(strRemotePath);
		File[] filesRemote = folderRemote.listFiles(File::isFile);
		String remoteFileName = "";
		for (File fileRemote : filesRemote) {
			remoteFileName = fileRemote.getName();
		}

		// Verificando se o arquivo local é igual ao arquivo remoto
		// Caso seja, então arquivo já atualizado, caso não, será atualizado pelo do
		// remoto
		if (fileLocalName.equals(remoteFileName)) {
			Alerts.showAlert("Informação", null, "Este arquivo já está atualizado", AlertType.WARNING);
		} else {
			try {
				Runtime.getRuntime()
						.exec("cmd.exe /c del C:\\apps_para_padronizacao_V3\\hp_scan_twain\\hp_scan_twain_padrao_atualizado\\"
								+ fileLocalName);
				Runtime.getRuntime().exec(
						"cmd.exe /c copy /Y \\\\dados\\seplan\\detic_coengi_seserc__softwares\\impressao\\hp_scan_twain\\"
								+ remoteFolder + "\\" + remoteFileName
								+ " C:\\apps_para_padronizacao_V3\\hp_scan_twain\\hp_scan_twain_padrao_atualizado");
				Alerts.showAlert("Sucesso na atualização", null, "Atualização realizada com sucesso",
						AlertType.INFORMATION);
			} catch (IOException e) {
				Alerts.showAlert("Erro na atualização", null, "Houve um erro na atualização: " + e.getMessage(),
						AlertType.ERROR);
			}
		}

	}
}
