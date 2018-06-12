package com.tencent.mm.network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class u
{
  private Map<String, List<String>> aBE = null;
  public HttpURLConnection aBv;
  public int erZ;
  public String esW;
  public URL url;
  
  public u(URL paramURL, int paramInt)
  {
    this.url = paramURL;
    this.erZ = paramInt;
    this.aBv = ((HttpURLConnection)this.url.openConnection());
    if (1 == this.erZ) {
      this.aBv.setInstanceFollowRedirects(false);
    }
  }
  
  public final void UI()
  {
    this.aBv.setDoInput(true);
  }
  
  public final void UJ()
  {
    this.aBv.setDoOutput(true);
  }
  
  public final void connect()
  {
    if ((1 == this.erZ) && (this.aBE == null)) {
      this.aBE = this.aBv.getRequestProperties();
    }
    this.aBv.connect();
  }
  
  public final String getHeaderField(String paramString)
  {
    if ((1 == this.erZ) && (this.aBE == null)) {
      this.aBE = this.aBv.getRequestProperties();
    }
    return this.aBv.getHeaderField(paramString);
  }
  
  public final Map<String, List<String>> getHeaderFields()
  {
    if ((1 == this.erZ) && (this.aBE == null)) {
      this.aBE = this.aBv.getRequestProperties();
    }
    return this.aBv.getHeaderFields();
  }
  
  public final InputStream getInputStream()
  {
    if (1 == this.erZ)
    {
      if (this.aBE == null) {
        this.aBE = this.aBv.getRequestProperties();
      }
      getResponseCode();
    }
    return this.aBv.getInputStream();
  }
  
  public final OutputStream getOutputStream()
  {
    if (1 == this.erZ)
    {
      if (this.aBE == null) {
        this.aBE = this.aBv.getRequestProperties();
      }
      getResponseCode();
    }
    return this.aBv.getOutputStream();
  }
  
  public final int getResponseCode()
  {
    for (;;)
    {
      if ((1 == this.erZ) && (this.aBE == null)) {
        this.aBE = this.aBv.getRequestProperties();
      }
      int i = this.aBv.getResponseCode();
      Object localObject;
      if ((1 == this.erZ) && (302 == i))
      {
        localObject = this.aBv.getHeaderField("Location");
        if (localObject != null) {}
      }
      else
      {
        return i;
      }
      this.url = new URL(this.url, (String)localObject);
      this.aBv = ((HttpURLConnection)this.url.openConnection());
      this.aBv.setInstanceFollowRedirects(false);
      if (this.aBE != null)
      {
        localObject = this.aBE.keySet().iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          if ((!str.equals("Host")) && (!str.equals("X-Online-Host")))
          {
            List localList = (List)this.aBE.get(str);
            i = 0;
            while (i < localList.size())
            {
              this.aBv.setRequestProperty(str, (String)localList.get(i));
              i += 1;
            }
          }
        }
      }
      this.aBv.setRequestProperty("Host", this.url.getHost());
      this.aBv.setRequestProperty("X-Online-Host", this.url.getHost());
    }
  }
  
  public final void oz(String paramString)
  {
    this.aBv.setRequestProperty("Referer", paramString);
  }
  
  public final void setConnectTimeout(int paramInt)
  {
    this.aBv.setConnectTimeout(paramInt);
  }
  
  public final void setReadTimeout(int paramInt)
  {
    this.aBv.setReadTimeout(paramInt);
  }
  
  public final void setRequestMethod(String paramString)
  {
    this.aBv.setRequestMethod(paramString);
  }
  
  public final void setRequestProperty(String paramString1, String paramString2)
  {
    this.aBv.setRequestProperty(paramString1, paramString2);
  }
  
  public final void setUseCaches(boolean paramBoolean)
  {
    this.aBv.setUseCaches(paramBoolean);
  }
  
  public final String toString()
  {
    return this.aBv.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/network/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */