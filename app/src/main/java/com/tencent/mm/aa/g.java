package com.tencent.mm.aa;

import android.annotation.SuppressLint;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.a;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.e;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.b;
import com.tencent.mm.network.u;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.at.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import junit.framework.Assert;

public final class g
  implements e
{
  private at dHA = null;
  j dHh = null;
  b dHx = null;
  m dHy = null;
  boolean dHz = false;
  
  public g()
  {
    com.tencent.mm.kernel.g.DF().a(158, this);
  }
  
  public final void Ku()
  {
    com.tencent.mm.kernel.g.DF().b(158, this);
  }
  
  public final int a(String paramString, b paramb)
  {
    Assert.assertTrue("GetHDHeadImg must set callback", true);
    if (bi.oW(paramString))
    {
      paramb.bd(3, -101);
      return -101;
    }
    this.dHx = paramb;
    if (ab.gY(paramString)) {}
    for (String str = ab.XV(paramString);; str = paramString)
    {
      this.dHh = q.KH().kc(str);
      x.d("MicroMsg.GetHDHeadImgHelper", "GetHDHeadImg: %s", new Object[] { str });
      if ((this.dHh == null) || (!this.dHh.getUsername().equals(str)))
      {
        this.dHh = new j();
        this.dHh.username = str;
      }
      if (bi.oW(this.dHh.Kx()))
      {
        x.w("MicroMsg.GetHDHeadImgHelper", "dkhurl [%s] has NO URL flag:%d !", new Object[] { paramString, Integer.valueOf(this.dHh.csA) });
        this.dHy = new m(str);
        if (!com.tencent.mm.kernel.g.DF().a(this.dHy, 0))
        {
          paramb.bd(3, -102);
          return -102;
        }
        return 0;
      }
      paramString = this.dHh;
      if ((this.dHA == null) || (this.dHA.ciz())) {
        this.dHA = new at(1, "get-hd-headimg", 1);
      }
      if (this.dHA.c(new a(paramString)) == 0) {
        return 0;
      }
      paramb.bd(3, -103);
      return -103;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    this.dHx.bd(paramInt1, paramInt2);
  }
  
  @SuppressLint({"DefaultLocale"})
  final class a
    implements at.a
  {
    public String dHB = null;
    public boolean dHC = true;
    private com.tencent.mm.compatible.util.g.a dHD;
    public j dHd = null;
    
    public a(j paramj)
    {
      this.dHd = paramj;
      this.dHB = q.Kp().c(paramj.getUsername(), true, false);
      this.dHD = new com.tencent.mm.compatible.util.g.a();
    }
    
    public final boolean Kr()
    {
      if (this.dHd == null) {
        return false;
      }
      Object localObject3 = this.dHd.Kx();
      Object localObject1 = "";
      int i;
      if (com.tencent.mm.kernel.g.Eg().Dx())
      {
        i = d.qVN;
        com.tencent.mm.kernel.g.Eg();
        localObject1 = String.format("http://weixin.qq.com/?version=%d&uin=%s&nettype=%d&signal=%d", new Object[] { Integer.valueOf(i), com.tencent.mm.a.o.getString(a.Df()), Integer.valueOf(ao.getNetTypeForStat(ad.getContext())), Integer.valueOf(ao.getStrength(ad.getContext())) });
      }
      x.d("MicroMsg.GetHDHeadImgHelper", "dkreferer dkavatar user: %s referer: %s  url:%s", new Object[] { this.dHd.getUsername(), localObject1, localObject3 });
      this.dHC = true;
      for (;;)
      {
        InputStream localInputStream;
        try
        {
          localu = b.a((String)localObject3, null);
        }
        catch (Exception localException3)
        {
          label268:
          localInputStream = null;
          localObject2 = null;
          localu = null;
          continue;
        }
        try
        {
          localu.setRequestMethod("GET");
          localu.setRequestProperty("referer", (String)localObject1);
          localu.setConnectTimeout(5000);
          localu.setReadTimeout(5000);
          if (b.a(localu) != 0)
          {
            x.e("MicroMsg.GetHDHeadImgHelper", "checkHttpConnection failed! url:%s", new Object[] { localObject3 });
            return true;
          }
          localInputStream = localu.getInputStream();
          if (localInputStream != null) {}
        }
        catch (Exception localException4)
        {
          localInputStream = null;
          localObject2 = null;
        }
      }
      try
      {
        x.d("MicroMsg.GetHDHeadImgHelper", "getInputStream failed. url:%s", new Object[] { localObject3 });
        return true;
      }
      catch (Exception localException5)
      {
        localObject2 = null;
        break label268;
        break label268;
      }
      localObject3 = new byte['Ѐ'];
      localObject1 = FileOp.jx(this.dHB + ".tmp");
      try
      {
        for (;;)
        {
          i = localInputStream.read((byte[])localObject3);
          if (i == -1) {
            break;
          }
          ((OutputStream)localObject1).write((byte[])localObject3, 0, i);
        }
      }
      catch (Exception localException2) {}
      tmp276_273[0] = bi.i(localException2);
      x.e("MicroMsg.GetHDHeadImgHelper", "exception:%s", tmp276_273);
      this.dHC = true;
      for (;;)
      {
        if (localu != null) {}
        try
        {
          localu.aBv.disconnect();
          if (localInputStream != null) {
            localInputStream.close();
          }
          if (localObject1 != null) {
            ((OutputStream)localObject1).close();
          }
          return true;
          this.dHC = false;
          ((OutputStream)localObject1).close();
          localu.aBv.disconnect();
        }
        catch (Exception localException1)
        {
          for (;;)
          {
            try
            {
              localInputStream.close();
              localInputStream = null;
              localObject1 = null;
              localu = null;
            }
            catch (Exception localException6)
            {
              Object localObject2 = null;
              localu = null;
            }
            localException1 = localException1;
            x.e("MicroMsg.GetHDHeadImgHelper", "exception:%s", new Object[] { bi.i(localException1) });
            x.e("MicroMsg.GetHDHeadImgHelper", "close conn failed : %s", new Object[] { localException1.getMessage() });
          }
        }
      }
    }
    
    public final boolean Ks()
    {
      if (g.this.dHz) {
        return false;
      }
      if ((this.dHC) || (bi.oW(this.dHB)))
      {
        g.this.dHx.bd(4, -1);
        return false;
      }
      x.d("MicroMsg.GetHDHeadImgHelper", "dkavatar user:" + this.dHd.getUsername() + " urltime:" + this.dHD.Ad());
      if (am.a.dBs != null) {
        am.a.dBs.aY((int)FileOp.mI(this.dHB + ".tmp"), 0);
      }
      FileOp.deleteFile(this.dHB);
      FileOp.av(this.dHB + ".tmp", this.dHB);
      m.ae(this.dHB, g.this.dHh.getUsername());
      g.this.dHx.bd(0, 0);
      return true;
    }
  }
  
  public static abstract interface b
  {
    public abstract int bd(int paramInt1, int paramInt2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/aa/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */