package com.tencent.mm.ui.chatting.i;

import android.content.Context;
import android.text.SpannableString;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class d
  extends a
{
  public d(a.b paramb)
  {
    super(paramb);
  }
  
  final CharSequence a(Map<String, String> paramMap, String paramString, WeakReference<Context> paramWeakReference)
  {
    paramWeakReference = (String)paramMap.get(paramString + ".title");
    a.a locala = new a.a(this);
    locala.username = ((String)paramMap.get(paramString + ".username"));
    locala.egr = ((String)paramMap.get(paramString + ".qrcode"));
    paramMap = new SpannableString(paramWeakReference);
    paramMap.setSpan(new d.1(this, locala), 0, paramWeakReference.length(), 33);
    return paramMap;
  }
  
  final String cxK()
  {
    return "link_revoke_qrcode";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/i/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */