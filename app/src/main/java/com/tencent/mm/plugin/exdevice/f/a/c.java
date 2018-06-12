package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.plugin.exdevice.f.b.a.a;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.io.ByteArrayOutputStream;

public final class c
  implements i.a
{
  String appName = null;
  String ixo = null;
  
  public final int a(String paramString, int paramInt, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult, boolean paramBoolean)
  {
    x.d("MicroMsg.ExdevicePictureUploader", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramString, Integer.valueOf(paramInt), paramkeep_ProgressInfo, paramkeep_SceneResult });
    if ((paramkeep_SceneResult != null) && (paramString.equals(this.ixo))) {
      if ((paramInt == 0) && (paramkeep_SceneResult.field_retCode == 0))
      {
        x.d("MicroMsg.ExdevicePictureUploader", "hy: transfer done, upload callback success");
        x.i("MicroMsg.ExdevicePictureUploader", "transfer done, mediaid=%s, completeInfo=%s", new Object[] { paramString, paramkeep_SceneResult.toString() });
        paramString = new a();
        paramString.field_championUrl = paramkeep_SceneResult.field_fileUrl;
        paramString.field_username = q.GF();
        b.Ab(paramString.field_championUrl);
        ad.aHi().a(paramString);
        ad.aHm();
        paramkeep_ProgressInfo = paramString.field_championUrl;
        paramString = paramString.field_championMotto;
        au.DF().a(new m(paramkeep_ProgressInfo, paramString), 0);
      }
    }
    while (paramkeep_ProgressInfo == null)
    {
      return 0;
      x.w("MicroMsg.ExdevicePictureUploader", "hy: transfer done, fail");
      return 0;
    }
    x.d("MicroMsg.ExdevicePictureUploader", "hy: upload progressing....");
    return 0;
  }
  
  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream) {}
  
  public final byte[] i(String paramString, byte[] paramArrayOfByte)
  {
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/exdevice/f/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */