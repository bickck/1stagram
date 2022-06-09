package com.team.Imitation.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public interface MemberFileService {
	
	public static String IMAGE_REPO = "D:/_DeviceJava/05_Spring/image_repo";

	public String saveFile(MultipartFile file);

	public void deleteImage(String parameter);

	public String getMessage(HttpServletRequest request, String msg, String url);
}
