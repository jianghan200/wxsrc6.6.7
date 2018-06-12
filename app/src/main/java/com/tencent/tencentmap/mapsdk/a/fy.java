package com.tencent.tencentmap.mapsdk.a;

import java.net.Socket;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public final class fy
  extends org.apache.http.conn.ssl.SSLSocketFactory
{
  private SSLContext a = SSLContext.getInstance("TLS");
  private String b = "";
  
  public fy(KeyStore paramKeyStore, String paramString)
  {
    super(paramKeyStore);
    this.b = paramString;
    paramKeyStore = new a();
    this.a.init(null, new TrustManager[] { paramKeyStore }, null);
  }
  
  public final Socket createSocket()
  {
    return this.a.getSocketFactory().createSocket();
  }
  
  public final Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
  {
    return this.a.getSocketFactory().createSocket(paramSocket, this.b, paramInt, paramBoolean);
  }
  
  public static final class a
    implements X509TrustManager
  {
    public final void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
    {
      try
      {
        int j = paramArrayOfX509Certificate.length;
        int i = 0;
        while (i < j)
        {
          paramArrayOfX509Certificate[i].checkValidity();
          i += 1;
        }
        return;
      }
      catch (CertificateException paramArrayOfX509Certificate) {}
    }
    
    public final void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
    {
      try
      {
        int j = paramArrayOfX509Certificate.length;
        int i = 0;
        while (i < j)
        {
          paramArrayOfX509Certificate[i].checkValidity();
          i += 1;
        }
        return;
      }
      catch (CertificateException paramArrayOfX509Certificate) {}
    }
    
    public final X509Certificate[] getAcceptedIssuers()
    {
      return null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/fy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */