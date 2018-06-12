package org.b.c;

import java.util.Collections;
import java.util.Map;
import org.b.d.e;
import org.b.d.j;
import org.b.g.d;

public final class c
  implements b
{
  public final String a(org.b.d.c paramc)
  {
    d.j(paramc, "Cannot extract base string from null object");
    if ((paramc.vKu == null) || (paramc.vKu.size() <= 0)) {
      throw new org.b.b.c(paramc);
    }
    String str1 = org.b.g.c.encode(paramc.cKt().name());
    String str2 = org.b.g.c.encode(paramc.cKy());
    e locale = new e();
    locale.a(paramc.cKs());
    locale.a(paramc.cKx());
    locale.a(new e(paramc.vKu));
    paramc = new e(locale.vKv);
    Collections.sort(paramc.vKv);
    return String.format("%s&%s&%s", new Object[] { str1, str2, org.b.g.c.encode(paramc.cKz()) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/org/b/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */