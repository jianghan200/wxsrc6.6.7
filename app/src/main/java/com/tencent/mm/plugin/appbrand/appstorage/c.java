package com.tencent.mm.plugin.appbrand.appstorage;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;

public final class c
  extends com.tencent.mm.sdk.e.i<b>
{
  public static final String[] diD = { com.tencent.mm.sdk.e.i.a(b.dhO, "AppBrandKVData"), "DROP TABLE IF EXISTS AppBrandStorageKVData;" };
  private e fgu;
  
  public c(e parame)
  {
    super(parame, b.dhO, "AppBrandKVData", null);
    this.fgu = parame;
  }
  
  private static String A(String paramString1, String paramString2, String paramString3)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append(paramString3);
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }
  
  private int ao(String paramString, int paramInt)
  {
    paramInt = Math.max(0, rd(paramString) + paramInt);
    b localb = new b();
    localb.field_key = A(paramString, "@@@TOTAL@DATA@SIZE@@@", "++");
    localb.field_data = String.valueOf(paramInt);
    super.a(localb);
    return paramInt;
  }
  
  private int rd(String paramString)
  {
    int i = 0;
    b localb = new b();
    localb.field_key = A(paramString, "@@@TOTAL@DATA@SIZE@@@", "++");
    if (super.b(localb, new String[0])) {
      i = bi.getInt(localb.field_data, 0);
    }
    return i;
  }
  
  private int re(String paramString)
  {
    paramString = this.fgu.a("AppBrandKVData", new String[] { "size" }, "key = ?", new String[] { paramString }, null, null, null, 2);
    if (paramString.moveToFirst())
    {
      int i = paramString.getInt(0);
      paramString.close();
      return i;
    }
    paramString.close();
    return 0;
  }
  
  public final Object[] aT(String paramString1, String paramString2)
  {
    if ((bi.oW(paramString1)) || (bi.oW(paramString2))) {
      return new Object[] { a.fjO };
    }
    b localb = new b();
    localb.field_key = A(paramString1, paramString2, "__");
    if (super.b(localb, new String[0])) {
      return new Object[] { a.fjM, localb.field_data, localb.field_dataType };
    }
    return new Object[] { a.fjP };
  }
  
  public final a aU(String paramString1, String paramString2)
  {
    if ((bi.oW(paramString1)) || (bi.oW(paramString2))) {
      return a.fjO;
    }
    paramString2 = A(paramString1, paramString2, "__");
    ao(paramString1, -re(paramString2));
    paramString1 = new b();
    paramString1.field_key = paramString2;
    super.a(paramString1, new String[0]);
    return a.fjM;
  }
  
  public final void clear(String paramString)
  {
    super.fV("AppBrandKVData", String.format("delete from %s where %s like '%s%%'", new Object[] { "AppBrandKVData", "key", paramString }));
  }
  
  public final a f(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    int k = 0;
    if ((bi.oW(paramString1)) || (bi.oW(paramString2))) {
      return a.fjO;
    }
    String str = A(paramString1, paramString2, "__");
    int m = re(str);
    int i;
    if (paramString2 == null)
    {
      i = 0;
      if (paramString3 != null) {
        break label106;
      }
    }
    label106:
    for (int j = 0;; j = paramString3.length())
    {
      j += i;
      m = j - m;
      i = k;
      if (rd(paramString1) + m >= com.tencent.mm.plugin.appbrand.config.i.rP(paramString1)) {
        i = 1;
      }
      if (i == 0) {
        break label115;
      }
      return a.fjQ;
      i = paramString2.length();
      break;
    }
    label115:
    paramString2 = new b();
    paramString2.field_key = str;
    paramString2.field_data = paramString3;
    paramString2.field_dataType = paramString4;
    paramString2.field_size = j;
    if (super.a(paramString2))
    {
      ao(paramString1, m);
      return a.fjM;
    }
    return a.fjN;
  }
  
  public final Object[] rc(String paramString)
  {
    String str = paramString + "__";
    Object localObject1 = this.fgu;
    Object localObject2 = str.replace("_", "\\_") + "%";
    localObject1 = ((e)localObject1).a("AppBrandKVData", new String[] { "key" }, "key like ? escape ?", new String[] { localObject2, "\\" }, null, null, null, 2);
    localObject2 = new ArrayList();
    while (((Cursor)localObject1).moveToNext()) {
      ((ArrayList)localObject2).add(((Cursor)localObject1).getString(0).replace(str, ""));
    }
    ((Cursor)localObject1).close();
    return new Object[] { localObject2, Integer.valueOf(rd(paramString)), Integer.valueOf(com.tencent.mm.plugin.appbrand.config.i.rP(paramString)) };
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appstorage/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */