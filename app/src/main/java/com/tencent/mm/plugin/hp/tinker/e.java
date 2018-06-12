package com.tencent.mm.plugin.hp.tinker;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import java.io.File;
import java.util.List;

public final class e
  extends com.tencent.tinker.lib.d.b
{
  public e(Context paramContext)
  {
    super(paramContext);
  }
  
  public final void O(Intent paramIntent)
  {
    super.O(paramIntent);
    com.tencent.mm.plugin.hp.b.b.N(paramIntent);
  }
  
  public final void a(File paramFile, SharePatchInfo paramSharePatchInfo, String paramString)
  {
    super.a(paramFile, paramSharePatchInfo, paramString);
    com.tencent.mm.plugin.hp.b.b.aWm();
  }
  
  public final void a(File paramFile1, File paramFile2, String paramString, int paramInt)
  {
    super.a(paramFile1, paramFile2, paramString, paramInt);
    com.tencent.mm.plugin.hp.b.b.rq(paramInt);
  }
  
  public final void a(File paramFile, String paramString1, String paramString2)
  {
    super.a(paramFile, paramString1, paramString2);
    com.tencent.mm.plugin.hp.b.b.aWl();
  }
  
  public final void a(File paramFile, Throwable paramThrowable)
  {
    super.a(paramFile, paramThrowable);
    com.tencent.mm.plugin.hp.b.b.d(paramThrowable);
  }
  
  public final void a(File paramFile, List<File> paramList, Throwable paramThrowable)
  {
    super.a(paramFile, paramList, paramThrowable);
    com.tencent.mm.plugin.hp.b.b.e(paramThrowable);
  }
  
  public final void a(File paramFile, boolean paramBoolean, long paramLong)
  {
    super.a(paramFile, paramBoolean, paramLong);
    com.tencent.mm.plugin.hp.b.b.l(paramLong, paramBoolean);
    x.chS();
  }
  
  public final void d(File paramFile, int paramInt)
  {
    super.d(paramFile, paramInt);
    com.tencent.mm.plugin.hp.b.b.rp(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/hp/tinker/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */