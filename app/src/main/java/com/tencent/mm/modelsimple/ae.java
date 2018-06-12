package com.tencent.mm.modelsimple;

import com.tencent.mm.aa.n;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public final class ae
{
  private static com.tencent.mm.ab.e diJ = null;
  private static boolean egv = false;
  private static int egw = 3;
  private static long egx = 0L;
  
  public static void run()
  {
    if (egv)
    {
      x.i("MicroMsg.PostTaskUploadHDHeadImg", "is uploading hdHeadImg now!");
      return;
    }
    if ((egx == 0L) || (bi.bI(egx) > 180000L))
    {
      egx = bi.VG();
      egw = 3;
    }
    if (egw <= 0)
    {
      x.i("MicroMsg.PostTaskUploadHDHeadImg", "frequency limit");
      return;
    }
    egw -= 1;
    Object localObject = com.tencent.mm.compatible.util.e.dgs + "temp.avatar.hd";
    if (!new File((String)localObject).exists())
    {
      x.d("MicroMsg.PostTaskUploadHDHeadImg", "has uploaded HDHeadImg and delete it");
      return;
    }
    if (diJ == null) {
      diJ = new com.tencent.mm.ab.e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          x.i("MicroMsg.PostTaskUploadHDHeadImg", "onSceneEnd errType:%d, erCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0)) {
            com.tencent.mm.a.e.deleteFile(this.egy);
          }
          ae.Ju();
          g.DF().b(157, ae.Rx());
        }
      };
    }
    g.DF().a(157, diJ);
    localObject = new n(1, (String)localObject);
    g.DF().a((l)localObject, 0);
    egv = true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelsimple/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */