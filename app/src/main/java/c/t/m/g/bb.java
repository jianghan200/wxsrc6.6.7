package c.t.m.g;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bb
  extends ay
  implements bx
{
  private ab a = new ab();
  private List<d> b = new ArrayList();
  
  public bb()
  {
    String str = cd.b("settings_in_client", "");
    if (!TextUtils.isEmpty(str)) {}
    try
    {
      this.a.a(str);
      c();
      return;
    }
    catch (Throwable localThrowable)
    {
      cd.a("settings_in_client", "");
    }
  }
  
  private void c()
  {
    try
    {
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext()) {
        localIterator.next();
      }
    }
    finally {}
  }
  
  public final String a()
  {
    return "settings";
  }
  
  public final String a(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    return this.a.a(paramString1, paramInt, paramString2, paramString3, paramString4, paramString5);
  }
  
  public final void a(String paramString1, String arg2)
  {
    if ((!TextUtils.isEmpty(???)) && (!bf.a().b().equals(???))) {
      bf.a().a(???, true);
    }
    if (!TextUtils.isEmpty(paramString1)) {}
    synchronized (this.a)
    {
      this.a.b();
      this.a.a(paramString1);
      cd.a("settings_in_client", this.a.a());
      c();
      return;
    }
  }
  
  public final void a_()
  {
    bz.c().b();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/c/t/m/g/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */