package com.tencent.mm.ak.a.g;

import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class b
{
  public static final String bnC = h.getExternalStorageDirectory().getAbsolutePath();
  public static final String bnE = bnC + "/tencent/MicroMsg/";
  public static final String dYs = bnE + ".tmp";
  public static long dYt = 0L;
  
  public static String Pw()
  {
    Object localObject = new StringBuilder().append(dYs).append("/");
    long l = System.currentTimeMillis();
    localObject = new SimpleDateFormat("yyyyMMdd").format(new Date(l));
    x.d("MicroMsg.imageloader.ImageTmpFilehUtils", "[cpan] get tmp file path:%s", new Object[] { localObject });
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(dYs);
    if (!localb.exists()) {
      localb.mkdirs();
    }
    return (String)localObject;
  }
  
  public static boolean Px()
  {
    long l = System.currentTimeMillis();
    if (l - dYt > 86400000L)
    {
      x.d("MicroMsg.imageloader.ImageTmpFilehUtils", "[cpan] need clean tmp file.");
      dYt = l;
      return true;
    }
    x.d("MicroMsg.imageloader.ImageTmpFilehUtils", "[cpan] need not clean tmp file.");
    return false;
  }
  
  public static boolean Py()
  {
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(dYs);
    try
    {
      if ((localb.exists()) && (!localb.isFile())) {
        a(localb, true);
      }
      return true;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.imageloader.ImageTmpFilehUtils", "[cpan] clean tmp file path exception.");
    }
    return false;
  }
  
  private static void a(com.tencent.mm.vfs.b paramb, boolean paramBoolean)
  {
    if ((paramb != null) && (paramb.exists()) && (paramb.isDirectory()))
    {
      com.tencent.mm.vfs.b[] arrayOfb = paramb.cBY();
      if ((arrayOfb != null) && (arrayOfb.length > 0))
      {
        int k = arrayOfb.length;
        int i = 0;
        if (i < k)
        {
          com.tencent.mm.vfs.b localb = arrayOfb[i];
          if ((localb != null) && (localb.exists()))
          {
            if (!localb.isFile()) {
              break label109;
            }
            if ((localb != null) && (localb.isFile()) && (localb.exists())) {
              localb.delete();
            }
          }
          label109:
          label182:
          for (;;)
          {
            i += 1;
            break;
            long l1 = localb.lastModified();
            long l2 = System.currentTimeMillis();
            x.d("MicroMsg.imageloader.ImageTmpFilehUtils", "[cpan] can delete current time:%d,listModified:%d", new Object[] { Long.valueOf(l2), Long.valueOf(l1) });
            if (l2 - l1 >= 259200000L) {}
            for (int j = 1;; j = 0)
            {
              if ((j == 0) || (!paramBoolean)) {
                break label182;
              }
              a(localb, false);
              break;
            }
          }
        }
      }
      paramb.delete();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ak/a/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */