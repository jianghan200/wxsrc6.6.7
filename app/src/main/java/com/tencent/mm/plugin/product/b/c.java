package com.tencent.mm.plugin.product.b;

import android.app.Activity;
import android.content.Intent;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.plugin.product.c.f;
import com.tencent.mm.plugin.product.c.h;
import com.tencent.mm.plugin.product.c.j;
import com.tencent.mm.plugin.product.c.k;
import com.tencent.mm.plugin.product.c.l;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.apx;
import com.tencent.mm.protocal.c.au;
import com.tencent.mm.protocal.c.bbs;
import com.tencent.mm.protocal.c.bfm;
import com.tencent.mm.protocal.c.bie;
import com.tencent.mm.protocal.c.bnx;
import com.tencent.mm.protocal.c.cf;
import com.tencent.mm.protocal.c.sg;
import com.tencent.mm.protocal.c.um;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.y.g.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class c
{
  private d lQK = null;
  public m lQL;
  public List<n> lQM;
  public String lQN;
  public String lQO;
  public String lQP;
  public um lQQ;
  public cf lQR;
  public bfm lQS;
  public String lQT;
  public String lQU;
  public int lQV;
  public Map<String, e> lQW;
  public Map<String, String> lQX = new HashMap();
  public LinkedList<um> lQY;
  public LinkedList<au> lQZ;
  public e lRa;
  private com.tencent.mm.plugin.product.ui.e lRb;
  public Map<String, LinkedList<sg>> lRc = null;
  public int mCount = 1;
  
  public static String I(Map<String, String> paramMap)
  {
    if ((paramMap == null) || (paramMap.isEmpty())) {
      return null;
    }
    Object localObject = new ArrayList(paramMap.entrySet());
    Collections.sort((List)localObject, new c.1());
    paramMap = new StringBuilder();
    localObject = ((ArrayList)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      paramMap.append((String)localEntry.getKey()).append(":").append((String)localEntry.getValue()).append(";");
    }
    paramMap.deleteCharAt(paramMap.lastIndexOf(";"));
    return paramMap.toString();
  }
  
  private int JA(String paramString)
  {
    int k = 0;
    int i = 0;
    int j = k;
    if (this.lRc != null)
    {
      j = k;
      if (this.lRc.size() > 0)
      {
        paramString = (LinkedList)this.lRc.get(paramString);
        j = k;
        if (paramString != null)
        {
          j = k;
          if (paramString.size() > 0)
          {
            paramString = paramString.iterator();
            for (;;)
            {
              j = i;
              if (!paramString.hasNext()) {
                break;
              }
              i = ((sg)paramString.next()).rlz + i;
            }
          }
        }
      }
    }
    return j;
  }
  
  private void a(String[] paramArrayOfString, l paraml)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0)) {
      return;
    }
    int k = paramArrayOfString.length;
    int i = 1;
    label16:
    StringBuilder localStringBuilder;
    e locale;
    if (i <= -1 >>> 32 - k)
    {
      localStringBuilder = new StringBuilder();
      int j = 0;
      while (j < k)
      {
        if (i << 31 - j >> 31 == -1) {
          localStringBuilder.append(paramArrayOfString[j]).append(";");
        }
        j += 1;
      }
      localStringBuilder.deleteCharAt(localStringBuilder.lastIndexOf(";"));
      locale = (e)this.lQW.get(localStringBuilder.toString());
      if (locale == null) {
        break label185;
      }
      if (locale.lRe < paraml.lRS) {
        locale.lRe = paraml.lRS;
      }
      if (locale.lRf > paraml.lRS) {
        locale.lRf = paraml.lRS;
      }
      locale.lRn += paraml.lRn;
    }
    for (;;)
    {
      i += 1;
      break label16;
      break;
      label185:
      locale = new e();
      locale.lRe = paraml.lRS;
      locale.lRf = paraml.lRS;
      locale.lRn = paraml.lRn;
      locale.lRT = paraml.lRT;
      locale.url = paraml.url;
      this.lQW.put(localStringBuilder.toString(), locale);
    }
  }
  
  public final LinkedList<com.tencent.mm.plugin.product.c.a> D(Activity paramActivity)
  {
    LinkedList localLinkedList = new LinkedList();
    if (this.lQZ != null)
    {
      Iterator localIterator = this.lQZ.iterator();
      while (localIterator.hasNext())
      {
        au localau = (au)localIterator.next();
        com.tencent.mm.plugin.product.c.a locala = new com.tencent.mm.plugin.product.c.a();
        locala.jPe = localau.jPe;
        locala.lRx = localau.lRx;
        locala.jSA = localau.jSA;
        locala.hcE = localau.hcE;
        locala.jPG = localau.jPG;
        if (locala.hcE == 1)
        {
          int i = JA(locala.jSA);
          if (i > 0) {
            locala.lRx = paramActivity.getString(a.i.mall_product_submit_preferential_summray, new Object[] { b.d(i, this.lQL.lRp.lNV) });
          }
        }
        localLinkedList.add(locala);
      }
    }
    return localLinkedList;
  }
  
  public final void W(Intent paramIntent)
  {
    cf localcf = new cf();
    localcf.hbL = bi.aG(paramIntent.getStringExtra("userName"), "");
    localcf.rcz = bi.aG(paramIntent.getStringExtra("telNumber"), "");
    localcf.rcA = bi.aG(paramIntent.getStringExtra("addressPostalCode"), "");
    localcf.eJI = bi.aG(paramIntent.getStringExtra("proviceFirstStageName"), "");
    localcf.eJJ = bi.aG(paramIntent.getStringExtra("addressCitySecondStageName"), "");
    localcf.eJQ = bi.aG(paramIntent.getStringExtra("addressCountiesThirdStageName"), "");
    localcf.jQf = bi.aG(paramIntent.getStringExtra("addressDetailInfo"), "");
    if ((!bi.oW(localcf.hbL)) && (!bi.oW(localcf.rcz))) {
      this.lQR = localcf;
    }
  }
  
  public final String a(m paramm)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<mallProductInfo>");
    localStringBuilder.append("<type>").append(paramm.lRm).append("</type>");
    localStringBuilder.append("<id>").append(paramm.lRl).append("</id>");
    localStringBuilder.append("<version>").append(paramm.lRp.version).append("</version>");
    localStringBuilder.append("<name>").append(bi.WS(paramm.lRp.name)).append("</name>");
    localStringBuilder.append("<highPrice>").append(paramm.lRp.lRB).append("</highPrice>");
    localStringBuilder.append("<lowPrice>").append(paramm.lRp.lRC).append("</lowPrice>");
    localStringBuilder.append("<originPrice>").append(paramm.lRp.lRA).append("</originPrice>");
    localStringBuilder.append("<sourceUrl>").append(bi.WS(this.lQL.lRt)).append("</sourceUrl>");
    if (paramm.lRp.lRD != null)
    {
      localStringBuilder.append("<imgCount>").append(paramm.lRp.lRD.size()).append("</imgCount>");
      localStringBuilder.append("<imgList>");
      Iterator localIterator = paramm.lRp.lRD.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localStringBuilder.append("<imgUrl>").append(bi.WS(str)).append("</imgUrl>");
      }
      localStringBuilder.append("</imgList>");
    }
    localStringBuilder.append("<shareInfo>");
    localStringBuilder.append("<shareUrl>").append(bi.WS(bmQ())).append("</shareUrl>");
    localStringBuilder.append("<shareThumbUrl>").append(bi.WS(paramm.bnb())).append("</shareThumbUrl>");
    localStringBuilder.append("</shareInfo>");
    if (this.lQL.lRq != null)
    {
      localStringBuilder.append("<sellerInfo>");
      localStringBuilder.append("<appID>").append(paramm.lRq.bPS).append("</appID>");
      localStringBuilder.append("<appName>").append(paramm.lRq.name).append("</appName>");
      localStringBuilder.append("<usrName>").append(paramm.lRq.username).append("</usrName>");
      localStringBuilder.append("</sellerInfo>");
    }
    localStringBuilder.append("</mallProductInfo>");
    return localStringBuilder.toString();
  }
  
  public final void a(m paramm, List<n> paramList)
  {
    int j = 0;
    clear();
    this.lQL = paramm;
    this.lQM = paramList;
    if (bi.oW(this.lQL.lRt)) {
      this.lQL.lRt = this.lQO;
    }
    paramm = this.lQL.lRr;
    this.lQW = new HashMap();
    if ((paramm == null) || (paramm.size() <= 0))
    {
      if ((this.lQL.lRp != null) && (this.lQL.lRp.lRJ != null)) {
        this.lQV = this.lQL.lRp.lRJ.size();
      }
      if ((this.lQL.lRp != null) && (this.lQL.lRp.lRD != null) && (this.lQL.lRp.lRD.size() > 0)) {
        this.lQT = ((String)this.lQL.lRp.lRD.get(0));
      }
      if (!bi.oW(this.lQL.bnb()))
      {
        y.a(new com.tencent.mm.plugin.product.ui.c(this.lQL.bnb()));
        x.d("MicroMsg.MallProductManager", "product img path : " + bmP());
      }
      if ((this.lQL.lRs == null) || (this.lQL.lRs.lRN == null)) {
        break label353;
      }
    }
    label353:
    for (int i = this.lQL.lRs.lRN.bWA;; i = 0)
    {
      if (this.lQL.lRq != null) {
        j = this.lQL.lRq.bWA;
      }
      this.lRb = new com.tencent.mm.plugin.product.ui.e(i, j);
      return;
      int k = paramm.size();
      i = 0;
      while (i < k)
      {
        paramList = (l)paramm.get(i);
        a(paramList.lRR.split(";"), paramList);
        i += 1;
      }
      bmX();
      break;
    }
  }
  
  public final com.tencent.mm.plugin.product.ui.e bmI()
  {
    if (this.lRb == null) {
      this.lRb = new com.tencent.mm.plugin.product.ui.e(0, 0);
    }
    return this.lRb;
  }
  
  public final String bmJ()
  {
    if ((this.lRa != null) && (!bi.oW(this.lRa.url))) {
      return this.lRa.url;
    }
    return this.lQT;
  }
  
  public final String bmK()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = this.lQL.lRp.lRJ.iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        break label127;
      }
      Object localObject = (com.tencent.mm.plugin.product.c.m)localIterator.next();
      String str = (String)this.lQX.get(((com.tencent.mm.plugin.product.c.m)localObject).lRU);
      if (str != null)
      {
        localObject = ((com.tencent.mm.plugin.product.c.m)localObject).lRW.iterator();
        if (((Iterator)localObject).hasNext())
        {
          h localh = (h)((Iterator)localObject).next();
          if (!str.equals(localh.id)) {
            break;
          }
          localStringBuilder.append(localh.name).append(" ");
        }
      }
    }
    label127:
    return localStringBuilder.toString();
  }
  
  public final int bmL()
  {
    int j = 0;
    int i = j;
    if (!bmI().bne())
    {
      i = j;
      if (this.lQQ != null) {
        i = this.lQQ.rlz + 0;
      }
    }
    if (this.lRa != null) {
      i += this.lRa.lRe * this.mCount;
    }
    for (;;)
    {
      return i - bmM();
      i += this.lQL.lRp.lRB * this.mCount;
    }
  }
  
  public final int bmM()
  {
    int j = 0;
    int i = j;
    if (this.lRc != null)
    {
      i = j;
      if (this.lRc.size() > 0)
      {
        Iterator localIterator = this.lRc.values().iterator();
        for (i = 0; localIterator.hasNext(); i = j)
        {
          Object localObject = (LinkedList)localIterator.next();
          j = i;
          if (localObject != null)
          {
            j = i;
            if (((LinkedList)localObject).size() > 0)
            {
              localObject = ((LinkedList)localObject).iterator();
              for (;;)
              {
                j = i;
                if (!((Iterator)localObject).hasNext()) {
                  break;
                }
                i += ((sg)((Iterator)localObject).next()).rlz;
              }
            }
          }
        }
      }
    }
    return i;
  }
  
  public final bfm bmN()
  {
    Object localObject2 = null;
    Object localObject1;
    if (this.lQS != null) {
      localObject1 = this.lQS;
    }
    cf localcf;
    do
    {
      do
      {
        return (bfm)localObject1;
        if (this.lQK == null) {
          this.lQK = com.tencent.mm.plugin.product.a.a.bmF().bmH();
        }
        localObject1 = this.lQK;
        if ((((d)localObject1).lRd != null) && (((d)localObject1).lRd.size() > 0)) {}
        for (localObject1 = (String)((d)localObject1).lRd.get(0); !bi.oW((String)localObject1); localObject1 = null)
        {
          this.lQS = new bfm();
          this.lQS.jQf = ((String)localObject1);
          this.lQS.sgM = 1;
          return this.lQS;
        }
        localcf = this.lQR;
        localObject1 = localObject2;
      } while (localcf == null);
      localObject1 = localObject2;
    } while (bi.oW(localcf.hbL));
    this.lQS = new bfm();
    this.lQS.jQf = localcf.hbL;
    this.lQS.sgM = 1;
    return this.lQS;
  }
  
  public final String bmO()
  {
    if (this.lQL.lRq != null) {
      return this.lQL.lRq.username;
    }
    return null;
  }
  
  public final String bmP()
  {
    if (!bi.oW(this.lQL.bnb())) {
      return com.tencent.mm.plugin.product.ui.c.JC(this.lQL.bnb());
    }
    return null;
  }
  
  public final String bmQ()
  {
    if ((this.lQL.lRp != null) && (this.lQL.lRp.lRL != null)) {
      return this.lQL.lRp.lRL.url;
    }
    if (!bi.oW(this.lQL.lRt)) {
      return this.lQL.lRt;
    }
    return this.lQO;
  }
  
  public final int bmR()
  {
    int j = this.lQL.lRn;
    int i = j;
    if (this.lRa != null)
    {
      i = j;
      if (j > this.lRa.lRn) {
        i = this.lRa.lRn;
      }
    }
    return i;
  }
  
  public final boolean bmS()
  {
    return (this.mCount > 0) && (this.lQL != null) && (this.mCount <= bmR()) && (this.lQL.lRp != null) && (this.lQL.lRp.lRJ != null);
  }
  
  public final boolean bmT()
  {
    if (!bmS()) {}
    do
    {
      do
      {
        do
        {
          return false;
        } while ((this.lQX == null) || (this.lQX.size() != this.lQV));
        if (this.lQV <= 0) {
          break;
        }
      } while ((this.lRa == null) || (this.mCount <= 0) || (this.mCount > bmR()));
      return true;
    } while (this.lQV != 0);
    return true;
  }
  
  public final boolean bmU()
  {
    if (!bmT()) {}
    while ((this.lQR == null) || ((!bmI().bne()) && (this.lQQ == null))) {
      return false;
    }
    return true;
  }
  
  public final LinkedList<bie> bmV()
  {
    LinkedList localLinkedList = new LinkedList();
    bie localbie = new bie();
    localbie.hbF = this.mCount;
    localbie.rJU = this.lQL.lRl;
    localbie.sdV = this.lQL.lRt;
    localbie.sdW = this.lQP;
    localLinkedList.add(localbie);
    return localLinkedList;
  }
  
  public final bnx bmW()
  {
    bnx localbnx = new bnx();
    localbnx.rmM = this.lQN;
    localbnx.lOS = 1;
    localbnx.slP = new LinkedList();
    bbs localbbs = new bbs();
    localbbs.hbF = this.mCount;
    localbbs.rJU = this.lQL.lRl;
    localbbs.jPe = this.lQL.lRp.name;
    if (this.lRa != null) {}
    Iterator localIterator;
    Object localObject;
    for (localbbs.sdU = this.lRa.lRe;; localbbs.sdU = this.lQL.lRp.lRB)
    {
      localbbs.sdV = this.lQL.lRt;
      localbbs.sdW = this.lQP;
      localbbs.hcE = this.lQL.lRm;
      localbbs.sdS = this.lQV;
      localbbs.sdT = new LinkedList();
      localIterator = this.lQX.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        String str = (String)this.lQX.get(localObject);
        apx localapx = new apx();
        localapx.riD = ((String)localObject);
        localapx.mEl = str;
        localbbs.sdT.add(localapx);
      }
    }
    localbbs.sea = new LinkedList();
    localbbs.sdZ = 0;
    if ((this.lRc != null) && (this.lRc.size() > 0))
    {
      localIterator = this.lRc.values().iterator();
      while (localIterator.hasNext())
      {
        localObject = (LinkedList)localIterator.next();
        localbbs.sea.addAll((Collection)localObject);
        int i = localbbs.sdZ;
        localbbs.sdZ = (((LinkedList)localObject).size() + i);
      }
    }
    localbnx.slP.add(localbbs);
    localbnx.slR = new LinkedList();
    localbnx.slS = 1;
    this.lQS = bmN();
    if (this.lQS != null) {
      localbnx.slR.add(this.lQS);
    }
    for (;;)
    {
      localbnx.rII = this.lQR;
      localbnx.slQ = this.lQQ;
      return localbnx;
      this.lQS = new bfm();
      this.lQS.sgM = 0;
      localbnx.slR.add(this.lQS);
    }
  }
  
  public final void bmX()
  {
    if (this.lQX == null) {}
    Iterator localIterator1;
    do
    {
      return;
      localIterator1 = this.lQL.lRp.lRJ.iterator();
    } while (!localIterator1.hasNext());
    com.tencent.mm.plugin.product.c.m localm = (com.tencent.mm.plugin.product.c.m)localIterator1.next();
    Iterator localIterator2 = localm.lRW.iterator();
    label50:
    h localh;
    Object localObject;
    String str2;
    boolean bool;
    if (localIterator2.hasNext())
    {
      localh = (h)localIterator2.next();
      localObject = localm.lRU;
      str2 = localh.id;
      if ((this.lQX != null) && (this.lQW != null)) {
        break label164;
      }
      bool = false;
    }
    for (;;)
    {
      localh.lRP = bool;
      x.d("MicroMsg.MallProductManager", "(" + localm.lRU + " , " + localh.id + ") hasStock--> " + localh.lRP);
      break label50;
      break;
      label164:
      String str1;
      if (this.lQX.containsKey(localObject))
      {
        str1 = (String)this.lQX.get(localObject);
        this.lQX.put(localObject, str2);
        str2 = I(this.lQX);
        this.lQX.put(localObject, str1);
        localObject = (e)this.lQW.get(str2);
        if (localObject != null)
        {
          if (((e)localObject).lRn > 0) {
            bool = true;
          } else {
            bool = false;
          }
        }
        else {
          bool = false;
        }
      }
      else
      {
        this.lQX.put(localObject, str2);
        str1 = I(this.lQX);
        this.lQX.remove(localObject);
        localObject = (e)this.lQW.get(str1);
        if (localObject != null)
        {
          if (((e)localObject).lRn > 0) {
            bool = true;
          } else {
            bool = false;
          }
        }
        else {
          bool = false;
        }
      }
    }
  }
  
  public final String bmY()
  {
    g.a locala = new g.a();
    locala.title = this.lQL.lRp.name;
    locala.description = bmZ();
    locala.type = 13;
    locala.url = bmQ();
    locala.thumburl = this.lQL.bnb();
    locala.dwX = this.lQL.lRm;
    locala.dwY = a(this.lQL);
    return g.a.a(locala, null, null);
  }
  
  public final String bmZ()
  {
    return b.d(this.lQL.lRp.lRC, this.lQL.lRp.lNV);
  }
  
  public final void clear()
  {
    this.lQL = null;
    if (this.lQM != null)
    {
      this.lQM.clear();
      this.lQM = null;
    }
    this.lQN = null;
    this.lQO = null;
    this.mCount = 1;
    this.lQP = null;
    this.lQQ = null;
    this.lQS = null;
    this.lQT = null;
    this.lQV = 0;
    this.lRa = null;
    if (this.lQW != null)
    {
      this.lQW.clear();
      this.lQW = null;
    }
    if (this.lQX != null) {
      this.lQX.clear();
    }
    if (this.lQY != null)
    {
      this.lQY.clear();
      this.lQY = null;
    }
    if (this.lRc != null)
    {
      this.lRc.clear();
      this.lRc = null;
    }
  }
  
  public final String getAppId()
  {
    if (this.lQL.lRq != null) {
      return this.lQL.lRq.bPS;
    }
    return null;
  }
  
  public final void uw(int paramInt)
  {
    if (this.lQY == null) {}
    while ((paramInt >= this.lQY.size()) || (paramInt < 0)) {
      return;
    }
    this.lQQ = ((um)this.lQY.get(paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/product/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */