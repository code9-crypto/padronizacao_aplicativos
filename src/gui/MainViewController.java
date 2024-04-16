package gui;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.FolderOrFileFinder;
import gui.util.SearcherVerify;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainViewController {

	// Texto para formatação referente aos programas se estão instalados ou não
	@FXML
	private Label lblCheckPlano;

	@FXML
	private Label lblCheck7zip;

	@FXML
	private Label lblCheckAdobePPAPI;

	@FXML
	private Label lblCheckAdobePlugin;

	@FXML
	private Label lblCheckAdobeReader;

	@FXML
	private Label lblCheckAtualizacaoAdobeReader;

	@FXML
	private Label lblCheckAdobeShockwave;

	@FXML
	private Label lblCheckChrome;

	@FXML
	private Label lblCheckOCS;

	@FXML
	private Label lblCheckFreePDF;

	@FXML
	private Label lblCheckHPScan;

	@FXML
	private Label lblCheckIE;

	@FXML
	private Label lblCheckJavaRuntime;

	@FXML
	private Label lblCheckLibreOffice;

	@FXML
	private Label lblCheckLojaApp;

	@FXML
	private Label lblCheckMozilla;

	@FXML
	private Label lblCheckPDF24;

	@FXML
	private Label lblCheckSamsungEasyDocument;

	@FXML
	private Label lblCheckScanBack;

	@FXML
	private Label lblCheckSilverlight;

	@FXML
	private Label lblCheckTrendAntivirus;

	@FXML
	private Label lblCheckVNC;

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

	@FXML
	private Button btInstallInternetExplorer;

	@FXML
	private Button btInstallJavaRuntime;

	@FXML
	private Button btInstallLibreOffice;

	@FXML
	private Button btInstallLojaDeApp;

	@FXML
	private Button btInstallMozillaFireFox;

	@FXML
	private Button btInstallPDF24Creator;

	@FXML
	private Button btInstallSamsungEasyDocumentCreator;

	@FXML
	private Button btInstallScanBack;

	@FXML
	private Button btInstallSilverlight;

	@FXML
	private Button btInstallTrendAntivirus;

	@FXML
	private Button btInstallUltraVNC;

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

	@FXML
	private Button btUninstallInternetExplorer;

	@FXML
	private Button btUninstallJavaRuntime;

	@FXML
	private Button btUninstallLibreOffice;

	@FXML
	private Button btUninstallLojaDeApp;

	@FXML
	private Button btUninstallMozillaFireFox;

	@FXML
	private Button btUninstallPDF24Creator;

	@FXML
	private Button btUninstallSamsungEasyDocumentCreator;

	@FXML
	private Button btUninstallScanBack;

	@FXML
	private Button btUninstallSilverlight;

	@FXML
	private Button btUninstallTrendAntivirus;

	@FXML
	private Button btUninstallUltraVNC;

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

	@FXML
	private Button btUpdateInternetExplorer;

	@FXML
	private Button btUpdateJavaRuntime;

	@FXML
	private Button btUpdateLibreOffice;

	@FXML
	private Button btUpdateLojaDeApp;

	@FXML
	private Button btUpdateMozillaFireFox;

	@FXML
	private Button btUpdatePDF24Creator;

	@FXML
	private Button btUpdateSamsungEasyDocumentCreator;

	@FXML
	private Button btUpdateScanBack;

	@FXML
	private Button btUpdateSilverlight;

	@FXML
	private Button btUpdateTrendAntivirus;

	@FXML
	private Button btUpdateUltraVNC;

	@FXML
	private Button btnDefinirPlano;

	@FXML
	private void onBtDefinirPlanoDeFundo() {
		try {
			Runtime.getRuntime()
					.exec("cmd.exe /c start C:\\apps_para_padronizacao_V3\\plano_de_fundo\\definir_plano_de_fundo.bat");
			lblCheckPlano.setStyle("-fx-text-fill: green");
			lblCheckPlano.setText("OK");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

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
			lblCheck7zip.setStyle("-fx-text-fill: green");
			lblCheck7zip.setText("OK");
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
			lblCheckAdobePPAPI.setStyle("-fx-text-fill: green");
			lblCheckAdobePPAPI.setText("OK");
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
			lblCheckAdobePlugin.setStyle("-fx-text-fill: green");
			lblCheckAdobePlugin.setText("OK");
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
			lblCheckAdobeReader.setStyle("-fx-text-fill: green");
			lblCheckAdobeReader.setText("OK");
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
			lblCheckAtualizacaoAdobeReader.setStyle("-fx-text-fill: green");
			lblCheckAtualizacaoAdobeReader.setText("OK");
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
			lblCheckAdobeShockwave.setStyle("-fx-text-fill: green");
			lblCheckAdobeShockwave.setText("OK");
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
			lblCheckChrome.setStyle("-fx-text-fill: green");
			lblCheckChrome.setText("OK");
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
			lblCheckOCS.setStyle("-fx-text-fill: green");
			lblCheckOCS.setText("OK");
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
			lblCheckFreePDF.setStyle("-fx-text-fill: green");
			lblCheckFreePDF.setText("OK");
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
			lblCheckHPScan.setStyle("-fx-text-fill: green");
			lblCheckHPScan.setText("OK");
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	private void onBtInstallInternetExplorerAction() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\internet_explorer";
		String correctPath = "internet_explorer_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctPath);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);

		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime().exec("cmd.exe /c start C:\\apps_para_padronizacao_V3\\internet_explorer\\" + folderName
					+ "\\" + fileName);
			lblCheckIE.setStyle("-fx-text-fill: green");
			lblCheckIE.setText("OK");
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	private void onBtInstallJavaRuntimeAction() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\java_runtime";
		String correctPath = "java_runtime_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctPath);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);

		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\java_runtime\\" + folderName + "\\" + fileName);
			lblCheckJavaRuntime.setStyle("-fx-text-fill: green");
			lblCheckJavaRuntime.setText("OK");
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	private void onBtInstallLibreOfficeAction() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\libre_office";
		String correctPath = "libre_office_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctPath);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);

		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\libre_office\\" + folderName + "\\" + fileName);
			lblCheckLibreOffice.setStyle("-fx-text-fill: green");
			lblCheckLibreOffice.setText("OK");
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	private void onBtInstallLojaDeAppsAction() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\loja_de_app";
		String correctPath = "loja_de_apps_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctPath);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);

		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\loja_de_app\\" + folderName + "\\" + fileName);
			lblCheckLojaApp.setStyle("-fx-text-fill: green");
			lblCheckLojaApp.setText("OK");
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	private void onBtInstallMozillaFirefoxAction() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\mozilla_firefox";
		String correctPath = "mozilla_firefox_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctPath);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);

		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\mozilla_firefox\\" + folderName + "\\" + fileName);
			lblCheckMozilla.setStyle("-fx-text-fill: green");
			lblCheckMozilla.setText("OK");
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	private void onBtInstallPDF24Creator() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\pdf24_creator";
		String correctPath = "Pdf24Creator_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctPath);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);

		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\pdf24_creator\\" + folderName + "\\" + fileName);
			lblCheckPDF24.setStyle("-fx-text-fill: green");
			lblCheckPDF24.setText("OK");
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	private void onBtInstallSamsungEasyDocumentCreator() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\samsung_easy_document_creator";
		String correctPath = "easy_document_creator_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctPath);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);

		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime().exec("cmd.exe /c start C:\\apps_para_padronizacao_V3\\samsung_easy_document_creator\\"
					+ folderName + "\\" + fileName);
			lblCheckSamsungEasyDocument.setStyle("-fx-text-fill: green");
			lblCheckSamsungEasyDocument.setText("OK");
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	private void onBtInstallScanBack() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\scanback";
		String correctPath = "scanback_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctPath);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);

		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime()
					.exec("cmd.exe /c start C:\\apps_para_padronizacao_V3\\scanback\\" + folderName + "\\" + fileName);
			lblCheckScanBack.setStyle("-fx-text-fill: green");
			lblCheckScanBack.setText("OK");
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	private void onBtInstallSilverlight() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\silverlight";
		String correctPath = "silverlight_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctPath);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);

		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\silverlight\\" + folderName + "\\" + fileName);
			lblCheckSilverlight.setStyle("-fx-text-fill: green");
			lblCheckSilverlight.setText("OK");
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	private void onBtInstallTrenAntivirus() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\trend_antivirus_apex";
		String correctPath = "antivirus_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctPath);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);

		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime().exec("cmd.exe /c start C:\\apps_para_padronizacao_V3\\trend_antivirus_apex\\"
					+ folderName + "\\" + fileName);
			lblCheckTrendAntivirus.setStyle("-fx-text-fill: green");
			lblCheckTrendAntivirus.setText("OK");
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	private void onBtInstallUltraVNC() {
		// Iniciando com um valor padrão do caminho
		String strPath = "C:\\apps_para_padronizacao_V3\\ultravnc";
		String correctPath = "ultravnc_padrao_atualizado";
		String folderName = FolderOrFileFinder.searchFolder(strPath, correctPath);
		String fileName = FolderOrFileFinder.searchFile(strPath, folderName);

		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime()
					.exec("cmd.exe /c start C:\\apps_para_padronizacao_V3\\ultravnc\\" + folderName + "\\" + fileName);
			lblCheckVNC.setStyle("-fx-text-fill: green");
			lblCheckVNC.setText("OK");
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
			lblCheck7zip.setStyle("-fx-text-fill: red");
			lblCheck7zip.setText("X");
		} else {
			Alerts.showAlert("Erro na desinstalação", null, "Este programa não está instalado", AlertType.ERROR);
		}
	}

	public void onBtUninstallAdobeApi() {
		String folderName = "Adobe";
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\adobe_flashplayer\\adobe_flashplayer_ppapi_padrao_atualizado\\uninstall.bat");
			lblCheckAdobePPAPI.setStyle("-fx-text-fill: red");
			lblCheckAdobePPAPI.setText("X");
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
			lblCheckAdobePlugin.setStyle("-fx-text-fill: red");
			lblCheckAdobePlugin.setText("X");
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
			lblCheckAdobeReader.setStyle("-fx-text-fill: red");
			lblCheckAdobeReader.setText("X");
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
			lblCheckAtualizacaoAdobeReader.setStyle("-fx-text-fill: red");
			lblCheckAtualizacaoAdobeReader.setText("X");
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
			lblCheckAdobeShockwave.setStyle("-fx-text-fill: red");
			lblCheckAdobeShockwave.setText("X");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
		}

	}

	public void onBtUninstallGoogleChrome() {
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\chrome\\google_chrome_padrao_atualizado\\uninstall.bat");
			lblCheckChrome.setStyle("-fx-text-fill: red");
			lblCheckChrome.setText("X");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
		}

	}

	public void onBtUninstallClienteOCS() {
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\cliente_ocs\\cliente_ocs_padrao_atualizado\\uninstall.bat");
			lblCheckOCS.setStyle("-fx-text-fill: red");
			lblCheckOCS.setText("X");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
		}

	}

	public void onBtUninstallFreePDF() {
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\freepdf\\freepdf_padrao_atualizado\\uninstall.bat");
			lblCheckFreePDF.setStyle("-fx-text-fill: red");
			lblCheckFreePDF.setText("X");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
		}

	}

	public void onBtUninstallHPScanTwain() {
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\hp_scan_twain\\hp_scan_twain_padrao_atualizado\\uninstall.bat");
			lblCheckHPScan.setStyle("-fx-text-fill: red");
			lblCheckHPScan.setText("X");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
		}
	}

	public void onBtUninstallInternetExplorer() {
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\internet_explorer\\internet_explorer_padrao_atualizado\\uninstall.bat");
			lblCheckIE.setStyle("-fx-text-fill: red");
			lblCheckIE.setText("X");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
		}
	}

	public void onBtUninstallJavaRuntime() {
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\java_runtime\\java_runtime_padrao_atualizado\\uninstall.bat");
			lblCheckJavaRuntime.setStyle("-fx-text-fill: red");
			lblCheckJavaRuntime.setText("X");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
		}
	}

	public void onBtUninstallLibreOffice() {
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\libre_office\\libre_office_padrao_atualizado\\uninstall.bat");
			lblCheckLibreOffice.setStyle("-fx-text-fill: red");
			lblCheckLibreOffice.setText("X");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
		}
	}

	public void onBtUninstallLojaDeApp() {
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\loja_de_app\\loja_de_apps_padrao_atualizado\\uninstall.bat");
			lblCheckLojaApp.setStyle("-fx-text-fill: red");
			lblCheckLojaApp.setText("X");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
		}
	}

	public void onBtUninstallMozillaFirefox() {
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\mozilla_firefox\\mozilla_firefox_padrao_atualizado\\uninstall.bat");
			lblCheckMozilla.setStyle("-fx-text-fill: red");
			lblCheckMozilla.setText("X");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
		}
	}

	@FXML
	private void onBtUninstallPDF24Creator() {
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\pdf24_creator\\Pdf24Creator_padrao_atualizado\\uninstall.bat");
			lblCheckPDF24.setStyle("-fx-text-fill: red");
			lblCheckPDF24.setText("X");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
		}
	}

	@FXML
	private void onBtUninstallSamsungEasyDocumentCreator() {
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\samsung_easy_document_creator\\easy_document_creator_padrao_atualizado\\uninstall.bat");
			lblCheckSamsungEasyDocument.setStyle("-fx-text-fill: red");
			lblCheckSamsungEasyDocument.setText("X");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
		}
	}

	@FXML
	private void onBtUninstallScanBack() {
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\scanback\\scanback_padrao_atualizado\\uninstall.bat");
			lblCheckScanBack.setStyle("-fx-text-fill: red");
			lblCheckScanBack.setText("X");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
		}
	}

	@FXML
	private void onBtUninstallSilverlight() {
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\silverlight\\silverlight_padrao_atualizado\\uninstall.bat");
			lblCheckSilverlight.setStyle("-fx-text-fill: red");
			lblCheckSilverlight.setText("X");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
		}
	}

	@FXML
	private void onBtUninstallTrenAntivirus() {
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\trend_antivirus_apex\\antivirus_padrao_atualizado\\uninstall.bat");
			lblCheckTrendAntivirus.setStyle("-fx-text-fill: red");
			lblCheckTrendAntivirus.setText("X");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
		}
	}

	@FXML
	private void onBtUninstallUltraVNC() {
		try {
			Runtime.getRuntime().exec(
					"cmd.exe /c start C:\\apps_para_padronizacao_V3\\ultravnc\\ultravnc_padrao_atualizado\\uninstall.bat");
			lblCheckVNC.setStyle("-fx-text-fill: red");
			lblCheckVNC.setText("X");
		} catch (IOException e) {
			System.out.println("Programa não encontrado");
		}
	}

	// MÉTODOS QUE FARÁ A ATUALIZAÇÃO DO APLICATIVO
	public void onBtUpdate7zip() throws InvocationTargetException {
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
		try {
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
		}catch(NullPointerException e) {
			Alerts.showAlert("Erro na Atualização", null, "Não foi possível se conectar ao servidor: " + e.getMessage(), AlertType.ERROR);			
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
				Runtime.getRuntime().exec(
						"cmd.exe /c del C:\\apps_para_padronizacao_V3\\hp_scan_twain\\hp_scan_twain_padrao_atualizado\\"
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

	public void onBtUpdateInternetExplorer() {
		// Pegando o arquivo da pasta local
		String strLocalPath = "C:\\apps_para_padronizacao_V3\\internet_explorer\\internet_explorer_padrao_atualizado";
		File folderLocal = new File(strLocalPath);
		File[] filesLocal = folderLocal.listFiles(File::isFile);
		String fileLocalName = "";
		for (File fileLocal : filesLocal) {
			int indBat = fileLocal.getName().lastIndexOf("bat");
			if (indBat != 10 && !fileLocal.getName().equals("uninstall.bat")) {
				fileLocalName = fileLocal.getName();
			}
		}

		// Pegando o arquivo da pasta remota
		String strRemotePath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\navegadores\\internet_explorer\\internet_explorer-v11-win_7-64bits";
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
						"cmd.exe /c del C:\\apps_para_padronizacao_V3\\internet_explorer\\internet_explorer_padrao_atualizado\\"
								+ fileLocalName);
				Runtime.getRuntime().exec(
						"cmd.exe /c copy /Y \\\\dados\\seplan\\detic_coengi_seserc__softwares\\navegadores\\internet_explorer\\internet_explorer-v11-win_7-64bits\\"
								+ remoteFileName
								+ " C:\\apps_para_padronizacao_V3\\internet_explorer\\internet_explorer_padrao_atualizado");
				Alerts.showAlert("Sucesso na atualização", null, "Atualização realizada com sucesso",
						AlertType.INFORMATION);
			} catch (IOException e) {
				Alerts.showAlert("Erro na atualização", null, "Houve um erro na atualização: " + e.getMessage(),
						AlertType.ERROR);
			}
		}
	}

	public void onBtUpdateJavaRuntime() {
		// Pegando o arquivo da pasta local
		String strLocalPath = "C:\\apps_para_padronizacao_V3\\java_runtime\\java_runtime_padrao_atualizado";
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
		String strRemPath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\plugins_e_complementos\\java_runtime";
		File remotePath = new File(strRemPath);
		File[] remoteFolders = remotePath.listFiles(File::isDirectory);
		String remoteFolder = "";
		int verMaior = 0;
		int bits = 0;
		for (File remoteFolderServer : remoteFolders) {
			if (remoteFolderServer.getName().charAt(0) != '_') {
				String dadoBruto = remoteFolderServer.getName().substring(16, 19).toString();
				String bitsBruto = remoteFolderServer.getName().substring(20, 22).toString();
				if (!dadoBruto.equals("5.0") && !dadoBruto.equals("80-") && !bitsBruto.equals("50")
						&& !bitsBruto.equals("2b")) {
					if (Integer.parseInt(dadoBruto) > verMaior && Integer.parseInt(bitsBruto) == 64) {
						verMaior = Integer.parseInt(dadoBruto);
						remoteFolder = remoteFolderServer.getName();
					}
				}
			}
		}

		// Pegando o arquivo da pasta remota
		String strRemotePath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\plugins_e_complementos\\java_runtime\\"
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
						"cmd.exe /c del C:\\apps_para_padronizacao_V3\\java_runtime\\java_runtime_padrao_atualizado\\"
								+ fileLocalName);
				Runtime.getRuntime().exec(
						"cmd.exe /c copy /Y \\\\dados\\seplan\\detic_coengi_seserc__softwares\\plugins_e_complementos\\java_runtime\\"
								+ remoteFolder + "\\" + remoteFileName
								+ " C:\\apps_para_padronizacao_V3\\java_runtime\\java_runtime_padrao_atualizado");
				Alerts.showAlert("Sucesso na atualização", null, "Atualização realizada com sucesso",
						AlertType.INFORMATION);
			} catch (IOException e) {
				Alerts.showAlert("Erro na atualização", null, "Houve um erro na atualização: " + e.getMessage(),
						AlertType.ERROR);
			}
		}
	}

	public void onBtUpdateLibreOffice() {
		// Pegando o arquivo da pasta local
		String strLocalPath = "C:\\apps_para_padronizacao_V3\\libre_office\\libre_office_padrao_atualizado";
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
		String strRemPath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\escritorio\\libre_office";
		File remotePath = new File(strRemPath);
		File[] remoteFolders = remotePath.listFiles(File::isDirectory);
		String remoteFolder = "";
		int priVerMaior = 0;
		int secVerMaior = 0;
		int terVerMaior = 0;
		for (File remoteFolderServer : remoteFolders) {
			String verRemota = remoteFolderServer.getName().substring(14, 19);
			int priMaior = Integer.parseInt(verRemota.substring(0, 1));
			int secMaior = Integer.parseInt(verRemota.substring(2, 3));
			int terMaior = Integer.parseInt(verRemota.substring(4));
			if (priMaior > priVerMaior || secMaior > secVerMaior || terMaior > terVerMaior) {
				priVerMaior = priMaior;
				secVerMaior = secMaior;
				terVerMaior = terMaior;
				remoteFolder = remoteFolderServer.getName();
			}
		}

		// Pegando o arquivo da pasta remota
		String strRemotePath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\escritorio\\libre_office\\"
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
						"cmd.exe /c del C:\\apps_para_padronizacao_V3\\libre_office\\libre_office_padrao_atualizado\\"
								+ fileLocalName);
				Runtime.getRuntime().exec(
						"cmd.exe /c copy /Y \\\\dados\\seplan\\detic_coengi_seserc__softwares\\escritorio\\libre_office\\"
								+ remoteFolder + "\\" + remoteFileName
								+ " C:\\apps_para_padronizacao_V3\\libre_office\\libre_office_padrao_atualizado");
				Alerts.showAlert("Sucesso na atualização", null, "Atualização realizada com sucesso",
						AlertType.INFORMATION);
			} catch (IOException e) {
				Alerts.showAlert("Erro na atualização", null, "Houve um erro na atualização: " + e.getMessage(),
						AlertType.ERROR);
			}
		}

	}

	public void onBtUpdateLojaDeApp() {
		Alerts.showAlert("Informação", null, "Não há arquivos de atualização para este programa", AlertType.WARNING);
	}

	public void onBtUpdateMozillaFirefox() {
		// Pegando o arquivo da pasta local
		String strLocalPath = "C:\\apps_para_padronizacao_V3\\mozilla_firefox\\mozilla_firefox_padrao_atualizado";
		File folderLocal = new File(strLocalPath);
		File[] filesLocal = folderLocal.listFiles(File::isFile);
		String fileLocalName = "";
		for (File fileLocal : filesLocal) {
			int indBat = fileLocal.getName().lastIndexOf("bat");
			if (indBat != 10 && !fileLocal.getName().equals("uninstall.bat")
					&& !fileLocal.getName().equals("configura-padroniza_navegadores.exe")) {
				fileLocalName = fileLocal.getName();
			}
		}

		// Encontrando o nome mais atualizado da pasta remota(servidor)
		String strRemPath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\navegadores\\mozilla_firefox";
		File remotePath = new File(strRemPath);
		File[] remoteFolders = remotePath.listFiles(File::isDirectory);
		String remoteFolder = "";
		int verMaior = 0;
		for (File remoteFolderServer : remoteFolders) {
			if (!remoteFolderServer.getName().equals("desabilita_corretor_ortografico")
					&& !remoteFolderServer.getName().equals("desinstalador")
					&& !remoteFolderServer.getName().equals("extensoes")) {
				int verInd = Integer.parseInt(remoteFolderServer.getName().substring(17, 19));
				if (verInd > verMaior) {
					verMaior = verInd;
					remoteFolder = remoteFolderServer.getName();
				}
			}
		}

		// Pegando o arquivo da pasta remota
		String strRemotePath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\navegadores\\mozilla_firefox\\"
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
						"cmd.exe /c del C:\\apps_para_padronizacao_V3\\mozilla_firefox\\mozilla_firefox_padrao_atualizado\\"
								+ fileLocalName);
				Runtime.getRuntime().exec(
						"cmd.exe /c copy /Y \\\\dados\\seplan\\detic_coengi_seserc__softwares\\navegadores\\mozilla_firefox\\"
								+ remoteFolder + "\\" + remoteFileName
								+ " C:\\apps_para_padronizacao_V3\\mozilla_firefox\\mozilla_firefox_padrao_atualizado");
				Alerts.showAlert("Sucesso na atualização", null, "Atualização realizada com sucesso",
						AlertType.INFORMATION);
			} catch (IOException e) {
				Alerts.showAlert("Erro na atualização", null, "Houve um erro na atualização: " + e.getMessage(),
						AlertType.ERROR);
			}
		}
	}

	@FXML
	private void onBtUpdatePDF24Creator() {
		// Pegando o arquivo da pasta local
		String strLocalPath = "C:\\apps_para_padronizacao_V3\\pdf24_creator\\Pdf24Creator_padrao_atualizado";
		File folderLocal = new File(strLocalPath);
		File[] filesLocal = folderLocal.listFiles(File::isFile);
		String fileLocalName = "";
		for (File fileLocal : filesLocal) {
			int indBat = fileLocal.getName().lastIndexOf("bat");
			if (indBat != 10 && !fileLocal.getName().equals("uninstall.bat")
					&& !fileLocal.getName().equals("configura-padroniza_navegadores.exe")) {
				fileLocalName = fileLocal.getName();
			}
		}

		// Encontrando o nome mais atualizado da pasta remota(servidor)
		String strRemPath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\escritorio\\pdf24_creator";
		File remotePath = new File(strRemPath);
		File[] remoteFolders = remotePath.listFiles(File::isDirectory);
		String remoteFolder = "";
		for (File remoteFolderServer : remoteFolders) {
			String ver = remoteFolderServer.getName().substring(remoteFolderServer.getName().indexOf("_") + 1)
					.toString();
			int indPri = 0;
			int indSec = 0;
			int indTer = 0;
			if (indPri < Integer.parseInt(ver.substring(0, 1)) && indSec < Integer.parseInt(ver.substring(2, 3))
					&& indTer < Integer.parseInt(ver.substring(4))) {
				indPri = Integer.parseInt(ver.substring(0, 1));
				indSec = Integer.parseInt(ver.substring(2, 3));
				indTer = Integer.parseInt(ver.substring(4));
				remoteFolder = remoteFolderServer.getName();
			}
		}

		// Pegando o arquivo da pasta remota
		String strRemotePath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\escritorio\\pdf24_creator\\"
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
						"cmd.exe /c del C:\\apps_para_padronizacao_V3\\pdf24_creator\\Pdf24Creator_padrao_atualizado\\"
								+ fileLocalName);
				Runtime.getRuntime().exec(
						"cmd.exe /c copy /Y \\\\dados\\seplan\\detic_coengi_seserc__softwares\\escritorio\\pdf24_creator\\"
								+ remoteFolder + "\\" + remoteFileName
								+ " C:\\apps_para_padronizacao_V3\\pdf24_creator\\Pdf24Creator_padrao_atualizado");
				Alerts.showAlert("Sucesso na atualização", null, "Atualização realizada com sucesso",
						AlertType.INFORMATION);
			} catch (IOException e) {
				Alerts.showAlert("Erro na atualização", null, "Houve um erro na atualização: " + e.getMessage(),
						AlertType.ERROR);
			}
		}

	}

	@FXML
	private void onBtUpdateSamsungEasyDocumentCreator() {
		// Pegando o arquivo da pasta local
		String strLocalPath = "C:\\apps_para_padronizacao_V3\\samsung_easy_document_creator\\easy_document_creator_padrao_atualizado";
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
		String strRemPath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\impressao\\samsung_easy_document_creator";
		File remotePath = new File(strRemPath);
		File[] remoteFolders = remotePath.listFiles(File::isDirectory);
		String remoteFolder = "";
		for (File remoteFolderServer : remoteFolders) {
			String ver = remoteFolderServer.getName().substring(remoteFolderServer.getName().indexOf("v") + 1)
					.toString();
			int indPri = 0;
			int indSec = 0;
			int indTer = 0;
			if (indPri < Integer.parseInt(ver.substring(0, 1)) && indSec < Integer.parseInt(ver.substring(2, 4))) {
				indPri = Integer.parseInt(ver.substring(0, 1));
				indSec = Integer.parseInt(ver.substring(2, 4));
				indTer = Integer.parseInt(ver.substring(5));
				remoteFolder = remoteFolderServer.getName();
			}
		}

		// Pegando o arquivo da pasta remota
		String strRemotePath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\impressao\\samsung_easy_document_creator\\"
				+ remoteFolder;
		File folderRemote = new File(strRemotePath);
		File[] filesRemote = folderRemote.listFiles(File::isFile);
		String remoteFileName = "";
		for (File fileRemote : filesRemote) {
			if (fileRemote.getName().equals(remoteFolder + ".exe")) {
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
				Runtime.getRuntime().exec(
						"cmd.exe /c del C:\\apps_para_padronizacao_V3\\samsung_easy_document_creator\\easy_document_creator_padrao_atualizado\\"
								+ fileLocalName);
				Runtime.getRuntime().exec(
						"cmd.exe /c copy /Y \\\\dados\\seplan\\detic_coengi_seserc__softwares\\impressao\\samsung_easy_document_creator\\"
								+ remoteFolder + "\\" + remoteFileName
								+ " C:\\apps_para_padronizacao_V3\\samsung_easy_document_creator\\easy_document_creator_padrao_atualizado");
				Alerts.showAlert("Sucesso na atualização", null, "Atualização realizada com sucesso",
						AlertType.INFORMATION);
			} catch (IOException e) {
				Alerts.showAlert("Erro na atualização", null, "Houve um erro na atualização: " + e.getMessage(),
						AlertType.ERROR);
			}
		}

	}

	@FXML
	private void onBtUpdateScanBack() {
		// Pegando o arquivo da pasta local
		String strLocalPath = "C:\\apps_para_padronizacao_V3\\scanback\\scanback_padrao_atualizado";
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
		String strRemPath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\impressao\\scanback";
		File remotePath = new File(strRemPath);
		File[] remoteFolders = remotePath.listFiles(File::isDirectory);
		String remoteFolder = "";
		for (File remoteFolderServer : remoteFolders) {
			String ver = remoteFolderServer.getName().substring(remoteFolderServer.getName().indexOf("v") + 1)
					.toString();
			double indVer = 0.0;
			if (indVer < Double.parseDouble(ver)) {
				indVer = Double.parseDouble(ver);
				remoteFolder = remoteFolderServer.getName();
			}
		}

		// Pegando o arquivo da pasta remota
		String strRemotePath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\impressao\\scanback\\"
				+ remoteFolder;
		File folderRemote = new File(strRemotePath);
		File[] filesRemote = folderRemote.listFiles(File::isFile);
		String remoteFileName = "";
		for (File fileRemote : filesRemote) {
			if (fileRemote.getName().equals("instalacao_pms.exe")) {
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
						.exec("cmd.exe /c del C:\\apps_para_padronizacao_V3\\scanback\\scanback_padrao_atualizado\\"
								+ fileLocalName);
				Runtime.getRuntime().exec(
						"cmd.exe /c copy /Y \\\\dados\\seplan\\detic_coengi_seserc__softwares\\impressao\\scanback\\"
								+ remoteFolder + "\\" + remoteFileName
								+ " C:\\apps_para_padronizacao_V3\\scanback\\scanback_padrao_atualizado");
				Alerts.showAlert("Sucesso na atualização", null, "Atualização realizada com sucesso",
						AlertType.INFORMATION);
			} catch (IOException e) {
				Alerts.showAlert("Erro na atualização", null, "Houve um erro na atualização: " + e.getMessage(),
						AlertType.ERROR);
			}
		}

	}

	@FXML
	private void onBtUpdateSilverlight() {
		// Pegando o arquivo da pasta local
		String strLocalPath = "C:\\apps_para_padronizacao_V3\\silverlight\\silverlight_padrao_atualizado";
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
		String strRemPath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\plugins_e_complementos\\silverlight";
		File remotePath = new File(strRemPath);
		File[] remoteFolders = remotePath.listFiles(File::isDirectory);
		String remoteFolder = "";
		for (File remoteFolderServer : remoteFolders) {
			String ver = remoteFolderServer.getName().substring(remoteFolderServer.getName().lastIndexOf("_") + 1);
			int verArqui = Integer.parseInt(remoteFolderServer.getName().substring(
					remoteFolderServer.getName().indexOf("x") + 1, remoteFolderServer.getName().lastIndexOf("_")));
			int indPri = 0;
			int indSec = 0;
			int indTec = 0;
			int indQua = 0;
			if (indPri < Integer.parseInt(ver.substring(0, 1)) && indSec < Integer.parseInt(ver.substring(2, 3))
					&& indTec < Integer.parseInt(ver.substring(4, 9)) && indQua < Integer.parseInt(ver.substring(10))
					|| verArqui == 64) {
				indPri = Integer.parseInt(ver.substring(0, 1));
				indSec = Integer.parseInt(ver.substring(2, 3));
				indTec = Integer.parseInt(ver.substring(4, 9));
				indQua = Integer.parseInt(ver.substring(10));
				remoteFolder = remoteFolderServer.getName();
			}
		}

		// Pegando o arquivo da pasta remota
		String strRemotePath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\plugins_e_complementos\\silverlight\\"
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
						"cmd.exe /c del C:\\apps_para_padronizacao_V3\\silverlight\\silverlight_padrao_atualizado\\"
								+ fileLocalName);
				Runtime.getRuntime().exec(
						"cmd.exe /c copy /Y \\\\dados\\seplan\\detic_coengi_seserc__softwares\\plugins_e_complementos\\silverlight\\"
								+ remoteFolder + "\\" + remoteFileName
								+ " C:\\apps_para_padronizacao_V3\\silverlight\\silverlight_padrao_atualizado");
				Alerts.showAlert("Sucesso na atualização", null, "Atualização realizada com sucesso",
						AlertType.INFORMATION);
			} catch (IOException e) {
				Alerts.showAlert("Erro na atualização", null, "Houve um erro na atualização: " + e.getMessage(),
						AlertType.ERROR);
			}
		}
	}

	@FXML
	private void onBtUpdateTrenAntivirus() {
		// Pegando o arquivo da pasta local
		String strLocalPath = "C:\\apps_para_padronizacao_V3\\trend_antivirus_apex\\antivirus_padrao_atualizado";
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
		String strRemPath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\seguranca\\trend_antivirus\\cliente";
		File remotePath = new File(strRemPath);
		File[] remoteFolders = remotePath.listFiles(File::isDirectory);
		String remoteFolder = "";
		for (File remoteFolderServer : remoteFolders) {
			if (remoteFolderServer.getName().equals("trend_antivirus_apex")) {
				remoteFolder = remoteFolderServer.getName();
			}
		}

		// Pegando o arquivo da pasta remota
		String strRemotePath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\seguranca\\trend_antivirus\\cliente\\"
				+ remoteFolder;
		File folderRemote = new File(strRemotePath);
		File[] filesRemote = folderRemote.listFiles(File::isFile);
		String remoteFileName = "";
		for (File fileRemote : filesRemote) {
			if (fileRemote.getName().equals("agent_cloud_x64.msi")) {
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
				Runtime.getRuntime().exec(
						"cmd.exe /c del C:\\apps_para_padronizacao_V3\\trend_antivirus_apex\\antivirus_padrao_atualizado\\"
								+ fileLocalName);
				Runtime.getRuntime().exec(
						"cmd.exe /c copy /Y \\\\dados\\seplan\\detic_coengi_seserc__softwares\\seguranca\\trend_antivirus\\cliente\\"
								+ remoteFolder + "\\" + remoteFileName
								+ " C:\\apps_para_padronizacao_V3\\trend_antivirus_apex\\antivirus_padrao_atualizado");
				Alerts.showAlert("Sucesso na atualização", null, "Atualização realizada com sucesso",
						AlertType.INFORMATION);
			} catch (IOException e) {
				Alerts.showAlert("Erro na atualização", null, "Houve um erro na atualização: " + e.getMessage(),
						AlertType.ERROR);
			}
		}
	}

	@FXML
	private void onBtUpdateUltraVNC() {
		// Pegando o arquivo da pasta local
		String strLocalPath = "C:\\apps_para_padronizacao_V3\\ultravnc\\ultravnc_padrao_atualizado";
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
		String strRemPath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\conexao_remota\\ultravnc";
		File remotePath = new File(strRemPath);
		File[] remoteFolders = remotePath.listFiles(File::isDirectory);
		String remoteFolder = "";
		for (File remoteFolderServer : remoteFolders) {
			remoteFolder = remoteFolderServer.getName();
		}

		// Pegando o arquivo da pasta remota
		String strRemotePath = "\\\\dados\\seplan\\detic_coengi_seserc__softwares\\conexao_remota\\ultravnc\\"
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
						.exec("cmd.exe /c del C:\\apps_para_padronizacao_V3\\ultravnc\\ultravnc_padrao_atualizado\\"
								+ fileLocalName);
				Runtime.getRuntime().exec(
						"cmd.exe /c copy /Y \\\\dados\\seplan\\detic_coengi_seserc__softwares\\conexao_remota\\ultravnc\\"
								+ remoteFolder + "\\" + remoteFileName
								+ " C:\\apps_para_padronizacao_V3\\ultravnc\\ultravnc_padrao_atualizado");
				Alerts.showAlert("Sucesso na atualização", null, "Atualização realizada com sucesso",
						AlertType.INFORMATION);
			} catch (IOException e) {
				Alerts.showAlert("Erro na atualização", null, "Houve um erro na atualização: " + e.getMessage(),
						AlertType.ERROR);
			}
		}
	}

}
