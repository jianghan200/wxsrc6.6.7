package com.tencent.mm.pluginsdk.ui.tools;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.tencent.mm.bg.d;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.ak.a.a;
import com.tencent.mm.plugin.ak.a.h;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.File;

public final class l
{
  private static String filePath = null;
  
  public static boolean A(Context paramContext, Intent paramIntent)
  {
    return b(paramContext, paramIntent, "");
  }
  
  public static boolean O(Activity paramActivity)
  {
    a(paramActivity, 2, 1, 0, 1, false, null);
    return true;
  }
  
  public static boolean P(Activity paramActivity)
  {
    a(paramActivity, 205, 1, 11, null);
    return true;
  }
  
  public static boolean Q(Activity paramActivity)
  {
    a(paramActivity, 2, 1, 5, null);
    return true;
  }
  
  public static void R(Activity paramActivity)
  {
    a(paramActivity, 2, 1, 10, 1, true, null);
  }
  
  public static String Vs()
  {
    return r.Vs();
  }
  
  public static void a(Activity paramActivity, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, Intent paramIntent)
  {
    Intent localIntent = new Intent();
    if (paramIntent != null) {
      localIntent.putExtras(paramIntent.getExtras());
    }
    localIntent.putExtra("max_select_count", paramInt2);
    localIntent.putExtra("query_source_type", paramInt3);
    localIntent.putExtra("query_media_type", paramInt4);
    localIntent.putExtra("show_header_view", paramBoolean);
    localIntent.addFlags(67108864);
    d.b(paramActivity, "gallery", ".ui.GalleryEntryUI", localIntent, paramInt1);
  }
  
  public static void a(Activity paramActivity, int paramInt1, int paramInt2, int paramInt3, Intent paramIntent)
  {
    Intent localIntent = new Intent();
    if (paramIntent != null) {
      localIntent.putExtras(paramIntent.getExtras());
    }
    localIntent.putExtra("max_select_count", paramInt2);
    localIntent.putExtra("query_source_type", paramInt3);
    localIntent.addFlags(67108864);
    d.b(paramActivity, "gallery", ".ui.GalleryEntryUI", localIntent, paramInt1);
  }
  
  public static void a(Activity paramActivity, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    paramString = new File(paramString);
    if (paramString.exists()) {
      paramString.delete();
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("output", Uri.fromFile(paramString));
    localIntent.putExtra("android.intent.extra.videoQuality", paramInt3);
    if (paramBoolean) {}
    for (paramInt3 = 1;; paramInt3 = 0)
    {
      localIntent.putExtra("android.intent.extras.CAMERA_FACING", paramInt3);
      if (paramInt2 > 0) {
        localIntent.putExtra("android.intent.extra.durationLimit", paramInt2);
      }
      localIntent.setAction("android.media.action.VIDEO_CAPTURE");
      localIntent.addCategory("android.intent.category.DEFAULT");
      paramActivity.startActivityForResult(localIntent, paramInt1);
      return;
    }
  }
  
  private static void a(Fragment paramFragment, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString1, String paramString2)
  {
    Intent localIntent = new Intent();
    if (!bi.oW(paramString2))
    {
      localIntent.putExtra("GalleryUI_FromUser", paramString1);
      localIntent.putExtra("GalleryUI_ToUser", paramString2);
    }
    localIntent.putExtra("max_select_count", paramInt2);
    localIntent.putExtra("query_source_type", paramInt3);
    localIntent.putExtra("query_media_type", paramInt4);
    if (af.eyg) {
      localIntent.putExtra("show_header_view", true);
    }
    for (;;)
    {
      localIntent.addFlags(67108864);
      d.a(paramFragment, "gallery", ".ui.AlbumPreviewUI", localIntent, paramInt1);
      return;
      localIntent.putExtra("show_header_view", false);
    }
  }
  
  public static void a(Fragment paramFragment, int paramInt, String paramString1, String paramString2)
  {
    a(paramFragment, 217, 9, paramInt, 1, paramString1, paramString2);
  }
  
  public static void a(String paramString, Context paramContext)
  {
    r.a(paramString, paramContext);
  }
  
  public static boolean a(Activity paramActivity, int paramInt, Intent paramIntent)
  {
    a(paramActivity, paramInt, 1, 0, paramIntent);
    return true;
  }
  
  public static boolean a(Context paramContext, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3)
  {
    return a(paramContext, paramInt1, paramIntent, paramInt2, "", paramInt3, "");
  }
  
  private static boolean a(Context paramContext, int paramInt1, Intent paramIntent, int paramInt2, String paramString1, int paramInt3, String paramString2)
  {
    SightParams localSightParams1 = null;
    if (paramIntent != null) {
      localSightParams1 = (SightParams)paramIntent.getParcelableExtra("KEY_SIGHT_PARAMS");
    }
    SightParams localSightParams2 = localSightParams1;
    if (localSightParams1 == null) {
      localSightParams2 = new SightParams(paramInt2, paramInt3);
    }
    localSightParams2.leu = paramString2;
    if (paramInt2 == 1)
    {
      paramString1 = s.nJ(paramString1);
      o.Ta();
      paramString2 = s.nK(paramString1);
      o.Ta();
      localSightParams2.m(paramString1, paramString2, s.nL(paramString1), com.tencent.mm.compatible.util.e.dgl + String.format("%s%d.%s", new Object[] { "capture", Long.valueOf(System.currentTimeMillis()), "jpg" }));
    }
    if (localSightParams2 == null) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.TakePhotoUtil", "videoParams takeMMSight is null");
    }
    for (;;)
    {
      d.b(paramContext, "mmsight", ".ui.SightCaptureUI", paramIntent, paramInt1);
      if ((paramContext instanceof Activity)) {
        ((Activity)paramContext).overridePendingTransition(a.a.sight_slide_bottom_in, -1);
      }
      return true;
      paramIntent.putExtra("KEY_SIGHT_PARAMS", localSightParams2);
    }
  }
  
  public static boolean a(Fragment paramFragment, Intent paramIntent, String paramString, int paramInt)
  {
    SightParams localSightParams = new SightParams(1, paramInt);
    paramString = s.nJ(paramString);
    o.Ta();
    String str = s.nK(paramString);
    o.Ta();
    localSightParams.m(paramString, str, s.nL(paramString), com.tencent.mm.compatible.util.e.dgl + String.format("%s%d.%s", new Object[] { "capture", Long.valueOf(System.currentTimeMillis()), "jpg" }));
    paramIntent.putExtra("KEY_SIGHT_PARAMS", localSightParams);
    d.a(paramFragment, "mmsight", ".ui.SightCaptureUI", paramIntent, 226);
    paramFragment.getActivity().overridePendingTransition(a.a.sight_slide_bottom_in, -1);
    return true;
  }
  
  public static boolean a(com.tencent.mm.ui.x paramx, String paramString1, String paramString2)
  {
    boolean bool = b(paramx, paramString1, paramString2);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TakePhotoUtil", "takePhoto(), dir = [%s], filename = [%s], cmd = [%s], result = [%s]", new Object[] { paramString1, paramString2, Integer.valueOf(201), Boolean.valueOf(bool) });
    return bool;
  }
  
  public static void b(Fragment paramFragment, int paramInt, String paramString1, String paramString2)
  {
    a(paramFragment, 217, 9, paramInt, 3, paramString1, paramString2);
  }
  
  public static boolean b(Context paramContext, Intent paramIntent, String paramString)
  {
    return a(paramContext, 17, paramIntent, 2, "", 0, paramString);
  }
  
