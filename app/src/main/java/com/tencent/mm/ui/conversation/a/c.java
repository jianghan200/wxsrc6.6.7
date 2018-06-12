package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.platformtools.g;
import com.tencent.mm.pluginsdk.h.a.a.a;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;
import junit.framework.Assert;

public final class c
{
  com.tencent.mm.pluginsdk.h.a.a urN;
  
  c(com.tencent.mm.pluginsdk.h.a.a parama)
  {
    this.urN = parama;
  }
  
  private static Drawable a(Map<String, String> paramMap, Context paramContext)
  {
    if ((paramMap == null) || (paramMap.size() <= 0)) {
      return null;
    }
    Object localObject1 = paramContext.getResources().getDisplayMetrics();
    Object localObject2 = (String)paramMap.get(((DisplayMetrics)localObject1).heightPixels + "x" + ((DisplayMetrics)localObject1).widthPixels);
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      new g();
      localObject1 = paramContext.getResources().getDisplayMetrics();
      localObject2 = paramContext.getResources().getConfiguration();
      if (((DisplayMetrics)localObject1).density >= 1.0F) {
        break label182;
      }
      localObject1 = "" + "LDPI";
      localObject3 = new StringBuilder().append((String)localObject1);
      if (((Configuration)localObject2).orientation != 2) {
        break label240;
      }
    }
    label182:
    label240:
    for (localObject1 = "_L";; localObject1 = "_P")
    {
      localObject1 = (String)paramMap.get((String)localObject1);
      if (ai.oV((String)localObject1).length() > 0) {
        break label246;
      }
      return null;
      if (((DisplayMetrics)localObject1).density >= 1.5F)
      {
        localObject1 = "" + "HDPI";
        break;
      }
      localObject1 = "" + "MDPI";
      break;
    }
    label246:
    localObject2 = com.tencent.mm.pluginsdk.h.a.a.Tt((String)localObject1);
    if (localObject2 == a.a.qDP) {
      return null;
    }
    Object localObject3 = com.tencent.mm.pluginsdk.h.a.a.Ts((String)localObject1);
    if (ai.oV((String)localObject3).length() <= 0) {
      return null;
    }
    try
    {
      float f;
      if (localObject2 == a.a.qDN)
      {
        paramMap = paramContext.getAssets().open((String)localObject3);
        f = com.tencent.mm.bp.a.getDensity(paramContext);
        new g();
        paramMap = com.tencent.mm.sdk.platformtools.c.a(paramMap, f);
      }
      while (paramMap == null)
      {
        x.e("MicroMsg.ADListView.Message", "get Bitmap failed type:" + localObject2 + " path:" + (String)localObject3);
        return null;
        f = com.tencent.mm.bp.a.getDensity(paramContext);
        new g();
        localObject1 = com.tencent.mm.sdk.platformtools.c.f((String)localObject3, f);
        paramMap = (Map<String, String>)localObject1;
        if (localObject1 != null)
        {
          ((Bitmap)localObject1).setDensity((int)(160.0F * f));
          paramMap = (Map<String, String>)localObject1;
        }
      }
      localObject1 = paramMap.getNinePatchChunk();
    }
    catch (Exception paramMap)
    {
      x.printErrStackTrace("MicroMsg.ADListView.Message", paramMap, "", new Object[0]);
      return null;
    }
    if ((localObject1 != null) && (NinePatch.isNinePatchChunk((byte[])localObject1))) {
      return new NinePatchDrawable(paramMap, (byte[])localObject1, new Rect(), null);
    }
    localObject2 = paramContext.getResources().getDisplayMetrics();
    localObject1 = Bitmap.createScaledBitmap(paramMap, ((DisplayMetrics)localObject2).widthPixels, ((DisplayMetrics)localObject2).widthPixels * paramMap.getHeight() / paramMap.getWidth(), true);
    paramContext = paramMap;
    if (localObject1 != null)
    {
      if (paramMap == localObject1) {
        break label530;
      }
      x.i("MicroMsg.ADListView.Message", "recycle bitmap:%s", new Object[] { paramMap });
      paramMap.recycle();
    }
    for (;;)
    {
      paramMap = new BitmapDrawable(paramContext);
      paramMap.setTargetDensity((DisplayMetrics)localObject2);
      return paramMap;
      label530:
      paramContext = (Context)localObject1;
    }
  }
  
  public final int a(d paramd)
  {
    boolean bool2 = true;
    if (paramd != null)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      if (paramd.urP == null) {
        break label58;
      }
    }
    Drawable localDrawable;
    label58:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      localDrawable = a(this.urN.qDL, paramd.urO.getContext());
      if (localDrawable != null) {
        break label63;
      }
      return -1;
      bool1 = false;
      break;
    }
    label63:
    paramd.urO.setBackgroundDrawable(localDrawable);
    paramd = paramd.urP;
    if (this.urN.qDG) {}
    for (int i = 0;; i = 8)
    {
      paramd.setVisibility(i);
      return 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/conversation/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */