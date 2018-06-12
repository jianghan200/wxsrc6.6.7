package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.ac.a;
import com.tencent.mm.protocal.c.axj;
import com.tencent.mm.protocal.c.zh;
import com.tencent.mm.protocal.c.zi;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class ad
  extends l
  implements k
{
  private static final String[] qAp = { "wxf109da3e26cf89f1", "wxc56bba830743541e", "wx41dd4f6ef137bd0b" };
  final String appId;
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private final int efG;
  
  public ad(String paramString)
  {
    this.appId = paramString;
    this.efG = 3;
    paramString = new b.a();
    paramString.dIG = new zh();
    paramString.dIH = new zi();
    paramString.uri = "/cgi-bin/micromsg-bin/getappinfo";
    paramString.dIF = 231;
    paramString.dII = 0;
    paramString.dIJ = 0;
    this.diG = paramString.KT();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    if ((this.appId == null) || (this.appId.length() == 0))
    {
      x.e("MicroMsg.NetSceneGetAppInfo", "doScene fail, appId is null");
      return -1;
    }
    parame1 = (zh)this.diG.dID.dIL;
    parame1.jPc = this.appId;
    parame1.ryb = this.efG;
    return a(parame, this.diG, this);
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGetAppInfo", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 == 4) && (paramInt3 == 64525))
    {
      x.e("MicroMsg.NetSceneGetAppInfo", "errType = " + paramInt2 + ", errCode = " + paramInt3 + ", appinfo does not exist");
      a.bmf();
      paramq = i.cbQ();
      paramq.field_appId = this.appId;
      a.bmf().a(paramq);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      x.e("MicroMsg.NetSceneGetAppInfo", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    Object localObject1 = (zi)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    paramArrayOfByte = ((zi)localObject1).rFo.rbj;
    Object localObject2 = ((zi)localObject1).rFo;
    if (localObject2 == null)
    {
      x.e("MicroMsg.NetSceneGetAppInfo", "convertToAppInfo : openAppInfo is null");
      paramq = null;
    }
    while (paramq == null)
    {
      x.e("MicroMsg.NetSceneGetAppInfo", "onGYNetEnd : info is null");
      this.diJ.a(3, -1, paramString, this);
      return;
      paramq = new f();
      paramq.field_appId = ((axj)localObject2).jPc;
      paramq.field_appName = ((axj)localObject2).jSv;
      paramq.field_appDiscription = ((axj)localObject2).sas;
      paramq.field_appIconUrl = ((axj)localObject2).rbh;
      paramq.field_appStoreUrl = ((axj)localObject2).jPy;
      paramq.field_appVersion = ((axj)localObject2).riv;
      paramq.field_appWatermarkUrl = ((axj)localObject2).sat;
      paramq.field_packageName = ((axj)localObject2).rbj;
      paramq.field_signature = p.Ta(((axj)localObject2).ris);
      paramq.field_appName_en = ((axj)localObject2).sau;
      paramq.field_appName_tw = ((axj)localObject2).saw;
      paramq.field_appDiscription_en = ((axj)localObject2).sav;
      paramq.field_appDiscription_tw = ((axj)localObject2).sax;
      paramq.field_appInfoFlag = ((axj)localObject2).jPj;
      x.d("MicroMsg.NetSceneGetAppInfo", "appid = %s, appInfoFlag = %s", new Object[] { paramq.field_appId, Integer.valueOf(paramq.field_appInfoFlag) });
    }
    paramq.field_appType = ((zi)localObject1).rit;
    localObject2 = ((zi)localObject1).rFo;
    localObject1 = ((axj)localObject2).rbj;
    localObject2 = ((axj)localObject2).ris;
    if ((localObject1 == null) || (((String)localObject1).length() == 0) || (localObject2 == null) || (((String)localObject2).length() == 0)) {}
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      if ((paramInt1 != 0) || (paramq.aaq()))
      {
        x.e("MicroMsg.NetSceneGetAppInfo", "no android app, packageName = " + paramArrayOfByte);
        com.tencent.mm.pluginsdk.ui.tools.b.TX(this.appId);
      }
      if (paramq.field_appId != null) {
        break;
      }
      x.e("MicroMsg.NetSceneGetAppInfo", "onGYNetEnd : info.appId is null");
      this.diJ.a(3, -1, paramString, this);
      return;
    }
    if (!paramq.field_appId.equals(this.appId))
    {
      x.e("MicroMsg.NetSceneGetAppInfo", "onGYNetEnd : appId is different");
      this.diJ.a(3, -1, paramString, this);
      return;
    }
    paramArrayOfByte = a.bmf();
    localObject1 = paramArrayOfByte.SW(this.appId);
    if ((localObject1 == null) || (((f)localObject1).field_appId == null) || (((f)localObject1).field_appId.length() == 0))
    {
      if (paramInt1 != 0)
      {
        paramInt1 = 3;
        paramq.field_status = paramInt1;
        paramq.field_modifyTime = System.currentTimeMillis();
        if (paramq.field_appId != null) {
          paramInt1 = 0;
        }
      }
      for (;;)
      {
        if (paramInt1 < qAp.length)
        {
          if (paramq.field_appId.equals(qAp[paramInt1])) {
            paramq.field_status = -1;
          }
        }
        else
        {
          if (paramArrayOfByte.l(paramq)) {
            break label754;
          }
          x.e("MicroMsg.NetSceneGetAppInfo", "onGYNetEnd : insert fail");
          this.diJ.a(3, -1, paramString, this);
          return;
          paramInt1 = 4;
          break;
        }
        paramInt1 += 1;
      }
      label754:
      a.bmd().cO(this.appId, 1);
      a.bmd().cO(this.appId, 2);
      a.bmd().cO(this.appId, 3);
      a.bmd().cO(this.appId, 4);
      a.bmd().cO(this.appId, 5);
    }
    label894:
    label983:
    label990:
    label1216:
    label1448:
    for (;;)
    {
      if (bi.oW(paramq.field_openId))
      {
        x.d("MicroMsg.NetSceneGetAppInfo", "onGYNetEnd, openId is null, trigger getAppSetting, appId = " + paramq.field_appId);
        a.bmh().pS(paramq.field_appId);
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      if (paramInt1 != 0)
      {
        paramInt1 = 3;
        paramq.field_status = paramInt1;
        if (paramq.field_appId != null)
        {
          paramInt1 = 0;
          if (paramInt1 < qAp.length)
          {
            if (!paramq.field_appId.equals(qAp[paramInt1])) {
              break label983;
            }
            paramq.field_status = -1;
          }
        }
        if (localObject1 != null) {
          break label990;
        }
        x.e("MicroMsg.NetSceneGetAppInfo", "merge failed, some appinfo is null");
      }
      for (;;)
      {
        if (paramArrayOfByte.a(paramq, new String[0])) {
          break label1216;
        }
        x.e("MicroMsg.NetSceneGetAppInfo", "onGYNetEnd : update fail");
        this.diJ.a(3, -1, paramString, this);
        return;
        paramInt1 = ((f)localObject1).field_status;
        break;
        paramInt1 += 1;
        break label894;
        if (((f)localObject1).cbJ())
        {
          if (!bi.oW(((f)localObject1).field_appIconUrl)) {
            paramq.field_appIconUrl = ((f)localObject1).field_appIconUrl;
          }
          if (!bi.oW(((f)localObject1).field_appName)) {
            paramq.field_appName = ((f)localObject1).field_appName;
          }
          if (!bi.oW(((f)localObject1).field_appName_en)) {
            paramq.field_appName_en = ((f)localObject1).field_appName_en;
          }
          if (!bi.oW(((f)localObject1).field_appName_tw)) {
            paramq.field_appName_tw = ((f)localObject1).field_appName_tw;
          }
          if (!bi.oW(((f)localObject1).field_appName_hk)) {
            paramq.field_appName_hk = ((f)localObject1).field_appName_hk;
          }
        }
        if ((bi.oW(paramq.field_appId)) || (bi.oW(((f)localObject1).field_appId)))
        {
          x.e("MicroMsg.NetSceneGetAppInfo", "merge failed, some appid is null");
        }
        else if (!paramq.field_appId.equalsIgnoreCase(((f)localObject1).field_appId))
        {
          x.e("MicroMsg.NetSceneGetAppInfo", "merge failed, appis is different");
        }
        else
        {
          paramq.field_openId = ((f)localObject1).field_openId;
          paramq.field_authFlag = ((f)localObject1).field_authFlag;
          paramq.dg(((com.tencent.mm.g.c.p)localObject1).cmC);
          paramq.dh(((com.tencent.mm.g.c.p)localObject1).cmD);
          paramq.di(((com.tencent.mm.g.c.p)localObject1).cmE);
        }
      }
      if ((localObject1 == null) || (((f)localObject1).field_appIconUrl == null) || (((f)localObject1).field_appIconUrl.length() == 0)) {
        paramInt1 = 1;
      }
      for (;;)
      {
        if (paramInt1 == 0) {
          break label1448;
        }
        a.bmd().cO(this.appId, 1);
        a.bmd().cO(this.appId, 2);
        a.bmd().cO(this.appId, 3);
        a.bmd().cO(this.appId, 4);
        a.bmd().cO(this.appId, 5);
        break;
        if (!bi.oW(paramq.cmW))
        {
          if (bi.oW(((com.tencent.mm.g.c.p)localObject1).cmW))
          {
            paramInt1 = 1;
            continue;
          }
          if (!((com.tencent.mm.g.c.p)localObject1).cmW.equals(((com.tencent.mm.g.c.p)localObject1).cmW))
          {
            paramInt1 = 1;
            continue;
          }
        }
        if (!bi.oW(paramq.cmX))
        {
          if (bi.oW(((com.tencent.mm.g.c.p)localObject1).cmX))
          {
            paramInt1 = 1;
            continue;
          }
          if (!((com.tencent.mm.g.c.p)localObject1).cmX.equals(((com.tencent.mm.g.c.p)localObject1).cmX))
          {
            paramInt1 = 1;
            continue;
          }
        }
        if ((paramq.field_appIconUrl == null) || (paramq.field_appIconUrl.length() == 0)) {
          paramInt1 = 0;
        } else if (!((f)localObject1).field_appIconUrl.equals(paramq.field_appIconUrl)) {
          paramInt1 = 1;
        } else {
          paramInt1 = 0;
        }
      }
    }
  }
  
  public final int getType()
  {
    return 231;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */