package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.Spannable;
import android.text.style.CharacterStyle;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class e<V, C extends g<V>>
  extends t<V, C>
{
  protected final s<ArrayList> a(Spannable paramSpannable, com.tencent.mm.plugin.wenote.model.nativenote.manager.e parame, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Object[] arrayOfObject = paramSpannable.getSpans(Math.max(0, parame.Tw - 1), Math.min(paramSpannable.length(), parame.tK + 1), CharacterStyle.class);
    int j = arrayOfObject.length;
    int i = 0;
    if (i < j)
    {
      Object localObject = arrayOfObject[i];
      int n;
      int k;
      int m;
      int i1;
      int i2;
      int i3;
      boolean bool;
      if (bV(localObject))
      {
        n = paramSpannable.getSpanStart(localObject);
        k = paramSpannable.getSpanEnd(localObject);
        m = parame.Tw;
        i1 = parame.tK;
        i2 = Math.max(n, m);
        i3 = Math.min(k, i1);
        if (i2 <= i3) {
          break label157;
        }
        bool = false;
      }
      for (;;)
      {
        if (bool) {
          localArrayList.add(localObject);
        }
        i += 1;
        break;
        label157:
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
          bool = false;
        }
        else
        {
          n = paramSpannable.getSpanFlags(localObject) & 0x33;
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
  
  public void a(WXRTEditText paramWXRTEditText, V paramV)
  {
    com.tencent.mm.plugin.wenote.model.nativenote.manager.e locale = p(paramWXRTEditText);
    int i;
    int j;
    label41:
    Object localObject;
    int k;
    if (locale.isEmpty())
    {
      i = 18;
      paramWXRTEditText = paramWXRTEditText.getText();
      Iterator localIterator = a(paramWXRTEditText, locale, s.qtt).iterator();
      j = i;
      if (!localIterator.hasNext()) {
        break label233;
      }
      localObject = localIterator.next();
      boolean bool = caF().equals(paramV);
      k = paramWXRTEditText.getSpanStart(localObject);
      i = j;
      if (k < locale.Tw)
      {
        if (!bool) {
          break label176;
        }
        locale.es(locale.Tw - k, 0);
        i = 34;
      }
      label116:
      j = paramWXRTEditText.getSpanEnd(localObject);
      if (j > locale.tK)
      {
        if (!bool) {
          break label206;
        }
        locale.es(0, j - locale.tK);
      }
    }
    for (;;)
    {
      paramWXRTEditText.removeSpan(localObject);
      j = i;
      break label41;
      i = 34;
      break;
      label176:
      caF();
      paramWXRTEditText.setSpan(caE(), k, locale.Tw, 33);
      i = j;
      break label116;
      label206:
      caF();
      paramWXRTEditText.setSpan(caE(), locale.tK, j, 34);
    }
    label233:
    if (paramV != null) {
      paramWXRTEditText.setSpan(caE(), locale.Tw, locale.tK, j);
    }
  }
  
  public abstract boolean bV(Object paramObject);
  
  protected abstract g<V> caE();
  
  protected abstract V caF();
  
  protected final com.tencent.mm.plugin.wenote.model.nativenote.manager.e p(WXRTEditText paramWXRTEditText)
  {
    return new com.tencent.mm.plugin.wenote.model.nativenote.manager.e(paramWXRTEditText);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/spans/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */