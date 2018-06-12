package com.tencent.mm.plugin.hp.tinker;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.k.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class g
{
  public static void G(Context paramContext, int paramInt)
  {
    paramContext.getSharedPreferences("tinker_patch_share_config", 4).edit().putInt("tinker_node_retry_time", paramInt).apply();
  }
  
  public static boolean ar(Context paramContext, String paramString)
  {
    paramContext = paramContext.getSharedPreferences("tinker_patch_share_config", 4).getString("tinker_before_install", "");
    x.i("MicroMsg.Tinker.TinkerPatchSharedPreferencesUtil", "isBeforeDownloadDialogHaveCancel current patchID :%s patchID:%s", new Object[] { paramContext, paramString });
    return (!bi.oW(paramContext)) && (!bi.oW(paramString)) && (paramContext.equalsIgnoreCase(paramString));
  }
  
  public static void as(Context paramContext, String paramString)
  {
    paramContext.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_before_install", paramString).apply();
  }
  
  public static void at(Context paramContext, String paramString)
  {
    paramContext.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_node", paramString).apply();
  }
  
  public static void dI(Context paramContext)
  {
    int i = com.tencent.mm.k.g.AT().getInt("TinkerCheckUpdateInterval", 12);
    if (i < 0)
    {
      x.i("MicroMsg.Tinker.TinkerPatchSharedPreferencesUtil", "saveTinkerCheckUpdateTinker hours < 0 ");
      return;
    }
    x.i("MicroMsg.Tinker.TinkerPatchSharedPreferencesUtil", "saveTinkerCheckUpdateTinker hours:%d", new Object[] { Integer.valueOf(i) });
    paramContext.getSharedPreferences("tinker_patch_share_config", 4).edit().putInt("check_tinker_update_interval", i).apply();
  }
  
  public static int dJ(Context paramContext)
  {
    return paramContext.getSharedPreferences("tinker_patch_share_config", 4).getInt("check_tinker_update_interval", 12);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/hp/tinker/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */