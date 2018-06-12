package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.ac.a.a;
import com.tencent.mm.plugin.ac.a.a.a;
import com.tencent.mm.protocal.c.blo;
import com.tencent.mm.protocal.c.blp;

public final class ak
  extends x
{
  private int cmdId;
  private String qAA;
  
  public ak(String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new blo();
    ((b.a)localObject).dIH = new blp();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/setappsetting";
    ((b.a)localObject).dIF = 396;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.ivx = ((b.a)localObject).KT();
    localObject = (blo)this.ivx.dID.dIL;
    ((blo)localObject).jPc = paramString1;
    ((blo)localObject).sku = 0;
    ((blo)localObject).skv = paramString2;
    this.cmdId = 0;
    this.qAA = paramString2;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneSetAppSetting", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt2 == 0))
    {
      paramString = (blp)this.ivx.dIE.dIL;
      if (paramString != null)
      {
        paramq = a.a.bmm().bmk();
        paramArrayOfByte = g.bl(paramString.jPc, false);
        if (paramArrayOfByte != null)
        {
          paramArrayOfByte.field_authFlag = paramString.rdF;
          boolean bool = paramq.a(paramArrayOfByte, new String[0]);
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneSetAppSetting", "onGYNetEnd, update ret = " + bool + ", appId = " + paramString.jPc);
        }
      }
    }
  }
  
  public final void bg(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneSetAppSetting", "buf is null");
      return;
    }
    try
    {
      this.ivx.dIE.G(paramArrayOfByte);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneSetAppSetting", "parse error: " + paramArrayOfByte.getMessage());
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneSetAppSetting", paramArrayOfByte, "", new Object[0]);
    }
  }
  
  public final byte[] cbx()
  {
    try
    {
      byte[] arrayOfByte = ((b.b)this.ivx.KV()).Ie();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneSetAppSetting", "toProtBuf failed: " + localException.getMessage());
    }
    return null;
  }
  
  public final int getType()
  {
    return 2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */