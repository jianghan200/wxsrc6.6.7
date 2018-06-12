package com.tencent.mm.plugin.p;

import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.UnsupportedEncodingException;

public final class a
{
  public String knp;
  public String knq;
  public int knr;
  public int kns;
  public int knt;
  public int knu;
  public int knv;
  public int knw;
  
  public static String EK(String paramString)
  {
    if (bi.oW(paramString)) {
      return "";
    }
    return paramString.replace(",", ";");
  }
  
  public static String cp(String paramString)
  {
    paramString = FileOp.e(paramString, 0, 6);
    if ((paramString == null) || (paramString.length != 6)) {
      return "";
    }
    try
    {
      paramString = new String(paramString, "UTF-8");
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      x.e("MicroMsg.ImgExtInfoReport", "getFileExt UnsupportedEncodingException:" + paramString);
    }
    return "";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/p/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */