package com.tencent.mm.plugin.sns.model.a;

import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsfs.f;
import com.tencent.mm.network.u;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.b.3;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class d
  extends b
{
  private long ntk = 0L;
  private int ntl = 0;
  
  public d(c.a parama, a parama1)
  {
    super(parama, parama1);
  }
  
  public final String MJ(String paramString)
  {
    return paramString;
  }
  
  public final u b(u paramu)
  {
    this.ntk = 0L;
    if (this.ntk > 0L)
    {
      x.i("MicroMsg.SnsDownloadAdSight", "appendHttpArg range " + this.ntk);
      paramu.setRequestProperty("RANGE", "bytes=" + this.ntk + "-");
    }
    return paramu;
  }
  
  public final boolean byZ()
  {
    return false;
  }
  
  public final boolean bza()
  {
    long l = FileOp.mI(this.nsN.getPath() + this.nsN.byY());
    x.i("MicroMsg.SnsDownloadAdSight", "preceeData  downloadLen " + l + " " + this.nte);
    if (l < this.nte + this.ntk) {
      return false;
    }
    String str = i.k(this.caK);
    FileOp.i(this.nsN.getPath(), this.nsN.byY(), str);
    return true;
  }
  
  protected final int bzb()
  {
    return 4;
  }
  
  public final boolean u(InputStream paramInputStream)
  {
    com.tencent.mm.plugin.sns.model.b localb = null;
    OutputStream localOutputStream2 = null;
    OutputStream localOutputStream1 = localOutputStream2;
    Object localObject = localb;
    try
    {
      byte[] arrayOfByte = new byte['Ѐ'];
      localOutputStream1 = localOutputStream2;
      localObject = localb;
      String str1 = this.nsN.getPath() + this.nsN.byY();
      localOutputStream1 = localOutputStream2;
      localObject = localb;
      long l = FileOp.mI(f.mQ(str1));
      localOutputStream1 = localOutputStream2;
      localObject = localb;
      x.i("MicroMsg.SnsDownloadAdSight", "getdatabegin " + l);
      localOutputStream1 = localOutputStream2;
      localObject = localb;
      localOutputStream2 = FileOp.mG(str1);
      int j = 1;
      localOutputStream1 = localOutputStream2;
      localObject = localOutputStream2;
      l = System.currentTimeMillis();
      localOutputStream1 = localOutputStream2;
      localObject = localOutputStream2;
      this.nsY.value = "";
      int i = 0;
      for (;;)
      {
        localOutputStream1 = localOutputStream2;
        localObject = localOutputStream2;
        int k = paramInputStream.read(arrayOfByte);
        if (k == -1) {
          break;
        }
        localOutputStream1 = localOutputStream2;
        localObject = localOutputStream2;
        if (this.ntb == 0L)
        {
          localOutputStream1 = localOutputStream2;
          localObject = localOutputStream2;
          this.ntb = bi.bH(this.ntc);
        }
        localOutputStream1 = localOutputStream2;
        localObject = localOutputStream2;
        if (k > this.nsZ)
        {
          localOutputStream1 = localOutputStream2;
          localObject = localOutputStream2;
          this.nsZ = k;
          localOutputStream1 = localOutputStream2;
          localObject = localOutputStream2;
          this.nta = bi.VE();
        }
        localOutputStream1 = localOutputStream2;
        localObject = localOutputStream2;
        if (!i.LM(af.Gq()))
        {
          localOutputStream1 = localOutputStream2;
          localObject = localOutputStream2;
          x.i("MicroMsg.SnsDownloadAdSight", "read data");
          localOutputStream1 = localOutputStream2;
          localObject = localOutputStream2;
          localOutputStream2.close();
          localOutputStream1 = localOutputStream2;
          localObject = localOutputStream2;
          paramInputStream.close();
          if (localOutputStream2 != null) {}
          try
          {
            localOutputStream2.close();
            return false;
          }
          catch (IOException paramInputStream)
          {
            for (;;)
            {
              x.printErrStackTrace("MicroMsg.SnsDownloadAdSight", paramInputStream, "", new Object[0]);
            }
          }
        }
        localOutputStream1 = localOutputStream2;
        localObject = localOutputStream2;
        localOutputStream2.write(arrayOfByte, 0, k);
        localOutputStream1 = localOutputStream2;
        localObject = localOutputStream2;
        this.nth += k;
        k = j;
        localOutputStream1 = localOutputStream2;
        localObject = localOutputStream2;
        if (this.nth - this.ntl > 409600 * j)
        {
          localOutputStream1 = localOutputStream2;
          localObject = localOutputStream2;
          localb = af.byj();
          localOutputStream1 = localOutputStream2;
          localObject = localOutputStream2;
          String str2 = this.nsN.mediaId;
          localOutputStream1 = localOutputStream2;
          localObject = localOutputStream2;
          af.aRu().post(new b.3(localb, str2, str1));
          localOutputStream1 = localOutputStream2;
          localObject = localOutputStream2;
          this.ntl = this.nth;
          k = j + 1;
        }
        i = 1;
        j = k;
        localOutputStream1 = localOutputStream2;
        localObject = localOutputStream2;
        if (a(this.nth, l, this.nsY))
        {
          localOutputStream1 = localOutputStream2;
          localObject = localOutputStream2;
          l = System.currentTimeMillis();
          i = 0;
          j = k;
        }
      }
      localOutputStream1 = localOutputStream2;
      localObject = localOutputStream2;
      localOutputStream2.close();
      localObject = null;
      localOutputStream1 = null;
      if (i != 0) {
        a(this.nth, 0L, this.nsY);
      }
      l = FileOp.mI(this.nsN.getPath() + this.nsN.byY());
      x.i("MicroMsg.SnsDownloadAdSight", "getdataend2  " + l);
      return true;
    }
    catch (Exception paramInputStream)
    {
      localObject = localOutputStream1;
      x.printErrStackTrace("MicroMsg.SnsDownloadAdSight", paramInputStream, "snscdndownload fail : " + paramInputStream.getMessage(), new Object[0]);
      localObject = localOutputStream1;
      x.printErrStackTrace("MicroMsg.SnsDownloadAdSight", paramInputStream, "", new Object[0]);
      if (localOutputStream1 != null) {}
      try
      {
        localOutputStream1.close();
        return false;
      }
      catch (IOException paramInputStream)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.SnsDownloadAdSight", paramInputStream, "", new Object[0]);
        }
      }
    }
    finally
    {
      if (localObject == null) {}
    }
    try
    {
      ((OutputStream)localObject).close();
      throw paramInputStream;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.SnsDownloadAdSight", localIOException, "", new Object[0]);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/sns/model/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */