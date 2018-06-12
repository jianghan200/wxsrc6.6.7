package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.mm.protocal.c.bqd;
import com.tencent.mm.protocal.c.xs;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class m
  extends com.tencent.mm.sdk.e.i<l>
  implements com.tencent.mm.plugin.sns.b.e
{
  public static final String[] diD = { com.tencent.mm.sdk.e.i.a(l.dhO, "snsExtInfo3") };
  public com.tencent.mm.sdk.e.e diF;
  private boolean nJh = false;
  private g nJi = null;
  
  public m(com.tencent.mm.sdk.e.e parame, g paramg)
  {
    super(parame, l.dhO, "snsExtInfo3", null);
    this.diF = parame;
    this.nJi = paramg;
    x.i("MicroMsg.SnsExtStorage", "createExtStorage " + parame + "  " + Thread.currentThread().getId());
  }
  
  private l a(String paramString, l paraml)
  {
    int j;
    int k;
    if (paraml == null)
    {
      j = 0;
      k = 0;
      i = j;
      label13:
      if ((k != 0) || (i != 0)) {
        break label221;
      }
      paraml = this.diF.b("select count(*)  from sqlite_master where type='table' and name = 'snsExtInfo2'", null, 2);
      if (!paraml.moveToFirst()) {
        break label223;
      }
    }
    label221:
    label223:
    for (int i = paraml.getInt(0);; i = 0)
    {
      paraml.close();
      if (i == 0)
      {
        x.v("MicroMsg.SnsExtStorage", "can not get snsextinfo2 %s", new Object[] { paramString });
        return null;
        if ((paraml.field_iFlag & 0x1) > 0) {}
        for (i = 1;; i = 0)
        {
          j = i;
          if ((paraml.field_local_flag & 0x4) <= 0) {
            break;
          }
          k = 1;
          break label13;
        }
      }
      paraml = "select * from snsExtInfo2 where userName=\"" + bi.oU(paramString) + "\"";
      x.d("MicroMsg.SnsExtStorage", "get from snsextinfo2 sql %s", new Object[] { paraml });
      paraml = this.diF.b(paraml, null, 2);
      l locall = new l();
      if (paraml.moveToFirst())
      {
        locall.d(paraml);
        paraml.close();
        x.i("MicroMsg.SnsExtStorage", "setSnsUserInfo fix newversion change snsextinfo3 %s", new Object[] { paramString });
        return locall;
      }
      paraml.close();
      return null;
    }
  }
  
  public final bqd Lv(String paramString)
  {
    paramString = Np(paramString);
    if (paramString == null) {
      return new bqd();
    }
    return paramString.bAU();
  }
  
  public final void Nm(String paramString)
  {
    l locall = Np(paramString);
    locall.field_userName = paramString;
    super.a(locall, new String[] { this.sKB.sKz });
  }
  
  public final xs Nn(String paramString)
  {
    Object localObject = new xs();
    new l();
    paramString = Np(paramString);
    try
    {
      if (!bi.bC(paramString.field_faultS))
      {
        paramString = (xs)new xs().aG(paramString.field_faultS);
        localObject = paramString;
        if (paramString == null) {
          localObject = new xs();
        }
        return (xs)localObject;
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        x.e("MicroMsg.SnsExtStorage", "parser field_faultS error");
        paramString = (String)localObject;
      }
    }
  }
  
  public final void No(String paramString)
  {
    new l();
    l locall = Np(paramString);
    locall.field_userName = paramString;
    locall.field_local_flag &= 0xFFFFFFFE;
    c(locall);
  }
  
  public final l Np(String paramString)
  {
    l locall2 = new l();
    l locall1 = locall2;
    if (this.nJi != null)
    {
      locall1 = locall2;
      if (this.nJh)
      {
        locall1 = this.nJi.Mj(paramString);
        if (locall1 != null) {
          return locall1;
        }
        locall1 = new l();
      }
    }
    locall1.field_userName = paramString;
    super.b(locall1, new String[] { this.sKB.sKz });
    return locall1;
  }
  
  public final boolean a(l paraml)
  {
    if ((this.nJh) && (this.nJi != null))
    {
      boolean bool = this.nJi.a(paraml);
      if (this.nJi != null) {
        this.nJi.byE();
      }
      return bool;
    }
    return super.a(paraml);
  }
  
  public final boolean a(String paramString, bqd parambqd)
  {
    paramString = Np(paramString);
    String str = com.tencent.mm.plugin.sns.data.i.eF(parambqd.eJU);
    if ((!bi.oW(parambqd.eJT)) && ((paramString.field_bgUrl == null) || (!paramString.field_bgId.equals(str))))
    {
      paramString.field_older_bgId = paramString.field_bgId;
      paramString.field_local_flag |= 0x1;
      paramString.bAS();
      x.d("MicroMsg.SnsExtStorage", "bg change");
    }
    paramString.field_bgId = str;
    paramString.field_bgUrl = parambqd.eJT;
    paramString.field_iFlag = parambqd.eJS;
    paramString.field_snsBgId = parambqd.eJU;
    paramString.field_local_flag |= 0x4;
    if (parambqd != null) {}
    try
    {
      paramString.field_snsuser = parambqd.toByteArray();
      a(paramString);
      return true;
    }
    catch (Exception parambqd)
    {
      for (;;) {}
    }
  }
  
  public final boolean a(String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    paramString = Np(paramString);
    int i = paramString.field_iFlag;
    if (paramBoolean1)
    {
      i |= 0x200;
      if (!paramBoolean2) {
        break label74;
      }
      i |= 0x400;
      label36:
      if (!paramBoolean3) {
        break label85;
      }
      i |= 0x800;
    }
    for (;;)
    {
      paramString.field_iFlag = i;
      c(paramString);
      return true;
      i &= 0xFDFF;
      break;
      label74:
      i &= 0xFBFF;
      break label36;
      label85:
      i &= 0xF7FF;
    }
  }
  
  public final boolean aQ(String paramString, boolean paramBoolean)
  {
    paramString = Np(paramString);
    int i = paramString.field_iFlag;
    if (paramBoolean) {
      i |= 0x1;
    }
    for (;;)
    {
      paramString.field_iFlag = i;
      c(paramString);
      return true;
      i &= 0xFFFFFFFE;
    }
  }
  
  public final bqd aR(String paramString, boolean paramBoolean)
  {
    paramString = Np(paramString).bAU();
    if (paramString == null)
    {
      x.e("MicroMsg.SnsExtStorage", "userinfo is null");
      return null;
    }
    int i = paramString.sod;
    if (paramBoolean) {
      i |= 0x1;
    }
    for (;;)
    {
      paramString.sod = i;
      return paramString;
      i &= 0xFFFFFFFE;
    }
  }
  
  public final bqd b(String paramString, bqd parambqd)
  {
    l locall = Np(paramString);
    if (locall == null)
    {
      paramString = a(paramString, locall);
      if (paramString != null)
      {
        if (parambqd.eJS != -1) {
          break label44;
        }
        i = paramString.field_iFlag;
        parambqd.eJS = i;
      }
    }
    label44:
    String str;
    label85:
    int j;
    label96:
    do
    {
      return parambqd;
      i = parambqd.eJS;
      break;
      if (!bi.oW(parambqd.eJT)) {
        break label130;
      }
      str = locall.field_bgUrl;
      parambqd.eJT = str;
      if (parambqd.eJS != -1) {
        break label139;
      }
      i = 1;
      if (i == 0) {
        break label144;
      }
      j = locall.field_iFlag;
      parambqd.eJS = j;
      paramString = a(paramString, locall);
    } while (paramString == null);
    if (i != 0) {}
    for (int i = paramString.field_iFlag;; i = parambqd.eJS)
    {
      parambqd.eJS = i;
      return parambqd;
      label130:
      str = parambqd.eJT;
      break;
      label139:
      i = 0;
      break label85;
      label144:
      j = parambqd.eJS;
      break label96;
    }
  }
  
  public final bqd b(String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    paramString = Np(paramString).bAU();
    if (paramString == null)
    {
      x.e("MicroMsg.SnsExtStorage", "userinfo is null");
      return null;
    }
    int i = paramString.sod;
    if (paramBoolean1)
    {
      i |= 0x200;
      if (!paramBoolean2) {
        break label85;
      }
      i |= 0x400;
      label53:
      if (!paramBoolean3) {
        break label96;
      }
      i |= 0x800;
    }
    for (;;)
    {
      paramString.sod = i;
      return paramString;
      i &= 0xFDFF;
      break;
      label85:
      i &= 0xFBFF;
      break label53;
      label96:
      i &= 0xF7FF;
    }
  }
  
  public final boolean b(l paraml)
  {
    return super.a(paraml);
  }
  
  public final void bwS()
  {
    x.d("MicroMsg.SnsExtStorage", "attachCache");
    this.nJh = true;
  }
  
  public final void bwT()
  {
    this.nJh = false;
    this.nJi.byF();
    x.d("MicroMsg.SnsExtStorage", "detchCache");
  }
  
  public final boolean c(l paraml)
  {
    if ((paraml == null) || (paraml.field_userName == null) || (paraml.field_userName.equals(""))) {
      return false;
    }
    return super.a(paraml);
  }
  
  public final boolean eM(String paramString1, String paramString2)
  {
    paramString1 = Np(paramString1);
    paramString1.field_newerIds = paramString2;
    return super.a(paramString1);
  }
  
  public final int f(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    paramString1 = Np(paramString1);
    paramString1.field_md5 = paramString2;
    paramString1.field_adsession = paramArrayOfByte;
    super.a(paramString1);
    return 0;
  }
  
  public final int l(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    paramString1 = Np(paramString1);
    paramString1.field_md5 = paramString2;
    paramString1.field_lastFirstPageRequestErrType = paramInt1;
    paramString1.field_lastFirstPageRequestErrCode = paramInt2;
    super.a(paramString1);
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */