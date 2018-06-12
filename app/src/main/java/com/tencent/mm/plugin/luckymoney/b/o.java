package com.tencent.mm.plugin.luckymoney.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.Time;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.ai.a;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.plugin.luckymoney.ui.SelectLuckyMoneyContactUI;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.amr;
import com.tencent.mm.protocal.c.aue;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.g.a;
import com.tencent.mm.y.h;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class o
{
  private static com.tencent.mm.a.f<String, Bitmap> jaR = new com.tencent.mm.a.f(10);
  public static int kQG = Integer.MAX_VALUE;
  
  public static boolean C(String paramString1, String paramString2, int paramInt)
  {
    if ((bi.oW(paramString1)) || (bi.oW(paramString2)))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.LuckyMoneyUtil", bi.oV(paramString1) + ", " + bi.oV(paramString2));
      return false;
    }
    com.tencent.mm.storage.bd localbd = new com.tencent.mm.storage.bd();
    localbd.setContent(paramString1);
    localbd.setStatus(2);
    localbd.ep(paramString2);
    localbd.ay(com.tencent.mm.model.bd.iD(paramString2));
    localbd.eX(1);
    if (paramInt == 3) {
      localbd.setType(469762097);
    }
    long l;
    for (;;)
    {
      l = ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().T(localbd);
      if (l >= 0L) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyUtil", com.tencent.mm.compatible.util.g.Ac() + "insert msg failed :" + l);
      return false;
      localbd.setType(436207665);
    }
    com.tencent.mm.y.g localg;
    if (localbd.aQm())
    {
      com.tencent.mm.modelstat.b.ehL.a(localbd, h.g(localbd));
      localbd.setMsgId(l);
      localg = new com.tencent.mm.y.g();
      localg.field_xml = localbd.field_content;
      paramString2 = bi.WT(paramString1);
      paramString1 = null;
      if (paramString2 != null)
      {
        paramString2 = g.a.J(paramString2, localbd.field_reserved);
        paramString1 = paramString2;
        if (paramString2 != null)
        {
          localg.field_title = paramString2.title;
          localg.field_description = paramString2.description;
          paramString1 = paramString2;
        }
      }
      localg.field_type = 2001;
      localg.field_msgId = l;
      if ((paramString1 != null) && (paramString1.type == 2001) && (paramString1.showType == 1))
      {
        if ((TextUtils.isEmpty(paramString1.dyf)) || (TextUtils.isEmpty(paramString1.dyg)) || (paramString1.dyh <= 0)) {
          break label443;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyUtil", "ljd:sendLocalMsg() this is new year msg! send predownload image event!");
        paramString2 = new com.tencent.mm.g.a.ai();
        paramString2.bHG = new ai.a();
        paramString2.bHG.bHI = paramString1.dyg;
        paramString2.bHG.bHH = paramString1.dyf;
        paramString2.bHG.bHJ = paramString1.dyh;
        com.tencent.mm.sdk.b.a.sFg.m(paramString2);
      }
      label396:
      paramString1 = com.tencent.mm.plugin.ac.a.bmg().fI(l);
      if ((paramString1 == null) || (paramString1.field_msgId != l)) {
        break label454;
      }
      com.tencent.mm.plugin.ac.a.bmg().c(localg, new String[0]);
    }
    for (;;)
    {
      return true;
      com.tencent.mm.modelstat.b.ehL.f(localbd);
      break;
      label443:
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyUtil", "ljd:sendLocalMsg() this is new year msg! don't send predownload image event, because image preload data is illegal!");
      break label396;
      label454:
      if (!com.tencent.mm.plugin.ac.a.bmg().b(localg)) {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyUtil", "PinOpenApi.getAppMessageStorage().insert msg failed id:" + l);
      }
    }
  }
  
  public static String Gd(String paramString)
  {
    Object localObject2 = null;
    Object localObject1 = com.tencent.mm.aa.q.KH().kc(paramString);
    if (localObject1 != null) {
      localObject1 = ((com.tencent.mm.aa.j)localObject1).Ky();
    }
    do
    {
      com.tencent.mm.storage.ab localab;
      do
      {
        do
        {
          do
          {
            return (String)localObject1;
            com.tencent.mm.kernel.g.Ek();
            localab = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yg(paramString);
            localObject1 = localObject2;
          } while (localab == null);
          localObject1 = localObject2;
        } while (!localab.field_username.equals(paramString));
        localObject1 = localObject2;
      } while (localab.csA == 4);
      com.tencent.mm.kernel.g.Ek();
      paramString = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yk(paramString);
      localObject1 = localObject2;
    } while (bi.bC(paramString));
    try
    {
      paramString = ((aue)new aue().aG(paramString)).rra;
      return paramString;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyUtil", "exception:%s", new Object[] { bi.i(paramString) });
        paramString = null;
      }
    }
  }
  
  public static String Ge(String paramString)
  {
    if ((bi.oW(paramString)) || (!com.tencent.mm.kernel.g.Eg().Dx())) {
      return "";
    }
    com.tencent.mm.kernel.g.Ek();
    File localFile = new File(String.format("%s/%s/", new Object[] { com.tencent.mm.kernel.g.Ei().dqp, "LuckyMoney" }));
    if ((!localFile.exists()) || (!localFile.isDirectory())) {
      localFile.mkdirs();
    }
    return new File(localFile, paramString).getAbsolutePath();
  }
  
  public static void a(Context paramContext, TextView paramTextView, String paramString)
  {
    if (paramTextView == null) {
      return;
    }
    paramTextView.setText(com.tencent.mm.pluginsdk.ui.d.j.a(paramContext, paramString, paramTextView.getTextSize()));
  }
  
  public static void a(View paramView, Animation.AnimationListener paramAnimationListener)
  {
    ScaleAnimation localScaleAnimation1 = new ScaleAnimation(0.0F, 0.96F, 0.0F, 0.96F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation1.setDuration(300L);
    localScaleAnimation1.setInterpolator(new OvershootInterpolator());
    localScaleAnimation1.setFillAfter(true);
    ScaleAnimation localScaleAnimation2 = new ScaleAnimation(0.96F, 1.0F, 0.96F, 1.0F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation2.setDuration(100L);
    localScaleAnimation2.setFillAfter(true);
    localScaleAnimation1.setAnimationListener(new o.1(paramView, localScaleAnimation2));
    if (paramAnimationListener != null) {
      localScaleAnimation2.setAnimationListener(paramAnimationListener);
    }
    if (paramView != null) {
      paramView.startAnimation(localScaleAnimation1);
    }
  }
  
  public static void a(Button paramButton)
  {
    b(paramButton);
  }
  
  public static void a(ImageView paramImageView, String paramString1, String paramString2)
  {
    if (paramImageView == null) {
      return;
    }
    if (!bi.oW(paramString2)) {}
    for (;;)
    {
      a.b.a(paramImageView, paramString2, 0.1F, false);
      return;
      paramString2 = com.tencent.mm.aa.q.KJ().jR(paramString1);
    }
  }
  
  public static void a(ImageView paramImageView, String paramString1, String paramString2, boolean paramBoolean)
  {
    c.a locala;
    if (paramImageView != null)
    {
      paramImageView.setImageBitmap(null);
      if (!bi.oW(paramString1))
      {
        locala = new c.a();
        com.tencent.mm.plugin.luckymoney.a.a.bat();
        locala.dXB = com.tencent.mm.plugin.luckymoney.a.a.bav();
        locala.dXy = true;
        locala.dXV = true;
        locala.dXW = paramBoolean;
        if (paramBoolean) {
          locala.dXX = 0.0F;
        }
        if (bi.oW(paramString2)) {
          break label100;
        }
        locala.bKg = paramString2;
      }
    }
    label100:
    for (locala.dXG = true;; locala.dXG = false)
    {
      paramString2 = locala.Pt();
      com.tencent.mm.ak.o.Pj().a(paramString1, paramImageView, paramString2);
      return;
    }
  }
  
  public static void a(MMActivity paramMMActivity, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if ((paramInt1 == 0) && (paramInt2 > 1))
    {
      Intent localIntent = new Intent();
      localIntent.setClass(paramMMActivity, SelectLuckyMoneyContactUI.class);
      localIntent.putExtra("key_friends_num", paramInt2);
      if (paramBoolean) {
        localIntent.putExtra("scene_from", 5);
      }
      paramMMActivity.startActivityForResult(localIntent, 2);
      return;
    }
    a(paramMMActivity, 2, paramBoolean);
  }
  
  public static void a(MMActivity paramMMActivity, int paramInt, boolean paramBoolean)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("select_is_ret", true);
    localIntent.putExtra("Select_Conv_Type", 3);
    if (paramBoolean) {
      localIntent.putExtra("scene_from", 5);
    }
    d.b(paramMMActivity, ".ui.transmit.SelectConversationUI", localIntent, paramInt);
  }
  
  public static boolean a(Activity paramActivity, int paramInt1, l paraml, Bundle paramBundle, boolean paramBoolean, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyUtil", "dealWithRealNameVerifyErr call");
    if (paramInt1 != 416)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyUtil", "don't need realname verify");
      return false;
    }
    return a(paramActivity, paraml, paramBundle, paramBoolean, paramInt2);
  }
  
  private static boolean a(Activity paramActivity, l paraml, Bundle paramBundle, boolean paramBoolean, int paramInt)
  {
    Object localObject = "";
    String str2 = "";
    String str3 = "";
    String str1 = "";
    if ((paraml != null) && ((paraml instanceof q)))
    {
      paraml = ((q)paraml).diG;
      if (paraml != null)
      {
        paraml = (amr)paraml.dIE.dIL;
        if (paraml.rPv != null) {
          paraml = com.tencent.mm.platformtools.ab.b(paraml.rPv);
        }
      }
    }
    for (;;)
    {
      try
      {
        paraml = new JSONObject(paraml);
        if (paraml == null) {
          break label309;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyUtil", "dealWithRealNameVerifyErr json is not null");
        localObject = paraml;
        if (paraml.has("real_name_info")) {
          localObject = paraml.optJSONObject("real_name_info");
        }
        paraml = ((JSONObject)localObject).optString("guide_flag", "");
        String str4 = ((JSONObject)localObject).optString("guide_wording");
        str2 = ((JSONObject)localObject).optString("left_button_wording", paramActivity.getString(a.i.app_cancel));
        str3 = ((JSONObject)localObject).optString("right_button_wording", paramActivity.getString(a.i.app_ok));
        str1 = ((JSONObject)localObject).optString("upload_credit_url", "");
        localObject = str4;
        if (!"1".equals(paraml)) {
          break label230;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyUtil", "showRealnameDialog");
        return com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(paramActivity, paramBundle, paramInt);
      }
      catch (JSONException paraml)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.LuckyMoneyUtil", paraml, "", new Object[0]);
      }
      paraml = null;
      continue;
      label230:
      if (("2".equals(paraml)) && (!bi.oW(str1)))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyUtil", "showUploadCreditDialog");
        return com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(paramActivity, (String)localObject, str1, str2, str3, paramBoolean, null);
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyUtil", "guide_flag=" + paraml + ";upload_credit_url=null?" + bi.oW(str1));
      return false;
      label309:
      paraml = "";
    }
  }
  
  public static Bitmap aE(String paramString, boolean paramBoolean)
  {
    boolean bool = true;
    if (paramBoolean)
    {
      localObject = (Bitmap)jaR.get(paramString);
      if (localObject != null) {
        return (Bitmap)localObject;
      }
    }
    if (!com.tencent.mm.compatible.util.f.zZ())
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyUtil", "sdcard is not avail!");
      return BitmapFactory.decodeResource(ad.getContext().getResources(), a.e.nosdcard_chatting_bg);
    }
    Object localObject = new BitmapFactory.Options();
    ((BitmapFactory.Options)localObject).inJustDecodeBounds = true;
    Bitmap localBitmap = BitmapFactory.decodeFile(paramString, (BitmapFactory.Options)localObject);
    if (localBitmap != null) {
      localBitmap.recycle();
    }
    int i;
    int j;
    if ((z.bv(((BitmapFactory.Options)localObject).outWidth, ((BitmapFactory.Options)localObject).outHeight)) && (((BitmapFactory.Options)localObject).outWidth > 480))
    {
      i = 1;
      if ((!z.bu(((BitmapFactory.Options)localObject).outWidth, ((BitmapFactory.Options)localObject).outHeight)) || (((BitmapFactory.Options)localObject).outHeight <= 480)) {
        break label190;
      }
      j = 1;
    }
    for (;;)
    {
      label145:
      if ((i != 0) || (j != 0))
      {
        i = ((BitmapFactory.Options)localObject).outHeight;
        j = ((BitmapFactory.Options)localObject).outWidth;
        for (;;)
        {
          if (j * i > 2764800)
          {
            j >>= 1;
            i >>= 1;
            continue;
            i = 0;
            break;
            label190:
            j = 0;
            break label145;
          }
        }
        j = Math.max(1, j);
        i = Math.max(1, i);
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.LuckyMoneyUtil", "fit long picture, beg %d*%d, after %d*%d", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject).outWidth), Integer.valueOf(((BitmapFactory.Options)localObject).outHeight), Integer.valueOf(j), Integer.valueOf(i) });
      }
    }
    for (;;)
    {
      int m = BackwardSupportUtil.ExifHelper.VX(paramString);
      if ((m == 90) || (m == 270)) {}
      for (;;)
      {
        if ((MMNativeJpeg.IsJpegFile(paramString)) && (MMNativeJpeg.isProgressive(paramString)))
        {
          localObject = MMNativeJpeg.decodeAsBitmap(paramString);
          if (localObject == null) {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyUtil", "Progressive jpeg, result isNull:%b", new Object[] { Boolean.valueOf(bool) });
          }
        }
        for (;;)
        {
          if (localObject != null) {
            break label368;
          }
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyUtil", "getSuitableBmp fail, temBmp is null, filePath = " + paramString);
          return null;
          bool = false;
          break;
          localObject = com.tencent.mm.sdk.platformtools.c.e(paramString, j, i, false);
        }
        label368:
        localBitmap = com.tencent.mm.sdk.platformtools.c.b((Bitmap)localObject, m);
        localObject = localBitmap;
        if (!paramBoolean) {
          break;
        }
        jaR.put(paramString, localBitmap);
        return localBitmap;
        int k = j;
        j = i;
        i = k;
      }
      i = 960;
      j = 960;
    }
  }
  
  public static void b(Button paramButton)
  {
    if (paramButton == null) {}
    do
    {
      return;
      paramButton.setBackgroundResource(a.e.festival_lucky_money_open_btn_ani);
      paramButton = (AnimationDrawable)paramButton.getBackground();
    } while (paramButton == null);
    paramButton.start();
  }
  
  public static String baX()
  {
    com.tencent.mm.kernel.g.Ek();
    return (String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sPv, null);
  }
  
  public static String bv(List<ai> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyUtil", "splitOperationField is empty!");
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i < paramList.size())
    {
      ai localai = (ai)paramList.get(i);
      if (localai != null)
      {
        if (i != 0) {
          localStringBuilder.append("|");
        }
        localStringBuilder.append(localai.type);
        localStringBuilder.append("|");
        localStringBuilder.append(localai.name);
      }
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public static void c(Button paramButton)
  {
    if (paramButton == null) {}
    do
    {
      do
      {
        return;
      } while (!(paramButton.getBackground() instanceof AnimationDrawable));
      paramButton = (AnimationDrawable)paramButton.getBackground();
    } while (paramButton == null);
    paramButton.stop();
  }
  
  public static void d(ImageView paramImageView, String paramString, int paramInt)
  {
    if (paramImageView == null) {}
    do
    {
      return;
      paramImageView.setImageBitmap(null);
    } while (bi.oW(paramString));
    Object localObject = new c.a();
    com.tencent.mm.plugin.luckymoney.a.a.bat();
    ((c.a)localObject).dXB = com.tencent.mm.plugin.luckymoney.a.a.bav();
    ((c.a)localObject).dXy = true;
    ((c.a)localObject).dXV = true;
    ((c.a)localObject).dXW = false;
    if (paramInt != 0) {
      ((c.a)localObject).dXN = paramInt;
    }
    localObject = ((c.a)localObject).Pt();
    com.tencent.mm.ak.o.Pj().a(paramString, paramImageView, (com.tencent.mm.ak.a.a.c)localObject);
  }
  
  public static void dC(String paramString1, String paramString2)
  {
    if ((!bi.oW(paramString1)) && (!bi.oW(paramString2)))
    {
      com.tencent.mm.storage.bd localbd = new com.tencent.mm.storage.bd();
      localbd.eX(0);
      localbd.ep(paramString2);
      localbd.setStatus(3);
      localbd.setContent(paramString1);
      localbd.ay(com.tencent.mm.model.bd.o(paramString2, System.currentTimeMillis() / 1000L));
      localbd.setType(10000);
      ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().T(localbd);
    }
  }
  
  public static int dM(Context paramContext)
  {
    if (kQG == Integer.MAX_VALUE) {
      kQG = paramContext.getResources().getColor(a.c.lucky_money_err_color);
    }
    return kQG;
  }
  
  public static void e(ImageView paramImageView, String paramString, int paramInt)
  {
    if (paramImageView == null) {}
    do
    {
      return;
      paramImageView.setImageBitmap(null);
    } while (bi.oW(paramString));
    Object localObject = new c.a();
    com.tencent.mm.plugin.luckymoney.a.a.bat();
    ((c.a)localObject).dXB = com.tencent.mm.plugin.luckymoney.a.a.bav();
    ((c.a)localObject).dXy = true;
    ((c.a)localObject).dXV = true;
    ((c.a)localObject).dXW = true;
    ((c.a)localObject).dXD = 1;
    if (paramInt != 0) {
      ((c.a)localObject).dXN = paramInt;
    }
    localObject = ((c.a)localObject).Pt();
    com.tencent.mm.ak.o.Pj().a(paramString, paramImageView, (com.tencent.mm.ak.a.a.c)localObject);
  }
  
  public static void g(ImageView paramImageView, String paramString)
  {
    a(paramImageView, paramString, null, false);
  }
  
  public static String gS(String paramString)
  {
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.storage.ab localab = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yg(paramString);
    if ((localab == null) || (!localab.field_username.equals(paramString))) {
      return null;
    }
    return localab.field_nickname;
  }
  
  public static String i(Context paramContext, long paramLong)
  {
    Object localObject = new GregorianCalendar();
    if (paramLong < 3600000L) {
      return "";
    }
    long l = paramLong - new GregorianCalendar(((GregorianCalendar)localObject).get(1), ((GregorianCalendar)localObject).get(2), ((GregorianCalendar)localObject).get(5)).getTimeInMillis();
    if ((l > 0L) && (l <= 86400000L)) {
      return new SimpleDateFormat("HH:mm:ss").format(new Date(paramLong));
    }
    localObject = new Time();
    ((Time)localObject).set(paramLong);
    return com.tencent.mm.pluginsdk.f.g.a(paramContext.getString(a.i.fmt_datetime, new Object[] { " " }), (Time)localObject).toString();
  }
  
  public static void i(ImageView paramImageView, String paramString)
  {
    a(paramImageView, paramString, null, true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */