package com.tencent.mm.network;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public final class v
{
  public HttpsURLConnection esX = null;
  
  public v(String paramString)
  {
    this(new URL(paramString));
  }
  
  private v(URL paramURL)
  {
    try
    {
      this.esX = ((HttpsURLConnection)paramURL.openConnection());
      return;
    }
    catch (MalformedURLException paramURL)
    {
      x.e("MicroMsg.MMHttpsUrlConnection", "MalformedURLException : %s", new Object[] { paramURL.getMessage() });
      x.e("MicroMsg.MMHttpsUrlConnection", "exception:%s", new Object[] { bi.i(paramURL) });
      return;
    }
    catch (IOException paramURL)
    {
      x.e("MicroMsg.MMHttpsUrlConnection", "IOException : %s", new Object[] { paramURL.getMessage() });
      x.e("MicroMsg.MMHttpsUrlConnection", "exception:%s", new Object[] { bi.i(paramURL) });
      return;
    }
    catch (Exception paramURL)
    {
      x.e("MicroMsg.MMHttpsUrlConnection", "Exception :" + paramURL.getMessage());
      x.e("MicroMsg.MMHttpsUrlConnection", "exception:%s", new Object[] { bi.i(paramURL) });
    }
  }
  
  public final void UK()
  {
    this.esX.setConnectTimeout(3000);
  }
  
  public final void UL()
  {
    this.esX.setReadTimeout(3000);
  }
  
  public final void UM()
  {
    this.esX.setUseCaches(true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/network/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */