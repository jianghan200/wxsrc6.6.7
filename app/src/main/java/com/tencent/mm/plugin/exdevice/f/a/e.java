package com.tencent.mm.plugin.exdevice.f.a;

import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import com.tencent.mm.R.l;
import com.tencent.mm.ak.a.a;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.q;
import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class e
{
  public static void a(Context paramContext, ImageView paramImageView, String paramString, int paramInt)
  {
    if (paramImageView != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (!ah.isMainThread()) {
        break;
      }
      b(paramImageView, paramString, paramInt);
      return;
    }
    ah.A(new e.1(paramContext, paramImageView, paramString, paramInt));
  }
  
  public static boolean a(MMActivity paramMMActivity, int paramInt1, int paramInt2, Intent paramIntent, String paramString)
  {
    boolean bool2 = false;
    boolean bool1;
    if ((paramInt1 == 1001) && (paramInt2 == -1))
    {
      paramIntent = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
      bool1 = bool2;
      if (paramIntent != null)
      {
        bool1 = bool2;
        if (paramIntent.size() > 0)
        {
          paramIntent = (String)paramIntent.get(0);
          paramString = new Intent();
          paramString.putExtra("CropImageMode", 1);
          paramString.putExtra("CropImage_OutputPath", com.tencent.mm.compatible.util.e.dgt + "temp.cover");
          paramString.putExtra("CropImage_ImgPath", paramIntent);
          com.tencent.mm.bg.d.b(paramMMActivity, ".ui.tools.CropImageNewUI", paramString, 1002);
          bool1 = true;
        }
      }
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramInt1 != 1002);
      bool1 = bool2;
    } while (paramInt2 != -1);
    paramMMActivity = d.Ac(com.tencent.mm.compatible.util.e.dgt + "temp.cover");
    paramIntent = ad.aHo();
    paramIntent.appName = paramString;
    long l = System.currentTimeMillis();
    paramIntent.ixo = com.tencent.mm.modelcdntran.d.a("uploadexdeivce", l, q.Hl().field_username, String.valueOf(l));
    paramString = paramIntent.ixo;
    i locali = new i();
    locali.dPV = paramIntent;
    locali.field_mediaId = paramString;
    locali.field_fullpath = paramMMActivity;
    locali.field_thumbpath = "";
    locali.field_fileType = b.dOu;
    locali.field_talker = "";
    locali.field_priority = b.dOj;
    locali.field_needStorage = true;
    locali.field_isStreamMedia = false;
    locali.field_appType = 200;
    locali.field_bzScene = 2;
    if (!g.ND().c(locali)) {
      x.e("MicroMsg.ExdevicePictureUploader", "hy: cdntra addSendTask failed. clientid:%s", new Object[] { paramString });
    }
    return true;
  }
  
  static void b(ImageView paramImageView, String paramString, int paramInt)
  {
    if ((!bi.oW(paramString)) && (!"#".equals(paramString)))
    {
      x.d("MicroMsg.ExdeviceRankUtil", "hy: set url to %s", new Object[] { paramString });
      ad.aHh().a(paramString, paramImageView, ad.Aa(paramString));
      return;
    }
    x.d("MicroMsg.ExdeviceRankUtil", "hy: url is null or nill. set to default picture resource");
    paramImageView.setImageResource(paramInt);
  }
  
  public static void e(MMActivity paramMMActivity)
  {
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    localLinkedList1.add(paramMMActivity.getString(R.l.exdevice_change_cover));
    localLinkedList2.add(Integer.valueOf(0));
    h.a(paramMMActivity, "", localLinkedList1, localLinkedList2, null, true, new e.2(paramMMActivity));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/exdevice/f/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */