package com.google.android.exoplayer2.f.g;

import android.text.TextUtils;
import com.google.android.exoplayer2.f.b;
import com.google.android.exoplayer2.i.j;
import java.util.ArrayList;
import java.util.List;

public final class g
  extends b
{
  private final f azL = new f();
  private final j azM = new j();
  private final e.a azN = new e.a();
  private final a azO = new a();
  private final List<d> azP = new ArrayList();
  
  public g()
  {
    super("WebvttDecoder");
  }
  
  private static int i(j paramj)
  {
    int j = 0;
    int i = -1;
    while (i == -1)
    {
      j = paramj.position;
      String str = paramj.readLine();
      if (str == null) {
        i = 0;
      } else if ("STYLE".equals(str)) {
        i = 2;
      } else if ("NOTE".startsWith(str)) {
        i = 1;
      } else {
        i = 3;
      }
    }
    paramj.setPosition(j);
    return i;
  }
  
  private static void j(j paramj)
  {
    while (!TextUtils.isEmpty(paramj.readLine())) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/google/android/exoplayer2/f/g/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */