package org.xwalk.core;

import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.List;

public abstract interface ClientCertRequest
{
  public abstract void cancel();
  
  public abstract String getHost();
  
  public abstract String[] getKeyTypes();
  
  public abstract int getPort();
  
  public abstract Principal[] getPrincipals();
  
  public abstract void ignore();
  
  public abstract void proceed(PrivateKey paramPrivateKey, List<X509Certificate> paramList);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/org/xwalk/core/ClientCertRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */