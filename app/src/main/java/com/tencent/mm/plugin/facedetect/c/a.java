package com.tencent.mm.plugin.facedetect.c;

import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import com.tencent.mm.ab.l;
import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.facedetect.b.u;
import com.tencent.mm.plugin.facedetect.b.v;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.plugin.facedetect.ui.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;

public abstract class a
{
  private int iLW;
  protected com.tencent.mm.plugin.facedetect.b.d iLX = null;
  protected com.tencent.mm.plugin.facedetect.b.c iLY = null;
  protected WeakReference<e> iMN;
  protected boolean iMO = false;
  int iMP = -1;
  private com.tencent.mm.remoteservice.d iMQ = null;
  protected com.tencent.mm.plugin.facedetect.b.a iMR = null;
  protected boolean iMS = false;
  private Context mContext;
  
  a(Context paramContext, e parame, int paramInt)
  {
    this.mContext = paramContext;
    this.iLW = paramInt;
    this.iMN = new WeakReference(parame);
    this.iMR = new com.tencent.mm.plugin.facedetect.b.a(paramInt);
    this.iMP = FaceDetectReporter.pw(paramInt);
  }
  
  public final void AS(String paramString)
  {
    com.tencent.mm.plugin.facedetect.b.a locala;
    if (this.iMR != null)
    {
      locala = this.iMR;
      if (!locala.iMa)
      {
        locala.iMc = 1;
        if (!bi.oW(paramString)) {
          break label48;
        }
        x.e("MicroMsg.FaceUploadProcessor", "hy: err face file null");
        locala.h(4, 90011, "face file null");
      }
    }
    label48:
    i locali;
    do
    {
      do
      {
        return;
        if (!FileOp.cn(paramString))
        {
          x.e("MicroMsg.FaceUploadProcessor", "hy: file not exist");
          locala.h(4, 90011, "get image failed");
          return;
        }
        if (locala.iMb == 0L)
        {
          x.e("MicroMsg.FaceUploadProcessor", "hy: err not init");
          locala.h(4, 90014, "uploadId not init");
          return;
        }
        x.i("MicroMsg.FaceUploadProcessor", "hy: start upload file : %s", new Object[] { paramString });
      } while (locala.iMa);
      locali = new i();
      locali.dPV = locala.iMh;
      locali.field_mediaId = com.tencent.mm.plugin.facedetect.model.o.AV(paramString);
      locali.field_fullpath = paramString;
      locali.field_thumbpath = "";
      locali.field_fileType = b.MediaType_FILE;
      locali.field_talker = "";
      locali.field_priority = b.dOk;
      locali.field_needStorage = false;
      locali.field_isStreamMedia = false;
      locali.field_appType = 0;
      locali.field_bzScene = 0;
      locali.field_largesvideo = 0;
    } while (com.tencent.mm.modelcdntran.g.ND().c(locali));
    x.e("MicroMsg.FaceUploadProcessor", "hy: cdntra addSendTask failed. clientid:%s", new Object[] { locali.field_mediaId });
    locala.h(4, 90019, "add to cdn failed");
  }
  
  protected final void a(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
    boolean bool = true;
    if (this.iMN == null) {}
    for (;;)
    {
      x.i("MicroMsg.FaceDetectBaseController", "alvinluo finishWithResult mUIModel == null: %b", new Object[] { Boolean.valueOf(bool) });
      if ((this.iMN != null) && (this.iMN.get() != null)) {
        ((e)this.iMN.get()).a(paramInt1, paramInt2, paramString, paramBundle);
      }
      return;
      bool = false;
    }
  }
  
  public final void a(int paramInt, String paramString, Bundle paramBundle)
  {
    if ((paramInt == 0) && (!b(paramInt, paramString, paramBundle)))
    {
      x.i("MicroMsg.FaceDetectBaseController", "alvinluo onUploadSuccess");
      this.iMO = true;
      if (this.iMS)
      {
        paramString = aJy();
        if (paramString != null) {
          break label50;
        }
        x.e("MicroMsg.FaceDetectBaseController", "alvinluo verifyNetScene is null, stop verify");
      }
    }
    label50:
    do
    {
      return;
      x.i("MicroMsg.FaceDetectBaseController", "alvinluo start verify, sceneType: %d", new Object[] { Integer.valueOf(paramString.getType()) });
      if (!this.iMO)
      {
        x.e("MicroMsg.FaceDetectBaseController", "isUploadDone: %b, upload not done, can't startVerify", new Object[] { Boolean.valueOf(this.iMO) });
        return;
      }
    } while (this.iMR == null);
    paramBundle = this.iMR;
    if (paramString == null)
    {
      x.e("MicroMsg.FaceUploadProcessor", "alvinluo verifyNetScene is null");
      return;
    }
    x.i("MicroMsg.FaceUploadProcessor", "uploader start verify, sceneType: %d", new Object[] { Integer.valueOf(paramString.getType()) });
    paramBundle.aJo();
    paramBundle.iMe = paramString;
    paramBundle.iMc = 2;
    com.tencent.mm.kernel.g.DF().a(paramString.getType(), paramBundle);
    com.tencent.mm.kernel.g.DF().a(paramString, 0);
    paramBundle.iMf = System.currentTimeMillis();
  }
  
  public final void a(com.tencent.mm.plugin.facedetect.b.c paramc)
  {
    if (this.iMR != null)
    {
      this.iLY = paramc;
      this.iMR.iLY = this.iLY;
    }
  }
  
  public final void a(com.tencent.mm.plugin.facedetect.b.d paramd)
  {
    if (this.iMR != null)
    {
      this.iLX = paramd;
      this.iMR.iLX = paramd;
    }
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, a.b paramb)
  {
    if ((this.iMN != null) && (this.iMN.get() != null)) {
      ((e)this.iMN.get()).a(paramBoolean1, paramBoolean2, paramb);
    }
  }
  
  public final void aJu()
  {
    com.tencent.mm.plugin.facedetect.b.a locala;
    if (this.iMR != null)
    {
      locala = this.iMR;
      com.tencent.mm.kernel.g.Eg();
      locala.iLZ = com.tencent.mm.kernel.a.Dw();
      x.i("MicroMsg.FaceUploadProcessor", "alvinluo isLogin: %b", new Object[] { Boolean.valueOf(locala.iLZ) });
      if (!locala.iLZ) {
        break label142;
      }
      com.tencent.mm.kernel.g.DF().a(732, locala);
      locala = this.iMR;
      locala.iMb = 0L;
      locala.iMc = 0;
      if (locala.iMd != null) {
        com.tencent.mm.kernel.g.DF().c(locala.iMd);
      }
      if (com.tencent.mm.plugin.facedetect.model.e.aJE()) {
        com.tencent.mm.plugin.facedetect.model.e.df(locala.iMb);
      }
      if (!locala.iLZ) {
        break label155;
      }
    }
    label142:
    label155:
    for (locala.iMd = new u(locala.iLW);; locala.iMd = new v(locala.iLW))
    {
      com.tencent.mm.kernel.g.DF().a(locala.iMd, 0);
      return;
      com.tencent.mm.kernel.g.DF().a(733, locala);
      break;
    }
  }
  
  public final void aJv()
  {
    if ((this.iMN != null) && (this.iMN.get() != null)) {
      ((e)this.iMN.get()).aJv();
    }
    onStart();
  }
  
  public final long aJw()
  {
    if (this.iMR != null) {
      return this.iMR.iMb;
    }
    return -1L;
  }
  
  public final void aJx()
  {
    x.i("MicroMsg.FaceDetectBaseController", "alvinluo controller releaseFaceDetect");
    if ((this.iMN != null) && (this.iMN.get() != null)) {
      ((e)this.iMN.get()).aJx();
    }
    this.iMN = null;
    Object localObject = bi.an(ad.getContext(), Process.myPid());
    String str = ad.getPackageName();
    x.i("MicroMsg.FaceDetectBaseController", "process name: %s", new Object[] { localObject });
    boolean bool;
    if (((String)localObject).equalsIgnoreCase(str)) {
      if (this.iMR != null)
      {
        localObject = this.iMR;
        if (((com.tencent.mm.plugin.facedetect.b.a)localObject).iMd != null) {
          break label201;
        }
        bool = true;
        x.v("MicroMsg.FaceUploadProcessor", "alvinluo uinit mCurrentNetScene == null: %b", new Object[] { Boolean.valueOf(bool) });
        ((com.tencent.mm.plugin.facedetect.b.a)localObject).iMa = true;
        if (((com.tencent.mm.plugin.facedetect.b.a)localObject).iMd != null)
        {
          x.i("MicroMsg.FaceUploadProcessor", "alvinluo hy: current scene: %s is not finished yet. cancel.", new Object[] { ((com.tencent.mm.plugin.facedetect.b.a)localObject).iMd.getClass().getSimpleName() });
          com.tencent.mm.kernel.g.DF().c(((com.tencent.mm.plugin.facedetect.b.a)localObject).iMd);
        }
        if (!((com.tencent.mm.plugin.facedetect.b.a)localObject).iLZ) {
          break label206;
        }
        com.tencent.mm.kernel.g.DF().b(732, (com.tencent.mm.ab.e)localObject);
      }
    }
    for (;;)
    {
      ((com.tencent.mm.plugin.facedetect.b.a)localObject).aJo();
      this.iMR = null;
      onRelease();
      return;
      label201:
      bool = false;
      break;
      label206:
      com.tencent.mm.kernel.g.DF().b(733, (com.tencent.mm.ab.e)localObject);
    }
  }
  
  protected abstract l aJy();
  
  public abstract Bundle aJz();
  
  public abstract void ac(int paramInt, String paramString);
  
  protected final void b(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
    if ((this.iMN != null) && (this.iMN.get() != null)) {
      ((e)this.iMN.get()).d(paramInt1, paramInt2, paramString, paramBundle);
    }
  }
  
  public abstract boolean b(int paramInt, String paramString, Bundle paramBundle);
  
  public abstract void c(int paramInt1, int paramInt2, String paramString, Bundle paramBundle);
  
  public abstract void i(int paramInt1, int paramInt2, String paramString);
  
  public abstract void i(int paramInt1, int paramInt2, String paramString, l paraml);
  
  public abstract void onRelease();
  
  protected abstract void onStart();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/facedetect/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */