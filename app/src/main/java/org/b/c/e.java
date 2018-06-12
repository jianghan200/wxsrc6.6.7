package org.b.c;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class e
  implements d
{
  public final String a(org.b.d.c paramc)
  {
    org.b.g.d.j(paramc, "Cannot extract a header from a null object");
    if ((paramc.vKu == null) || (paramc.vKu.size() <= 0)) {
      throw new org.b.b.c(paramc);
    }
    paramc = paramc.vKu;
    StringBuffer localStringBuffer = new StringBuffer(paramc.size() * 20);
    localStringBuffer.append("OAuth ");
    Iterator localIterator = paramc.keySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return localStringBuffer.toString();
      }
      String str = (String)localIterator.next();
      if (localStringBuffer.length() > 6) {
        localStringBuffer.append(", ");
      }
      localStringBuffer.append(String.format("%s=\"%s\"", new Object[] { str, org.b.g.c.encode((String)paramc.get(str)) }));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/org/b/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */