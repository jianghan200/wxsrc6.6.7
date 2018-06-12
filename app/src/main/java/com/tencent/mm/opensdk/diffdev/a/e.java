package com.tencent.mm.opensdk.diffdev.a;

import com.tencent.mm.opensdk.utils.Log;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;

public final class e
{
  public static byte[] a(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      Log.e("MicroMsg.SDK.NetUtil", "httpGet, url is null");
      return null;
    }
    DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient();
    paramString = new HttpGet(paramString);
    if (paramInt >= 0) {}
    try
    {
      HttpConnectionParams.setSoTimeout(localDefaultHttpClient.getParams(), paramInt);
      paramString = localDefaultHttpClient.execute(paramString);
      if (paramString.getStatusLine().getStatusCode() != 200)
      {
        Log.e("MicroMsg.SDK.NetUtil", "httpGet fail, status code = " + paramString.getStatusLine().getStatusCode());
        return null;
      }
    }
    catch (Exception paramString)
    {
      Log.e("MicroMsg.SDK.NetUtil", "httpGet, Exception ex = " + paramString.getMessage());
      return null;
      paramString = EntityUtils.toByteArray(paramString.getEntity());
      return paramString;
    }
    catch (IncompatibleClassChangeError paramString)
    {
      Log.e("MicroMsg.SDK.NetUtil", "httpGet, IncompatibleClassChangeError ex = " + paramString.getMessage());
      return null;
    }
    catch (Throwable paramString)
    {
      Log.e("MicroMsg.SDK.NetUtil", "httpGet, Throwable ex = " + paramString.getMessage());
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/opensdk/diffdev/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */