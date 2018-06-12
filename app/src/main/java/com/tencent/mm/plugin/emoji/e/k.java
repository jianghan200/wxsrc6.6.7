package com.tencent.mm.plugin.emoji.e;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import com.tencent.mm.R.a;
import com.tencent.mm.R.l;
import com.tencent.mm.ak.c;
import com.tencent.mm.ak.o;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.ot;
import com.tencent.mm.g.a.ow;
import com.tencent.mm.model.s;
import com.tencent.mm.model.u;
import com.tencent.mm.model.u.b;
import com.tencent.mm.opensdk.modelmsg.WXDesignerSharedObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.pluginsdk.ui.applet.g;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public final class k
{
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("Ksnsupload_title", paramString1);
    localIntent.putExtra("KContentObjDesc", paramString2);
    localIntent.putExtra("Ksnsupload_imgurl", paramString3);
    localIntent.putExtra("Ksnsupload_link", paramString4);
    localIntent.putExtra("KUploadProduct_UserData", paramString5);
    localIntent.putExtra("Ksnsupload_type", paramInt);
    paramString1 = u.ic("emoje_stroe");
    u.Hx().v(paramString1, true).p("prePublishId", "emoje_stroe");
    localIntent.putExtra("reportSessionId", paramString1);
    d.c(paramContext, "sns", ".ui.SnsUploadUI", localIntent);
  }
  
  public static void a(MMActivity paramMMActivity, String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt3, String paramString6)
  {
    g.b(paramMMActivity.mController, paramString2, paramString4, paramString3, "", paramMMActivity.getString(R.l.app_send), new k.3(paramString1, paramInt1, paramInt2, paramString2, paramString3, paramString4, paramString5, paramInt3, paramString6, paramMMActivity));
  }
  
  public static void cZ(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("Select_Conv_Type", 3);
    localIntent.putExtra("MMActivity.OverrideEnterAnimation", R.a.fast_faded_in);
    localIntent.putExtra("MMActivity.OverrideExitAnimation", R.a.push_down_out);
    d.b(paramContext, ".ui.transmit.SelectConversationUI", localIntent, 2002);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/emoji/e/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */