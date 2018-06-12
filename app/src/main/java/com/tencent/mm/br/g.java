package com.tencent.mm.br;

import android.text.SpannableString;
import com.tencent.mm.pluginsdk.ui.d.d;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.bi;

public final class g
  implements d
{
  private static g sMk;
  private int sMj = 300;
  
  public static g cjL()
  {
    if (sMk == null) {
      sMk = new g();
    }
    return sMk;
  }
  
  public final SpannableString a(CharSequence paramCharSequence, float paramFloat)
  {
    if ((paramCharSequence == null) || (bi.oW(paramCharSequence.toString()))) {
      return new SpannableString("");
    }
    return g(paramCharSequence, (int)paramFloat);
  }
  
  public final SpannableString g(CharSequence paramCharSequence, int paramInt)
  {
    if ((paramCharSequence == null) || (bi.oW(paramCharSequence.toString()))) {
      return new SpannableString("");
    }
    if ((paramCharSequence == null) || (bi.oW(paramCharSequence.toString()))) {
      return new SpannableString("");
    }
    if ((paramCharSequence instanceof SpannableString)) {}
    for (paramCharSequence = (SpannableString)paramCharSequence;; paramCharSequence = new SpannableString(paramCharSequence))
    {
      PInt localPInt = new PInt();
      localPInt.value = this.sMj;
      paramCharSequence = b.cjC().a(paramCharSequence, paramInt, localPInt);
      return f.cjI().b(paramCharSequence, paramInt, localPInt.value);
    }
  }
  
  public final boolean u(CharSequence paramCharSequence)
  {
    b.cjC();
    return b.Xv(paramCharSequence.toString());
  }
  
  public final boolean v(CharSequence paramCharSequence)
  {
    return f.cjI().Xx(paramCharSequence.toString()) != null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/br/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */