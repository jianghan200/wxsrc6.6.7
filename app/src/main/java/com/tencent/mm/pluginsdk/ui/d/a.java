package com.tencent.mm.pluginsdk.ui.d;

import android.content.Context;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.sdk.platformtools.ad;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
{
  public static m a(Context paramContext, String paramString, int paramInt1, int paramInt2)
  {
    return a(paramContext, paramString, paramInt1, paramInt2, 0, 0);
  }
  
  public static m a(Context paramContext, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ad.getContext();
    }
    paramContext = b.a.qPF.u(localContext, paramString);
    if (paramContext != null)
    {
      paramContext.start = paramInt1;
      paramContext.end = paramInt2;
      paramContext.linkColor = paramInt3;
      paramContext.backgroundColor = paramInt4;
    }
    return paramContext;
  }
  
  public static ArrayList<m> bm(Context paramContext, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    paramString = i.a.qPQ.matcher(paramString);
    while (paramString.find())
    {
      int i = paramString.start();
      int j = paramString.end();
      m localm = a(paramContext, paramString.group(), i, j);
      if (localm != null) {
        localArrayList.add(localm);
      }
    }
    return localArrayList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */