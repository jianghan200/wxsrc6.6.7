package com.tencent.mm.network;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public final class b
{
  static a erY;
  
  public static int a(u paramu)
  {
    int i = 0;
    try
    {
      int j = paramu.getResponseCode();
      if (j != 200) {
        i = -1;
      }
      return i;
    }
    catch (Exception paramu)
    {
      x.e("MicroMsg.GprsSetting", "exception:%s", new Object[] { bi.i(paramu) });
    }
    return -3;
  }
  
  public static int a(String paramString, boolean paramBoolean, List<String> paramList)
  {
    if ((erY == null) || (erY.DJ() == null)) {
      return -1;
    }
    return erY.DJ().a(paramString, paramBoolean, paramList);
  }
  
  public static int a(boolean paramBoolean, List<String> paramList, String paramString)
  {
    if (erY == null) {
      return -1;
    }
    try
    {
      int i = erY.DJ().a(paramString, paramBoolean, paramList);
      return i;
    }
    catch (Exception paramList)
    {
      x.e("MicroMsg.GprsSetting", "exception:%s", new Object[] { bi.i(paramList) });
    }
    return -1;
  }
  
  public static u a(String paramString, b paramb)
  {
    b localb = paramb;
    if (paramb == null) {
      localb = new b(paramString);
    }
    x.i("MicroMsg.GprsSetting", "hy: url redirect host: %s, url: %s, ip: %s, dns_type: %d", new Object[] { localb.host, localb.url, localb.ip, Integer.valueOf(localb.erZ) });
    paramString = new u(localb.url, localb.erZ);
    paramString.esW = localb.ip;
    if (1 == localb.erZ)
    {
      paramString.setRequestProperty("Host", localb.host);
      paramString.setRequestProperty("X-Online-Host", localb.host);
    }
    return paramString;
  }
  
  public static void a(a parama)
  {
    x.i("MicroMsg.GprsSetting", "sethostimpl %b, [%s]", new Object[] { Boolean.valueOf(false), bi.cjd() });
    erY = parama;
  }
  
  public static InputStream n(String paramString, int paramInt1, int paramInt2)
  {
    paramString = a(paramString, null);
    paramString.setConnectTimeout(paramInt1);
    paramString.setReadTimeout(paramInt2);
    paramString.setRequestMethod("GET");
    if (a(paramString) != 0) {
      return null;
    }
    return paramString.getInputStream();
  }
  
  public static v oy(String paramString)
  {
    return new v(paramString);
  }
  
  public static void reportFailIp(String paramString)
  {
    if ((erY != null) && (erY.DJ() != null)) {
      erY.DJ().reportFailIp(paramString);
    }
  }
  
  public static abstract interface a
  {
    public abstract e DJ();
  }
  
  public static final class b
  {
    public int erZ = 0;
    private ArrayList<String> esa = new ArrayList();
    public String esb;
    public boolean esc = false;
    private boolean esd = false;
    public String host = null;
    public String ip = "";
    URL url = null;
    
    public b(String paramString)
    {
      this.esb = paramString;
      Object localObject;
      try
      {
        this.url = new URL(paramString);
        this.host = this.url.getHost();
        localObject = new ArrayList();
        if ((b.erY == null) || (b.erY.DJ() == null))
        {
          if (b.erY == null) {}
          for (paramString = "-1";; paramString = b.erY.DJ())
          {
            x.e("MicroMsg.GprsSetting", "UrlRedirct ERR:AUTOAUTH NULL:%s  [%s]", new Object[] { paramString, bi.cjd() });
            return;
          }
        }
        this.erZ = b.erY.DJ().getHostByName(this.host, (List)localObject);
        x.d("MicroMsg.GprsSetting", "[Arth.302] dnsType:%d  host:%s url:%s", new Object[] { Integer.valueOf(this.erZ), this.host, paramString });
        if (((ArrayList)localObject).size() <= 0)
        {
          this.erZ = 0;
          return;
        }
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.GprsSetting", "exception:%s", new Object[] { bi.i(paramString) });
        return;
      }
      if (1 == this.erZ)
      {
        localObject = (String)((ArrayList)localObject).get((int)(bi.VF() % ((ArrayList)localObject).size()));
        this.ip = ((String)localObject);
        this.url = new URL(paramString.replaceFirst(this.host, (String)localObject));
      }
    }
    
    public b(String paramString, boolean paramBoolean)
    {
      this.esc = paramBoolean;
      this.esb = paramString;
      try
      {
        this.url = new URL(paramString);
        this.host = this.url.getHost();
        if ((b.erY == null) || (b.erY.DJ() == null))
        {
          if (b.erY == null) {}
          for (paramString = "-1";; paramString = b.erY.DJ())
          {
            x.e("MicroMsg.GprsSetting", "UrlRedirct ERR:AUTOAUTH NULL:%s  [%s]", new Object[] { paramString, bi.cjd() });
            return;
          }
        }
        this.erZ = b.erY.DJ().a(this.host, paramBoolean, this.esa);
        Random localRandom = new Random();
        localRandom.setSeed(bi.VF());
        Collections.shuffle(this.esa, localRandom);
        x.d("MicroMsg.GprsSetting", "[Arth.302] dnsType:%d  host:%s url:%s ips:%s", new Object[] { Integer.valueOf(this.erZ), this.host, paramString, this.esa });
        if (this.esa.size() <= 0)
        {
          this.erZ = 0;
          return;
        }
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.GprsSetting", "exception:%s", new Object[] { bi.i(paramString) });
        return;
      }
      if (1 == this.erZ)
      {
        this.ip = ((String)this.esa.remove(0));
        this.url = new URL(paramString.replaceFirst(this.host, this.ip));
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/network/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */