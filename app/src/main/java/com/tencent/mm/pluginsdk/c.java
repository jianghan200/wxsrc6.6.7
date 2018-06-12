package com.tencent.mm.pluginsdk;

import com.tencent.mm.plugin.l.a.a;
import com.tencent.mm.plugin.l.a.b;
import java.util.HashMap;

public final class c
{
  private static HashMap<String, Integer> qxZ = null;
  
  public static int Sz(String paramString)
  {
    if (qxZ == null)
    {
      HashMap localHashMap = new HashMap();
      qxZ = localHashMap;
      localHashMap.put("avi", Integer.valueOf(a.b.app_attach_file_icon_video));
      qxZ.put("m4v", Integer.valueOf(a.b.app_attach_file_icon_video));
      qxZ.put("vob", Integer.valueOf(a.b.app_attach_file_icon_video));
      qxZ.put("mpeg", Integer.valueOf(a.b.app_attach_file_icon_video));
      qxZ.put("mpe", Integer.valueOf(a.b.app_attach_file_icon_video));
      qxZ.put("asx", Integer.valueOf(a.b.app_attach_file_icon_video));
      qxZ.put("asf", Integer.valueOf(a.b.app_attach_file_icon_video));
      qxZ.put("f4v", Integer.valueOf(a.b.app_attach_file_icon_video));
      qxZ.put("flv", Integer.valueOf(a.b.app_attach_file_icon_video));
      qxZ.put("mkv", Integer.valueOf(a.b.app_attach_file_icon_video));
      qxZ.put("wmv", Integer.valueOf(a.b.app_attach_file_icon_video));
      qxZ.put("wm", Integer.valueOf(a.b.app_attach_file_icon_video));
      qxZ.put("3gp", Integer.valueOf(a.b.app_attach_file_icon_video));
      qxZ.put("mp4", Integer.valueOf(a.b.app_attach_file_icon_video));
      qxZ.put("rmvb", Integer.valueOf(a.b.app_attach_file_icon_video));
      qxZ.put("rm", Integer.valueOf(a.b.app_attach_file_icon_video));
      qxZ.put("ra", Integer.valueOf(a.b.app_attach_file_icon_video));
      qxZ.put("ram", Integer.valueOf(a.b.app_attach_file_icon_video));
      qxZ.put("mp3pro", Integer.valueOf(a.b.app_attach_file_icon_music));
      qxZ.put("vqf", Integer.valueOf(a.b.app_attach_file_icon_music));
      qxZ.put("cd", Integer.valueOf(a.b.app_attach_file_icon_music));
      qxZ.put("md", Integer.valueOf(a.b.app_attach_file_icon_music));
      qxZ.put("mod", Integer.valueOf(a.b.app_attach_file_icon_music));
      qxZ.put("vorbis", Integer.valueOf(a.b.app_attach_file_icon_music));
      qxZ.put("au", Integer.valueOf(a.b.app_attach_file_icon_music));
      qxZ.put("amr", Integer.valueOf(a.b.app_attach_file_icon_music));
      qxZ.put("silk", Integer.valueOf(a.b.app_attach_file_icon_music));
      qxZ.put("wma", Integer.valueOf(a.b.app_attach_file_icon_music));
      qxZ.put("mmf", Integer.valueOf(a.b.app_attach_file_icon_music));
      qxZ.put("mid", Integer.valueOf(a.b.app_attach_file_icon_music));
      qxZ.put("midi", Integer.valueOf(a.b.app_attach_file_icon_music));
      qxZ.put("mp3", Integer.valueOf(a.b.app_attach_file_icon_music));
      qxZ.put("aac", Integer.valueOf(a.b.app_attach_file_icon_music));
      qxZ.put("ape", Integer.valueOf(a.b.app_attach_file_icon_music));
      qxZ.put("aiff", Integer.valueOf(a.b.app_attach_file_icon_music));
      qxZ.put("aif", Integer.valueOf(a.b.app_attach_file_icon_music));
      qxZ.put("jfif", Integer.valueOf(a.a.app_attach_file_icon_pic));
      qxZ.put("tiff", Integer.valueOf(a.a.app_attach_file_icon_pic));
      qxZ.put("tif", Integer.valueOf(a.a.app_attach_file_icon_pic));
      qxZ.put("jpe", Integer.valueOf(a.a.app_attach_file_icon_pic));
      qxZ.put("dib", Integer.valueOf(a.a.app_attach_file_icon_pic));
      qxZ.put("jpeg", Integer.valueOf(a.a.app_attach_file_icon_pic));
      qxZ.put("jpg", Integer.valueOf(a.a.app_attach_file_icon_pic));
      qxZ.put("png", Integer.valueOf(a.a.app_attach_file_icon_pic));
      qxZ.put("bmp", Integer.valueOf(a.a.app_attach_file_icon_pic));
      qxZ.put("gif", Integer.valueOf(a.a.app_attach_file_icon_pic));
      qxZ.put("rar", Integer.valueOf(a.b.app_attach_file_icon_rar));
      qxZ.put("zip", Integer.valueOf(a.b.app_attach_file_icon_rar));
      qxZ.put("7z", Integer.valueOf(a.b.app_attach_file_icon_rar));
      qxZ.put("iso", Integer.valueOf(a.b.app_attach_file_icon_rar));
      qxZ.put("cab", Integer.valueOf(a.b.app_attach_file_icon_rar));
      qxZ.put("doc", Integer.valueOf(a.b.app_attach_file_icon_word));
      qxZ.put("docx", Integer.valueOf(a.b.app_attach_file_icon_word));
      qxZ.put("ppt", Integer.valueOf(a.b.app_attach_file_icon_ppt));
      qxZ.put("pptx", Integer.valueOf(a.b.app_attach_file_icon_ppt));
      qxZ.put("xls", Integer.valueOf(a.b.app_attach_file_icon_excel));
      qxZ.put("xlsx", Integer.valueOf(a.b.app_attach_file_icon_excel));
      qxZ.put("txt", Integer.valueOf(a.b.app_attach_file_icon_txt));
      qxZ.put("rtf", Integer.valueOf(a.b.app_attach_file_icon_txt));
      qxZ.put("pdf", Integer.valueOf(a.b.app_attach_file_icon_pdf));
    }
    paramString = (Integer)qxZ.get(paramString);
    if (paramString == null) {
      return a.b.app_attach_file_icon_unknow;
    }
    return paramString.intValue();
  }
  
  public static int cbi()
  {
    return a.b.app_attach_file_icon_unknow;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */