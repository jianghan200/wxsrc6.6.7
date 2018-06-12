package com.tencent.mm.h;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.h;

public final class a
{
  public String bHD;
  private c cZM;
  public String desc;
  public int showType;
  public String url;
  
  public static a eV(String paramString)
  {
    paramString = c.eX(paramString);
    if (paramString != null)
    {
      a locala = new a();
      locala.cZM = paramString;
      locala.url = paramString.url;
      locala.desc = paramString.desc;
      locala.showType = paramString.showType;
      locala.bHD = paramString.bHD;
      return locala;
    }
    return null;
  }
  
  public final boolean a(Context paramContext, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    if ((this.showType == 3) || (this.showType == 4))
    {
      String str3 = this.cZM.cZY;
      String str4 = this.cZM.cZZ;
      String str1 = str3;
      String str2 = str4;
      int i;
      if (bi.oW(str3))
      {
        str1 = str3;
        str2 = str4;
        if (bi.oW(str4))
        {
          if (this.showType != 3) {
            break label166;
          }
          i = a.h.app_yes;
          str1 = paramContext.getString(i);
          if (this.showType != 3) {
            break label174;
          }
          i = a.h.app_no;
          label100:
          str2 = paramContext.getString(i);
        }
      }
      if ((bi.oW(str1)) || (bi.oW(str2)))
      {
        str3 = this.desc;
        str4 = this.bHD;
        if (bi.oW(str1))
        {
          label144:
          if (!bi.oW(str1)) {
            break label189;
          }
          label152:
          h.a(paramContext, str3, str4, str2, paramOnClickListener2);
        }
      }
      for (;;)
      {
        return true;
        label166:
        i = a.h.app_ok;
        break;
        label174:
        i = a.h.app_cancel;
        break label100;
        str2 = str1;
        break label144;
        label189:
        paramOnClickListener2 = paramOnClickListener1;
        break label152;
        h.a(paramContext, this.desc, this.bHD, str1, str2, paramOnClickListener1, paramOnClickListener2);
      }
    }
    if (this.showType == 1)
    {
      h.b(paramContext, this.desc, this.bHD, true);
      return true;
    }
    if (this.showType == 5)
    {
      h.b(paramContext, this.desc, this.bHD, true);
      return true;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */