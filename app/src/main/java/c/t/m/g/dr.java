package c.t.m.g;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class dr
{
  public static int a = 0;
  public final dt b;
  public final dq c;
  private final dp d;
  private final List<do> e;
  
  public dr(dt paramdt, dp paramdp, dq paramdq, List<do> paramList)
  {
    this.b = paramdt;
    this.d = paramdp;
    this.c = paramdq;
    this.e = paramList;
  }
  
  private String b(int paramInt, String paramString, ct paramct, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramct == null) {
      return null;
    }
    for (;;)
    {
      try
      {
        Object localObject1;
        String str2;
        String str1;
        String str3;
        cu localcu;
        String str4;
        String str6;
        int j;
        String str5;
        if (this.d == null)
        {
          bool = true;
          localObject1 = ei.a(this.b);
          str2 = ei.a(this.d, bool);
          str1 = ei.a(this.c);
          str3 = do.a(this.e);
          if (!paramBoolean2) {
            break label716;
          }
          str1 = "{}";
          localcu = paramct.b;
          localObject2 = new HashMap();
          ((HashMap)localObject2).put("imei", localcu.a());
          ((HashMap)localObject2).put("imsi", localcu.b());
          ((HashMap)localObject2).put("phonenum", j.b(localcu.d));
          ((HashMap)localObject2).put("qq", j.b(localcu.f));
          ((HashMap)localObject2).put("mac", localcu.c().toLowerCase(Locale.ENGLISH));
          str4 = new JSONObject((Map)localObject2).toString();
          str6 = localcu.f();
          eg.a();
          j = eg.a(paramct.a);
          str5 = ej.c(paramct);
          paramct = (ct)localObject1;
        }
        try
        {
          if (((String)localObject1).equals("[]"))
          {
            paramct = (ct)localObject1;
            if (!str5.equals("{}"))
            {
              paramct = new JSONObject(str5);
              paramct.remove("ssid");
              paramct = "[" + paramct.toString() + "]";
            }
          }
          localObject1 = paramct;
        }
        catch (Throwable paramct)
        {
          StringBuilder localStringBuilder;
          paramct.toString();
          continue;
          paramct = localcu.q;
          continue;
          paramString = paramString + ",\"detectgps\":0";
          continue;
        }
        Object localObject2 = localcu.i;
        paramct = (ct)localObject2;
        if (localObject2 != null) {
          paramct = ((String)localObject2).replace("\"", "");
        }
        localObject2 = paramct;
        if (paramct != null) {
          localObject2 = paramct.replace("|", "");
        }
        localObject2 = (String)localObject2 + "_" + localcu.h;
        if (paramBoolean3)
        {
          paramct = localcu.a();
          if (paramct != null)
          {
            i = Math.abs(paramct.hashCode()) % 1000 + 1001;
            localStringBuilder = new StringBuilder("{\"version\":\"");
            if (localcu.q == null)
            {
              paramct = "None";
              paramct = paramct + "\",\"address\":" + paramInt;
              paramString = paramct + ",\"source\":" + i + ",\"access_token\":\"" + str6 + "\",\"app_name\":\"" + paramString + "\",\"app_label\":\"" + (String)localObject2 + "\",\"bearing\":1";
              paramString = paramString + ",\"control\":0";
              if (!paramBoolean1) {
                continue;
              }
              paramString = paramString + ",\"detectgps\":1";
              paramString = paramString + ",\"pstat\":" + j;
              paramString = paramString + ",\"wlan\":" + str5;
              return paramString + ",\"attribute\":" + str4 + ",\"location\":" + str1 + ",\"cells\":" + str2 + ",\"wifis\":" + (String)localObject1 + ",\"bles\":" + str3 + "}";
              if (a == this.d.e) {
                break label719;
              }
              bool = true;
              a = this.d.e;
            }
          }
        }
        int i = 203;
      }
      catch (Exception paramString)
      {
        return null;
      }
      continue;
      label716:
      continue;
      label719:
      boolean bool = false;
    }
  }
  
  public final String a(int paramInt, String paramString, ct paramct, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    return b(paramInt, paramString, paramct, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public final boolean a()
  {
    return this.c != null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/c/t/m/g/dr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */