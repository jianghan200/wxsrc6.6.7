package com.tencent.mm.ui.appbrand;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.sl;
import com.tencent.mm.g.a.sl.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.modelappbrand.m;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.a;
import com.tencent.mm.plugin.appbrand.n.c;
import com.tencent.mm.protocal.c.bsa;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.s;
import java.util.LinkedList;

public final class b
{
  public static String ZV(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    paramString = ((c)g.l(c.class)).rR(paramString);
    if ((paramString != null) && (paramString.aej() != null)) {
      return paramString.aej().frY;
    }
    x.e("MicroMsg.AppBrandServiceHelper", "attr is null or getAppInfo return null");
    return null;
  }
  
  public static String ZW(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    paramString = ((c)g.l(c.class)).rR(paramString);
    if (paramString != null) {
      return paramString.field_nickname;
    }
    x.e("MicroMsg.AppBrandServiceHelper", "attr is null or getAppInfo return null");
    return null;
  }
  
  public static void i(Context paramContext, final String paramString, final boolean paramBoolean)
  {
    int j = 1;
    Object localObject1 = new sl();
    ((sl)localObject1).cdl.bGy = paramString;
    Object localObject2 = ((sl)localObject1).cdl;
    if (paramBoolean)
    {
      i = 2;
      ((sl.a)localObject2).action = i;
      ((sl)localObject1).cdl.cdn = 2;
      a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = new LinkedList();
      localObject2 = new bsa();
      ((bsa)localObject2).spI = paramString;
      if (!paramBoolean) {
        break label153;
      }
    }
    label153:
    for (int i = j;; i = 0)
    {
      ((bsa)localObject2).spH = i;
      ((bsa)localObject2).hcE = 3;
      ((LinkedList)localObject1).add(localObject2);
      au.DF().a(1176, new e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          int i = 1;
          au.DF().b(1176, this);
          x.d("MicroMsg.AppBrandServiceHelper", "onSceneEnd(errType : %d, errCode : %d, errMsg : %s, toBan : %s)", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, Boolean.valueOf(true) });
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            s.makeText(this.val$context, R.l.notify_message_settings_operation_failed, 0).show();
            paramAnonymousString = new sl();
            paramAnonymousString.cdl.bGy = paramString;
            paramAnonymousl = paramAnonymousString.cdl;
            paramAnonymousInt1 = i;
            if (!paramBoolean) {
              paramAnonymousInt1 = 2;
            }
            paramAnonymousl.action = paramAnonymousInt1;
            paramAnonymousString.cdl.cdn = 2;
            a.sFg.m(paramAnonymousString);
          }
        }
      });
      paramContext = new m((LinkedList)localObject1);
      au.DF().a(paramContext, 0);
      return;
      i = 1;
      break;
    }
  }
  
  public static String rW(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    paramString = ((c)g.l(c.class)).rR(paramString);
    if ((paramString != null) && (paramString.aej() != null)) {
      return paramString.field_appId;
    }
    x.e("MicroMsg.AppBrandServiceHelper", "attr is null or getAppInfo return null");
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/appbrand/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */