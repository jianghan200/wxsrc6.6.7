package com.tencent.mm.plugin.game.wepkg.model;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

public final class e
{
  private String charset = "UTF-8";
  public WepkgVersion kff;
  private d kfp;
  public Map<String, WepkgPreloadFile> kfq;
  
  public e(WepkgVersion paramWepkgVersion, d paramd, Map<String, WepkgPreloadFile> paramMap)
  {
    this.kff = paramWepkgVersion;
    this.kfp = paramd;
    this.kfq = paramMap;
    if ((paramWepkgVersion != null) && (!bi.oW(paramWepkgVersion.charset))) {
      this.charset = paramWepkgVersion.charset;
    }
  }
  
  public final m Eg(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    if ((this.kfq != null) && (this.kfq.get(paramString) != null))
    {
      Object localObject1 = (WepkgPreloadFile)this.kfq.get(paramString);
      if (!bi.oW(((WepkgPreloadFile)localObject1).filePath))
      {
        Object localObject2 = new File(((WepkgPreloadFile)localObject1).filePath);
        if ((((File)localObject2).exists()) && (((File)localObject2).isFile()) && (((File)localObject2).length() == ((WepkgPreloadFile)localObject1).size)) {
          try
          {
            x.i("MicroMsg.Wepkg.WepkgInterceptor", "rid hit preload file. rid:%s", new Object[] { paramString });
            localObject2 = new FileInputStream((File)localObject2);
            localObject1 = new m(((WepkgPreloadFile)localObject1).mimeType, this.charset, (InputStream)localObject2);
            return (m)localObject1;
          }
          catch (FileNotFoundException localFileNotFoundException) {}
        }
      }
    }
    if (this.kfp != null) {
      return this.kfp.df(paramString, this.charset);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */