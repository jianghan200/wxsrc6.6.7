package com.tencent.mm.ui.chatting.i;

import android.content.Context;
import android.text.SpannableString;
import com.tencent.mm.sdk.platformtools.bi;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Map;

public final class c
  extends a
{
  public c(a.b paramb)
  {
    super(paramb);
  }
  
  final CharSequence a(Map<String, String> paramMap, String paramString, WeakReference<Context> paramWeakReference)
  {
    String str2 = (String)paramMap.get(paramString + ".title");
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    for (;;)
    {
      String str1 = paramString + ".usernamelist.username";
      paramWeakReference = str1;
      if (i != 0) {
        paramWeakReference = str1 + i;
      }
      paramWeakReference = (String)paramMap.get(paramWeakReference);
      if (bi.oW(paramWeakReference)) {
        break;
      }
      localLinkedList.add(paramWeakReference);
      i += 1;
    }
    paramMap = new SpannableString(str2);
    paramMap.setSpan(new c.1(this, localLinkedList), 0, str2.length(), 33);
    return paramMap;
  }
  
  final String cxK()
  {
    return "link_revoke";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/i/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */