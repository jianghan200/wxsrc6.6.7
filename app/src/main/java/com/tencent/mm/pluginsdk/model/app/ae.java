package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.ac.a;
import com.tencent.mm.protocal.c.ho;
import com.tencent.mm.protocal.c.zf;
import com.tencent.mm.protocal.c.zg;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ae
  extends x
{
  private static final String[] qAp = { "wxf109da3e26cf89f1", "wxc56bba830743541e", "wx41dd4f6ef137bd0b" };
  
  public ae(List<String> paramList)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new zf();
    ((b.a)localObject).dIH = new zg();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getappinfolist";
    ((b.a)localObject).dIF = 451;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.ivx = ((b.a)localObject).KT();
    localObject = (zf)this.ivx.dID.dIL;
    LinkedList localLinkedList = new LinkedList();
    if (paramList != null)
    {
      String[] arrayOfString = new String[paramList.size()];
      paramList.toArray(arrayOfString);
      int j = arrayOfString.length;
      while (i < j)
      {
        paramList = arrayOfString[i];
        if (!bi.oW(paramList)) {
          localLinkedList.add(ab.oT(paramList));
        }
        i += 1;
      }
    }
    ((zf)localObject).rFm = localLinkedList;
    ((zf)localObject).hbF = localLinkedList.size();
  }
  
  private static void a(f paramf, ho paramho)
  {
    int k = 0;
    if (paramf == null)
    {
      paramf = new f();
      paramf.field_appId = paramho.jQb;
    }
    for (int i = 1;; i = 0)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetAppInfoList", "appid:[%s], appinfoflag:[%d] AppSupportContentType:%d", new Object[] { paramho.jQb, Integer.valueOf(paramho.jPj), Long.valueOf(paramho.riz) });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetAppInfoList", "appId=%s, appName=%s, status=%s, appInfoFlag=%s", new Object[] { paramf.field_appId, paramf.field_appName, Integer.valueOf(paramf.field_status), Integer.valueOf(paramf.field_appInfoFlag) });
      if ((!paramf.cbJ()) || (bi.oW(paramf.field_appName))) {
        paramf.field_appName = paramho.jPe;
      }
      if ((!paramf.cbJ()) || (bi.oW(paramf.field_appName_en))) {
        paramf.field_appName_en = paramho.rik;
      }
      if ((!paramf.cbJ()) || (bi.oW(paramf.field_appName_tw))) {
        paramf.field_appName_tw = paramho.rim;
      }
      paramf.field_appDiscription = paramho.rej;
      paramf.field_appDiscription_en = paramho.ril;
      paramf.field_appDiscription_tw = paramho.rin;
      paramf.field_appWatermarkUrl = paramho.rir;
      paramf.field_packageName = paramho.rbj;
      paramf.field_signature = p.Ta(paramho.ris);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetAppInfoList", "get signature, server sig : %s, gen sig: %s ", new Object[] { paramho.ris, paramf.field_signature });
      paramf.field_appType = paramho.rit;
      if ((!bi.oW(paramf.field_appType)) && ((paramf.field_appType.startsWith("1")) || (paramf.field_appType.startsWith("6")))) {
        paramf.field_appType = ("," + paramf.field_appType);
      }
      paramf.field_appInfoFlag = paramho.jPj;
      paramf.field_appVersion = paramho.riv;
      paramf.dh(paramho.riu);
      paramf.field_appWatermarkUrl = paramho.rir;
      if ((!bi.oW(paramho.rcY)) && (!bi.oW(paramho.riy)))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetAppInfoList", "get app download url and download md5 : [%s], [%s], [%s]", new Object[] { paramf.field_appName, paramho.rcY, paramho.riy });
        paramf.di(paramho.rcY);
        paramf.dl(paramho.riy);
      }
      paramf.dm(paramho.rbk);
      paramf.field_svrAppSupportContentType = paramho.riz;
      if (paramho.riw > paramf.cmF)
      {
        paramf.cmG = 1;
        paramf.clZ = true;
      }
      paramf.cmF = paramho.riw;
      paramf.clZ = true;
      Object localObject = paramho.rbj;
      String str = paramho.rbj;
      int j;
      if ((localObject == null) || (((String)localObject).length() == 0) || (str == null) || (str.length() == 0))
      {
        j = 1;
        if (j != 0) {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetAppInfoList", "no android app, packageName = " + paramho.rbj + "appid: " + paramf.field_appId);
        }
        if (paramf.aaq()) {
          com.tencent.mm.pluginsdk.ui.tools.b.TX(paramf.field_appId);
        }
        localObject = a.bmf();
        if (i == 0) {
          break label736;
        }
        if (j == 0) {
          break label668;
        }
        i = 3;
        label587:
        paramf.field_status = i;
        paramf.field_modifyTime = System.currentTimeMillis();
        paramf.field_appIconUrl = paramho.rip;
        if (paramf.field_appId != null) {
          i = k;
        }
      }
      for (;;)
      {
        if (i < qAp.length)
        {
          if (paramf.field_appId.equals(qAp[i])) {
            paramf.field_status = -1;
          }
        }
        else
        {
          if (((i)localObject).l(paramf)) {
            break label680;
          }
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetAppInfoList", "onGYNetEnd : insert fail");
          return;
          j = 0;
          break;
          label668:
          i = 4;
          break label587;
        }
        i += 1;
      }
      label680:
      a.bmd().cO(paramf.field_appId, 1);
      a.bmd().cO(paramf.field_appId, 2);
      a.bmd().cO(paramf.field_appId, 3);
      a.bmd().cO(paramf.field_appId, 4);
      a.bmd().cO(paramf.field_appId, 5);
      return;
      label736:
      label756:
      label807:
      boolean bool;
      if (j != 0)
      {
        i = 3;
        paramf.field_status = i;
        if (paramf.field_appId != null)
        {
          i = 0;
          if (i < qAp.length)
          {
            if (!paramf.field_appId.equals(qAp[i])) {
              break label957;
            }
            paramf.field_status = -1;
          }
        }
        if ((paramf != null) && (paramf.field_appIconUrl != null) && (paramf.field_appIconUrl.length() != 0)) {
          break label964;
        }
        i = 1;
        if (i == 0) {
          break label1014;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetAppInfoList", "oldIcon = %s, newIcon = %s", new Object[] { paramf.field_appIconUrl, paramho.rip });
        paramf.field_appIconUrl = paramho.rip;
        bool = ((i)localObject).a(paramf, new String[0]);
        a.bmd().cO(paramf.field_appId, 1);
        a.bmd().cO(paramf.field_appId, 2);
        a.bmd().cO(paramf.field_appId, 3);
        a.bmd().cO(paramf.field_appId, 4);
        a.bmd().cO(paramf.field_appId, 5);
      }
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetAppInfoList", "update appinfo " + bool + ", appid = " + paramho.jQb);
        return;
        i = paramf.field_status;
        break;
        label957:
        i += 1;
        break label756;
        label964:
        if ((paramho == null) || (paramho.rix == null) || (paramho.rix.length() == 0))
        {
          i = 0;
          break label807;
        }
        if (!paramf.field_appIconUrl.equals(paramho.rip))
        {
          i = 1;
          break label807;
        }
        i = 0;
        break label807;
        label1014:
        bool = ((i)localObject).a(paramf, new String[0]);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetAppInfoList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetAppInfoList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    }
    for (;;)
    {
      return;
      paramString = ((zg)this.ivx.dIE.dIL).rFn;
      if ((paramString != null) && (!paramString.isEmpty()))
      {
        paramString = paramString.iterator();
        while (paramString.hasNext())
        {
          paramq = (ho)paramString.next();
          if (paramq != null) {
            a(g.bl(paramq.jQb, false), paramq);
          }
        }
      }
    }
  }
  
  public final void bg(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetAppInfoList", "buf is null");
      return;
    }
    try
    {
      this.ivx.dIE.G(paramArrayOfByte);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetAppInfoList", "parse error: " + paramArrayOfByte.getMessage());
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneGetAppInfoList", paramArrayOfByte, "", new Object[0]);
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
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetAppInfoList", "toProtBuf failed: " + localException.getMessage());
    }
    return null;
  }
  
  public final int getType()
  {
    return 7;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */