package com.tencent.mm.plugin.emoji;

import android.content.Context;
import android.text.SpannableString;
import com.tencent.mm.br.f;
import com.tencent.mm.br.f.a;
import com.tencent.mm.br.g;
import com.tencent.mm.pluginsdk.ui.d.j;

public final class a
  implements com.tencent.mm.plugin.emoji.b.a
{
  public final SpannableString a(Context paramContext, CharSequence paramCharSequence, float paramFloat)
  {
    return j.a(paramContext, paramCharSequence, paramFloat);
  }
  
  public final SpannableString a(CharSequence paramCharSequence, float paramFloat)
  {
    return g.cjL().a(paramCharSequence, paramFloat);
  }
  
  public final String cp(String paramString1, String paramString2)
  {
    g.cjL();
    f localf = f.cjI();
    int i = 0;
    int j = paramString1.length();
    StringBuilder localStringBuilder = new StringBuilder(j);
    while (i < j)
    {
      char c = paramString1.charAt(i);
      if ((c == '/') || (c == '['))
      {
        f.a locala = localf.Xx(paramString1.substring(i));
        if (locala != null)
        {
          localStringBuilder.append(paramString2);
          i += locala.text.length();
          continue;
        }
      }
      localStringBuilder.append(c);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public final boolean u(CharSequence paramCharSequence)
  {
    return g.cjL().u(paramCharSequence);
  }
  
  public final boolean v(CharSequence paramCharSequence)
  {
    return g.cjL().v(paramCharSequence);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/emoji/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */