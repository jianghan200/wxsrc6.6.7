package com.tencent.tinker.lib.e;

import android.content.Context;
import com.tencent.tinker.lib.d.c;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import java.io.File;

public class a
{
  private static a vsu;
  public static boolean vsv = false;
  public final Context context;
  public final boolean ons;
  public int tinkerFlags;
  final boolean tinkerLoadVerifyFlag;
  public final File vsA;
  public final File vsB;
  public final boolean vsC;
  public d vsD;
  public boolean vsE = false;
  public final File vsw;
  final com.tencent.tinker.lib.b.b vsx;
  public final c vsy;
  public final com.tencent.tinker.lib.d.d vsz;
  
  private a(Context paramContext, int paramInt, c paramc, com.tencent.tinker.lib.d.d paramd, com.tencent.tinker.lib.b.b paramb, File paramFile1, File paramFile2, File paramFile3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.context = paramContext;
    this.vsx = paramb;
    this.vsy = paramc;
    this.vsz = paramd;
    this.tinkerFlags = paramInt;
    this.vsw = paramFile1;
    this.vsA = paramFile2;
    this.vsB = paramFile3;
    this.ons = paramBoolean1;
    this.tinkerLoadVerifyFlag = paramBoolean3;
    this.vsC = paramBoolean2;
  }
  
  public static void a(a parama)
  {
    if (vsu != null) {
      throw new TinkerRuntimeException("Tinker instance is already set.");
    }
    vsu = parama;
  }
  
  public static a hL(Context paramContext)
  {
    if (!vsv) {
      throw new TinkerRuntimeException("you must install tinker before get tinker sInstance");
    }
    try
    {
      if (vsu == null) {
        vsu = new a(paramContext).cGX();
      }
      return vsu;
    }
    finally {}
  }
  
  public final void aWt()
  {
    if (this.vsw == null) {
      return;
    }
    if (this.vsE) {
      com.tencent.tinker.lib.f.a.e("Tinker.Tinker", "it is not safety to clean patch when tinker is loaded, you should kill all your process after clean!", new Object[0]);
    }
    SharePatchFileUtil.k(this.vsw);
  }
  
  public final void ac(File paramFile)
  {
    if ((this.vsw == null) || (paramFile == null) || (!paramFile.exists())) {}
    do
    {
      return;
      paramFile = SharePatchFileUtil.acV(SharePatchFileUtil.ak(paramFile));
    } while ((this.vsw == null) || (paramFile == null));
    SharePatchFileUtil.co(this.vsw.getAbsolutePath() + "/" + paramFile);
  }
  
  public static final class a
  {
    private final Context context;
    public int status = -1;
    private File vsA;
    private File vsB;
    private final boolean vsF;
    private final boolean vsG;
    public Boolean vsH;
    private File vsw;
    public com.tencent.tinker.lib.b.b vsx;
    public c vsy;
    public com.tencent.tinker.lib.d.d vsz;
    
    public a(Context paramContext)
    {
      if (paramContext == null) {
        throw new TinkerRuntimeException("Context must not be null.");
      }
      this.context = paramContext;
      this.vsF = com.tencent.tinker.lib.f.b.ic(paramContext);
      this.vsG = com.tencent.tinker.lib.f.b.hP(paramContext);
      this.vsw = SharePatchFileUtil.hV(paramContext);
      if (this.vsw == null)
      {
        com.tencent.tinker.lib.f.a.e("Tinker.Tinker", "patchDirectory is null!", new Object[0]);
        return;
      }
      this.vsA = SharePatchFileUtil.acT(this.vsw.getAbsolutePath());
      this.vsB = SharePatchFileUtil.acU(this.vsw.getAbsolutePath());
      com.tencent.tinker.lib.f.a.w("Tinker.Tinker", "tinker patch directory: %s", new Object[] { this.vsw });
    }
    
    public final a cGX()
    {
      if (this.status == -1) {
        this.status = 7;
      }
      if (this.vsy == null) {
        this.vsy = new com.tencent.tinker.lib.d.a(this.context);
      }
      if (this.vsz == null) {
        this.vsz = new com.tencent.tinker.lib.d.b(this.context);
      }
      if (this.vsx == null) {
        this.vsx = new com.tencent.tinker.lib.b.a(this.context);
      }
      if (this.vsH == null) {
        this.vsH = Boolean.valueOf(false);
      }
      return new a(this.context, this.status, this.vsy, this.vsz, this.vsx, this.vsw, this.vsA, this.vsB, this.vsF, this.vsG, this.vsH.booleanValue(), (byte)0);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tinker/lib/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */