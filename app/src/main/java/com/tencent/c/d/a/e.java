package com.tencent.c.d.a;

import android.text.TextUtils;
import com.tencent.c.f.h;
import java.io.File;

public final class e
{
  public static boolean cFf()
  {
    for (;;)
    {
      int i;
      try
      {
        Object localObject = System.getenv("PATH");
        if (TextUtils.isEmpty((CharSequence)localObject))
        {
          localObject = ((String)localObject).split(":");
          int j = localObject.length;
          i = 0;
          if (i < j)
          {
            File localFile = new File(localObject[i], "su");
            if (!localFile.exists()) {
              break label130;
            }
            h.i("SuFile found : " + localFile.toString());
            return true;
          }
        }
        else
        {
          if (!new File("/system/bin/su").exists()) {
            break label108;
          }
          h.i("SuFile found : /system/bin/su");
          return true;
        }
      }
      catch (Throwable localThrowable)
      {
        h.k(localThrowable);
        h.i("SuFile not found");
        return false;
      }
      label108:
      if (new File("/system/xbin/su").exists())
      {
        h.i("SuFile found : /system/xbin/su");
        return true;
        label130:
        i += 1;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/c/d/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */