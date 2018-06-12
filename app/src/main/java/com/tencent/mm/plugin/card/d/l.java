package com.tencent.mm.plugin.card.d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.text.TextUtils;
import com.tencent.mm.g.a.ow;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.plugin.card.a.a;
import com.tencent.mm.plugin.card.a.b;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.m;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.model.k;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.protocal.c.bng;
import com.tencent.mm.protocal.c.bnk;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.lk;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.y.g.a;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class l
{
  private static SimpleDateFormat hIH = null;
  private static SimpleDateFormat hII = null;
  private static SimpleDateFormat hIJ = null;
  
  public static ShapeDrawable A(Context paramContext, int paramInt)
  {
    return cm(paramInt, paramContext.getResources().getDimensionPixelOffset(a.b.card_btn_bg_corner));
  }
  
  public static boolean OC()
  {
    try
    {
      boolean bool = ((LocationManager)ad.getContext().getSystemService("location")).isProviderEnabled("gps");
      return bool;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CardUtil", localException, "", new Object[0]);
    }
    return false;
  }
  
  public static boolean OD()
  {
    try
    {
      boolean bool = ((LocationManager)ad.getContext().getSystemService("location")).isProviderEnabled("network");
      return bool;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CardUtil", localException, "", new Object[0]);
    }
    return false;
  }
  
  public static void a(com.tencent.mm.plugin.card.base.b paramb, String paramString1, String paramString2, int paramInt)
  {
    g.a locala = null;
    Object localObject = y.a(new m(paramb.awm().huW));
    if (localObject != null) {}
    for (localObject = com.tencent.mm.sdk.platformtools.c.Q((Bitmap)localObject);; localObject = null)
    {
      com.tencent.mm.plugin.card.compat.a.a locala1 = (com.tencent.mm.plugin.card.compat.a.a)g.l(com.tencent.mm.plugin.card.compat.a.a.class);
      if (paramb == null)
      {
        paramString2 = locala;
        locala1.b(paramString2, paramb.awm().bPS, paramb.awm().hwh, paramString1, (byte[])localObject);
        return;
      }
      if (paramInt == 23) {
        paramInt = 2;
      }
      for (int i = 1;; i = 0)
      {
        StringBuilder localStringBuilder1 = new StringBuilder();
        locala = new g.a();
        if (paramb.awm() != null)
        {
          locala.title = paramb.awo().sli;
          locala.description = paramb.awm().title;
          locala.type = 16;
          locala.showType = 0;
          locala.dwr = 3;
          locala.appId = paramb.awm().bPS;
          locala.dwP = 0;
          locala.thumburl = paramb.awm().huW;
          locala.dxG = paramInt;
          locala.dxF = paramb.awm().hwh;
          locala.url = paramb.awm().rnM;
        }
        StringBuilder localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append("<from_username>").append(paramb.aws()).append("</from_username>");
        if (nZ(paramInt))
        {
          localStringBuilder2.append("<card_id>").append(paramb.awr()).append("</card_id>");
          label297:
          localStringBuilder2.append("<card_type>").append(paramb.awm().huV).append("</card_type>");
          localStringBuilder2.append("<from_scene>").append(paramInt).append("</from_scene>");
          localStringBuilder2.append("<color>").append(paramb.awm().dxh).append("</color>");
          localStringBuilder2.append("<card_type_name>").append(paramb.awm().hwg).append("</card_type_name>");
          localStringBuilder2.append("<brand_name>").append(paramb.awm().hwh).append("</brand_name>");
          if (!TextUtils.isEmpty(paramString2)) {
            break label535;
          }
          localStringBuilder2.append("<card_ext></card_ext>");
        }
        for (;;)
        {
          localStringBuilder2.append("<is_recommend>").append(i).append("</is_recommend>");
          localStringBuilder2.append("<recommend_card_id>").append(paramb.awq()).append("</recommend_card_id>");
          locala.dxE = localStringBuilder2.toString();
          locala.bRw = g.a.a(locala, null, null);
          paramString2 = locala;
          break;
          if (paramInt != 5) {
            break label297;
          }
          localStringBuilder2.append("<card_id>").append(paramb.awq()).append("</card_id>");
          break label297;
          label535:
          localStringBuilder2.append("<card_ext>").append(paramString2).append("</card_ext>");
        }
      }
    }
  }
  
  public static boolean a(com.tencent.mm.plugin.card.model.b paramb, String paramString)
  {
    if (!cd(paramb.roL))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardUtil", "ShowWarning not support show the warning!");
      return false;
    }
    paramb = paramb.title;
    if (ya(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardUtil", "ShowWarning has show the warning!");
      return false;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardUtil", "ShowWarning has not show the warning!");
    return true;
  }
  
  public static boolean a(ShareCardInfo paramShareCardInfo)
  {
    if (paramShareCardInfo == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardUtil", "processShareCardObject fail, card is null");
      return false;
    }
    ShareCardInfo localShareCardInfo = am.axq().xC(paramShareCardInfo.field_card_id);
    if (localShareCardInfo == null)
    {
      bool = am.axq().b(paramShareCardInfo);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CardUtil", "processShareCardObject, insertRet = %b", new Object[] { Boolean.valueOf(bool) });
      if (!bool) {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardUtil", "processShareCardObject, insert fail");
      }
      for (;;)
      {
        return bool;
        com.tencent.mm.plugin.card.sharecard.a.b.cc(paramShareCardInfo.field_card_id, paramShareCardInfo.field_card_tp_id);
      }
    }
    paramShareCardInfo.field_categoryType = localShareCardInfo.field_categoryType;
    paramShareCardInfo.field_itemIndex = localShareCardInfo.field_itemIndex;
    boolean bool = am.axq().c(paramShareCardInfo, new String[0]);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CardUtil", "processShareCardObject, updateRet = %b", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
  
  public static boolean a(pr parampr, String paramString)
  {
    if (!cd(parampr.roL))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardUtil", "ShowWarning not support show the warning!");
      return false;
    }
    parampr = parampr.title;
    if (ya(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardUtil", "ShowWarning has show the warning!");
      return false;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardUtil", "ShowWarning has not show the warning!");
    return true;
  }
  
  public static ArrayList<String> aA(List<String> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty()))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardUtil", "getContactNamesFromLabels labels is empty!");
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    HashSet localHashSet = new HashSet();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject = (String)paramList.next();
      localObject = com.tencent.mm.plugin.label.a.a.aYK().FD(com.tencent.mm.plugin.label.a.a.aYK().FA((String)localObject));
      if ((localObject == null) || (((List)localObject).size() == 0)) {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardUtil", "getContactNamesFromLabels, namelist get bu label is null");
      } else {
        localHashSet.addAll((Collection)localObject);
      }
    }
    localArrayList.addAll(localHashSet);
    return localArrayList;
  }
  
  public static ArrayList<String> aB(List<String> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty()))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardUtil", "getContactIdsFromLabels labels is empty!");
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      str = com.tencent.mm.plugin.label.a.a.aYK().FA(str);
      if (!TextUtils.isEmpty(str)) {
        localArrayList.add(str);
      }
    }
    return localArrayList;
  }
  
  public static ColorStateList ad(Context paramContext, String paramString)
  {
    int i = paramContext.getResources().getColor(a.a.white);
    int j = xV(paramString);
    return new ColorStateList(new int[][] { { 16842919, 16842910 }, new int[0] }, new int[] { i, j });
  }
  
  public static List<com.tencent.mm.plugin.card.model.b> az(List<lk> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0)) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramList.size())
    {
      lk locallk = (lk)paramList.get(i);
      com.tencent.mm.plugin.card.model.b localb = new com.tencent.mm.plugin.card.model.b();
      localb.title = locallk.title;
      localb.huX = locallk.huX;
      localb.hyz = locallk.hyz;
      localb.url = locallk.url;
      localb.roL = locallk.roL;
      localb.hvi = false;
      localb.roM = locallk.roM;
      localb.roN = locallk.roN;
      localb.lMY = locallk.lMY;
      localb.rnv = locallk.rnv;
      localb.rnw = locallk.rnw;
      localb.hvh = 1;
      localArrayList.add(localb);
      i += 1;
    }
    return localArrayList;
  }
  
  public static void azQ()
  {
    Integer localInteger = (Integer)g.Ei().DT().get(282883, null);
    if ((localInteger != null) && (localInteger.intValue() == 1))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardUtil", "card entrance is open");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardUtil", "open card entrance");
    g.Ei().DT().set(282883, Integer.valueOf(1));
    com.tencent.mm.s.c.Cp().u(262152, true);
  }
  
  public static boolean azR()
  {
    Integer localInteger = (Integer)g.Ei().DT().get(282883, null);
    return (localInteger != null) && (localInteger.intValue() == 1);
  }
  
  public static void azS()
  {
    Integer localInteger = (Integer)g.Ei().DT().get(aa.a.sQc, Integer.valueOf(0));
    if ((localInteger != null) && (localInteger.intValue() == 1))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardUtil", "share card entrance is open");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardUtil", "open share card entrance");
    g.Ei().DT().a(aa.a.sQc, Integer.valueOf(1));
    com.tencent.mm.s.c.Cp().u(262152, true);
  }
  
  public static boolean azT()
  {
    Integer localInteger = (Integer)g.Ei().DT().get(aa.a.sQc, null);
    return (localInteger != null) && (localInteger.intValue() == 1);
  }
  
  public static String azU()
  {
    return (String)g.Ei().DT().get(aa.a.sQa, "");
  }
  
  public static boolean b(CardInfo paramCardInfo)
  {
    if (paramCardInfo == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardUtil", "processCardObject fail, card is null");
      return false;
    }
    CardInfo localCardInfo = am.axi().xm(paramCardInfo.field_card_id);
    if (localCardInfo == null)
    {
      bool = am.axi().b(paramCardInfo);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CardUtil", "processCardObject, insertRet = %b", new Object[] { Boolean.valueOf(bool) });
      if (!bool) {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardUtil", "processCardObject, insert fail");
      }
      return bool;
    }
    paramCardInfo.field_stickyIndex = localCardInfo.field_stickyIndex;
    paramCardInfo.field_stickyEndTime = localCardInfo.field_stickyEndTime;
    paramCardInfo.field_stickyAnnouncement = localCardInfo.field_stickyAnnouncement;
    boolean bool = am.axi().c(paramCardInfo, new String[0]);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CardUtil", "processCardObject, updateRet = %b", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
  
  public static int bc(String paramString, int paramInt)
  {
    int i = Color.rgb(66, 66, 66);
    if ((paramString == null) || (paramString.length() < 7) || (!paramString.startsWith("#")))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardUtil", "string format error");
      return i;
    }
    try
    {
      paramString = paramString.substring(1).toUpperCase();
      paramInt = Color.argb(paramInt, Integer.parseInt(paramString.substring(0, 2), 16), Integer.parseInt(paramString.substring(2, 4), 16), Integer.parseInt(paramString.substring(4, 6), 16));
      return paramInt;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardUtil", paramString.toString());
    }
    return i;
  }
  
  public static String bx(long paramLong)
  {
    paramLong = 1000L * paramLong;
    new GregorianCalendar().setTimeInMillis(paramLong);
    if (hIH == null) {
      hIH = new SimpleDateFormat("yyyy.MM.dd");
    }
    return hIH.format(new Date(paramLong));
  }
  
  private static boolean cd(long paramLong)
  {
    if ((0x8 & paramLong) > 0L)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardUtil", "shouldShowWarning show the warning!");
      return true;
    }
    return false;
  }
  
  public static void ck(String paramString1, String paramString2)
  {
    if (!bi.oW(paramString1))
    {
      ow localow = new ow();
      localow.bZQ.bZR = paramString2;
      localow.bZQ.content = paramString1;
      localow.bZQ.type = s.hQ(paramString2);
      localow.bZQ.flags = 0;
      com.tencent.mm.sdk.b.a.sFg.m(localow);
    }
  }
  
  public static ShapeDrawable cm(int paramInt1, int paramInt2)
  {
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new RoundRectShape(new float[] { paramInt2, paramInt2, paramInt2, paramInt2, paramInt2, paramInt2, paramInt2, paramInt2 }, null, null));
    localShapeDrawable.getPaint().setColor(paramInt1);
    return localShapeDrawable;
  }
  
  public static ShapeDrawable e(Context paramContext, int paramInt1, int paramInt2)
  {
    int i = paramContext.getResources().getDimensionPixelSize(a.b.OneDPPadding);
    paramContext = new float[8];
    paramContext[0] = paramInt2;
    paramContext[1] = paramInt2;
    paramContext[2] = paramInt2;
    paramContext[3] = paramInt2;
    paramContext[4] = paramInt2;
    paramContext[5] = paramInt2;
    paramContext[6] = paramInt2;
    paramContext[7] = paramInt2;
    paramContext = new ShapeDrawable(new RoundRectShape(paramContext, new RectF(i, i, i, i), paramContext));
    Paint localPaint = paramContext.getPaint();
    localPaint.setColor(paramInt1);
    localPaint.setStrokeWidth(i);
    return paramContext;
  }
  
  public static bnk f(int paramInt, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardUtil", "getShareTag()");
    bnk localbnk = new bnk();
    String str;
    if (paramInt == 2)
    {
      if ((paramArrayList1 != null) && (paramArrayList1.size() > 0)) {
        localbnk.slr.addAll(paramArrayList1);
      }
      if ((paramArrayList2 != null) && (paramArrayList2.size() > 0))
      {
        paramArrayList1 = new ArrayList();
        paramInt = 0;
        while (paramInt < paramArrayList2.size())
        {
          str = (String)paramArrayList2.get(paramInt);
          if ((!TextUtils.isEmpty(str)) && (xW(str))) {
            paramArrayList1.add(Integer.valueOf(str));
          }
          paramInt += 1;
        }
        localbnk.slt.addAll(paramArrayList1);
      }
    }
    do
    {
      do
      {
        return localbnk;
      } while (paramInt != 3);
      if ((paramArrayList1 != null) && (paramArrayList1.size() > 0)) {
        localbnk.sls.addAll(paramArrayList1);
      }
    } while ((paramArrayList2 == null) || (paramArrayList2.size() <= 0));
    paramArrayList1 = new ArrayList();
    paramInt = 0;
    while (paramInt < paramArrayList2.size())
    {
      str = (String)paramArrayList2.get(paramInt);
      if ((!TextUtils.isEmpty(str)) && (xW(str))) {
        paramArrayList1.add(Integer.valueOf(str));
      }
      paramInt += 1;
    }
    localbnk.slu.addAll(paramArrayList1);
    return localbnk;
  }
  
  public static String f(Context paramContext, float paramFloat)
  {
    if (paramFloat <= 0.0F) {
      return "";
    }
    if ((paramFloat > 0.0F) && (paramFloat < 1000.0F)) {
      return paramContext.getString(a.g.card_distance_m, new Object[] { (int)paramFloat });
    }
    if (paramFloat >= 1000.0F)
    {
      int i = a.g.card_distance_km;
      StringBuilder localStringBuilder = new StringBuilder();
      paramFloat /= 1000.0F;
      return paramContext.getString(i, new Object[] { new DecimalFormat("0.00").format(paramFloat) });
    }
    return "";
  }
  
  public static Drawable g(Context paramContext, String paramString, int paramInt)
  {
    paramContext = e(paramContext, xV(paramString), paramInt);
    paramString = cm(xV(paramString), paramInt);
    StateListDrawable localStateListDrawable = new StateListDrawable();
    localStateListDrawable.addState(new int[] { 16842919 }, paramString);
    localStateListDrawable.addState(new int[0], paramContext);
    return localStateListDrawable;
  }
  
  public static boolean isNetworkAvailable(Context paramContext)
  {
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (paramContext != null)
    {
      paramContext = paramContext.getActiveNetworkInfo();
      if ((paramContext != null) && (paramContext.isConnected()) && (paramContext.getState() == NetworkInfo.State.CONNECTED)) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean j(com.tencent.mm.plugin.card.base.b paramb)
  {
    boolean bool2;
    boolean bool1;
    if ((paramb instanceof CardInfo))
    {
      bool2 = am.axi().c((CardInfo)paramb, new String[0]);
      bool1 = bool2;
      if (!bool2)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardUtil", "update mCardInfo fail, cardId = %s", new Object[] { paramb.awq() });
        bool1 = bool2;
      }
    }
    do
    {
      return bool1;
      if (!(paramb instanceof ShareCardInfo)) {
        break;
      }
      bool2 = am.axq().c((ShareCardInfo)paramb, new String[0]);
      bool1 = bool2;
    } while (bool2);
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardUtil", "update mCardInfo fail, cardId = %s", new Object[] { paramb.awq() });
    return bool2;
    return false;
  }
  
  public static boolean nI(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public static boolean nZ(int paramInt)
  {
    return (paramInt == 0) || (paramInt == 1) || (paramInt == 2) || (paramInt == 9) || (paramInt == 12) || (paramInt == 17) || (paramInt == 21);
  }
  
  public static boolean oa(int paramInt)
  {
    return (paramInt == 7) || (paramInt == 8) || (paramInt == 16) || (paramInt == 26);
  }
  
  public static boolean ob(int paramInt)
  {
    return (paramInt == 3) || (paramInt == 4) || (paramInt == 5) || (paramInt == 15);
  }
  
  public static Bitmap w(Bitmap paramBitmap)
  {
    boolean bool = true;
    Object localObject = new Matrix();
    ((Matrix)localObject).reset();
    ((Matrix)localObject).setRotate(90.0F, paramBitmap.getWidth() / 2, paramBitmap.getHeight() / 2);
    paramBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
    localObject = new StringBuilder("resultBmp is null: ");
    if (paramBitmap == null) {}
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CardUtil", bool + "  degree:90.0");
      return paramBitmap;
      bool = false;
    }
  }
  
  public static String x(String paramString, long paramLong)
  {
    if (TextUtils.isEmpty(paramString)) {
      str = "";
    }
    float f1;
    float f2;
    do
    {
      return str;
      f1 = am.axo().cXn;
      f2 = am.axo().cXm;
      if ((f1 == -1000.0F) || (f2 == -85.0F))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardUtil", "getRedirectUrl() location info is empty!");
        return paramString;
      }
      str = paramString;
    } while ((0x10 & paramLong) <= 0L);
    String str = "&longitude=" + f1 + "&latitude=" + f2;
    str = paramString.replace("#", str + "#");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardUtil", "getRedirectUrl originalUrl:" + paramString);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardUtil", "getRedirectUrl afterwardsUrl:" + str);
    return str;
  }
  
  public static void x(Bitmap paramBitmap)
  {
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardUtil", "bitmap recycle %s", new Object[] { paramBitmap });
      paramBitmap.recycle();
    }
  }
  
  public static int xV(String paramString)
  {
    int i = Color.rgb(66, 66, 66);
    if ((paramString == null) || (paramString.length() < 7) || (!paramString.startsWith("#")))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardUtil", "string format error");
      return i;
    }
    try
    {
      paramString = paramString.substring(1).toUpperCase();
      int j = Color.argb(255, Integer.parseInt(paramString.substring(0, 2), 16), Integer.parseInt(paramString.substring(2, 4), 16), Integer.parseInt(paramString.substring(4, 6), 16));
      return j;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardUtil", paramString.toString());
    }
    return i;
  }
  
  public static boolean xW(String paramString)
  {
    return Pattern.compile("[0-9]*").matcher(paramString).matches();
  }
  
  public static void xX(String paramString)
  {
    g.Ei().DT().a(aa.a.sQa, paramString);
  }
  
  public static String xY(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      paramString = "";
    }
    String str1;
    do
    {
      return paramString;
      String str2 = r.gU(paramString);
      str1 = r.gT(paramString);
      if (!TextUtils.isEmpty(str2)) {
        return str2;
      }
    } while (TextUtils.isEmpty(str1));
    return str1;
  }
  
  public static String xZ(String paramString)
  {
    paramString = Arrays.asList(paramString.split(","));
    LinkedList localLinkedList = new LinkedList();
    if (g.Eg().Dx()) {
      if ((paramString != null) && (paramString.size() != 0)) {}
    }
    for (;;)
    {
      return bi.c(localLinkedList, ",");
      Iterator localIterator = paramString.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        ab localab = ((i)g.l(i.class)).FR().Yg(str);
        paramString = str;
        if (localab != null)
        {
          paramString = str;
          if ((int)localab.dhP != 0) {
            paramString = localab.BL();
          }
        }
        localLinkedList.add(paramString);
      }
    }
  }
  
  private static boolean ya(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardUtil", "hasShowTheWarning card_id or title is empty!");
      return true;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardUtil", "hasShowWarning()");
    Object localObject = (String)g.Ei().DT().get(aa.a.sQh, "");
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardUtil", "hasShowTheWarning cardIdListStr list is empty!");
      return false;
    }
    localObject = ((String)localObject).split(",");
    if ((localObject == null) || (localObject.length == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardUtil", "hasShowTheWarning cardIds is empty!");
      return false;
    }
    int j = localObject.length;
    int i = 0;
    while (i < j)
    {
      if (paramString.equals(localObject[i])) {
        return true;
      }
      i += 1;
    }
    return false;
  }
  
  public static void yb(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardUtil", "setShowWarningFlag card_id or title is empty!");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardUtil", "setShowWarningFlag()");
    String str = (String)g.Ei().DT().get(aa.a.sQh, "");
    if (TextUtils.isEmpty(str)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardUtil", "hasShowTheWarning cardIdListStr list is empty!");
    }
    for (;;)
    {
      g.Ei().DT().a(aa.a.sQh, paramString);
      return;
      String[] arrayOfString = str.split(",");
      if ((arrayOfString == null) || (arrayOfString.length == 0))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardUtil", "hasShowTheWarning cardIds is empty!");
        str = paramString;
      }
      int k = arrayOfString.length;
      int i = 0;
      int j = 0;
      while (i < k)
      {
        if (paramString.equals(arrayOfString[i])) {
          j = 1;
        }
        i += 1;
      }
      if (j == 0) {
        paramString = str + "," + paramString;
      } else {
        paramString = str;
      }
    }
  }
  
  public static int yc(String paramString)
  {
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.equals(q.GF()))) {
      return 1;
    }
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/d/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */