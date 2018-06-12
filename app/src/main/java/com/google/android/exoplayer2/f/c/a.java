package com.google.android.exoplayer2.f.c;

import android.text.TextUtils;
import com.google.android.exoplayer2.f.b;
import com.google.android.exoplayer2.i.e;
import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.i.t;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
  extends b
{
  private static final Pattern ays = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");
  private final boolean ayt;
  private int ayu;
  private int ayv;
  private int ayw;
  private int ayx;
  
  public a()
  {
    this(null);
  }
  
  public a(List<byte[]> paramList)
  {
    super("SsaDecoder");
    if (paramList != null)
    {
      this.ayt = true;
      String str = new String((byte[])paramList.get(0));
      com.google.android.exoplayer2.i.a.ao(str.startsWith("Format: "));
      am(str);
      f(new j((byte[])paramList.get(1)));
      return;
    }
    this.ayt = false;
  }
  
  private void a(j paramj, List<com.google.android.exoplayer2.f.a> paramList, e parame)
  {
    Object localObject;
    long l2;
    long l1;
    do
    {
      do
      {
        do
        {
          for (;;)
          {
            localObject = paramj.readLine();
            if (localObject == null) {
              break label203;
            }
            if ((this.ayt) || (!((String)localObject).startsWith("Format: "))) {
              break;
            }
            am((String)localObject);
          }
        } while ((!((String)localObject).startsWith("Dialogue: ")) || (this.ayu == 0));
        localObject = ((String)localObject).substring(10).split(",", this.ayu);
        l2 = an(localObject[this.ayv]);
      } while (l2 == -9223372036854775807L);
      String str = localObject[this.ayw];
      if (str.trim().isEmpty()) {
        break label204;
      }
      l1 = an(str);
    } while (l1 == -9223372036854775807L);
    for (;;)
    {
      paramList.add(new com.google.android.exoplayer2.f.a(localObject[this.ayx].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
      parame.add(l2);
      if (l1 == -9223372036854775807L) {
        break;
      }
      paramList.add(null);
      parame.add(l1);
      break;
      label203:
      return;
      label204:
      l1 = -9223372036854775807L;
    }
  }
  
  private void am(String paramString)
  {
    paramString = TextUtils.split(paramString.substring(8), ",");
    this.ayu = paramString.length;
    this.ayv = -1;
    this.ayw = -1;
    this.ayx = -1;
    int j = 0;
    if (j < this.ayu)
    {
      String str = t.aC(paramString[j].trim());
      label92:
      int i;
      switch (str.hashCode())
      {
      default: 
        i = -1;
        label94:
        switch (i)
        {
        }
        break;
      }
      for (;;)
      {
        j += 1;
        break;
        if (!str.equals("start")) {
          break label92;
        }
        i = 0;
        break label94;
        if (!str.equals("end")) {
          break label92;
        }
        i = 1;
        break label94;
        if (!str.equals("text")) {
          break label92;
        }
        i = 2;
        break label94;
        this.ayv = j;
        continue;
        this.ayw = j;
        continue;
        this.ayx = j;
      }
    }
  }
  
  private static long an(String paramString)
  {
    paramString = ays.matcher(paramString);
    if (!paramString.matches()) {
      return -9223372036854775807L;
    }
    long l1 = Long.parseLong(paramString.group(1));
    long l2 = Long.parseLong(paramString.group(2));
    long l3 = Long.parseLong(paramString.group(3));
    return Long.parseLong(paramString.group(4)) * 10000L + (l1 * 60L * 60L * 1000000L + l2 * 60L * 1000000L + l3 * 1000000L);
  }
  
  private static void f(j paramj)
  {
    String str;
    do
    {
      str = paramj.readLine();
    } while ((str != null) && (!str.startsWith("[Events]")));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/f/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */