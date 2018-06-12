package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.g.c.p;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.ac.a.a;
import com.tencent.mm.plugin.ac.a.a.a;
import com.tencent.mm.protocal.c.aig;
import com.tencent.mm.protocal.c.aih;
import com.tencent.mm.protocal.c.ba;
import com.tencent.mm.protocal.c.bet;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.cib;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Iterator;
import java.util.LinkedList;

public final class ah
  extends x
{
  private int dPU;
  LinkedList<f> qAr;
  private LinkedList<f> qAs;
  private LinkedList<String> qAt;
  
  public ah(String paramString, LinkedList<String> paramLinkedList)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetSuggestionAppList", "offset: 0, limit = 20, lang = " + paramString + "installedApp list size: " + paramLinkedList.size());
    Object localObject = paramLinkedList.iterator();
    while (((Iterator)localObject).hasNext()) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetSuggestionAppList", "install id:[%s]", new Object[] { (String)((Iterator)localObject).next() });
    }
    this.dPU = 3;
    localObject = new b.a();
    ((b.a)localObject).dIG = new aig();
    ((b.a)localObject).dIH = new aih();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getsuggestionapplist";
    ((b.a)localObject).dIF = 409;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.ivx = ((b.a)localObject).KT();
    localObject = (aig)this.ivx.dID.dIL;
    ((aig)localObject).jPr = 3;
    ((aig)localObject).jSa = 0;
    ((aig)localObject).jSb = 20;
    ((aig)localObject).jRj = paramString;
    paramString = aq(paramLinkedList);
    ((aig)localObject).rLd = paramString.size();
    ((aig)localObject).jRK = paramString;
    this.qAr = new LinkedList();
    this.qAs = new LinkedList();
    this.qAt = new LinkedList();
    this.qAt.addAll(paramLinkedList);
  }
  
  private static void a(f paramf, ba paramba)
  {
    paramf.di(paramba.rbg);
    paramf.dl(paramba.jPT);
    paramf.dj(paramba.rbi);
    paramf.field_appName = paramba.jSv;
    paramf.field_appIconUrl = paramba.rbh;
    paramf.dm(paramba.rbk);
    paramf.cmU = paramba.rbm;
    paramf.clZ = true;
    a(paramf, paramba.rbl);
  }
  
  private static void a(f paramf, bet parambet)
  {
    paramf.di(parambet.rbg);
    paramf.field_appIconUrl = parambet.rbh;
    paramf.dh(parambet.sgh);
    paramf.field_appName = parambet.jSv;
    paramf.dj(parambet.rbi);
    paramf.field_appType = parambet.rit;
    paramf.dl(parambet.jPT);
    paramf.field_packageName = parambet.rbj;
    paramf.dm(parambet.rbk);
    if (!bi.oW(parambet.rbk))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetSuggestionAppList", "google play download url is : %s, download flag is %d", new Object[] { parambet.rbk, Integer.valueOf(parambet.sgr) });
      paramf.eA(parambet.sgr);
    }
    paramf.dn(parambet.sgo);
    paramf.jdMethod_do(parambet.sgp);
    a(paramf, parambet.rbl);
    if ((!bi.oW(paramf.field_appType)) && ((paramf.field_appType.startsWith("1")) || (paramf.field_appType.startsWith("6"))))
    {
      if (!paramf.field_appType.endsWith(",")) {
        paramf.field_appType += ",";
      }
      paramf.field_appType = ("," + paramf.field_appType);
    }
  }
  
  private static void a(f paramf, cib paramcib)
  {
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.NetSceneGetSuggestionAppList", "dealYYBDownloadInfos, appId = %s", new Object[] { paramf.field_appId });
    if (paramcib != null)
    {
      paramf.eA(paramcib.sBY);
      paramf.dr(paramcib.rcY);
      paramf.ds(paramcib.jTz);
      paramf.dp(paramcib.sBZ);
      paramf.dq(paramcib.jTB);
      paramf.cmS = paramcib.jTC;
      paramf.clZ = true;
      paramf.eB(paramcib.jTD);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetSuggestionAppList", "get yyb download infos:[%d],[%s],[%s],[%s],[%s],[%s],[%d]", new Object[] { Integer.valueOf(paramcib.sBY), paramcib.rcY, paramcib.jTz, paramcib.sBZ, paramcib.jTB, paramcib.jTC, Integer.valueOf(paramcib.jTD) });
    }
  }
  
  private void a(i parami, LinkedList<ba> paramLinkedList)
  {
    if ((paramLinkedList != null) && (paramLinkedList.size() > 0))
    {
      Iterator localIterator = paramLinkedList.iterator();
      if (localIterator.hasNext())
      {
        ba localba = (ba)localIterator.next();
        paramLinkedList = g.bl(localba.jPc, true);
        if (paramLinkedList != null)
        {
          a(paramLinkedList, localba);
          parami.a(paramLinkedList, new String[0]);
        }
        for (;;)
        {
          this.qAs.add(paramLinkedList);
          break;
          paramLinkedList = new f();
          paramLinkedList.field_appId = localba.jPc;
          a(paramLinkedList, localba);
          parami.l(paramLinkedList);
        }
      }
    }
  }
  
  private static LinkedList<bhz> aq(LinkedList<String> paramLinkedList)
  {
    LinkedList localLinkedList = new LinkedList();
    if (paramLinkedList == null) {
      return localLinkedList;
    }
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      String str = (String)paramLinkedList.next();
      if (!bi.oW(str)) {
        localLinkedList.add(ab.oT(str));
      }
    }
    return localLinkedList;
  }
  
  private void b(i parami, LinkedList<bet> paramLinkedList)
  {
    if ((paramLinkedList != null) && (paramLinkedList.size() > 0))
    {
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        bet localbet = (bet)localIterator.next();
        if (bi.oW(localbet.jPc))
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetSuggestionAppList", "error appinfo, the appid is null");
        }
        else
        {
          boolean bool4 = true;
          boolean bool1 = true;
          boolean bool3 = false;
          paramLinkedList = g.bl(localbet.jPc, true);
          label131:
          boolean bool2;
          if (paramLinkedList != null)
          {
            a(paramLinkedList, localbet);
            if (this.dPU == 3)
            {
              paramLinkedList.field_status = 5;
              if ((bi.oW(paramLinkedList.cmM)) || (bi.oW(paramLinkedList.cmL))) {
                if (paramLinkedList.cmM != null)
                {
                  bool1 = true;
                  if (paramLinkedList.cmL == null) {
                    break label255;
                  }
                  bool2 = true;
                  label141:
                  com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetSuggestionAppList", "wrong suggestion params1, has IntroUrl %s, has IconUrl %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
                  bool1 = false;
                }
              }
            }
            for (bool2 = false;; bool2 = parami.a(paramLinkedList, new String[0]))
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetSuggestionAppList", "update appinfo: AppID = %s, ret = %s, needAddToList = %s", new Object[] { localbet.jPc, Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
              label208:
              if ((!bool1) || (this.qAt.contains(localbet.jPc)) || (this.qAr.contains(paramLinkedList))) {
                break label419;
              }
              this.qAr.add(paramLinkedList);
              break;
              bool1 = false;
              break label131;
              label255:
              bool2 = false;
              break label141;
            }
          }
          paramLinkedList = new f();
          paramLinkedList.field_appId = localbet.jPc;
          a(paramLinkedList, localbet);
          if (this.dPU == 3)
          {
            paramLinkedList.field_status = 5;
            if ((bi.oW(paramLinkedList.cmM)) || (bi.oW(paramLinkedList.cmL))) {
              if (paramLinkedList.cmM != null)
              {
                bool1 = true;
                label340:
                if (paramLinkedList.cmL == null) {
                  break label426;
                }
                bool2 = true;
                label350:
                com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetSuggestionAppList", "wrong suggestion params2, has IntroUrl %s, has IconUrl %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
                bool1 = false;
                bool2 = bool3;
              }
            }
          }
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetSuggestionAppList", "insert appinfo: AppID = %s, ret = %s, needAddToList = %s", new Object[] { localbet.jPc, Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
            break label208;
            label419:
            break;
            bool1 = false;
            break label340;
            label426:
            bool2 = false;
            break label350;
            bool2 = parami.l(paramLinkedList);
            bool1 = bool4;
          }
        }
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetSuggestionAppList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetSuggestionAppList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      return;
    }
    paramString = (aih)this.ivx.dIE.dIL;
    if (paramString == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetSuggestionAppList", "resp == null");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.NetSceneGetSuggestionAppList", "suggestion app count = %s, appType = %s, ", new Object[] { Integer.valueOf(paramString.rLe), Integer.valueOf(this.dPU) });
    paramq = a.a.bmm().bmk();
    b(paramq, paramString.rLf);
    a(paramq, paramString.jSI);
  }
  
  public final void bg(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetSuggestionAppList", "buf is null");
      return;
    }
    b.c localc = this.ivx.dIE;
    try
    {
      localc.G(paramArrayOfByte);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetSuggestionAppList", paramArrayOfByte.getMessage());
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneGetSuggestionAppList", paramArrayOfByte, "", new Object[0]);
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
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetSuggestionAppList", localException.getMessage());
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneGetSuggestionAppList", localException, "", new Object[0]);
    }
    return null;
  }
  
  public final int getType()
  {
    return 4;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */