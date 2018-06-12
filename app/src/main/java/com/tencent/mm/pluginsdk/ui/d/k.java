package com.tencent.mm.pluginsdk.ui.d;

import android.text.GetChars;
import android.text.Spannable;
import android.text.SpannableString;

public final class k
  implements GetChars, Spannable, CharSequence
{
  private SpannableString qQb = null;
  
  public k()
  {
    this.qQb = new SpannableString("");
  }
  
  public k(SpannableString paramSpannableString)
  {
    this.qQb = paramSpannableString;
  }
  
  public k(CharSequence paramCharSequence)
  {
    this.qQb = new SpannableString(paramCharSequence);
  }
  
  public k(String paramString)
  {
    this.qQb = new SpannableString(paramString);
  }
  
  private void c(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt2 <= this.qQb.length())) {
      this.qQb.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
    }
  }
  
  public final void a(Object paramObject, CharSequence paramCharSequence, int paramInt)
  {
    c(paramObject, paramInt, paramCharSequence.length() + paramInt, 33);
  }
  
  public final char charAt(int paramInt)
  {
    return this.qQb.charAt(paramInt);
  }
  
  public final void f(Object paramObject, CharSequence paramCharSequence)
  {
    a(paramObject, paramCharSequence, 0);
  }
  
  public final void getChars(int paramInt1, int paramInt2, char[] paramArrayOfChar, int paramInt3)
  {
    this.qQb.getChars(paramInt1, paramInt2, paramArrayOfChar, paramInt3);
  }
  
  public final int getSpanEnd(Object paramObject)
  {
    return this.qQb.getSpanEnd(paramObject);
  }
  
  public final int getSpanFlags(Object paramObject)
  {
    return this.qQb.getSpanFlags(paramObject);
  }
  
  public final int getSpanStart(Object paramObject)
  {
    return this.qQb.getSpanStart(paramObject);
  }
  
  public final <T> T[] getSpans(int paramInt1, int paramInt2, Class<T> paramClass)
  {
    return this.qQb.getSpans(paramInt1, paramInt2, paramClass);
  }
  
  public final int length()
  {
    return this.qQb.length();
  }
  
  public final int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass)
  {
    return this.qQb.nextSpanTransition(paramInt1, paramInt2, paramClass);
  }
  
  public final void removeSpan(Object paramObject)
  {
    this.qQb.removeSpan(paramObject);
  }
  
  public final void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    c(paramObject, paramInt1, paramInt2, paramInt3);
  }
  
  public final CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return this.qQb.subSequence(paramInt1, paramInt2);
  }
  
  public final String toString()
  {
    return this.qQb.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/d/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */