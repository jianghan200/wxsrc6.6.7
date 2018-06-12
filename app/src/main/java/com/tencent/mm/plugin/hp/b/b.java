package com.tencent.mm.plugin.hp.b;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;

public final class b
{
  private static long kmx = 0L;
  
  public static void N(Intent paramIntent)
  {
    KVCommCrossProcessReceiver.brK();
    x.i("Tinker.HotPatchReportHelper", "hp_report try to apply patch service start");
    if (paramIntent == null)
    {
      h.mEJ.U(338, 6, 127);
      return;
    }
    if (ShareIntentUtil.j(paramIntent, "patch_path_extra") == null)
    {
      h.mEJ.U(338, 6, 128);
      return;
    }
    h.mEJ.a(338L, 6L, 1L, true);
  }
  
  public static void a(Throwable paramThrowable, int paramInt)
  {
    int i = 0;
    switch (paramInt)
    {
    }
    for (;;)
    {
      if (i == 0)
      {
        String str1 = ak.j(paramThrowable);
        paramThrowable = str1;
        if (paramInt == -4)
        {
          Context localContext = ad.getContext();
          String str2 = SharePatchFileUtil.hY(localContext);
          paramThrowable = str1;
          if (!ShareTinkerInternals.oW(str2))
          {
            paramThrowable = "tinker checkSafeModeCount fail:\n" + str2;
            SharePatchFileUtil.aj(SharePatchFileUtil.hX(localContext));
          }
        }
        h.mEJ.c("Tinker", "Tinker Exception:load tinker occur exception " + paramThrowable, null);
      }
      return;
      if (paramThrowable.getMessage().contains("checkDexInstall failed"))
      {
        h.mEJ.a(338L, 189L, 1L, false);
        x.i("Tinker.HotPatchReportHelper", "tinker dex check fail:" + paramThrowable.getMessage());
        i = 1;
      }
      else
      {
        h.mEJ.a(338L, 161L, 1L, false);
        x.e("Tinker.HotPatchReportHelper", "tinker dex reflect fail:" + paramThrowable.getMessage());
        continue;
        if (paramThrowable.getMessage().contains("checkResInstall failed"))
        {
          h.mEJ.a(338L, 190L, 1L, false);
          i = 1;
        }
        else
        {
          h.mEJ.a(338L, 184L, 1L, false);
          continue;
          h.mEJ.a(338L, 188L, 1L, false);
          continue;
          h.mEJ.a(338L, 160L, 1L, false);
        }
      }
    }
  }
  
  public static void aWk()
  {
    h.mEJ.a(338L, 9L, 1L, false);
  }
  
  public static void aWl()
  {
    h.mEJ.a(338L, 106L, 1L, false);
  }
  
  public static void aWm()
  {
    h.mEJ.a(338L, 116L, 1L, false);
  }
  
  public static void aWn()
  {
    h.mEJ.a(338L, 168L, 1L, false);
  }
  
  public static void aWo()
  {
    h.mEJ.a(338L, 5L, 1L, false);
  }
  
  public static void c(int paramInt, Throwable paramThrowable)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 1: 
      h.mEJ.a(338L, 191L, 1L, false);
      h.mEJ.c("Tinker", "Tinker Exception:interpret occur instruction exception " + ak.j(paramThrowable), null);
      return;
    case 2: 
      h.mEJ.a(338L, 192L, 1L, false);
      h.mEJ.c("Tinker", "Tinker Exception:interpret occur command exception " + ak.j(paramThrowable), null);
      return;
    }
    h.mEJ.a(338L, 193L, 1L, false);
  }
  
  public static void d(Throwable paramThrowable)
  {
    h.mEJ.a(338L, 104L, 1L, false);
    h.mEJ.c("Tinker", "Tinker Exception:apply tinker occur unknown exception " + ak.j(paramThrowable), null);
  }
  
  public static void e(Throwable paramThrowable)
  {
    if (paramThrowable.getMessage().contains("checkDexOptExist failed"))
    {
      h.mEJ.a(338L, 134L, 1L, false);
      return;
    }
    if (paramThrowable.getMessage().contains("checkDexOptFormat failed"))
    {
      h.mEJ.a(338L, 135L, 1L, false);
      h.mEJ.c("Tinker", "Tinker Exception:apply tinker occur dexOpt format exception " + ak.j(paramThrowable), null);
      return;
    }
    h.mEJ.a(338L, 105L, 1L, false);
    h.mEJ.c("Tinker", "Tinker Exception:apply tinker occur dexOpt exception " + ak.j(paramThrowable), null);
  }
  
  public static void fK(boolean paramBoolean)
  {
    x.i("Tinker.HotPatchReportHelper", "hp_report try to apply hotpatch");
    h.mEJ.U(338, 2, 71);
    if (paramBoolean) {
      h.mEJ.a(338L, 7L, 1L, true);
    }
  }
  
  public static void j(boolean paramBoolean, int paramInt)
  {
    x.i("Tinker.HotPatchReportHelper", "hp_report package check failed, error = %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramBoolean) {
      h.mEJ.a(338L, 170L, 1L, false);
    }
    switch (paramInt)
    {
    default: 
      return;
    case -1: 
      h.mEJ.U(338, 169, 171);
      return;
    case -3: 
      h.mEJ.U(338, 169, 172);
      return;
    case -4: 
      h.mEJ.U(338, 169, 173);
      return;
    case -6: 
      h.mEJ.U(338, 169, 175);
      return;
    case -5: 
      h.mEJ.U(338, 169, 174);
      return;
    case -7: 
      h.mEJ.U(338, 169, 176);
      return;
    case -2: 
      h.mEJ.U(338, 107, 182);
      return;
    }
    h.mEJ.U(338, 169, 186);
  }
  
  public static void l(long paramLong, boolean paramBoolean)
  {
    if (paramBoolean) {
      h.mEJ.a(338L, 3L, 1L, true);
    }
    if (paramBoolean) {
      h.mEJ.a(338L, 101L, 1L, false);
    }
    for (;;)
    {
      x.i("Tinker.HotPatchReportHelper", "hp_report report apply cost = %d", new Object[] { Long.valueOf(paramLong) });
      if (paramLong >= 0L) {
        break;
      }
      x.e("Tinker.HotPatchReportHelper", "hp_report report apply cost failed, invalid cost");
      return;
      h.mEJ.a(338L, 103L, 1L, false);
    }
    if (paramLong <= 5000L)
    {
      if (paramBoolean)
      {
        h.mEJ.a(338L, 117L, 1L, false);
        return;
      }
      h.mEJ.a(338L, 122L, 1L, false);
      return;
    }
    if (paramLong <= 10000L)
    {
      if (paramBoolean)
      {
        h.mEJ.a(338L, 118L, 1L, false);
        return;
      }
      h.mEJ.a(338L, 123L, 1L, false);
      return;
    }
    if (paramLong <= 30000L)
    {
      if (paramBoolean)
      {
        h.mEJ.a(338L, 119L, 1L, false);
        return;
      }
      h.mEJ.a(338L, 124L, 1L, false);
      return;
    }
    if (paramLong <= 60000L)
    {
      if (paramBoolean)
      {
        h.mEJ.a(338L, 120L, 1L, false);
        return;
      }
      h.mEJ.a(338L, 125L, 1L, false);
      return;
    }
    if (paramLong >= 3600000L) {
      h.mEJ.a(338L, 133L, 1L, false);
    }
    if (paramBoolean)
    {
      h.mEJ.a(338L, 121L, 1L, false);
      return;
    }
    h.mEJ.a(338L, 126L, 1L, false);
  }
  
  public static void m(long paramLong, boolean paramBoolean)
  {
    h.mEJ.a(338L, 4L, 1L, false);
    if (!paramBoolean)
    {
      h.mEJ.a(338L, 159L, 1L, false);
      return;
    }
    x.i("Tinker.HotPatchReportHelper", "hp_report report load cost = %d", new Object[] { Long.valueOf(paramLong) });
    if (paramLong < 0L)
    {
      x.e("Tinker.HotPatchReportHelper", "hp_report report load cost failed, invalid cost");
      return;
    }
    if (paramLong <= 500L)
    {
      h.mEJ.a(338L, 177L, 1L, false);
      return;
    }
    if (paramLong <= 1000L)
    {
      h.mEJ.a(338L, 178L, 1L, false);
      return;
    }
    if (paramLong <= 3000L)
    {
      h.mEJ.a(338L, 179L, 1L, false);
      return;
    }
    if (paramLong <= 5000L)
    {
      h.mEJ.a(338L, 180L, 1L, false);
      return;
    }
    h.mEJ.a(338L, 181L, 1L, false);
  }
  
  public static void rl(int paramInt)
  {
    x.i("Tinker.HotPatchReportHelper", "hp_report new hotpatch requested");
    switch (paramInt)
    {
    }
    for (;;)
    {
      kmx = bi.VG();
      return;
      h.mEJ.a(338L, 0L, 1L, false);
      continue;
      h.mEJ.a(338L, 20L, 1L, false);
      continue;
      h.mEJ.a(614L, 0L, 1L, false);
    }
  }
  
  public static void rm(int paramInt)
  {
    long l = bi.bI(kmx);
    x.i("Tinker.HotPatchReportHelper", "hp_report report download cost = %d", new Object[] { Long.valueOf(l) });
    switch (paramInt)
    {
    }
    while (l < 0L)
    {
      x.e("Tinker.HotPatchReportHelper", "hp_report report download cost failed, invalid cost");
      return;
      h.mEJ.a(338L, 40L, 1L, false);
    }
    if (l <= 5000L)
    {
      h.mEJ.U(338, 1, 43);
      return;
    }
    if (l <= 60000L)
    {
      h.mEJ.U(338, 1, 44);
      return;
    }
    if (l <= 180000L)
    {
      h.mEJ.U(338, 1, 45);
      return;
    }
    h.mEJ.U(338, 1, 46);
  }
  
  public static void rn(int paramInt)
  {
    x.i("Tinker.HotPatchReportHelper", "hp_report download failed");
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      h.mEJ.a(338L, 41L, 1L, false);
      return;
    case 1: 
      h.mEJ.a(338L, 42L, 1L, false);
      return;
    }
    h.mEJ.a(614L, 3L, 1L, false);
  }
  
  public static void ro(int paramInt)
  {
    x.i("Tinker.HotPatchReportHelper", "hp_report try to apply hotpatch fail");
    switch (paramInt)
    {
    case -19: 
    case -18: 
    case -17: 
    case -16: 
    case -15: 
    case -14: 
    case -13: 
    case -12: 
    case -11: 
    case -10: 
    case -9: 
    case -8: 
    default: 
      return;
    case -2: 
      h.mEJ.a(338L, 75L, 1L, false);
      return;
    case -1: 
      h.mEJ.a(338L, 72L, 1L, false);
      return;
    case -4: 
      h.mEJ.a(338L, 74L, 1L, false);
      return;
    case -3: 
      h.mEJ.a(338L, 73L, 1L, false);
      return;
    case -5: 
      h.mEJ.a(338L, 85L, 1L, false);
      return;
    case -21: 
      h.mEJ.a(338L, 77L, 1L, false);
      return;
    case -20: 
      h.mEJ.a(338L, 76L, 1L, false);
      return;
    case -6: 
      h.mEJ.a(338L, 78L, 1L, false);
      return;
    case -22: 
      h.mEJ.a(338L, 80L, 1L, false);
      return;
    case -23: 
      h.mEJ.a(338L, 79L, 1L, false);
      return;
    case -24: 
      h.mEJ.a(338L, 81L, 1L, false);
      return;
    case -25: 
      h.mEJ.a(338L, 82L, 1L, false);
      return;
    case -26: 
      h.mEJ.a(338L, 83L, 1L, false);
      return;
    }
    h.mEJ.a(338L, 84L, 1L, false);
  }
  
  public static void rp(int paramInt)
  {
    x.i("Tinker.HotPatchReportHelper", "hp_report package check failed, error = %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default: 
      return;
    case -1: 
      h.mEJ.U(338, 107, 108);
      return;
    case -3: 
      h.mEJ.U(338, 107, 109);
      return;
    case -4: 
      h.mEJ.U(338, 107, 110);
      return;
    case -6: 
      h.mEJ.U(338, 107, 112);
      return;
    case -5: 
      h.mEJ.U(338, 107, 111);
      return;
    case -7: 
      h.mEJ.U(338, 107, 113);
      return;
    case -2: 
      h.mEJ.U(338, 107, 129);
      return;
    }
    h.mEJ.U(338, 107, 131);
  }
  
  public static void rq(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
    case 4: 
    default: 
      return;
    case 3: 
      h.mEJ.a(338L, 114L, 1L, false);
      return;
    case 5: 
      h.mEJ.a(338L, 115L, 1L, false);
      return;
    case 1: 
      h.mEJ.a(338L, 130L, 1L, false);
      return;
    case 6: 
      h.mEJ.a(338L, 132L, 1L, false);
      return;
    }
    h.mEJ.a(338L, 136L, 1L, false);
  }
  
  public static void rr(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 4: 
      h.mEJ.a(338L, 183L, 1L, false);
      return;
    case 3: 
      h.mEJ.a(338L, 164L, 1L, false);
      return;
    case 5: 
      h.mEJ.a(338L, 165L, 1L, false);
      return;
    case 1: 
      h.mEJ.a(338L, 166L, 1L, false);
      return;
    case 2: 
      h.mEJ.a(338L, 167L, 1L, false);
      return;
    }
    h.mEJ.a(338L, 187L, 1L, false);
  }
  
  public static void rs(int paramInt)
  {
    switch (paramInt)
    {
    case 4: 
    default: 
      return;
    case 3: 
      h.mEJ.a(338L, 162L, 1L, false);
      return;
    case 5: 
      h.mEJ.a(338L, 163L, 1L, false);
      return;
    }
    h.mEJ.a(338L, 185L, 1L, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/hp/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */