package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.b;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.e;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class o<V, C extends g<V>>
  extends t<V, C>
{
  protected final s<ArrayList> a(Spannable paramSpannable, e parame, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments();
    if (localObject1 == null) {
      return null;
    }
    localObject1 = (Class)localObject1[(localObject1.length - 1)];
    localObject1 = paramSpannable.getSpans(parame.Tw, parame.tK, (Class)localObject1);
    int j = localObject1.length;
    int i = 0;
    if (i < j)
    {
      Object localObject2 = localObject1[i];
      int n = paramSpannable.getSpanStart(localObject2);
      int k = paramSpannable.getSpanEnd(localObject2);
      int m = parame.Tw;
      int i1 = parame.tK;
      int i2 = Math.max(n, m);
      int i3 = Math.min(k, i1);
      boolean bool;
      if (i2 > i3) {
        bool = false;
      }
      for (;;)
      {
        if (bool) {
          localArrayList.add(localObject2);
        }
        i += 1;
        break;
        if (i2 < i3)
        {
          bool = true;
        }
        else if (((n > m) && (k < i1)) || ((m > n) && (i1 < k)))
        {
          bool = true;
        }
        else if (paramInt == s.qts)
        {
          if ((n == m) && (k == i1) && (m == i1)) {
            bool = true;
          } else {
            bool = false;
          }
        }
        else
        {
          n = paramSpannable.getSpanFlags(localObject2) & 0x33;
          if (k == m) {
            bool = c(n, new int[] { 34, 18 });
          } else {
            bool = c(n, new int[] { 17, 18 });
          }
        }
      }
    }
    return localArrayList;
  }
  
  protected final void a(Spannable paramSpannable, n paramn, p paramp)
  {
    paramp.a(a(paramSpannable, paramn, s.qts), paramn);
  }
  
  public abstract void a(WXRTEditText paramWXRTEditText, e parame, V paramV);
  
  public final void a(WXRTEditText paramWXRTEditText, V paramV)
  {
    e locale = paramWXRTEditText.getParagraphsInSelection();
    if ((paramWXRTEditText.qqU) && (paramWXRTEditText.getSelection().Tw == locale.Tw) && (locale.Tw > 1))
    {
      Object localObject1 = a(paramWXRTEditText.getText(), locale, s.qtt);
      if ((!((ArrayList)localObject1).isEmpty()) && (paramWXRTEditText.getLayout().getPrimaryHorizontal(paramWXRTEditText.getSelection().Tw) == b.bZC()))
      {
        localObject1 = ((ArrayList)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          Object localObject2 = ((Iterator)localObject1).next();
          paramWXRTEditText.getText().removeSpan(localObject2);
        }
        paramWXRTEditText.getText().insert(locale.Tw - 1, "\n");
      }
    }
    a(paramWXRTEditText, locale, paramV);
    u.a(paramWXRTEditText, new t[] { this });
  }
  
  protected final e p(WXRTEditText paramWXRTEditText)
  {
    return paramWXRTEditText.getParagraphsInSelection();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/spans/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */