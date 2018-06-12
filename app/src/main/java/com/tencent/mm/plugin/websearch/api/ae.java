package com.tencent.mm.plugin.websearch.api;

import com.tencent.mm.loader.stub.b;
import java.io.File;
import java.util.Properties;

public final class ae
{
  private int pMt = 1;
  private long pMu;
  private String pMv;
  String pMw;
  String pMx;
  
  public ae(String paramString1, String paramString2, String paramString3)
  {
    this.pMv = paramString1;
    this.pMw = paramString2;
    this.pMx = paramString3;
  }
  
  private File bTo()
  {
    return new File(adP(), "config.conf");
  }
  
  public final int Oe()
  {
    if ((this.pMt <= 1) || (bTo().lastModified() > this.pMu)) {
      bTn();
    }
    return this.pMt;
  }
  
  public final String adP()
  {
    File localFile = new File(b.duO.replace("/data/user/0", "/data/data"), this.pMv);
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    return localFile.getAbsolutePath();
  }
  
  public final int bTn()
  {
    this.pMt = Integer.valueOf(p.A(bTo()).getProperty("version", "1")).intValue();
    this.pMu = System.currentTimeMillis();
    return this.pMt;
  }
  
  public final String bTp()
  {
    return new File(adP(), this.pMw).getAbsolutePath();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/websearch/api/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */