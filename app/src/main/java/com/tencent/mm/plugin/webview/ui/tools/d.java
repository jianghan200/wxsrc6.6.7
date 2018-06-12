package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Base64;
import com.tencent.mm.bp.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.ak;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class d
{
  private static final HashMap<String, WeakReference<Bitmap>> pWn = new HashMap();
  
  public static int AD(int paramInt)
  {
    return ak.AD(paramInt);
  }
  
  public static Bitmap Rf(String paramString)
  {
    Object localObject = (WeakReference)pWn.get(paramString);
    if ((localObject != null) && (((WeakReference)localObject).get() != null) && (!((Bitmap)((WeakReference)localObject).get()).isRecycled())) {
      return (Bitmap)((WeakReference)localObject).get();
    }
    if (FileOp.cn(paramString)) {}
    for (localObject = c.decodeFile(paramString, null);; localObject = null)
    {
      if (localObject != null)
      {
        pWn.put(paramString, new WeakReference(localObject));
        return (Bitmap)localObject;
      }
      try
      {
        Bitmap localBitmap = BackwardSupportUtil.b.a(ad.getContext().getAssets().open("avatar/default_nor_avatar.png"), a.getDensity(null));
        localObject = localBitmap;
        pWn.put(paramString, new WeakReference(localBitmap));
        return localBitmap;
      }
      catch (Exception paramString)
      {
        x.printErrStackTrace("MicroMsg.WebView.RemoteUtil", paramString, "", new Object[0]);
        return (Bitmap)localObject;
      }
    }
  }
  
  public static Bitmap Rg(String paramString)
  {
    if (bi.oW(paramString))
    {
      localObject1 = null;
      return (Bitmap)localObject1;
    }
    Object localObject1 = (WeakReference)pWn.get(paramString);
    if ((localObject1 != null) && (((WeakReference)localObject1).get() != null) && (!((Bitmap)((WeakReference)localObject1).get()).isRecycled())) {
      return (Bitmap)((WeakReference)localObject1).get();
    }
    localObject1 = Base64.decode(paramString, 0);
    if (localObject1 == null) {
      return null;
    }
    Object localObject2 = new BitmapFactory.Options();
    ((BitmapFactory.Options)localObject2).inJustDecodeBounds = true;
    BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length, (BitmapFactory.Options)localObject2);
    int k = ((BitmapFactory.Options)localObject2).outWidth;
    int j = ((BitmapFactory.Options)localObject2).outHeight;
    int i = Math.min(((BitmapFactory.Options)localObject2).outWidth, ((BitmapFactory.Options)localObject2).outHeight);
    ((BitmapFactory.Options)localObject2).inJustDecodeBounds = false;
    if (i > 96)
    {
      ((BitmapFactory.Options)localObject2).inSampleSize = Math.max((int)(i * 1.0F / 96.0F), 1);
      localObject1 = BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length, (BitmapFactory.Options)localObject2);
      if (localObject1 == null) {
        return null;
      }
      k = ((Bitmap)localObject1).getWidth();
      j = ((Bitmap)localObject1).getHeight();
      i = Math.min(k, j);
    }
    do
    {
      Bitmap localBitmap = Bitmap.createBitmap((Bitmap)localObject1, Math.max(k / 2 - i / 2, 0), Math.max(j / 2 - i / 2, 0), i, i);
      if (localBitmap != localObject1) {
        ((Bitmap)localObject1).recycle();
      }
      localObject2 = Bitmap.createScaledBitmap(localBitmap, 96, 96, false);
      if (localBitmap != localObject2) {
        localBitmap.recycle();
      }
      localObject1 = localObject2;
      if (localObject2 == null) {
        break;
      }
      localObject1 = localObject2;
      if (((Bitmap)localObject2).isRecycled()) {
        break;
      }
      pWn.put(paramString, new WeakReference(localObject2));
      return (Bitmap)localObject2;
      localObject2 = BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length, (BitmapFactory.Options)localObject2);
      localObject1 = localObject2;
    } while (localObject2 != null);
    return null;
  }
  
  public static void a(com.tencent.mm.plugin.webview.stub.d paramd, int paramInt, List<String> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0)) {
      return;
    }
    try
    {
      paramd.g(paramInt, paramList);
      return;
    }
    catch (Exception paramd)
    {
      x.w("MicroMsg.WebView.RemoteUtil", "kvReport, ex = " + paramd.getMessage());
    }
  }
  
  public static void a(com.tencent.mm.plugin.webview.stub.d paramd, int paramInt, Object... paramVarArgs)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramVarArgs == null) || (paramVarArgs.length == 0)) {
      return;
    }
    try
    {
      int j = paramVarArgs.length;
      int i = 0;
      while (i < j)
      {
        localArrayList.add(String.valueOf(paramVarArgs[i]));
        i += 1;
      }
      paramd.g(paramInt, localArrayList);
      return;
    }
    catch (Exception paramd)
    {
      x.w("MicroMsg.WebView.RemoteUtil", "kvReport, ex = " + paramd.getMessage());
    }
  }
  
  public static boolean a(Bundle paramBundle, String paramString1, String paramString2, e parame, Runnable paramRunnable)
  {
    if (parame == null)
    {
      if (paramRunnable != null) {
        paramRunnable.run();
      }
      return true;
    }
    paramRunnable = new Bundle(3);
    paramRunnable.putBundle("open_ui_with_webview_ui_extras", paramBundle);
    paramRunnable.putString("open_ui_with_webview_ui_plugin_name", paramString1);
    paramRunnable.putString("open_ui_with_webview_ui_plugin_entry", paramString2);
    try
    {
      parame.g(101, paramRunnable);
      return true;
    }
    catch (RemoteException paramBundle)
    {
      x.printErrStackTrace("MicroMsg.WebView.RemoteUtil", paramBundle, "startUIWithWebViewUI, exp, pluginName %s, pluginEntry %s", new Object[] { paramString1, paramString2 });
    }
    return false;
  }
  
  public static int aO(String paramString, int paramInt)
  {
    return (int)w(paramString, Long.valueOf(paramInt).longValue());
  }
  
  private static long w(String paramString, long paramLong)
  {
    if (bi.oW(paramString)) {
      return paramLong;
    }
    Object localObject = paramString;
    if (paramString.startsWith("#"))
    {
      localObject = paramString;
      if (paramString.length() == 4)
      {
        localObject = new StringBuilder(paramString);
        ((StringBuilder)localObject).insert(2, paramString.charAt(1));
        ((StringBuilder)localObject).insert(4, paramString.charAt(2));
        ((StringBuilder)localObject).insert(6, paramString.charAt(3));
        localObject = ((StringBuilder)localObject).toString();
      }
    }
    try
    {
      int i = Color.parseColor((String)localObject);
      return 0xFFFFFFFF & i;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.WebView.RemoteUtil", "Failed to parse color: %s", new Object[] { localObject });
    }
    return paramLong;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */