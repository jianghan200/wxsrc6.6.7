package c.t.m.g;

import android.text.TextUtils;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

public final class ah
  implements HostnameVerifier
{
  private String a;
  
  public ah(String paramString)
  {
    this.a = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((TextUtils.isEmpty(this.a)) || (!(paramObject instanceof ah))) {}
    do
    {
      return false;
      paramObject = ((ah)paramObject).a;
    } while (TextUtils.isEmpty((CharSequence)paramObject));
    return this.a.equals(paramObject);
  }
  
  public final boolean verify(String paramString, SSLSession paramSSLSession)
  {
    return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.a, paramSSLSession);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/c/t/m/g/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */