package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.g.c.cm;
import com.tencent.mm.k.g;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import java.util.Map;

public final class a
{
  public String bKg;
  public int bRt;
  public String desc;
  public long eiD;
  public long qzA;
  public int size;
  public String url;
  
  public a(String paramString)
  {
    Map localMap = bl.z(paramString, "msg");
    this.desc = ((String)localMap.get(".msg.appmsg.des"));
    this.bRt = bi.getInt((String)localMap.get(".msg.alphainfo.clientVersion"), 0);
    this.url = ((String)localMap.get(".msg.alphainfo.url"));
    this.size = bi.getInt((String)localMap.get(".msg.alphainfo.size"), 0);
    this.bKg = ((String)localMap.get(".msg.alphainfo.md5"));
    this.qzA = bi.getLong((String)localMap.get(".msg.alphainfo.maxAge"), 0L);
    this.eiD = bi.getLong((String)localMap.get(".msg.alphainfo.expireTime"), 0L);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AlphaUpdateInfo", "updateInfo, content:%s, clientVersion:%d, url:%s, size:%d, md5:%s, desc:%s, maxAge:%d, expireTime:%d", new Object[] { paramString, Integer.valueOf(this.bRt), this.url, Integer.valueOf(this.size), this.bKg, this.desc, Long.valueOf(this.qzA), Long.valueOf(this.eiD) });
  }
  
  private boolean bTJ()
  {
    au.HU();
    long l = ((Long)com.tencent.mm.model.c.DT().get(352274, Long.valueOf(System.currentTimeMillis()))).longValue();
    if ((System.currentTimeMillis() - l > this.qzA) || (System.currentTimeMillis() > this.eiD)) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AlphaUpdateInfo", "isExpired: %b", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
  }
  
  public static a cbF()
  {
    au.HU();
    Object localObject = (String)com.tencent.mm.model.c.DT().get(352273, "");
    if (!bi.oW((String)localObject))
    {
      localObject = new a((String)localObject);
      if ((!((a)localObject).isValid()) || (((a)localObject).bTJ()))
      {
        cbG();
        return null;
      }
    }
    else
    {
      return null;
    }
    return (a)localObject;
  }
  
  public static void cbG()
  {
    au.HU();
    com.tencent.mm.model.c.DT().set(352273, null);
    au.HU();
    com.tencent.mm.model.c.DT().set(352274, null);
  }
  
  private boolean isValid()
  {
    if ((this.bRt > com.tencent.mm.protocal.d.qVN) && (!bi.oW(this.url)) && (!bi.oW(this.bKg)) && (!bi.oW(this.desc))) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AlphaUpdateInfo", "isValid %b", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
  }
  
  public final void cbH()
  {
    com.tencent.mm.storage.bd localbd = new com.tencent.mm.storage.bd();
    localbd.ay(com.tencent.mm.model.bd.o("weixin", bi.VE()));
    localbd.setType(1);
    localbd.setContent(this.desc);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AlphaUpdateInfo", localbd.field_content);
    localbd.eX(0);
    localbd.ep("weixin");
    localbd.setStatus(3);
    com.tencent.mm.model.bd.i(localbd);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AlphaUpdateInfo", "insertUpdateTextMsg");
    cbG();
  }
  
  public final void cbI()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AlphaUpdateInfo", "downloadInSilence.");
    if ((!isValid()) || (bTJ())) {
      return;
    }
    int i;
    if (bi.WU(g.AT().getValue("SilentDownloadApkAtWiFi")) != 0) {
      i = 0;
    }
    while (i == 0)
    {
      cbH();
      return;
      au.HU();
      if ((((Integer)com.tencent.mm.model.c.DT().get(7, Integer.valueOf(0))).intValue() & 0x1000000) == 0)
      {
        i = 1;
        label77:
        if ((!ao.isWifi(ad.getContext())) || (i == 0)) {
          break label118;
        }
      }
      label118:
      for (i = 1;; i = 0)
      {
        if ((com.tencent.mm.sdk.platformtools.e.bxm & 0x1) == 0) {
          break label123;
        }
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AlphaUpdateInfo", "channel pack, not silence download.");
        i = 0;
        break;
        i = 0;
        break label77;
      }
      label123:
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AlphaUpdateInfo", "not channel pack.");
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AlphaUpdateInfo", "go to download, %s, %d, %s, %s", new Object[] { this.bKg, Integer.valueOf(this.size), this.desc, this.url });
    com.tencent.mm.plugin.y.d.bfB().c(this.bKg, this.size, this.desc.replaceFirst("(\n)*<a.*</a>(\n)*", "\n"), this.url);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */