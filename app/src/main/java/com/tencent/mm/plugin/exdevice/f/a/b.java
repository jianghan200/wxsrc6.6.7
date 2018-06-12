package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.mm.model.au;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.IOException;

public final class b
{
  public static String Ab(String paramString)
  {
    if ((bi.oW(paramString)) || ("#".equals(paramString))) {
      return "";
    }
    Object localObject = ac.ce(paramString);
    localObject = new File(d.aHr(), (String)localObject);
    if (((File)localObject).exists()) {
      return ((File)localObject).getAbsolutePath();
    }
    try
    {
      ((File)localObject).createNewFile();
      au.Em().H(new a(paramString, (File)localObject));
      return "";
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        x.d("MicroMsg.ExdevicePictureLocalizer", "hy: %s", new Object[] { localIOException.toString() });
      }
    }
  }
  
  static final class a
    implements Runnable
  {
    private File ixn;
    private String url;
    
    a(String paramString, File paramFile)
    {
      this.url = paramString;
      this.ixn = paramFile;
    }
    
    public final void run()
    {
      byte[] arrayOfByte = bi.WY(this.url);
      if (arrayOfByte != null) {
        FileOp.l(this.ixn.getAbsolutePath(), arrayOfByte);
      }
    }
    
    public final String toString()
    {
      return super.toString() + "|DownloadRunnable";
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/f/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */