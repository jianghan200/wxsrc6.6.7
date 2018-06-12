package com.tencent.mm.ui.chatting.i;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class b
  extends a
{
  public b(a.b paramb)
  {
    super(paramb);
  }
  
  final CharSequence a(Map<String, String> paramMap, String paramString, final WeakReference<Context> paramWeakReference)
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    String str = bi.aG((String)paramMap.get(paramString + ".separator"), "、");
    int i = 0;
    Object localObject2 = new StringBuilder().append(paramString).append(".memberlist.member");
    final Object localObject1;
    if (i != 0)
    {
      localObject1 = Integer.valueOf(i);
      label77:
      localObject2 = localObject1;
      if (paramMap.get(localObject2) == null) {
        break label259;
      }
      if (i != 0) {
        localSpannableStringBuilder.append(str);
      }
      localObject1 = (String)paramMap.get((String)localObject2 + ".username");
      localObject2 = (String)paramMap.get((String)localObject2 + ".nickname");
      if ((!bi.oW((String)localObject1)) && (!bi.oW((String)localObject2))) {
        break label214;
      }
      x.w("MicroMsg.SysMsgHandlerProfile", "hy: can not resolve username or nickname");
    }
    for (;;)
    {
      i += 1;
      break;
      localObject1 = "";
      break label77;
      label214:
      SpannableString localSpannableString = j.a(ad.getContext(), (CharSequence)localObject2);
      localSpannableString.setSpan(new com.tencent.mm.plugin.messenger.a.a()
      {
        public final void onClickImp(View paramAnonymousView)
        {
          if ((paramWeakReference != null) && (paramWeakReference.get() != null))
          {
            paramAnonymousView = (Context)paramWeakReference.get();
            Object localObject = localObject1;
            if ((paramAnonymousView != null) && (!bi.oW((String)localObject)))
            {
              h.mEJ.h(14516, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
              localObject = new Intent().putExtra("Contact_User", (String)localObject);
              ((Intent)localObject).putExtra("Contact_Scene", 14);
              d.b(paramAnonymousView, "profile", ".ui.ContactInfoUI", (Intent)localObject);
            }
          }
        }
      }, 0, ((String)localObject2).length(), 33);
      localSpannableStringBuilder.append(localSpannableString);
    }
    label259:
    return localSpannableStringBuilder;
  }
  
  final String cxK()
  {
    return "link_profile";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/chatting/i/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */