package com.moudles.webservice.controller.upload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

/**
 * Created by admin on 2016/10/9.
 */
@Controller
public class UploadControll {
    @RequestMapping("/bacth")
    public String fileupload(@RequestParam("file") CommonsMultipartFile file[], HttpServletRequest req) throws IOException {
        String path=req.getRealPath("/fileupload");
        for (int i=0;i<file.length;i++){
            InputStream is=file[i].getInputStream();
            OutputStream os=new FileOutputStream(new File(path,file[i].getOriginalFilename()));
            int len=0;
            byte[]buffer=new  byte[400];
            while((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
                os.close();
                is.close();
            }
        }
        return "/index.jsp";
    }
}
