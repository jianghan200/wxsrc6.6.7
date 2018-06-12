package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.pluginsdk.ui.d.k;
import com.tencent.mm.pluginsdk.ui.d.o;
import com.tencent.mm.protocal.c.bon;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;

public final class c
{
  public static CharSequence a(Context paramContext, bon parambon, av paramav, int paramInt, String paramString)
  {
    String str1 = a(parambon);
    Object localObject3 = null;
    Object localObject2 = null;
    int k = 0;
    int j = 0;
    int i;
    String str3;
    Object localObject1;
    label103:
    String str2;
    if (paramInt == 21)
    {
      i = 3;
      str3 = parambon.jSA;
      localObject1 = null;
      if (!bi.oW(paramString))
      {
        g.Ek();
        localObject1 = ((i)g.l(i.class)).FR().Ye(paramString);
      }
      if (parambon.smm != 1) {
        break label368;
      }
      if (localObject1 == null) {
        break label345;
      }
      if ((localObject1 != null) && (!TextUtils.isEmpty(((ab)localObject1).BL()))) {
        break label335;
      }
      localObject1 = paramString;
      localObject3 = str1 + paramContext.getString(i.j.sns_at);
      j = ((String)localObject3).length();
      str2 = (String)localObject3 + (String)localObject1;
      localObject3 = localObject1;
      localObject1 = str2;
    }
    for (;;)
    {
      label167:
      localObject1 = "" + (String)localObject1 + ": ";
      paramContext = j.a(paramContext, (String)localObject1 + str3, com.tencent.mm.bp.a.fromDPToPix(paramContext, (int)(15.0F * com.tencent.mm.bp.a.fe(paramContext))), 2);
      if (paramInt == 21)
      {
        paramInt = 3;
        label240:
        g.Ek();
        ((i)g.l(i.class)).FR().Ye(parambon.rdS);
        paramContext = new k(paramContext);
        paramContext.a(new o(parambon.rdS, paramav.nUh, paramInt), str1, 0);
        if (localObject3 == null) {
          break label485;
        }
        paramContext.a(new o(paramString, paramav.nUh, i), (CharSequence)localObject3, j);
      }
      label335:
      label345:
      label368:
      label485:
      while (localObject2 == null)
      {
        return paramContext;
        i = 2;
        break;
        localObject1 = ((ab)localObject1).BL();
        break label103;
        x.w("SnsCommentUtil", "feedContact null by feedOwnUserName %s", new Object[] { paramString });
        localObject1 = str1;
        break label167;
        if (bi.oW(parambon.smB)) {
          break label517;
        }
        localObject1 = af.byc().Yf(parambon.smB);
        if (localObject1 == null) {}
        for (localObject1 = parambon.smB;; localObject1 = ((ab)localObject1).BL())
        {
          localObject2 = str1 + paramContext.getString(i.j.sns_reply);
          k = ((String)localObject2).length();
          str2 = (String)localObject2 + (String)localObject1;
          localObject2 = localObject1;
          localObject1 = str2;
          break;
        }
        paramInt = 2;
        break label240;
      }
      paramContext.a(new o(parambon.smB, paramav.nUh, i), (CharSequence)localObject2, k);
      return paramContext;
      label517:
      localObject1 = str1;
    }
  }
  
  public static String a(bon parambon)
  {
    ab localab = af.byc().Yf(parambon.rdS);
    if (localab != null) {
      return localab.BL();
    }
    if (parambon.rTW != null) {
      return parambon.rTW;
    }
    return parambon.rdS;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */