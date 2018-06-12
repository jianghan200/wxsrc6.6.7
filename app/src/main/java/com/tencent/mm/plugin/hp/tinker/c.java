package com.tencent.mm.plugin.hp.tinker;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.tencent.mm.plugin.hp.b.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.tinker.lib.e.d;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;

public final class c
  extends com.tencent.tinker.lib.d.a
{
  public c(Context paramContext)
  {
    super(paramContext);
  }
  
  private void aWr()
  {
    new a(this.context, new c.1(this));
  }
  
  public final void a(File paramFile, int paramInt)
  {
    super.a(paramFile, paramInt);
    b.rs(paramInt);
  }
  
  public final void a(File paramFile, int paramInt, long paramLong)
  {
    super.a(paramFile, paramInt, paramLong);
    switch (paramInt)
    {
    default: 
      if (!com.tencent.tinker.lib.e.a.hL(this.context).ons) {
        com.tencent.tinker.lib.f.a.w("Tinker.TinkerPatchLoadReporter", "onPatchRetryLoad retry is not main process, just return", new Object[0]);
      }
      break;
    }
    for (;;)
    {
      x.d("Tinker.TinkerPatchLoadReporter", "onLoadResult loadcode:%d icost:%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong) });
      if (paramInt == 0)
      {
        Object localObject = com.tencent.tinker.lib.e.a.hL(this.context).vsD;
        x.i("Tinker.TinkerPatchLoadReporter", "onLoadResult currentVersion:%s", new Object[] { ((d)localObject).vsI });
        if (!TextUtils.isEmpty(((d)localObject).vsI))
        {
          paramFile = this.context;
          localObject = ((d)localObject).vsI;
          paramFile.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_patch_version_key", (String)localObject).apply();
        }
      }
      return;
      b.m(paramLong, com.tencent.tinker.lib.e.a.hL(this.context).ons);
      break;
      paramFile = new File(SharePatchFileUtil.hW(this.context), "temp.apk").getAbsolutePath();
      if ((paramFile == null) || (!new File(paramFile).exists())) {
        com.tencent.tinker.lib.f.a.w("Tinker.TinkerPatchLoadReporter", "onPatchRetryLoad patch file: %s is not exist, just return", new Object[] { paramFile });
      } else {
        new a(this.context, new c.2(this));
      }
    }
  }
  
  public final void a(File paramFile, int paramInt, boolean paramBoolean)
  {
    com.tencent.tinker.lib.f.a.i("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadFileNotFound: patch file not found: %s, fileType:%d, isDirectory:%b", new Object[] { paramFile.getAbsolutePath(), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (paramInt == 4) {
      aWr();
    }
    for (;;)
    {
      if (paramInt == 1)
      {
        paramFile = com.tencent.tinker.lib.e.a.hL(this.context).vsD;
        if ((paramFile.vsI != null) && ("00000000000000000000000000000000".equals(paramFile.vsI)))
        {
          com.tencent.tinker.lib.f.a.e("Tinker.TinkerPatchLoadReporter", "Roll back patch when restarting main process, restart all other process also!", new Object[0]);
          ShareTinkerInternals.ie(this.context);
        }
      }
      b.rr(paramInt);
      return;
      cGU();
    }
  }
  
  public final void a(String paramString1, String paramString2, File paramFile)
  {
    super.a(paramString1, paramString2, paramFile);
    b.aWn();
  }
  
  public final void a(String paramString1, String paramString2, File paramFile, String paramString3)
  {
    super.a(paramString1, paramString2, paramFile, paramString3);
    b.aWo();
  }
  
  public final void a(Throwable paramThrowable, int paramInt)
  {
    super.a(paramThrowable, paramInt);
    b.a(paramThrowable, paramInt);
  }
  
  public final void b(File paramFile, int paramInt)
  {
    super.b(paramFile, paramInt);
    b.j(ad.sGA, paramInt);
  }
  
  public final void c(File paramFile, int paramInt)
  {
    super.c(paramFile, paramInt);
    if ((paramInt == -26) || (paramInt == -5))
    {
      ShareTinkerInternals.ia(this.context);
      com.tencent.tinker.lib.e.a.hL(this.context).tinkerFlags = 0;
    }
    b.ro(paramInt);
  }
  
  public final void d(int paramInt, Throwable paramThrowable)
  {
    com.tencent.tinker.lib.f.a.i("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadInterpret: type: %d, throwable: %s", new Object[] { Integer.valueOf(paramInt), paramThrowable });
    switch (paramInt)
    {
    }
    for (;;)
    {
      aWr();
      b.c(paramInt, paramThrowable);
      return;
      com.tencent.tinker.lib.f.a.e("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadInterpret fail, can get instruction set from existed oat file", new Object[0]);
      continue;
      com.tencent.tinker.lib.f.a.e("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadInterpret fail, command line to interpret return error", new Object[0]);
      continue;
      com.tencent.tinker.lib.f.a.i("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadInterpret ok", new Object[0]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/hp/tinker/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */