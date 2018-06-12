package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.mm.protocal.c.bhi;
import com.tencent.mm.protocal.c.bhk;
import com.tencent.mm.protocal.c.bhl;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Locale;
import java.util.Map;

public final class e
{
  private static boolean d(int paramInt, String paramString, Map<String, String> paramMap)
  {
    boolean bool2 = false;
    boolean bool1;
    if ((paramMap.get(paramString + ".resType") == null) && (paramMap.get(paramString + ".subType") == null)) {
      bool1 = true;
    }
    int i;
    Object localObject;
    int j;
    int k;
    String str;
    int m;
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  return bool1;
                  if (!i.b.BR(paramInt)) {
                    break;
                  }
                  x.d("MicroMsg.CheckResUpdateNewXmlParser", "handleResourceDelete()");
                  paramInt = bi.getInt((String)paramMap.get(paramString + ".resType"), -1);
                  i = bi.getInt((String)paramMap.get(paramString + ".subType"), -1);
                  bool1 = bool2;
                } while (-1 == paramInt);
                bool1 = bool2;
              } while (-1 == i);
              localObject = new bhi();
              ((bhi)localObject).sdX = i;
              ((bhi)localObject).sih = new bhl();
              ((bhi)localObject).sih.sir = bi.getInt((String)paramMap.get(paramString + ".resVer"), 0);
              ((bhi)localObject).sik = ((String)paramMap.get(paramString + ".sampleID"));
              ((bhi)localObject).sij = bi.getInt((String)paramMap.get(paramString + ".reportID"), 0);
              ((bhi)localObject).rIr = i.b.qCs.bWA;
              b.c.ccr().a(paramInt, (bhi)localObject, true);
              j.n(((bhi)localObject).sij, 40L);
              return true;
              if (!i.b.BP(paramInt)) {
                break;
              }
              x.d("MicroMsg.CheckResUpdateNewXmlParser", "handleResourceCache()");
              localObject = (String)paramMap.get(paramString + ".CDNUrl");
              j = bi.getInt((String)paramMap.get(paramString + ".subType"), -1);
              k = bi.getInt((String)paramMap.get(paramString + ".resType"), -1);
              str = (String)paramMap.get(paramString + ".md5");
              m = bi.getInt((String)paramMap.get(paramString + ".priority"), 0);
              bool1 = bool2;
            } while (bi.oW((String)localObject));
            bool1 = bool2;
          } while (bi.oW(str));
          bool1 = bool2;
        } while (-1 == j);
        bool1 = bool2;
      } while (-1 == k);
      bool1 = bool2;
    } while (m < 0);
    bhi localbhi = new bhi();
    localbhi.sih = new bhl();
    if (bi.getInt((String)paramMap.get(paramString + ".fileEncrypt"), 0) > 0) {}
    for (paramInt = i.a.ccu();; paramInt = 0)
    {
      i = paramInt;
      if (bi.getInt((String)paramMap.get(paramString + ".fileCompress"), 0) > 0) {
        i = i.a.BN(paramInt);
      }
      localbhi.sdX = j;
      localbhi.sim = bi.getInt((String)paramMap.get(paramString + ".networkType"), 2);
      localbhi.rlY = bi.getInt((String)paramMap.get(paramString + ".expireTime"), 1);
      localbhi.sih.jPK = ((String)localObject);
      localbhi.sih.sir = bi.getInt((String)paramMap.get(paramString + ".resVer"), 0);
      localbhi.sih.rwt = str;
      localbhi.sih.siu = ((String)paramMap.get(paramString + ".originalmd5"));
      localbhi.sih.sis = i;
      localbhi.sih.sit = null;
      localbhi.sih.rwb = null;
      localbhi.rPB = m;
      localbhi.rIr = i.b.qCq.bWA;
      localbhi.sij = bi.getInt((String)paramMap.get(paramString + ".reportID"), 0);
      localbhi.sik = ((String)paramMap.get(paramString + ".sampleID"));
      localbhi.sil = bi.getInt((String)paramMap.get(paramString + ".retryTime"), 3);
      localbhi.sin = bi.getInt((String)paramMap.get(paramString + ".retryInterval"), 0);
      localbhi.qCh = 0;
      b.c.ccr().b(k, localbhi, true);
      j.n(localbhi.sij, 34L);
      return true;
      bool1 = bool2;
      if (!i.b.BQ(paramInt)) {
        break;
      }
      x.d("MicroMsg.CheckResUpdateNewXmlParser", "handleResourceDecrypt()");
      paramInt = bi.getInt((String)paramMap.get(paramString + ".resType"), -1);
      i = bi.getInt((String)paramMap.get(paramString + ".subType"), -1);
      bool1 = bool2;
      if (-1 == paramInt) {
        break;
      }
      bool1 = bool2;
      if (-1 == i) {
        break;
      }
      localObject = new bhi();
      ((bhi)localObject).sii = new bhk();
      ((bhi)localObject).sdX = i;
      ((bhi)localObject).sii.siq = ((String)paramMap.get(paramString + ".resKey"));
      ((bhi)localObject).sii.sip = bi.getInt((String)paramMap.get(paramString + ".resKeyVersion"), 0);
      ((bhi)localObject).sik = ((String)paramMap.get(paramString + ".sampleID"));
      ((bhi)localObject).sij = bi.getInt((String)paramMap.get(paramString + ".reportID"), 0);
      ((bhi)localObject).rIr = i.b.qCr.bWA;
      ((bhi)localObject).sih = new bhl();
      ((bhi)localObject).sih.siu = ((String)paramMap.get(paramString + ".originalmd5"));
      b.c.ccr().a(paramInt, (bhi)localObject, true, false);
      j.n(((bhi)localObject).sij, 37L);
      return true;
    }
  }
  
  static void f(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    if (t(String.format("%s.%s", new Object[] { paramString1, paramString2 }), paramMap)) {}
    boolean bool;
    do
    {
      int i;
      do
      {
        do
        {
          do
          {
            return;
            bool = g(paramString1, paramString2, paramMap) | false;
            i = 0;
            for (;;)
            {
              i += 1;
              if (t(String.format(Locale.US, "%s.%s%d", new Object[] { paramString1, paramString2, Integer.valueOf(i) }), paramMap)) {
                break;
              }
              bool |= g(paramString1, paramString2, paramMap);
            }
            i = i.b.Tk(paramString2);
            if (!i.b.BP(i)) {
              break;
            }
            j.n(0L, 32L);
          } while (bool);
          j.n(0L, 33L);
          return;
          if (!i.b.BQ(i)) {
            break;
          }
          j.n(0L, 35L);
        } while (bool);
        j.n(0L, 36L);
        return;
      } while (!i.b.BR(i));
      j.n(0L, 38L);
    } while (bool);
    j.n(0L, 39L);
  }
  
  private static boolean g(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    String str = String.format("%s.%s.%s", new Object[] { paramString1, paramString2, "Resource" });
    int j = i.b.Tk(paramString2);
    boolean bool2;
    if (t(str, paramMap))
    {
      bool2 = true;
      return bool2;
    }
    boolean bool1 = d(j, str, paramMap) | false;
    int i = 0;
    for (;;)
    {
      i += 1;
      str = String.format(Locale.US, "%s.%s.%s%d", new Object[] { paramString1, paramString2, "Resource", Integer.valueOf(i) });
      bool2 = bool1;
      if (t(str, paramMap)) {
        break;
      }
      bool1 |= d(j, str, paramMap);
    }
  }
  
  private static boolean t(String paramString, Map<String, String> paramMap)
  {
    return (paramMap.get(paramString) == null) && (paramMap.get(paramString + ".resType") == null) && (paramMap.get(paramString + ".subType") == null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */