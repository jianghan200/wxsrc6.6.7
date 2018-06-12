package com.tencent.mm.plugin.hp.d;

import android.content.Context;
import android.util.Base64;
import com.tencent.mm.protocal.c.avn;
import com.tencent.mm.protocal.c.bhl;
import com.tencent.mm.protocal.c.bsy;
import com.tencent.mm.protocal.c.bsz;
import com.tencent.mm.protocal.c.bta;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class b
{
  public String clientVersion;
  public final int fileSize;
  public final Integer knd;
  public HashMap<Integer, LinkedList<avn>> kne = new HashMap();
  public final Integer knf;
  public final Integer kng;
  public final String knh;
  public final String kni;
  public final String knj;
  public String knk;
  public String knl;
  public String knm;
  public String knn;
  public String kno;
  public int versionCode;
  
  public b(bta parambta)
  {
    if (parambta == null)
    {
      this.knd = Integer.valueOf(1);
      this.knh = "";
      this.kni = "";
      this.knf = Integer.valueOf(-1);
      this.kng = Integer.valueOf(-1);
      this.knj = "";
      this.fileSize = 0;
      this.knk = "";
      this.knl = "";
      this.versionCode = 0;
      this.clientVersion = "";
      this.knm = "";
      this.knn = "";
      this.kno = "";
    }
    for (;;)
    {
      return;
      if (parambta.sqv != null)
      {
        this.kni = parambta.sqv.rwt;
        this.knh = parambta.sqv.jPK;
      }
      Object localObject;
      for (this.fileSize = parambta.sqv.ruE;; this.fileSize = 0)
      {
        this.knd = Integer.valueOf(parambta.state);
        this.kng = Integer.valueOf(parambta.squ);
        if ((parambta.sqs == null) || (parambta.sqs.isEmpty())) {
          break;
        }
        int j = parambta.sqs.size();
        int i = 0;
        while (i < j)
        {
          localObject = (bsz)parambta.sqs.get(i);
          if ((((bsz)localObject).sqr != null) && (!((bsz)localObject).sqr.isEmpty())) {
            this.kne.put(Integer.valueOf(((bsz)localObject).type), ((bsz)localObject).sqr);
          }
          i += 1;
        }
        this.kni = "";
        this.knh = "";
      }
      this.knf = Integer.valueOf(parambta.sqt);
      this.knj = parambta.rsQ;
      if ((parambta.sqx == null) || (parambta.sqx.isEmpty())) {
        break;
      }
      parambta = parambta.sqx.iterator();
      while (parambta.hasNext())
      {
        localObject = (bsy)parambta.next();
        if ((localObject != null) && (!bi.oW(((bsy)localObject).aAL))) {
          if (((bsy)localObject).aAL.equalsIgnoreCase("newApkMd5")) {
            this.knk = ((bsy)localObject).value;
          } else if (((bsy)localObject).aAL.equalsIgnoreCase("oldApkMd5")) {
            this.knl = ((bsy)localObject).value;
          } else if (((bsy)localObject).aAL.equalsIgnoreCase("versionCode")) {
            this.versionCode = bi.WU(((bsy)localObject).value);
          } else if (((bsy)localObject).aAL.equalsIgnoreCase("clientVersion")) {
            this.clientVersion = ((bsy)localObject).value;
          } else if (((bsy)localObject).aAL.equalsIgnoreCase("alphaTitle")) {
            this.knm = c.EJ(((bsy)localObject).value);
          } else if (((bsy)localObject).aAL.equalsIgnoreCase("alphaContent")) {
            this.knn = c.EJ(((bsy)localObject).value);
          } else if (((bsy)localObject).aAL.equalsIgnoreCase("alphaUrl")) {
            this.kno = ((bsy)localObject).value;
          }
        }
      }
    }
    this.knk = "";
    this.knl = "";
    this.versionCode = 0;
    this.clientVersion = "";
    this.knm = "";
    this.knn = "";
    this.kno = "";
  }
  
  public static String a(HashMap<Integer, LinkedList<avn>> paramHashMap, int paramInt)
  {
    if ((paramHashMap == null) || (paramHashMap.isEmpty())) {
      localObject = "";
    }
    LinkedList localLinkedList;
    int i;
    do
    {
      String str;
      do
      {
        do
        {
          return (String)localObject;
          str = "";
          localLinkedList = (LinkedList)paramHashMap.get(Integer.valueOf(paramInt));
          localObject = str;
        } while (localLinkedList == null);
        localObject = str;
      } while (localLinkedList.isEmpty());
      i = localLinkedList.size();
      paramInt = 0;
      paramHashMap = str;
      localObject = paramHashMap;
    } while (paramInt >= i);
    Object localObject = (avn)localLinkedList.get(paramInt);
    if (((avn)localObject).lang.equalsIgnoreCase("default")) {
      paramHashMap = new String(Base64.decode(((avn)localObject).content, 0));
    }
    for (;;)
    {
      paramInt += 1;
      break;
      if (((avn)localObject).lang.equalsIgnoreCase(w.chP())) {
        return new String(Base64.decode(((avn)localObject).content, 0));
      }
    }
  }
  
  public final boolean aWw()
  {
    boolean bool2 = true;
    Context localContext = ad.getContext();
    boolean bool1;
    if (!ao.isConnected(localContext)) {
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (this.kng.intValue() == 1);
      bool1 = bool2;
    } while (this.kng.intValue() != 3);
    return ao.isWifi(localContext);
  }
  
  public final boolean aWx()
  {
    return (this.knd.intValue() == 2) || (this.knd.intValue() == 4);
  }
  
  public final boolean aWy()
  {
    return (this.kne != null) && (!this.kne.isEmpty()) && (this.kne.containsKey(Integer.valueOf(4)));
  }
  
  public final String aWz()
  {
    if (aWy()) {
      return a(this.kne, 4);
    }
    return "";
  }
  
  public final String toString()
  {
    return "responseState:" + this.knd + "\ncdnUrl:" + this.knh + "\nfileMd5:" + this.kni + "\npackageType:" + this.knf + "\nnetworkType:" + this.kng + "\npatchId:" + this.knj;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/hp/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */