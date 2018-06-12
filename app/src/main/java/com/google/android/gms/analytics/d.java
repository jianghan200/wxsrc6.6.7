package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.analytics.internal.k;
import com.google.android.gms.analytics.internal.m;
import com.google.android.gms.analytics.internal.n;
import com.google.android.gms.analytics.internal.p;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.c.ae;
import com.google.android.gms.c.ai;
import com.google.android.gms.c.aj;
import com.google.android.gms.c.ak;
import com.google.android.gms.c.al;
import com.google.android.gms.c.am;
import com.google.android.gms.c.an;
import com.google.android.gms.c.ao;
import com.google.android.gms.c.ap;
import com.google.android.gms.c.aq;
import com.google.android.gms.c.ar;
import com.google.android.gms.c.g;
import com.google.android.gms.c.h;
import com.google.android.gms.common.internal.w;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
  extends n
  implements ai
{
  private static DecimalFormat aIn;
  private final q aHe;
  private final String aIo;
  private final Uri aIp;
  private final boolean aIq;
  private final boolean aIr;
  
  public d(q paramq, String paramString)
  {
    this(paramq, paramString, (byte)0);
  }
  
  private d(q paramq, String paramString, byte paramByte)
  {
    super(paramq);
    w.bg(paramString);
    this.aHe = paramq;
    this.aIo = paramString;
    this.aIq = true;
    this.aIr = false;
    this.aIp = ba(this.aIo);
  }
  
  private static void a(Map<String, String> paramMap, String paramString, double paramDouble)
  {
    if (paramDouble != 0.0D) {
      paramMap.put(paramString, n(paramDouble));
    }
  }
  
  private static void a(Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2)
  {
    if ((paramInt1 > 0) && (paramInt2 > 0)) {
      paramMap.put(paramString, paramInt1 + "x" + paramInt2);
    }
  }
  
  private static void a(Map<String, String> paramMap, String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramMap.put(paramString, "1");
    }
  }
  
  private static void b(Map<String, String> paramMap, String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2)) {
      paramMap.put(paramString1, paramString2);
    }
  }
  
  public static Uri ba(String paramString)
  {
    w.bg(paramString);
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("uri");
    localBuilder.authority("google-analytics.com");
    localBuilder.path(paramString);
    return localBuilder.build();
  }
  
  private static Map<String, String> c(ae paramae)
  {
    HashMap localHashMap = new HashMap();
    Object localObject1 = (g)paramae.d(g.class);
    Object localObject3;
    Object localObject4;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject3 = Collections.unmodifiableMap(((g)localObject1).aFa).entrySet().iterator();
      label198:
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (Map.Entry)((Iterator)localObject3).next();
        localObject1 = ((Map.Entry)localObject4).getValue();
        if (localObject1 == null) {
          localObject1 = null;
        }
        for (;;)
        {
          if (localObject1 == null) {
            break label198;
          }
          localHashMap.put(((Map.Entry)localObject4).getKey(), localObject1);
          break;
          if ((localObject1 instanceof String))
          {
            localObject2 = (String)localObject1;
            localObject1 = localObject2;
            if (TextUtils.isEmpty((CharSequence)localObject2)) {
              localObject1 = null;
            }
          }
          else if ((localObject1 instanceof Double))
          {
            localObject1 = (Double)localObject1;
            if (((Double)localObject1).doubleValue() != 0.0D) {
              localObject1 = n(((Double)localObject1).doubleValue());
            } else {
              localObject1 = null;
            }
          }
          else if ((localObject1 instanceof Boolean))
          {
            if (localObject1 != Boolean.FALSE) {
              localObject1 = "1";
            } else {
              localObject1 = null;
            }
          }
          else
          {
            localObject1 = String.valueOf(localObject1);
          }
        }
      }
    }
    localObject1 = (h)paramae.d(h.class);
    if (localObject1 != null)
    {
      b(localHashMap, "t", ((h)localObject1).aWn);
      b(localHashMap, "cid", ((h)localObject1).aGl);
      b(localHashMap, "uid", ((h)localObject1).aWo);
      b(localHashMap, "sc", ((h)localObject1).aWr);
      a(localHashMap, "sf", ((h)localObject1).aWt);
      a(localHashMap, "ni", ((h)localObject1).aWs);
      b(localHashMap, "adid", ((h)localObject1).aWp);
      a(localHashMap, "ate", ((h)localObject1).aWq);
    }
    localObject1 = (ap)paramae.d(ap.class);
    if (localObject1 != null)
    {
      b(localHashMap, "cd", ((ap)localObject1).aYS);
      a(localHashMap, "a", ((ap)localObject1).aYT);
      b(localHashMap, "dr", ((ap)localObject1).aYW);
    }
    localObject1 = (an)paramae.d(an.class);
    if (localObject1 != null)
    {
      b(localHashMap, "ec", ((an)localObject1).pM);
      b(localHashMap, "ea", ((an)localObject1).aOA);
      b(localHashMap, "el", ((an)localObject1).aYO);
      a(localHashMap, "ev", ((an)localObject1).aYP);
    }
    localObject1 = (ak)paramae.d(ak.class);
    if (localObject1 != null)
    {
      b(localHashMap, "cn", ((ak)localObject1).mName);
      b(localHashMap, "cs", ((ak)localObject1).aYw);
      b(localHashMap, "cm", ((ak)localObject1).aYx);
      b(localHashMap, "ck", ((ak)localObject1).aYy);
      b(localHashMap, "cc", ((ak)localObject1).aYz);
      b(localHashMap, "ci", ((ak)localObject1).aEN);
      b(localHashMap, "anid", ((ak)localObject1).aYA);
      b(localHashMap, "gclid", ((ak)localObject1).aYB);
      b(localHashMap, "dclid", ((ak)localObject1).aYC);
      b(localHashMap, "aclid", ((ak)localObject1).aYD);
    }
    localObject1 = (ao)paramae.d(ao.class);
    if (localObject1 != null)
    {
      b(localHashMap, "exd", ((ao)localObject1).aYQ);
      a(localHashMap, "exf", ((ao)localObject1).aYR);
    }
    localObject1 = (aq)paramae.d(aq.class);
    if (localObject1 != null)
    {
      b(localHashMap, "sn", ((aq)localObject1).aZa);
      b(localHashMap, "sa", ((aq)localObject1).aOA);
      b(localHashMap, "st", ((aq)localObject1).aZb);
    }
    localObject1 = (ar)paramae.d(ar.class);
    if (localObject1 != null)
    {
      b(localHashMap, "utv", ((ar)localObject1).aZc);
      a(localHashMap, "utt", ((ar)localObject1).aZd);
      b(localHashMap, "utc", ((ar)localObject1).pM);
      b(localHashMap, "utl", ((ar)localObject1).aYO);
    }
    localObject1 = (com.google.android.gms.c.e)paramae.d(com.google.android.gms.c.e.class);
    if (localObject1 != null)
    {
      localObject1 = Collections.unmodifiableMap(((com.google.android.gms.c.e)localObject1).aWl).entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        localObject3 = e.l("cd", ((Integer)((Map.Entry)localObject2).getKey()).intValue());
        if (!TextUtils.isEmpty((CharSequence)localObject3)) {
          localHashMap.put(localObject3, ((Map.Entry)localObject2).getValue());
        }
      }
    }
    localObject1 = (com.google.android.gms.c.f)paramae.d(com.google.android.gms.c.f.class);
    if (localObject1 != null)
    {
      localObject1 = Collections.unmodifiableMap(((com.google.android.gms.c.f)localObject1).aWm).entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        localObject3 = e.l("cm", ((Integer)((Map.Entry)localObject2).getKey()).intValue());
        if (!TextUtils.isEmpty((CharSequence)localObject3)) {
          localHashMap.put(localObject3, n(((Double)((Map.Entry)localObject2).getValue()).doubleValue()));
        }
      }
    }
    localObject1 = (am)paramae.d(am.class);
    if (localObject1 != null)
    {
      localObject2 = ((am)localObject1).aYN;
      if (localObject2 != null)
      {
        localObject2 = new HashMap(((b)localObject2).aEM).entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (Map.Entry)((Iterator)localObject2).next();
          if (((String)((Map.Entry)localObject3).getKey()).startsWith("&")) {
            localHashMap.put(((String)((Map.Entry)localObject3).getKey()).substring(1), ((Map.Entry)localObject3).getValue());
          } else {
            localHashMap.put(((Map.Entry)localObject3).getKey(), ((Map.Entry)localObject3).getValue());
          }
        }
      }
      localObject2 = Collections.unmodifiableList(((am)localObject1).aYL).iterator();
      int i = 1;
      while (((Iterator)localObject2).hasNext())
      {
        localHashMap.putAll(((com.google.android.gms.analytics.a.c)((Iterator)localObject2).next()).aH(e.l("promo", i)));
        i += 1;
      }
      localObject2 = Collections.unmodifiableList(((am)localObject1).aYK).iterator();
      i = 1;
      while (((Iterator)localObject2).hasNext())
      {
        localHashMap.putAll(((com.google.android.gms.analytics.a.a)((Iterator)localObject2).next()).aH(e.l("pr", i)));
        i += 1;
      }
      localObject1 = ((am)localObject1).aYM.entrySet().iterator();
      i = 1;
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        localObject4 = (List)((Map.Entry)localObject2).getValue();
        localObject3 = e.l("il", i);
        localObject4 = ((List)localObject4).iterator();
        int j = 1;
        while (((Iterator)localObject4).hasNext())
        {
          localHashMap.putAll(((com.google.android.gms.analytics.a.a)((Iterator)localObject4).next()).aH((String)localObject3 + e.l("pi", j)));
          j += 1;
        }
        if (!TextUtils.isEmpty((CharSequence)((Map.Entry)localObject2).getKey())) {
          localHashMap.put((String)localObject3 + "nm", ((Map.Entry)localObject2).getKey());
        }
        i += 1;
      }
    }
    localObject1 = (al)paramae.d(al.class);
    if (localObject1 != null)
    {
      b(localHashMap, "ul", ((al)localObject1).aYE);
      a(localHashMap, "sd", ((al)localObject1).aYF);
      a(localHashMap, "sr", ((al)localObject1).aYG, ((al)localObject1).aYH);
      a(localHashMap, "vp", ((al)localObject1).aYI, ((al)localObject1).aYJ);
    }
    paramae = (aj)paramae.d(aj.class);
    if (paramae != null)
    {
      b(localHashMap, "an", paramae.aEV);
      b(localHashMap, "aid", paramae.aYu);
      b(localHashMap, "aiid", paramae.aYv);
      b(localHashMap, "av", paramae.aEW);
    }
    return localHashMap;
  }
  
  private static String n(double paramDouble)
  {
    if (aIn == null) {
      aIn = new DecimalFormat("0.######");
    }
    return aIn.format(paramDouble);
  }
  
  public final void b(ae paramae)
  {
    w.ah(paramae);
    w.e(paramae.aXZ, "Can't deliver not submitted measurement");
    w.bi("deliver should be called on worker thread");
    Object localObject1 = paramae.ql();
    Object localObject2 = (h)((ae)localObject1).e(h.class);
    if (TextUtils.isEmpty(((h)localObject2).aWn)) {
      this.aFn.nr().b(c((ae)localObject1), "Ignoring measurement without type");
    }
    do
    {
      return;
      if (TextUtils.isEmpty(((h)localObject2).aGl))
      {
        this.aFn.nr().b(c((ae)localObject1), "Ignoring measurement without client id");
        return;
      }
    } while (this.aHe.nu().aEL);
    double d = ((h)localObject2).aWt;
    if (k.b(d, ((h)localObject2).aGl))
    {
      e("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d));
      return;
    }
    localObject1 = c((ae)localObject1);
    ((Map)localObject1).put("v", "1");
    ((Map)localObject1).put("_v", p.aFS);
    ((Map)localObject1).put("tid", this.aIo);
    if (this.aHe.nu().aEK)
    {
      paramae = new StringBuilder();
      localObject1 = ((Map)localObject1).entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        if (paramae.length() != 0) {
          paramae.append(", ");
        }
        paramae.append((String)((Map.Entry)localObject2).getKey());
        paramae.append("=");
        paramae.append((String)((Map.Entry)localObject2).getValue());
      }
      a(4, "Dry run is enabled. GoogleAnalytics would have sent", paramae.toString(), null, null);
      return;
    }
    HashMap localHashMap = new HashMap();
    k.a(localHashMap, "uid", ((h)localObject2).aWo);
    Object localObject3 = (aj)paramae.d(aj.class);
    if (localObject3 != null)
    {
      k.a(localHashMap, "an", ((aj)localObject3).aEV);
      k.a(localHashMap, "aid", ((aj)localObject3).aYu);
      k.a(localHashMap, "av", ((aj)localObject3).aEW);
      k.a(localHashMap, "aiid", ((aj)localObject3).aYv);
    }
    localObject3 = ((h)localObject2).aGl;
    String str = this.aIo;
    if (!TextUtils.isEmpty(((h)localObject2).aWp)) {}
    for (boolean bool = true;; bool = false)
    {
      localObject2 = new s((String)localObject3, str, bool, 0L, localHashMap);
      ((Map)localObject1).put("_s", String.valueOf(this.aFn.nt().a((s)localObject2)));
      paramae = new com.google.android.gms.analytics.internal.c(this.aFn.nr(), (Map)localObject1, paramae.aYa);
      this.aFn.nt().c(paramae);
      return;
    }
  }
  
  public final Uri ok()
  {
    return this.aIp;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/gms/analytics/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */