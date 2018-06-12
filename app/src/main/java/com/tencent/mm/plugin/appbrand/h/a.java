package com.tencent.mm.plugin.appbrand.h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.TextView;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.h;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.n.c;
import com.tencent.mm.plugin.appbrand.q.m;
import com.tencent.mm.plugin.appbrand.s.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;

public class a
  implements h
{
  private static SpannableString a(Context paramContext, int paramInt, Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      if (paramInt == 1) {
        paramInt = s.i.spannable_wxa_game_link_logo;
      }
    }
    for (paramContext = paramContext.getResources().getDrawable(paramInt);; paramContext = new BitmapDrawable(paramContext.getResources(), paramBitmap))
    {
      paramContext.setBounds(0, 0, m.aos(), m.aos());
      paramContext = new com.tencent.mm.plugin.appbrand.widget.g.b(paramContext);
      paramBitmap = new SpannableString("@ ");
      paramBitmap.setSpan(paramContext, 0, 1, 33);
      return paramBitmap;
      paramInt = s.i.spannable_app_brand_link_logo;
      break;
    }
  }
  
  public final CharSequence a(String paramString, Bundle paramBundle, WeakReference<Context> paramWeakReference, WeakReference<TextView> paramWeakReference1)
  {
    com.tencent.mm.y.a.a locala = com.tencent.mm.y.a.a.gw(paramString);
    Context localContext = (Context)paramWeakReference.get();
    if (localContext == null)
    {
      x.w("MicroMsg.WxaSubscribeMsgService", "context is null");
      return null;
    }
    paramString = locala.content;
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.WxaSubscribeMsgService", "content is null, return");
      return null;
    }
    Object localObject = paramBundle.getString("conv_talker_username");
    int i = paramBundle.getInt("scene");
    long l = paramBundle.getLong("msg_sever_id");
    String str = paramBundle.getString("send_msg_username");
    paramBundle = new SpannableString(paramString);
    paramBundle.setSpan(new a.1(this, locala, (String)localObject, i, l, str), paramString.indexOf(locala.title), paramString.indexOf(locala.title) + locala.title.length(), 17);
    x.i("MicroMsg.WxaSubscribeMsgService", "wxaSubscribeSysContent.forbids:%d", new Object[] { Integer.valueOf(locala.dzS) });
    if (locala.dzS == 1) {
      return paramBundle;
    }
    paramString = ((c)g.l(c.class)).rR(locala.username);
    if (paramString != null) {}
    for (paramString = paramString.field_brandIconURL;; paramString = "")
    {
      localObject = com.tencent.mm.modelappbrand.b.b.Ka().a(paramString, null);
      if (localObject != null) {
        break;
      }
      com.tencent.mm.modelappbrand.b.b.Ka().a(new a.2(this, paramWeakReference1, paramWeakReference, paramBundle), paramString, null);
      return TextUtils.concat(new CharSequence[] { a(localContext, locala.dzT, null), paramBundle });
    }
    return TextUtils.concat(new CharSequence[] { a(localContext, locala.dzT, (Bitmap)localObject), paramBundle });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */