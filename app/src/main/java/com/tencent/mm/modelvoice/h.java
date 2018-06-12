package com.tencent.mm.modelvoice;

import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.io.RandomAccessFile;
import junit.framework.Assert;

public final class h
  implements b
{
  private RandomAccessFile aBA = null;
  private String fileName = "";
  
  public h(String paramString)
  {
    this.fileName = paramString;
  }
  
  private boolean od(String paramString)
  {
    if (this.fileName.length() >= 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (this.aBA != null) {
        break label109;
      }
      bool = true;
      label25:
      Assert.assertTrue(bool);
      if ((!paramString.equals("r")) && (!paramString.equals("rw"))) {
        break label114;
      }
    }
    label109:
    label114:
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      x.d("MicroMsg.SilkFileOperator", "Open file:" + this.aBA + " mode:" + paramString);
      try
      {
        this.aBA = new RandomAccessFile(this.fileName, paramString);
        return true;
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.SilkFileOperator", "ERR: OpenFile[" + this.fileName + "] failed:[" + paramString.getMessage() + "]");
        this.aBA = null;
      }
      bool = false;
      break;
      bool = false;
      break label25;
    }
    return false;
  }
  
  public final void Tz()
  {
    if (this.aBA != null) {}
    try
    {
      this.aBA.close();
      this.aBA = null;
      x.d("MicroMsg.SilkFileOperator", "Close :" + this.fileName);
      return;
    }
    catch (IOException localIOException) {}
  }
  
  public final g br(int paramInt1, int paramInt2)
  {
    g localg = new g();
    if ((paramInt1 < 0) || (paramInt2 <= 0))
    {
      localg.ret = -3;
      return localg;
    }
    if ((this.aBA == null) && (!od("r")))
    {
      localg.ret = -2;
      return localg;
    }
    localg.buf = new byte[paramInt2];
    try
    {
      long l = this.aBA.length();
      this.aBA.seek(paramInt1);
      int i = this.aBA.read(localg.buf, 0, paramInt2);
      x.d("MicroMsg.SilkFileOperator", "DBG: ReadFile[" + this.fileName + "] readOffset:" + paramInt1 + " readRet:" + i + " fileNow:" + this.aBA.getFilePointer() + " fileSize:" + l);
      paramInt2 = i;
      if (i < 0) {
        paramInt2 = 0;
      }
      localg.bEG = paramInt2;
      localg.eon = (paramInt2 + paramInt1);
      localg.ret = 0;
      return localg;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.SilkFileOperator", "ERR: ReadFile[" + this.fileName + "] Offset:" + paramInt1 + "  failed:[" + localException.getMessage() + "] ");
      Tz();
      localg.ret = -1;
    }
    return localg;
  }
  
  public final int getFormat()
  {
    return 4;
  }
  
  public final int write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool2 = true;
    if ((paramArrayOfByte.length > 0) && (paramInt1 > 0)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      if ((this.aBA != null) || (od("rw"))) {
        break;
      }
      return -1;
    }
    for (;;)
    {
      try
      {
        this.aBA.seek(paramInt2);
        this.aBA.write(paramArrayOfByte, 0, paramInt1);
        long l = this.aBA.getFilePointer();
        int i = (int)l;
        paramInt1 = paramInt2 + paramInt1;
        if (i == paramInt1)
        {
          bool1 = true;
          Assert.assertTrue(bool1);
          if (paramInt1 < 0) {
            break label174;
          }
          bool1 = bool2;
          Assert.assertTrue(bool1);
          return paramInt1;
        }
      }
      catch (Exception paramArrayOfByte)
      {
        x.e("MicroMsg.SilkFileOperator", "ERR: WriteFile[" + this.fileName + "] Offset:" + paramInt2 + " failed:[" + paramArrayOfByte.getMessage() + "]");
        Tz();
        return -3;
      }
      bool1 = false;
      continue;
      label174:
      bool1 = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/modelvoice/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */