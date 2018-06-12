package c.t.m.g;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class au
  extends al
{
  private static au d = new au();
  
  public static String a(String paramString, boolean paramBoolean, Map<String, String> paramMap)
  {
    Object localObject = p.d();
    paramMap.put("A23", m.d);
    aw localaw = new aw();
    localaw.a(paramString);
    localaw.a = System.currentTimeMillis();
    localaw.b = at.a;
    localaw.c = ((String)localObject);
    paramMap.put("A1", m.c);
    paramMap.put("A2", ci.a());
    paramMap.put("A4", ci.b());
    paramMap.put("A6", ci.c());
    paramMap.put("A7", ci.e());
    paramMap.put("A23", m.d);
    paramMap.put("A33", p.f());
    paramMap.put("A10", at.d);
    paramMap.put("A9", at.c);
    paramMap.put("A19", localObject);
    localaw.a(paramMap);
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(ci.a(System.currentTimeMillis(), "yyyy-MM-dd HH:mm:ss.SSS") + "|");
    ((StringBuilder)localObject).append("INFO|");
    ((StringBuilder)localObject).append(w.a + "|");
    ((StringBuilder)localObject).append(at.b + "|");
    ((StringBuilder)localObject).append("beacon|");
    ((StringBuilder)localObject).append("1.8.1|");
    paramString = localaw.b;
    try
    {
      paramMap = URLEncoder.encode(localaw.b, "utf-8");
      paramString = paramMap;
    }
    catch (UnsupportedEncodingException paramMap)
    {
      for (;;) {}
    }
    ((StringBuilder)localObject).append(paramString + "|");
    ((StringBuilder)localObject).append("|");
    ((StringBuilder)localObject).append("upload_ip|");
    ((StringBuilder)localObject).append("|");
    ((StringBuilder)localObject).append(localaw.c + "|");
    ((StringBuilder)localObject).append(localaw.a() + "|");
    ((StringBuilder)localObject).append(paramBoolean + "|");
    ((StringBuilder)localObject).append("0|");
    ((StringBuilder)localObject).append("0|");
    paramString = a(localaw.b());
    ((StringBuilder)localObject).append(paramString + "|");
    ((StringBuilder)localObject).append(ci.a(localaw.a, "yyyy-MM-dd HH:mm:ss") + "|");
    ((StringBuilder)localObject).append("upload_time");
    return ((StringBuilder)localObject).toString();
  }
  
  private static String a(Map<String, String> paramMap)
  {
    if (paramMap == null) {
      return "";
    }
    Object localObject = paramMap.keySet();
    if (localObject == null) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localObject = ((Set)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      localStringBuilder.append("&");
      localStringBuilder.append(str);
      localStringBuilder.append("=");
      localStringBuilder.append((String)paramMap.get(str));
    }
    paramMap = localStringBuilder.substring(1);
    localStringBuilder.setLength(0);
    return paramMap;
  }
  
  public static au f()
  {
    return d;
  }
  
  public final String a()
  {
    return "halley-cloud-HalleyAction";
  }
  
  public final int b()
  {
    return w.a("report_insert_new_record_num_limit", 5, 100, 100);
  }
  
  public final String c()
  {
    return "beacon";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/c/t/m/g/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */