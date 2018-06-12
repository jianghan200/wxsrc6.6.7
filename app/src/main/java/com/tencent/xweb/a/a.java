package com.tencent.xweb.a;

import android.os.Bundle;
import com.tencent.xweb.l;
import java.util.Map;

public final class a
{
  l vAV;
  
  public a(l paraml)
  {
    this.vAV = paraml;
  }
  
  public final Bundle getBundle()
  {
    Object localObject;
    if ((this.vAV != null) && (this.vAV.getRequestHeaders() != null) && (!this.vAV.isForMainFrame()) && (this.vAV.getRequestHeaders().containsKey("Accept")))
    {
      localObject = (String)this.vAV.getRequestHeaders().get("Accept");
      if ((localObject == null) || (!((String)localObject).startsWith("text/html"))) {}
    }
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        localObject = new Bundle();
        ((Bundle)localObject).putInt("resourceType", 1);
        return (Bundle)localObject;
      }
      return null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/xweb/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */