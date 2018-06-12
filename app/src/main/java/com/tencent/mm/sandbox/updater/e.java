package com.tencent.mm.sandbox.updater;

import android.util.Base64;
import com.tencent.mm.c.i;
import com.tencent.mm.c.i.a;
import com.tencent.mm.protocal.c.avn;
import com.tencent.mm.protocal.c.bhl;
import com.tencent.mm.protocal.c.bsy;
import com.tencent.mm.protocal.c.bsz;
import com.tencent.mm.protocal.c.bta;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
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
  
  public e(bta parambta)
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
            this.knm = EJ(((bsy)localObject).value);
          } else if (((bsy)localObject).aAL.equalsIgnoreCase("alphaContent")) {
            this.knn = EJ(((bsy)localObject).value);
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
  
  public static boolean EI(String paramString)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (!bi.oW(paramString))
    {
      bool1 = bool2;
      if (paramString.length() != 10) {}
    }
    try
    {
      int i = Integer.decode(paramString).intValue();
      bool1 = bool2;
      if ((i & 0xFF) >= 0)
      {
        bool1 = bool2;
        if ((i & 0xFF) <= 31) {
          bool1 = true;
        }
      }
      return bool1;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("Tinker.TinkerSyncResponse", paramString, "checkAplhVersion failed.", new Object[0]);
    }
    return false;
  }
  
  private static String EJ(String paramString)
  {
    if (!bi.oW(paramString)) {
      return new String(Base64.decode(paramString, 0));
    }
    return "";
  }
  
  public final String cgW()
  {
    Object localObject = this.knh.substring(0, this.knh.lastIndexOf('/') + 1);
    String str = this.knh.substring(this.knh.lastIndexOf('/') + 1);
    localObject = new i((String)localObject, Integer.valueOf(this.versionCode).intValue());
    ((i)localObject).a(new i.a(this.knl, this.knk, this.kni, str, this.fileSize));
    return ((i)localObject).uv();
  }
  
  public final String toString()
  {
    return "responseState:" + this.knd + "\ncdnUrl:" + this.knh + "\nfileMd5:" + this.kni + "\npackageType:" + this.knf + "\nnetworkType:" + this.kng + "\npatchId:" + this.knj;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/sandbox/updater/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */