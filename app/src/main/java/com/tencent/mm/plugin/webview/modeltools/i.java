package com.tencent.mm.plugin.webview.modeltools;

import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;

public final class i
{
  private final LinkedList<String> pUw = new LinkedList();
  
  public final String[] bVe()
  {
    synchronized (this.pUw)
    {
      String[] arrayOfString = new String[this.pUw.size()];
      Iterator localIterator = this.pUw.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        arrayOfString[i] = ((String)localIterator.next());
        i += 1;
      }
      return arrayOfString;
    }
  }
  
  public final void bVf()
  {
    if (!b.chp()) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder("routeList: ");
    synchronized (this.pUw)
    {
      Iterator localIterator = this.pUw.iterator();
      if (localIterator.hasNext()) {
        localStringBuilder.append(URLDecoder.decode((String)localIterator.next())).append("\n");
      }
    }
    x.d("MicroMsg.WebViewURLRouteList", ((StringBuilder)localObject).toString());
  }
  
  public final void pS(String paramString)
  {
    try
    {
      if (!bi.oW(paramString)) {
        synchronized (this.pUw)
        {
          String str = (String)this.pUw.peekLast();
          paramString = URLEncoder.encode(paramString);
          if ((str == null) || (!str.equals(paramString))) {
            this.pUw.addLast(paramString);
          }
          if (this.pUw.size() > 10) {
            this.pUw.removeFirst();
          }
          return;
        }
      }
      return;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.WebViewURLRouteList", "add exp = %s", new Object[] { bi.i(paramString) });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/webview/modeltools/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */