package com.tencent.tinker.loader;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.hotplug.ComponentHotplug;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;

public class TinkerLoader
  extends AbstractTinkerLoader
{
  private static final String TAG = "Tinker.TinkerLoader";
  private SharePatchInfo patchInfo;
  
  private boolean checkSafeModeCount(TinkerApplication paramTinkerApplication)
  {
    String str = ShareTinkerInternals.aC(paramTinkerApplication);
    str = "tinker_own_config_" + str;
    SharedPreferences localSharedPreferences = paramTinkerApplication.getSharedPreferences(str, 0);
    int i = localSharedPreferences.getInt("safe_mode_count", 0) + 1;
    new StringBuilder("tinker safe mode preferName:").append(str).append(" count:").append(i);
    if (i >= 3)
    {
      localSharedPreferences.edit().putInt("safe_mode_count", 0).commit();
      return false;
    }
    paramTinkerApplication.setUseSafeMode(true);
    localSharedPreferences.edit().putInt("safe_mode_count", i).commit();
    return true;
  }
  
  private void tryLoadPatchFilesInternal(TinkerApplication paramTinkerApplication, Intent paramIntent)
  {
    int k = paramTinkerApplication.getTinkerFlags();
    if (!ShareTinkerInternals.In(k))
    {
      ShareIntentUtil.a(paramIntent, -1);
      return;
    }
    if (ShareTinkerInternals.id(paramTinkerApplication))
    {
      ShareIntentUtil.a(paramIntent, -1);
      return;
    }
    Object localObject1 = SharePatchFileUtil.hV(paramTinkerApplication);
    if (localObject1 == null)
    {
      ShareIntentUtil.a(paramIntent, -2);
      return;
    }
    String str2 = ((File)localObject1).getAbsolutePath();
    if (!((File)localObject1).exists())
    {
      ShareIntentUtil.a(paramIntent, -2);
      return;
    }
    File localFile1 = SharePatchFileUtil.acT(str2);
    if (!localFile1.exists())
    {
      new StringBuilder("tryLoadPatchFiles:patch info not exist:").append(localFile1.getAbsolutePath());
      ShareIntentUtil.a(paramIntent, -3);
      return;
    }
    File localFile2 = SharePatchFileUtil.acU(str2);
    this.patchInfo = SharePatchInfo.n(localFile1, localFile2);
    if (this.patchInfo == null)
    {
      ShareIntentUtil.a(paramIntent, -4);
      return;
    }
    localObject1 = this.patchInfo.vvF;
    Object localObject2 = this.patchInfo.vvG;
    String str1 = this.patchInfo.vsJ;
    if ((localObject1 == null) || (localObject2 == null) || (str1 == null))
    {
      ShareIntentUtil.a(paramIntent, -4);
      return;
    }
    paramIntent.putExtra("intent_patch_old_version", (String)localObject1);
    paramIntent.putExtra("intent_patch_new_version", (String)localObject2);
    boolean bool4 = ShareTinkerInternals.ic(paramTinkerApplication);
    int j;
    label231:
    int i;
    if (!((String)localObject1).equals(localObject2))
    {
      j = 1;
      if ((!str1.equals("changing")) || (!bool4)) {
        break label300;
      }
      i = 1;
      label248:
      str1 = ShareTinkerInternals.bS(paramTinkerApplication, str1);
      paramIntent.putExtra("intent_patch_oat_dir", str1);
      if ((j == 0) || (!bool4)) {
        break label873;
      }
      localObject1 = localObject2;
    }
    label300:
    label682:
    label873:
    for (;;)
    {
      if (ShareTinkerInternals.oW((String)localObject1))
      {
        ShareIntentUtil.a(paramIntent, -5);
        return;
        j = 0;
        break label231;
        i = 0;
        break label248;
      }
      localObject2 = SharePatchFileUtil.acV((String)localObject1);
      if (localObject2 == null)
      {
        ShareIntentUtil.a(paramIntent, -6);
        return;
      }
      str2 = str2 + "/" + (String)localObject2;
      localObject2 = new File(str2);
      if (!((File)localObject2).exists())
      {
        ShareIntentUtil.a(paramIntent, -6);
        return;
      }
      Object localObject3 = SharePatchFileUtil.acW((String)localObject1);
      if (localObject3 != null) {}
      for (localObject2 = new File(((File)localObject2).getAbsolutePath(), (String)localObject3); !SharePatchFileUtil.ah((File)localObject2); localObject2 = null)
      {
        ShareIntentUtil.a(paramIntent, -7);
        return;
      }
      localObject3 = new ShareSecurityCheck(paramTinkerApplication);
      int m = ShareTinkerInternals.a(paramTinkerApplication, k, (File)localObject2, (ShareSecurityCheck)localObject3);
      if (m != 0)
      {
        paramIntent.putExtra("intent_patch_package_patch_check", m);
        ShareIntentUtil.a(paramIntent, -8);
        return;
      }
      paramIntent.putExtra("intent_patch_package_config", ((ShareSecurityCheck)localObject3).cHd());
      boolean bool2 = ShareTinkerInternals.Ij(k);
      if (((bool2) && (!TinkerDexLoader.a(str2, (ShareSecurityCheck)localObject3, str1, paramIntent))) || ((ShareTinkerInternals.Ik(k)) && (!TinkerSoLoader.a(str2, (ShareSecurityCheck)localObject3, paramIntent)))) {
        break;
      }
      boolean bool3 = ShareTinkerInternals.Il(k);
      if ((bool3) && (!TinkerResourceLoader.a(paramTinkerApplication, str2, (ShareSecurityCheck)localObject3, paramIntent))) {
        break;
      }
      if ((ShareTinkerInternals.cHe()) && (ShareTinkerInternals.acZ(this.patchInfo.vvH)) && (Build.VERSION.SDK_INT >= 21) && (!ShareTinkerInternals.cHg())) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        paramIntent.putExtra("intent_patch_system_ota", bool1);
        if (((!bool4) || (j == 0)) && (i == 0)) {
          break label682;
        }
        this.patchInfo.vvF = ((String)localObject1);
        this.patchInfo.vsJ = str1;
        if (SharePatchInfo.a(localFile1, this.patchInfo, localFile2)) {
          break;
        }
        ShareIntentUtil.a(paramIntent, -19);
        return;
      }
      if (i != 0) {
        SharePatchFileUtil.co(str2 + "/interpet");
      }
      if (!checkSafeModeCount(paramTinkerApplication))
      {
        paramIntent.putExtra("intent_patch_exception", new TinkerRuntimeException("checkSafeModeCount fail"));
        ShareIntentUtil.a(paramIntent, -25);
        return;
      }
      j = i;
      if (bool2)
      {
        bool4 = TinkerDexLoader.a(paramTinkerApplication, str2, str1, paramIntent, bool1);
        if (bool1)
        {
          this.patchInfo.vvH = Build.FINGERPRINT;
          localObject2 = this.patchInfo;
          if (bool4) {}
          for (localObject1 = "interpet";; localObject1 = "odex")
          {
            ((SharePatchInfo)localObject2).vsJ = ((String)localObject1);
            i = 0;
            if (SharePatchInfo.a(localFile1, this.patchInfo, localFile2)) {
              break;
            }
            ShareIntentUtil.a(paramIntent, -19);
            return;
          }
          paramIntent.putExtra("intent_patch_oat_dir", this.patchInfo.vsJ);
        }
        if (!bool4) {
          break;
        }
        j = i;
      }
      if ((bool3) && (!TinkerResourceLoader.a(paramTinkerApplication, str2, paramIntent))) {
        break;
      }
      if ((bool2) && (bool3)) {
        ComponentHotplug.a(paramTinkerApplication, (ShareSecurityCheck)localObject3);
      }
      if (j != 0) {
        ShareTinkerInternals.ie(paramTinkerApplication);
      }
      ShareIntentUtil.a(paramIntent, 0);
      return;
    }
  }
  
  public Intent tryLoad(TinkerApplication paramTinkerApplication)
  {
    Intent localIntent = new Intent();
    long l = SystemClock.elapsedRealtime();
    tryLoadPatchFilesInternal(paramTinkerApplication, localIntent);
    ShareIntentUtil.a(localIntent, SystemClock.elapsedRealtime() - l);
    return localIntent;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tinker/loader/TinkerLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */