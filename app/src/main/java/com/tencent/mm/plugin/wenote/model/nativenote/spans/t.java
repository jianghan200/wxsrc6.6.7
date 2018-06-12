package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.Spannable;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.e;
import java.util.ArrayList;

public abstract class t<V, C extends g<V>>
{
  protected static boolean c(int paramInt, int... paramVarArgs)
  {
    boolean bool2 = false;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < 2)
      {
        int j = paramVarArgs[i];
        if ((paramInt & j) == j) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      i += 1;
    }
  }
  
  protected abstract s<ArrayList> a(Spannable paramSpannable, e parame, int paramInt);
  
  public abstract void a(WXRTEditText paramWXRTEditText, V paramV);
  
  public abstract int caD();
  
  protected abstract e p(WXRTEditText paramWXRTEditText);
  
  public final boolean q(WXRTEditText paramWXRTEditText)
  {
    e locale = p(paramWXRTEditText);
    return !a(paramWXRTEditText.getText(), locale, s.qtt).isEmpty();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/spans/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */