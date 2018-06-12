package c.t.m.g;

import android.content.Context;
import android.os.Bundle;
import com.tencent.map.geolocation.internal.TencentHttpClient;
import java.io.IOException;

public final class dj
  implements cl, TencentHttpClient
{
  private static d a;
  
  public dj(Context paramContext, String paramString)
  {
    try
    {
      a = a.a(new b(paramContext, "test_uuid", paramString));
      return;
    }
    catch (Exception paramContext) {}
  }
  
  private static String a(String paramString)
  {
    String str2 = "GBK";
    String str1 = str2;
    int j;
    int i;
    if (paramString != null)
    {
      paramString = paramString.split(";");
      j = paramString.length;
      i = 0;
    }
    for (;;)
    {
      str1 = str2;
      if (i < j)
      {
        str1 = paramString[i].trim();
        int k = str1.indexOf("charset=");
        if (-1 != k) {
          str1 = str1.substring(k + 8, str1.length());
        }
      }
      else
      {
        return str1;
      }
      i += 1;
    }
  }
  
  public final String a(String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      paramString = postSync(paramString, paramArrayOfByte);
      paramString = new String(paramString.getByteArray("data_bytes"), paramString.getString("data_charset"));
      return paramString;
    }
    catch (Throwable paramString) {}
    return "{}";
  }
  
  public final Bundle postSync(String paramString, byte[] paramArrayOfByte)
  {
    if (a == null) {
      throw new IOException("can not init net sdk");
    }
    Object localObject;
    try
    {
      localObject = a.a(paramString, paramArrayOfByte);
      ((e)localObject).a("User-Agent", "Dalvik/1.6.0 (Linux; U; Android 4.4; Nexus 5 Build/KRT16M)");
      ((e)localObject).b();
      paramString = a.a((e)localObject);
      if ((paramString.a() == 0) && (paramString.c() >= 200) && (paramString.c() < 300))
      {
        paramArrayOfByte = new Bundle();
        paramArrayOfByte.putString("req_key", ((e)localObject).a());
        if (paramString.d() == null)
        {
          paramArrayOfByte.putByteArray("data_bytes", "{}".getBytes());
          paramArrayOfByte.putString("data_charset", "utf-8");
          return paramArrayOfByte;
        }
        localObject = a(paramString.a("content-type"));
        paramArrayOfByte.putByteArray("data_bytes", paramString.d());
        paramArrayOfByte.putString("data_charset", (String)localObject);
        return paramArrayOfByte;
      }
    }
    catch (Exception paramString)
    {
      throw new IOException(paramString.getMessage());
    }
    throw new IOException("net sdk error: errCode: " + paramString.a() + ", errInfo: " + paramString.b() + ", statusCode: " + paramString.c() + ", reqKey: " + ((e)localObject).a());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/c/t/m/g/dj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */