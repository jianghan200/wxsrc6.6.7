package com.tencent.mm.modelvoice;

import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.io.RandomAccessFile;
import junit.framework.Assert;

public final class a
  implements b
{
  private RandomAccessFile aBA = null;
  private String fileName = "";
  
  public a(String paramString)
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
      x.d("MicroMsg.AmrFileOperator", "Open file:" + this.aBA + " mode:" + paramString);
      try
      {
        this.aBA = new RandomAccessFile(this.fileName, paramString);
        return true;
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.AmrFileOperator", "ERR: OpenFile[" + this.fileName + "] failed:[" + paramString.getMessage() + "]");
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
      x.d("MicroMsg.AmrFileOperator", "Close :" + this.fileName);
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
    int i = paramInt1 + 6;
    localg.buf = new byte[paramInt2];
    try
    {
      long l = this.aBA.length();
      this.aBA.seek(i);
      paramInt2 = this.aBA.read(localg.buf, 0, paramInt2);
      x.d("MicroMsg.AmrFileOperator", "DBG: ReadFile[" + this.fileName + "] readOffset:" + i + " readRet:" + paramInt2 + " fileNow:" + this.aBA.getFilePointer() + " fileSize:" + l);
      paramInt1 = paramInt2;
      if (paramInt2 < 0) {
        paramInt1 = 0;
      }
      localg.bEG = paramInt1;
      localg.eon = (paramInt1 + i - 6);
      localg.ret = 0;
      return localg;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.AmrFileOperator", "ERR: ReadFile[" + this.fileName + "] Offset:" + i + "  failed:[" + localException.getMessage() + "] ");
      Tz();
      localg.ret = -1;
    }
    return localg;
  }
  
  public final int getFormat()
  {
    return 0;
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
    if (paramInt2 == 0) {}
    for (;;)
    {
      try
      {
        this.aBA.write("#!AMR\n".getBytes(), 0, 6);
        int i = paramInt2 + 6;
        long l;
        bool1 = false;
      }
      catch (Exception paramArrayOfByte)
      {
        try
        {
          this.aBA.seek(i);
          this.aBA.write(paramArrayOfByte, 0, paramInt1);
          l = this.aBA.getFilePointer();
          paramInt2 = (int)l;
          paramInt1 = i + paramInt1;
          if (paramInt2 != paramInt1) {
            break label248;
          }
          bool1 = true;
          Assert.assertTrue(bool1);
          paramInt1 -= 6;
          if (paramInt1 < 0) {
            break label254;
          }
          bool1 = bool2;
          Assert.assertTrue(bool1);
          return paramInt1;
        }
        catch (Exception paramArrayOfByte)
        {
          x.e("MicroMsg.AmrFileOperator", "ERR: WriteFile[" + this.fileName + "] Offset:" + i + " failed:[" + paramArrayOfByte.getMessage() + "]");
          Tz();
          return -3;
        }
        paramArrayOfByte = paramArrayOfByte;
        x.e("MicroMsg.AmrFileOperator", "ERR: WriteHeadToFile[" + this.fileName + "] failed:[" + paramArrayOfByte.getMessage() + "]");
        Tz();
        return -2;
      }
      label248:
      continue;
      label254:
      bool1 = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/modelvoice/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */