package org.b.d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.b.g.c;

public final class e
{
  public final List<d> vKv;
  
  public e()
  {
    this.vKv = new ArrayList();
  }
  
  public e(List<d> paramList)
  {
    this.vKv = new ArrayList(paramList);
  }
  
  public e(Map<String, String> paramMap)
  {
    this();
    paramMap = paramMap.entrySet().iterator();
    for (;;)
    {
      if (!paramMap.hasNext()) {
        return;
      }
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      this.vKv.add(new d((String)localEntry.getKey(), (String)localEntry.getValue()));
    }
  }
  
  public final void a(e parame)
  {
    this.vKv.addAll(parame.vKv);
  }
  
  public final void adU(String paramString)
  {
    String[] arrayOfString;
    int i;
    if ((paramString != null) && (paramString.length() > 0))
    {
      arrayOfString = paramString.split("&");
      int j = arrayOfString.length;
      i = 0;
      if (i < j) {}
    }
    else
    {
      return;
    }
    paramString = arrayOfString[i].split("=");
    String str = c.decode(paramString[0]);
    if (paramString.length > 1) {}
    for (paramString = c.decode(paramString[1]);; paramString = "")
    {
      this.vKv.add(new d(str, paramString));
      i += 1;
      break;
    }
  }
  
  public final String cKz()
  {
    if (this.vKv.size() == 0) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = this.vKv.iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return localStringBuilder.toString().substring(1);
      }
      d locald = (d)localIterator.next();
      localStringBuilder.append('&').append(c.encode(locald.aAL).concat("=").concat(c.encode(locald.value)));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/org/b/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */