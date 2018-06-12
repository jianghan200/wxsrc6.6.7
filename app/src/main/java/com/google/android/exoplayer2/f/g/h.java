package com.google.android.exoplayer2.f.g;

import com.google.android.exoplayer2.i.j;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class h
{
  private static final Pattern azQ = Pattern.compile("^NOTE(( |\t).*)?$");
  private static final Pattern azR = Pattern.compile("^﻿?WEBVTT(( |\t).*)?$");
  
  public static long ap(String paramString)
  {
    int i = 0;
    long l = 0L;
    paramString = paramString.split("\\.", 2);
    String[] arrayOfString = paramString[0].split(":");
    int j = arrayOfString.length;
    while (i < j)
    {
      l = l * 60L + Long.parseLong(arrayOfString[i]);
      i += 1;
    }
    return (Long.parseLong(paramString[1]) + l * 1000L) * 1000L;
  }
  
  public static float aq(String paramString)
  {
    if (!paramString.endsWith("%")) {
      throw new NumberFormatException("Percentages must end with %");
    }
    return Float.parseFloat(paramString.substring(0, paramString.length() - 1)) / 100.0F;
  }
  
  public static void k(j paramj)
  {
    paramj = paramj.readLine();
    if ((paramj == null) || (!azR.matcher(paramj).matches())) {
      throw new com.google.android.exoplayer2.f.f("Expected WEBVTT. Got " + paramj);
    }
  }
  
  public static Matcher l(j paramj)
  {
    Object localObject;
    do
    {
      localObject = paramj.readLine();
      if (localObject == null) {
        break;
      }
      if (azQ.matcher((CharSequence)localObject).matches()) {
        for (;;)
        {
          localObject = paramj.readLine();
          if ((localObject == null) || (((String)localObject).isEmpty())) {
            break;
          }
        }
      }
      localObject = f.azF.matcher((CharSequence)localObject);
    } while (!((Matcher)localObject).matches());
    return (Matcher)localObject;
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/f/g/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */