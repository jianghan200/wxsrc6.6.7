package com.tencent.mm.plugin.wenote.model;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.mm.a.e;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.an;
import com.tencent.mm.plugin.fav.a.q;
import com.tencent.mm.plugin.wenote.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

public final class c
  implements ar
{
  private static HashMap<Integer, h.d> cVM = new HashMap();
  private com.tencent.mm.sdk.b.c bannerOnInitListener = new c.1(this);
  private com.tencent.mm.plugin.wenote.a.c qnA = new com.tencent.mm.plugin.wenote.a.c();
  private com.tencent.mm.plugin.wenote.a.a qnB = new com.tencent.mm.plugin.wenote.a.a();
  public d qnC = null;
  private b qnz = new b();
  
  public static c bZb()
  {
    au.HN();
    c localc2 = (c)bs.iK("plugin.wenote");
    c localc1 = localc2;
    if (localc2 == null)
    {
      localc1 = new c();
      au.HN().a("plugin.wenote", localc1);
    }
    return localc1;
  }
  
  private static void e(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = new byte['Ѐ'];
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1) {
        break;
      }
      paramOutputStream.write(arrayOfByte, 0, i);
    }
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    x.d("MicroMsg.SubCoreWNNoteMsg", "on account post reset");
    com.tencent.mm.sdk.b.a.sFg.b(this.qnz);
    ((com.tencent.mm.plugin.record.a.a)g.n(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().a(this.qnA);
    ((ae)g.n(ae.class)).getFavCdnStorage().a(this.qnA);
    com.tencent.mm.sdk.b.a.sFg.b(this.qnB);
    com.tencent.mm.sdk.b.a.sFg.b(this.bannerOnInitListener);
    Object localObject1 = new File(i.Go());
    if ((!((File)localObject1).exists()) || (!((File)localObject1).isDirectory()))
    {
      x.d("MicroMsg.SubCoreWNNoteMsg", "record stg dir[%s] not exsit, create it");
      ((File)localObject1).mkdirs();
    }
    Object localObject2 = new File(an.aLQ());
    x.i("MicroMsg.SubCoreWNNoteMsg", "copy to path %s", new Object[] { ((File)localObject2).getAbsolutePath() });
    if ((com.tencent.mm.protocal.d.qVQ) || (com.tencent.mm.protocal.d.qVR))
    {
      x.i("MicroMsg.SubCoreWNNoteMsg", "copyAssertTemplateFile develop version delete template");
      e.k((File)localObject2);
      if (!((File)localObject2).exists()) {
        ((File)localObject2).mkdirs();
      }
      localObject1 = ad.getContext().getAssets();
    }
    for (;;)
    {
      int i;
      InputStream localInputStream;
      File localFile;
      try
      {
        localObject1 = ((AssetManager)localObject1).open("WNNote.zip");
        if (localObject1 == null)
        {
          x.e("MicroMsg.SubCoreWNNoteMsg", "file inputStream not found");
          return;
          an.iXk = an.Oe();
          if (paramBoolean)
          {
            i = an.Of();
            x.i("MicroMsg.SubCoreWNNoteMsg", "copyAssertTemplateFile need update assetVersion=%d currentVersion=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(an.iXk) });
            if (an.iXk >= i) {
              break;
            }
            e.k((File)localObject2);
            break;
          }
          if (an.iXk == 1)
          {
            x.i("MicroMsg.SubCoreWNNoteMsg", "copyAssertTemplateFile need init template");
            e.k((File)localObject2);
            break;
          }
          x.i("MicroMsg.SubCoreWNNoteMsg", "copyAssertTemplateFile currentVersion=%d", new Object[] { Integer.valueOf(an.iXk) });
        }
      }
      catch (IOException localIOException1)
      {
        x.printErrStackTrace("MicroMsg.SubCoreWNNoteMsg", localIOException1, "", new Object[0]);
        localInputStream = null;
        continue;
        localFile = new File((File)localObject2, "WNNote.zip");
        if (localFile.exists())
        {
          x.i("MicroMsg.SubCoreWNNoteMsg", "wenote template already exists");
          e.f(localInputStream);
          return;
        }
      }
      try
      {
        localObject2 = new FileOutputStream(localFile);
        if (localObject2 == null) {}
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        try
        {
          e(localInputStream, (OutputStream)localObject2);
          e.f(localInputStream);
          e.closeOutputStream((OutputStream)localObject2);
          i = bi.fR(localFile.getAbsolutePath(), localFile.getParent());
          if (i >= 0) {
            continue;
          }
          x.e("MicroMsg.SubCoreWNNoteMsg", "unzip fail, ret = " + i + ", zipFilePath = " + localFile.getAbsolutePath() + ", unzipPath = " + localFile.getParent());
          return;
          localFileNotFoundException = localFileNotFoundException;
          x.printErrStackTrace("MicroMsg.SubCoreWNNoteMsg", localFileNotFoundException, "", new Object[0]);
          Object localObject3 = null;
        }
        catch (IOException localIOException2)
        {
          for (;;)
          {
            x.printErrStackTrace("MicroMsg.SubCoreWNNoteMsg", localIOException2, "", new Object[0]);
          }
        }
      }
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    x.d("MicroMsg.SubCoreWNNoteMsg", "on account post release");
    com.tencent.mm.sdk.b.a.sFg.c(this.qnz);
    if (((com.tencent.mm.plugin.record.a.a)g.n(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage() != null) {
      ((com.tencent.mm.plugin.record.a.a)g.n(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().b(this.qnA);
    }
    if (((ae)g.n(ae.class)).getFavCdnStorage() != null) {
      ((ae)g.n(ae.class)).getFavCdnStorage().b(this.qnA);
    }
    com.tencent.mm.sdk.b.a.sFg.c(this.qnB);
    com.tencent.mm.sdk.b.a.sFg.c(this.bannerOnInitListener);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */