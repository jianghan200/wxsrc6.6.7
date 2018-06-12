package com.tencent.mm.plugin.profile.ui.newbizinfo.c;

import com.tencent.mm.ac.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  public static final String lZq = j.dMg;
  
  public static void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    x.d("MicroMsg.Kv10809", "brandUsername:%s, menuId:%s, menuKey:%s, status:%s, content:%s, actionType:%d, nativescene:%d, titleInfo:%s, indexInfo:%s, actionInfo:%s", new Object[] { paramString1, paramString2, paramString3, paramString4, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(126), paramString5, paramString6, paramString7 });
    h.mEJ.h(10809, new Object[] { paramString1, paramString2, paramString3, paramString4, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(126), paramString5, paramString6, paramString7 });
  }
  
  public static String dl(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0) {
      return "";
    }
    if (paramInt2 < 0) {
      return String.valueOf(paramInt1);
    }
    return paramInt1 + "-" + paramInt2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/newbizinfo/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */