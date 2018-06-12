package org.b.d;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.b.b.b;
import org.b.g.e;

public final class g
{
  public int code;
  private Map<String, String> gDj;
  private InputStream stream;
  private String vKD;
  
  g(HttpURLConnection paramHttpURLConnection)
  {
    for (;;)
    {
      try
      {
        paramHttpURLConnection.connect();
        this.code = paramHttpURLConnection.getResponseCode();
        this.gDj = j(paramHttpURLConnection);
        if ((this.code >= 200) && (this.code < 400))
        {
          i = 1;
          if (i != 0)
          {
            paramHttpURLConnection = paramHttpURLConnection.getInputStream();
            this.stream = paramHttpURLConnection;
            return;
          }
          paramHttpURLConnection = paramHttpURLConnection.getErrorStream();
          continue;
        }
        int i = 0;
      }
      catch (UnknownHostException paramHttpURLConnection)
      {
        throw new b("The IP address of a host could not be determined.", paramHttpURLConnection);
      }
    }
  }
  
  private static Map<String, String> j(HttpURLConnection paramHttpURLConnection)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramHttpURLConnection.getHeaderFields().keySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return localHashMap;
      }
      String str = (String)localIterator.next();
      localHashMap.put(str, (String)((List)paramHttpURLConnection.getHeaderFields().get(str)).get(0));
    }
  }
  
  public final String getBody()
  {
    if (this.vKD != null) {
      return this.vKD;
    }
    this.vKD = e.D(this.stream);
    return this.vKD;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/org/b/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */