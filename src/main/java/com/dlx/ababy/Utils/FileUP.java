package com.dlx.ababy.Utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.dlx.ababy.entity.Img;
import com.dlx.ababy.entity.Photos;
import com.dlx.ababy.service.ImgService;
import com.dlx.ababy.service.PhotosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.qfedu.vo.ResultVo;

/**
* Copyright: Copyright (c) 2018 
* @author: taoge
* @version: v1.0.0
* @date: 2019年1月9日 下午7:54:37
* @ClassName: FileUP.java
*/
@RestController
@CrossOrigin
public class FileUP {
	private ResultVo rv;
	@Autowired
	private ImgService iService;
	@PostMapping("/upload.do")
	public ResultVo upload(@RequestParam MultipartFile[] upfiles){
		//获取表单中提交的其他参数
		//System.out.println(uname);
		List<String> fileNames = new ArrayList<>();
		//保存图片的目录
		String path = "D:/upload";
		File file = new File(path);
		//如果目录不存在，创建
		if(!file.exists()){
			file.mkdir();
		}
		System.out.println(upfiles.length);
		//通过循环上传文件
		for(MultipartFile upfile : upfiles){
			
			//获取文件的名称
			String fName = upfile.getOriginalFilename();
			//如果不是所有的file都上传文件，需要进行相关判断，否则异常
			if(fName == null || fName.isEmpty()){
				continue;
			}
			
			String uuid = UUID.randomUUID().toString();
			fName = uuid + "_" + fName;
			File f = new File(path, fName);
			try {
				//上传文件
				upfile.transferTo(f);
				fileNames.add(fName);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		rv = ResultVo.setOK(fileNames);
		return rv;
	}

}
