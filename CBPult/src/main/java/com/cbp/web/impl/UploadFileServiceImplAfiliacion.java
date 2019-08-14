package com.cbp.web.impl;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadFileServiceImplAfiliacion implements IUploadFileService{
		private final String PATH="/home/ubuntu/documentosAdquiriencia";
		//private final String PATH="C:\\pnp\\";
		@Override
		public Resource load(String filename) throws MalformedURLException {

			Path pathFoto = getPath(filename);
			Resource recurso = null;

			recurso = new UrlResource(pathFoto.toUri());
			if (!recurso.exists() || !recurso.isReadable()) {
				throw new RuntimeException("Error: no se puede cargar la imagen" + pathFoto.toString());
			}

			return recurso;
		}

		@Override
		public String copy(MultipartFile foto) throws IOException {
			String uniqueFilename = UUID.randomUUID().toString() + "_" + foto.getOriginalFilename();// para que genere un
																									// nombre unico
			Path rootPath = getPath(uniqueFilename);

			// Medtodo que se puede utilizar
			// byte [] bytes=foto.getBytes();
			// Path urlCompleta=Paths.get(urlruta +"//"+ foto.getOriginalFilename());
			// Files.write(urlCompleta, bytes);
			Files.copy(foto.getInputStream(), rootPath);
			// NOTa: hay que modificar el handle que sobreescrimos en anterior metodo

			return uniqueFilename;
		}

		@Override
		public boolean delete(String filename) {
			// borrar el archivivo
			Path rootPath = getPath(filename);
			File archivo = rootPath.toFile();

			if (archivo.exists() || archivo.canRead()) {
				if (archivo.delete()) {
					return true;
				}

			}

			return false;
		}

		public Path getPath(String filename) {
			return Paths.get(PATH).resolve(filename).toAbsolutePath();
		}

		@Override
		public void deleteAll() {
			FileSystemUtils.deleteRecursively(Paths.get(PATH).toFile());
			
		}

		@Override
		public void ini() throws IOException {
			Files.createDirectory(Paths.get(PATH));
			
		}
}