  private static boolean b(com.tencent.mm.ui.x paramx, String paramString1, String paramString2)
  {
    if ((com.tencent.mm.p.a.bx(paramx.getContext())) || (com.tencent.mm.p.a.bw(paramx.getContext()))) {
      return false;
    }
    filePath = paramString1 + paramString2;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), filePath = " + filePath);
    bp(paramx.getContext(), filePath);
    paramString2 = new Intent("android.media.action.IMAGE_CAPTURE");
    File localFile = new File(paramString1);
    if (!localFile.exists()) {}
    try
    {
      localFile.mkdirs();
      if (!localFile.exists())
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), dir not exist. " + paramString1);
        return false;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.TakePhotoUtil", localException, "", new Object[0]);
      }
      paramString2.putExtra("output", Uri.fromFile(new File(filePath)));
      try
      {
        paramx.startActivityForResult(paramString2, 201);
        return true;
      }
      catch (ActivityNotFoundException paramx)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), " + paramx.getMessage());
      }
    }
    return false;
  }
  
  private static void bp(Context paramContext, String paramString)
  {
    paramContext = paramContext.getSharedPreferences("system_config_prefs", 0).edit();
    paramContext.putString("camera_file_path", paramString);
    paramContext.commit();
  }
  
  public static void c(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    paramIntent.putExtra("max_select_count", paramInt1);
    paramIntent.putExtra("query_media_type", 2);
    paramIntent.putExtra("query_source_type", paramInt2);
    paramIntent.addFlags(67108864);
    d.b(paramActivity, "gallery", ".ui.GalleryEntryUI", paramIntent, 4);
  }
  
  public static boolean c(Activity paramActivity, String paramString1, String paramString2, int paramInt)
  {
    boolean bool = d(paramActivity, paramString1, paramString2, paramInt);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TakePhotoUtil", "takePhoto(), dir = [%s], filename = [%s], cmd = [%s], result = [%s]", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt), Boolean.valueOf(bool) });
    return bool;
  }
  
  public static boolean c(Context paramContext, Intent paramIntent, String paramString)
  {
    return a(paramContext, 8, paramIntent, 1, paramString, 0, "");
  }
  
  @TargetApi(8)
  public static String cfw()
  {
    return com.tencent.mm.compatible.util.e.dgl;
  }
  
  public static String d(Context paramContext, Intent paramIntent, String paramString)
  {
    if (filePath == null) {
      filePath = paramContext.getSharedPreferences("system_config_prefs", 0).getString("camera_file_path", null);
    }
    if ((filePath == null) || (!com.tencent.mm.a.e.cn(filePath))) {
      filePath = com.tencent.mm.ui.tools.a.e(paramContext, paramIntent, paramString);
    }
    r.a(filePath, paramContext);
    return filePath;
  }
  
  private static boolean d(Activity paramActivity, String paramString1, String paramString2, int paramInt)
  {
    if ((com.tencent.mm.p.a.bx(paramActivity)) || (com.tencent.mm.p.a.bw(paramActivity))) {
      return false;
    }
    filePath = paramString1 + paramString2;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), filePath = " + filePath);
    bp(paramActivity, filePath);
    paramString2 = new Intent("android.media.action.IMAGE_CAPTURE");
    File localFile = new File(paramString1);
    if (!localFile.exists()) {}
    try
    {
      localFile.mkdirs();
      if (!localFile.exists())
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), dir not exist. " + paramString1);
        return false;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.TakePhotoUtil", localException, "", new Object[0]);
      }
      paramString2.putExtra("output", Uri.fromFile(new File(filePath)));
      try
      {
        paramActivity.startActivityForResult(paramString2, paramInt);
        return true;
      }
      catch (Exception paramActivity)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), " + paramActivity.getMessage());
      }
    }
    return false;
  }
  
  public static void i(String paramString, Context paramContext)
  {
    r.a(paramString, paramContext, a.h.image_saved);
  }
  
  public static boolean k(Fragment paramFragment)
  {
    a(paramFragment, 200, 1, 0, 1, "", "");
    return true;
  }
  
  public static String oN(String paramString)
  {
    return r.oN(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/tools/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */