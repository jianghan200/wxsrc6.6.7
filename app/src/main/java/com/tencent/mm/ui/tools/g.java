package com.tencent.mm.ui.tools;

import android.text.InputFilter;
import android.text.Spanned;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class g
  implements InputFilter
{
  private int gHy;
  private int gHz;
  
  public g(int paramInt1, int paramInt2)
  {
    this.gHy = paramInt1;
    this.gHz = paramInt2;
  }
  
  public static int abd(String paramString)
  {
    int i = 0;
    if (bi.oW(paramString)) {
      return 0;
    }
    int k = paramString.length();
    int m = abe(paramString);
    if (bi.oW(paramString)) {
      return i + (k + m);
    }
    int j = 0;
    i = 0;
    label40:
    if (j < paramString.length())
    {
      int n = paramString.charAt(j);
      if ((n < 0) || (n > 127)) {
        break label93;
      }
      i += 1;
    }
    label93:
    for (;;)
    {
      j += 1;
      break label40;
      i = paramString.length() - (abe(paramString) + i);
      break;
    }
  }
  
  public static int abe(String paramString)
  {
    if (bi.oW(paramString)) {
      return 0;
    }
    paramString = Pattern.compile("[\\u4e00-\\u9fa5]").matcher(paramString);
    int i = 0;
    if (paramString.find())
    {
      int k = 0;
      int j = i;
      for (;;)
      {
        i = j;
        if (k > paramString.groupCount()) {
          break;
        }
        j += 1;
        k += 1;
      }
    }
    return i;
  }
  
  public static int be(int paramInt, String paramString)
  {
    if (w.chL()) {
      return Math.round((paramInt - Math.round(abd(paramString))) / 2.0F);
    }
    return paramInt - abd(paramString);
  }
  
  public static int bf(int paramInt, String paramString)
  {
    if (w.chL()) {
      return Math.round((Math.round(abd(paramString)) - paramInt) / 2.0F);
    }
    return abd(paramString) - paramInt;
  }
  
  public static int du(String paramString, int paramInt)
  {
    if (paramInt == a.uzY) {
      if (!bi.oW(paramString)) {}
    }
    while (paramInt != a.uzZ)
    {
      return 0;
      return paramString.length();
    }
    return abd(paramString);
  }
  
  public CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    Object localObject = paramCharSequence;
    if (du(paramSpanned.toString(), this.gHz) + du(paramCharSequence.toString(), this.gHz) > this.gHy) {
      localObject = "";
    }
    return (CharSequence)localObject;
  }
  
  public static enum a {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/tools/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */