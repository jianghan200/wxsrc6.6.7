package c.t.m.g;

import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class ag
  extends ae
{
  private static boolean p = false;
  public String o;
  private ak q;
  private aj r;
  private af s;
  private boolean t;
  private s u;
  private n v;
  private String w;
  private String x;
  
  public ag(String paramString1, Map<String, String> paramMap, byte[] paramArrayOfByte, int paramInt, String paramString2, boolean paramBoolean, s params, String paramString3)
  {
    this.b = paramString1;
    this.c = false;
    this.d = paramMap;
    this.e = paramArrayOfByte;
    this.f = paramInt;
    this.g = paramString2;
    this.t = paramBoolean;
    this.u = params;
    this.w = paramString3;
  }
  
  public static ag a(String paramString1, Map<String, String> paramMap, byte[] paramArrayOfByte, int paramInt, String paramString2, s params)
  {
    return new ag(paramString1, paramMap, paramArrayOfByte, paramInt, paramString2, false, params, "");
  }
  
  public final aj a()
  {
    if (!p) {
      p = true;
    }
    try
    {
      if ((Build.VERSION.SDK != null) && (Build.VERSION.SDK_INT < 8)) {
        System.setProperty("http.keepAlive", "false");
      }
      this.r = new aj(0, "");
      for (;;)
      {
        Object localObject3;
        long l2;
        try
        {
          URL localURL = new URL(this.b);
          this.s = new af(localURL, this.b, this.u);
          boolean bool = localURL.getProtocol().toLowerCase().startsWith("https");
          List localList = this.s.a(this.t, bool);
          int n = localList.size();
          long l1 = SystemClock.elapsedRealtime();
          i = this.f;
          int j = 0;
          if (j >= n) {
            break;
          }
          this.n.incrementAndGet();
          this.v = ((n)localList.get(j));
          localObject3 = this.s;
          n localn = this.v;
          if (localn.b == -1)
          {
            localObject2 = localn.a;
            this.x = ((String)localObject2);
            this.q = new ak(localURL.getHost(), this.x, this.c, this.d, this.e, i, this.g);
            if (j != 0) {
              this.q.A = true;
            }
            if ((p.i()) && (j != 0)) {
              this.q.x = true;
            }
            if ((j == 1) && (((n)localList.get(0)).a.equals(this.b)) && (((n)localList.get(1)).a.equals(this.b))) {
              this.q.y = true;
            }
            this.q.z = this.n.get();
            this.r = this.q.a();
            if ((!this.q.i) && (this.r.c < 500)) {
              break label862;
            }
            if ((p.h()) && (this.v != null) && (!this.v.b())) {
              af.a(this.v);
            }
            int m = (int)(this.f - (SystemClock.elapsedRealtime() - l1));
            if (((this.r.a != 0) || (this.r.c < 200) || (this.r.c >= 400)) && (this.r.a != -20) && (this.r.a != 65236) && (this.r.a != 65230) && (j != n - 1) && (m > 200)) {
              break label872;
            }
            i = 1;
            k = i;
            if (i == 0)
            {
              k = i;
              if (this.r.a == -4)
              {
                k = w.a("direct_nonet_retry_gap", 0, 10000, 3000);
                l2 = this.q.w;
                if (l2 < k) {
                  break label877;
                }
                k = 1;
              }
            }
            if (k != 0) {
              break;
            }
            a(true);
            j += 1;
            i = m;
            continue;
          }
          if (((af)localObject3).a.getProtocol().startsWith("https")) {
            break label753;
          }
        }
        catch (MalformedURLException localMalformedURLException)
        {
          this.r.a = 65236;
          return this.r;
        }
        Object localObject2 = "http://" + localMalformedURLException.a + ":" + localMalformedURLException.b;
        label646:
        String str = ((af)localObject3).a.getFile();
        Object localObject1 = localObject2;
        if (!TextUtils.isEmpty(str)) {
          if (!str.startsWith("/")) {
            break label832;
          }
        }
        label753:
        label832:
        for (localObject1 = (String)localObject2 + str;; localObject1 = (String)localObject2 + "/" + str)
        {
          localObject3 = ((af)localObject3).a.getRef();
          localObject2 = localObject1;
          if (TextUtils.isEmpty((CharSequence)localObject3)) {
            break;
          }
          localObject2 = (String)localObject1 + "#" + (String)localObject3;
          break;
          if (((af)localObject3).b != 0)
          {
            localObject2 = "https://" + ((n)localObject1).a + ":" + ((af)localObject3).b;
            break label646;
          }
          localObject2 = "https://" + ((n)localObject1).a + ":443";
          break label646;
        }
        label862:
        af.b(this.v);
        continue;
        label872:
        int i = 0;
        continue;
        label877:
        SystemClock.sleep(ci.a((int)(k - l2), 200, k, 200));
        int k = i;
      }
      return this.r;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    HashMap localHashMap3;
    ak localak;
    HashMap localHashMap2;
    label481:
    int i;
    if (this.q != null)
    {
      if (this.i) {
        this.q.i = true;
      }
      localHashMap3 = new HashMap();
      if (paramBoolean) {
        break label877;
      }
      localHashMap3.put("B22", this.k);
      if (!ci.a(this.o)) {
        localHashMap3.put("B15", this.o);
      }
      if (!ci.a(this.w)) {
        localHashMap3.put("B54", this.w);
      }
      HashMap localHashMap1 = new HashMap();
      localHashMap1.put("B82", this.g);
      if (this.l != 0L) {
        localHashMap1.put("B83", this.l);
      }
      localHashMap1.put("B44", ci.b(this.a));
      if ((!TextUtils.isEmpty(this.a)) && (!this.a.equals(this.x))) {
        localHashMap1.put("B49", ci.b(this.x));
      }
      if (this.v != null)
      {
        if (!this.v.b()) {
          localHashMap1.put("B10", this.v.a());
        }
        if (this.v.c != -1) {
          localHashMap1.put("B45", this.v.c);
        }
      }
      localHashMap1.put("B53", this.n.get());
      if (!TextUtils.isEmpty(this.s.c)) {
        localHashMap1.put("B26", this.s.c);
      }
      if (this.j) {
        localHashMap1.put("B97", "1");
      }
      localak = this.q;
      localHashMap2 = new HashMap();
      localHashMap2.putAll(localHashMap3);
      localHashMap2.put("B59", localak.w);
      if (localak.p) {
        localHashMap2.put("B85", "1");
      }
      if (!localak.c) {
        break label894;
      }
      localHashMap2.put("B95", "1");
      if (!localak.q) {
        localHashMap2.put("B23", "1");
      }
      localHashMap3 = new HashMap();
      localHashMap3.putAll(localHashMap1);
      if (localak.m != 0L) {
        localHashMap3.put("B84", localak.m);
      }
      localHashMap3.put("B87", localak.r);
      localHashMap3.put("B88", localak.s);
      localHashMap3.put("B90", localak.v.g);
      localHashMap3.put("B91", localak.v.h);
      localHashMap3.put("B92", localak.v.i);
      localHashMap3.put("B93", localak.v.j);
      localHashMap3.put("B94", localak.v.k);
      if (!TextUtils.isEmpty(localak.h)) {
        localHashMap3.put("B47", ci.b(localak.h));
      }
      if (!TextUtils.isEmpty(localak.u)) {
        localHashMap3.put("B41", localak.u);
      }
      if (localak.o.a == 0) {
        break label926;
      }
      i = localak.o.a;
    }
    for (;;)
    {
      if (!localak.A) {
        break label957;
      }
      ce.a("HLHttpDirect", m.b(), i, localak.o.b, localHashMap2, localHashMap3, localak.i);
      return;
      label877:
      localHashMap3.put("B46", "1");
      break;
      label894:
      localHashMap2.put("B96", localak.t);
      break label481;
      label926:
      if (localak.o.c == 200) {
        i = 0;
      } else {
        i = localak.o.c;
      }
    }
    label957:
    ce.b("HLHttpDirect", m.b(), i, localak.o.b, localHashMap2, localHashMap3, localak.i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/c/t/m/g/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */