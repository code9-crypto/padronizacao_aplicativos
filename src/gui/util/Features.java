package gui.util;

import java.io.File;
import java.io.IOException;

import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;

public class Features {
	
	/*---------------------- ESTE MÉTODO É USADO PARA FAZER A INSTALAÇÃO DO APP -----------------------------------------*/
	public void instalaApp(String fileName, String folderName, String caminhoFolder,Label msg) {
		try {
			// Este comando faz o acesso ao cmd que por sua vez inicia o instalador
			Runtime.getRuntime()
					.exec("cmd.exe /c start " + caminhoFolder + "\\" +  folderName + "\\" + fileName);
			msg.setStyle("-fx-text-fill: green");
			msg.setText("OK");
		} catch (IOException e) {
			Alerts.showAlert("Criação de arquivo", null, "Houve um problema: " + e.getMessage(), AlertType.ERROR);
		}
	}

	/*---------------------- ESTES MÉTODOS SÃO PARA FAZER ATUALIZAÇÕES NOS APPS -----------------------------------------*/
	// Este método fará a busca pelo arquivo local e retornará o nome deste
	public static String pegaArquivoLocal(String local) {
		File path = new File(local);
		File[] files = path.listFiles(File::isFile);
		String fileName = "";
		for (File file : files) {
			int indBat = file.getName().lastIndexOf("bat");
			if (indBat != 10 && !file.getName().equals("uninstall.bat")
					&& !file.getName().equals("Fim do suporte Windows 7 e 8.txt")
					&& !file.getName().equals("remove-aviso.exe")) {
				fileName = file.getName();
			}
		}
		return fileName;
	}

	// Este método fará a busca pelo nome do arquivo no reposotório e retornará este
	public static String pegaArquivoRemota(String remoteFile) {
		File pathRemoteFile = new File(remoteFile);
		File[] remoteFiles = pathRemoteFile.listFiles(File::isFile);
		String remoteFileServer = "";
		for (File remote : remoteFiles) {
			if (!remote.getName().equals("Fim do suporte Windows 7 e 8.txt")
					&& !remote.getName().equals("remove-aviso.exe")) {
				remoteFileServer = remote.getName();
			}
		}
		return remoteFileServer;
	}

	// Este método exibirá na tela uma mensagem de confirmação ou de aviso
	public static void exibeMensagem(String localFile, String remoteFile, String remoteFolder, String pasta,
			String pastaPadrao, String pastaGenerica) {
		// Verificando se o arquivo local é igual ao do servidor
		// Caso seja, então o arquivo já está atualizado
		// Caso não, então será atualizado pelo arquivo do servidor
		try {
			if (localFile.equals(remoteFile)) {
				Alerts.showAlert("Informação", null, "Este arquivo já está atualizado", AlertType.WARNING);
			} else {
				try {
					// Excluindo o arquivo antigo da pasta local
					Runtime.getRuntime().exec("cmd.exe /c del C:\\apps_para_padronizacao_V3\\" + pasta + "\\"
							+ pastaPadrao + "\\" + localFile);

					// Adicionando o arquivo atualizado na pasta local
					Runtime.getRuntime()
							.exec("cmd.exe /c copy /Y \\\\dados\\seplan\\detic_coengi_seserc__softwares\\"
									+ pastaGenerica + "\\" + pasta + "\\" + remoteFolder + "\\" + remoteFile
									+ " C:\\apps_para_padronizacao_V3\\" + pasta + "\\" + pastaPadrao);
					Alerts.showAlert("Sucesso na atualização", null, "Arquivo atualizado com sucesso",
							AlertType.INFORMATION);
				} catch (IOException e) {
					Alerts.showAlert("Erro na atualização", null, "Houve um erro na atualização: " + e.getMessage(),
							AlertType.ERROR);
				}
			}
		} catch (NullPointerException e) {
			Alerts.showAlert("Erro na Atualização", null, "Não foi possível se conectar ao servidor: " + e.getMessage(),
					AlertType.ERROR);
		}
	}

}
