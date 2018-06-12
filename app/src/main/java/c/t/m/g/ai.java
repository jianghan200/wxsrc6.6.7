package c.t.m.g;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

class ai
  extends SSLSocketFactory
{
  public boolean a;
  private String b;
  
  public ai(String paramString)
  {
    ai.class.getSimpleName();
    this.a = false;
    this.b = paramString;
  }
  
  public Socket createSocket()
  {
    return null;
  }
  
  public Socket createSocket(String paramString, int paramInt)
  {
    return null;
  }
  
  public Socket createSocket(String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2)
  {
    return null;
  }
  
  public Socket createSocket(InetAddress paramInetAddress, int paramInt)
  {
    return null;
  }
  
  public Socket createSocket(InetAddress paramInetAddress1, int paramInt1, InetAddress paramInetAddress2, int paramInt2)
  {
    return null;
  }
  
  public Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
  {
    if (TextUtils.isEmpty(this.b)) {
      throw new IOException("Halley set empty bizHost");
    }
    new StringBuilder("customized createSocket. host: ").append(this.b);
    try
    {
      if (Build.VERSION.SDK_INT < 17)
      {
        paramSocket = (SSLSocket)((SSLCertificateSocketFactory)SSLCertificateSocketFactory.getInsecure(10000, new SSLSessionCache(m.a()))).createSocket(paramSocket, this.b, paramInt, paramBoolean);
        paramSocket.setEnabledProtocols(paramSocket.getSupportedProtocols());
        paramSocket.getClass().getMethod("setHostname", new Class[] { String.class }).invoke(paramSocket, new Object[] { this.b });
        paramSocket.startHandshake();
        return paramSocket;
      }
      paramString = (SSLCertificateSocketFactory)SSLCertificateSocketFactory.getInsecure(10000, new SSLSessionCache(m.a()));
      paramSocket = (SSLSocket)paramString.createSocket(paramSocket, this.b, paramInt, paramBoolean);
      paramString.setUseSessionTickets(paramSocket, true);
      paramSocket.setEnabledProtocols(paramSocket.getSupportedProtocols());
      paramString.setHostname(paramSocket, this.b);
      paramSocket.startHandshake();
      return paramSocket;
    }
    catch (Throwable paramSocket)
    {
      this.a = true;
      throw new IOException("HalleySNI exception: " + paramSocket);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if ((TextUtils.isEmpty(this.b)) || (!(paramObject instanceof ai))) {}
    do
    {
      return false;
      paramObject = ((ai)paramObject).b;
    } while (TextUtils.isEmpty((CharSequence)paramObject));
    return this.b.equals(paramObject);
  }
  
  public String[] getDefaultCipherSuites()
  {
    return new String[0];
  }
  
  public String[] getSupportedCipherSuites()
  {
    return new String[0];
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/c/t/m/g/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */