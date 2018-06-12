package com.google.android.gms.c;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ad
  implements ai
{
  private static final Uri aXV;
  private final LogPrinter aXW = new LogPrinter(4, "GA/LogCatTransport");
  
  static
  {
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("uri");
    localBuilder.authority("local");
    aXV = localBuilder.build();
  }
  
  public final void b(ae paramae)
  {
    Object localObject = new ArrayList(paramae.aYg.values());
    Collections.sort((List)localObject, new Comparator() {});
    paramae = new StringBuilder();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = ((af)((Iterator)localObject).next()).toString();
      if (!TextUtils.isEmpty(str))
      {
        if (paramae.length() != 0) {
          paramae.append(", ");
        }
        paramae.append(str);
      }
    }
    this.aXW.println(paramae.toString());
  }
  
  public final Uri ok()
  {
    return aXV;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/gms/c/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */