package com.google.android.exoplayer2.c;

import com.google.android.exoplayer2.metadata.id3.a.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class h
{
  public static final a.a aiH = new h.1();
  private static final Pattern aiI = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
  public int aei = -1;
  public int aej = -1;
  
  public final boolean j(String paramString1, String paramString2)
  {
    if (!"iTunSMPB".equals(paramString1)) {}
    for (;;)
    {
      return false;
      paramString1 = aiI.matcher(paramString2);
      if (paramString1.find()) {
        try
        {
          int i = Integer.parseInt(paramString1.group(1), 16);
          int j = Integer.parseInt(paramString1.group(2), 16);
          if ((i > 0) || (j > 0))
          {
            this.aei = i;
            this.aej = j;
            return true;
          }
        }
        catch (NumberFormatException paramString1) {}
      }
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/google/android/exoplayer2/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */