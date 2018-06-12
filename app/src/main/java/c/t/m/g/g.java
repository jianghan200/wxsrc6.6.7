package c.t.m.g;

import android.text.TextUtils;
import java.util.concurrent.ThreadPoolExecutor;

public final class g
  implements d
{
  private static g a = new g();
  
  public static g a()
  {
    return a;
  }
  
  public final e a(String paramString, byte[] paramArrayOfByte)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("url is empty");
    }
    return new i(paramString, paramArrayOfByte);
  }
  
  public final f a(e parame)
  {
    int i = 0;
    if (parame == null) {
      throw new RuntimeException("execute...IHttpRequest is null");
    }
    if (!(parame instanceof i)) {
      throw new RuntimeException("execute...IHttpRequest should be create by API:createRequest");
    }
    i locali = (i)parame;
    locali.l = System.currentTimeMillis();
    w.a("app_http_use_proxy", 0, 1, 1);
    parame = new l(locali);
    if (locali.h <= 0)
    {
      locali.a(parame.a());
      parame = locali.d();
      if (i != 0) {
        locali.k = true;
      }
      if (parame != null) {
        break label164;
      }
      parame = new aj(-14, "force return timeout:" + locali.h);
    }
    label164:
    for (;;)
    {
      return new j(parame);
      y.a.a().a.execute(new h(parame, locali));
      if (locali.c()) {
        break;
      }
      i = 1;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/c/t/m/g/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */