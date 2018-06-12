package com.tencent.mm.ak.a.b;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;

public final class b
  implements com.tencent.mm.ak.a.c.b
{
  public final com.tencent.mm.ak.a.d.b mb(String paramString)
  {
    x.d("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data from url:%s", new Object[] { paramString });
    try
    {
      paramString = (HttpURLConnection)new URL(paramString).openConnection();
      paramString.setConnectTimeout(15000);
      paramString.setReadTimeout(20000);
      if (paramString == null) {
        x.i("MicroMsg.imageload.DefaultImageDownloader.HttpClientFactory", "open connection failed.");
      }
      if (paramString.getResponseCode() >= 300)
      {
        paramString.disconnect();
        x.w("MicroMsg.imageload.DefaultImageDownloader.HttpClientFactory", "dz[httpURLConnectionGet 300]");
        return null;
      }
      Object localObject = paramString.getInputStream();
      String str = paramString.getContentType();
      localObject = e.m((InputStream)localObject);
      paramString.disconnect();
      paramString = new com.tencent.mm.ak.a.d.b((byte[])localObject, str);
      return paramString;
    }
    catch (InterruptedException paramString)
    {
      x.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bi.i(paramString) });
      return new com.tencent.mm.ak.a.d.b(null, null);
    }
    catch (UnknownHostException paramString)
    {
      for (;;)
      {
        x.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bi.i(paramString) });
      }
    }
    catch (SSLHandshakeException paramString)
    {
      for (;;)
      {
        x.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bi.i(paramString) });
      }
    }
    catch (SocketException paramString)
    {
      for (;;)
      {
        x.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bi.i(paramString) });
      }
    }
    catch (SocketTimeoutException paramString)
    {
      for (;;)
      {
        x.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bi.i(paramString) });
      }
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        x.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bi.i(paramString) });
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        x.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bi.i(paramString) });
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ak/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */