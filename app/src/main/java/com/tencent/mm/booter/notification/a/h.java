package com.tencent.mm.booter.notification.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.a.a;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.m;
import com.tencent.mm.model.q;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.modelvideo.p;
import com.tencent.mm.plugin.messenger.a.e;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bd.a;
import com.tencent.mm.storage.bd.c;
import com.tencent.mm.storage.bd.d;
import com.tencent.mm.y.g.a;
import com.tencent.mm.y.k;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import junit.framework.Assert;

public final class h
{
  private static WeakReference<TextPaint> cZJ;
  private static int cZK = 0;
  private static int cZL = 0;
  public String cZG = "";
  public String cZH = "";
  public String cZI = "";
  
  public static String a(int paramInt1, String paramString1, String paramString2, int paramInt2, Context paramContext)
  {
    return bi.oV(a(null, paramInt1, paramString1, paramString2, paramInt2, paramContext, new PString(), new PString(), new PInt(), false, false));
  }
  
  private static String a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, PString paramPString1, PString paramPString2)
  {
    String str3 = "";
    String str2;
    String str1;
    int i;
    if ((s.hk(paramString1)) || (s.hm(paramString1)))
    {
      str2 = str3;
      str1 = paramString2;
      if (paramString2 != null)
      {
        i = paramString2.indexOf(":");
        str2 = str3;
        str1 = paramString2;
        if (i >= 0)
        {
          str2 = str3;
          str1 = paramString2;
          if (i < paramString2.length())
          {
            paramString1 = paramString2.substring(0, i);
            if (!ab.XO(paramString1))
            {
              str2 = str3;
              str1 = paramString2;
              if (!ab.XQ(paramString1)) {}
            }
            else
            {
              str2 = r.gT(paramString1);
              paramPString2.value = paramString1;
              str1 = paramString2.substring(i + 1);
            }
          }
        }
      }
      if (bi.oV(str2).length() > 0) {
        break label283;
      }
      if (paramString3 != null) {
        break label276;
      }
    }
    for (;;)
    {
      paramPString1.value = str1;
      return paramPString1.value;
      if (!ab.XO(paramString1))
      {
        str2 = str3;
        str1 = paramString2;
        if (!ab.XQ(paramString1)) {
          break;
        }
      }
      r.gT(paramString1);
      paramPString2.value = paramString1;
      if (paramInt == 1)
      {
        paramContext = new StringBuilder().append(paramContext.getString(R.l.fmt_response_to, new Object[] { "" }));
        if (paramString3 == null) {}
        for (;;)
        {
          paramPString1.value = paramString2;
          paramPString2.value = "";
          return paramPString1.value;
          paramString2 = paramString3;
        }
      }
      if (paramString3 == null) {}
      for (;;)
      {
        paramPString1.value = paramString2;
        paramPString2.value = "";
        return paramPString1.value;
        paramString2 = paramString3;
      }
      label276:
      str1 = paramString3;
    }
    label283:
    paramString1 = new StringBuilder();
    if (paramInt == 1)
    {
      i = R.l.fmt_response_to;
      paramString2 = paramString1.append(paramContext.getString(i));
      if (paramString3 != null) {
        break label392;
      }
      paramString1 = str1;
      label320:
      paramPString1.value = paramString1;
      paramString1 = new StringBuilder();
      if (paramInt != 1) {
        break label398;
      }
      paramInt = R.l.fmt_response_to;
      label350:
      paramContext = paramString1.append(paramContext.getString(paramInt, new Object[] { str2 }));
      if (paramString3 != null) {
        break label405;
      }
    }
    for (;;)
    {
      return str1;
      i = R.l.fmt_send_from;
      break;
      label392:
      paramString1 = paramString3;
      break label320;
      label398:
      paramInt = R.l.fmt_send_from;
      break label350;
      label405:
      str1 = paramString3;
    }
  }
  
  public static String a(Context paramContext, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      String str = com.tencent.mm.br.b.cjC().Xw(paramString);
      paramString = str;
      if (paramInt3 > 1) {
        paramString = paramContext.getResources().getQuantityString(R.j.notification_fmt_multi_msg_and_one_talker_pre, paramInt3, new Object[] { Integer.valueOf(paramInt3) }) + str;
      }
      return paramString;
    }
    return paramContext.getResources().getQuantityString(R.j.notification_fmt_multi_msg_and_talker, paramInt1, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  public static String a(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    paramContext = a(0, paramString2, paramString1, paramInt, paramContext);
    return j.TT(com.tencent.mm.br.b.cjC().Xw(paramContext));
  }
  
  private static String a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, Context paramContext, PString paramPString1, PString paramPString2, PInt paramPInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool;
    label29:
    int i;
    if (paramContext != null)
    {
      bool = true;
      Assert.assertTrue("context is null", bool);
      if ((paramString2 == null) || (paramString2.length() <= 0)) {
        break label77;
      }
      bool = true;
      Assert.assertTrue("username is null", bool);
      if (paramBoolean1) {
        break label144;
      }
      if ((!s.hk(paramString2)) || (q.GX())) {
        break label83;
      }
      i = 1;
    }
    for (;;)
    {
      if (i == 0) {
        break label144;
      }
      return paramContext.getString(R.l.settings_plugins_disable);
      bool = false;
      break;
      label77:
      bool = false;
      break label29;
      label83:
      if (s.hm(paramString2))
      {
        if ((q.GJ() & 0x40) != 0) {}
        for (i = 1;; i = 0)
        {
          if (i != 0) {
            break label119;
          }
          i = 1;
          break;
        }
      }
      label119:
      if ((s.hq(paramString2)) && (!q.Ha())) {
        i = 1;
      } else {
        i = 0;
      }
    }
    label144:
    if (s.hq(paramString2))
    {
      if (paramBoolean1) {
        return "";
      }
      paramBoolean1 = q.Ha();
      au.HU();
      long l = bi.a((Long)c.DT().get(65793, null), 0L);
      if (!paramBoolean1) {
        return paramContext.getString(R.l.settings_plugins_disable);
      }
      if (l == 0L) {
        return paramContext.getString(R.l.fmt_qqsynchelper_brief_new);
      }
      if (bi.bG(l) * 1000L > 1209600000L) {
        return paramContext.getString(R.l.fmt_qqsynchelper_brief_alert, new Object[] { Long.valueOf(bi.bG(l) * 1000L / 86400000L) });
      }
      return "";
    }
    if ((paramString3 != null) && (paramBoolean1)) {
      paramString3 = eS(paramString3);
    }
    for (int k = 1;; k = 0)
    {
      paramPString1.value = paramString3;
      String str1;
      String str2;
      Object localObject2;
      if ((paramInt1 == 0) && (s.fq(paramString2)))
      {
        i = com.tencent.mm.model.bd.iA(paramString3);
        if (i > 0)
        {
          str1 = paramString3.substring(0, i).trim();
          str2 = r.getDisplayName(str1, paramString2);
          localObject2 = (paramString3 + " ").substring(i + 1);
        }
      }
      for (;;)
      {
        i = 0;
        Object localObject1;
        int j;
        if ((s.hE(paramString2)) || (s.hN(paramString2)))
        {
          i = paramString3.indexOf(":");
          localObject1 = paramString3;
          if (i != -1)
          {
            paramPString2.value = paramString3.substring(0, i);
            localObject1 = paramString3.substring(i + 1);
          }
          j = 0;
          paramString3 = (String)localObject1;
        }
        for (;;)
        {
          switch (paramInt2)
          {
          default: 
            paramString1 = paramString3;
          case 3: 
          case 23: 
          case 33: 
          case 47: 
          case 1048625: 
          case 13: 
          case 39: 
          case 11: 
          case 36: 
          case 34: 
          case 43: 
          case 62: 
          case 12299999: 
          case -1879048191: 
          case -1879048190: 
          case -1879048189: 
          case 50: 
          case 53: 
          case 52: 
          case -1879048188: 
          case 37: 
          case 40: 
          case 35: 
          case 42: 
          case 66: 
          case 48: 
            label846:
            label855:
            label1002:
            label1038:
            label1355:
            label1521:
            do
            {
              paramString3 = "";
              localObject1 = null;
              i = 0;
              for (;;)
              {
                if (!s.hl(paramString2)) {
                  break label6847;
                }
                if (1 != paramInt1) {
                  break label6593;
                }
                if (bi.oW(paramString3)) {
                  break label6558;
                }
                paramPString1.value = paramString3;
                return paramString3;
                au.HU();
                localObject1 = c.FW().Yq(paramString2);
                if (((localObject1 == null) || (!((ai)localObject1).gh(2097152))) && (!paramBoolean2)) {
                  break label7418;
                }
                i = 1;
                j = paramString3.indexOf(":");
                if (j == -1) {
                  break label7418;
                }
                paramPString2.value = paramString3.substring(0, j);
                paramString3 = paramString3.substring(j + 1);
                j = 1;
                break;
                localObject2 = paramContext.getString(R.l.app_pic);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": ";
                  if (str1.length() <= 0) {
                    break label1038;
                  }
                }
                for (paramString3 = "%s: ";; paramString3 = "")
                {
                  paramPString1.value = paramString3;
                  localObject1 = null;
                  i = 0;
                  paramString3 = (String)localObject2;
                  break;
                  paramString1 = "";
                  break label1002;
                }
                localObject2 = an.YJ(paramString3);
                localObject1 = ((an)localObject2).enF + ": ";
                if ((paramString1 != null) && (paramString1.length() == 32)) {}
                for (paramString3 = paramString1;; paramString3 = paramContext.getString(R.l.app_emoji))
                {
                  paramPString1.value = "";
                  paramPString2.value = ((an)localObject2).enF;
                  localObject2 = null;
                  i = 0;
                  paramString1 = (String)localObject1;
                  localObject1 = localObject2;
                  break;
                }
                paramString1 = a(paramContext, paramInt1, paramString2, paramString3, paramContext.getString(R.l.app_pic), paramPString1, paramPString2);
                paramString3 = "";
                localObject1 = null;
                i = 0;
                continue;
                paramString1 = a(paramContext, paramInt1, paramString2, paramString3, null, paramPString1, paramPString2);
                paramString3 = "";
                localObject1 = null;
                i = 0;
                continue;
                if ((ab.XO(paramString2)) || (ab.XQ(paramString2)) || (s.hk(paramString2)) || (s.hm(paramString2)))
                {
                  paramString1 = a(paramContext, paramInt1, paramString2, paramString3, paramContext.getString(R.l.app_voice), paramPString1, paramPString2);
                  paramString3 = "";
                  localObject1 = null;
                  i = 0;
                }
                else
                {
                  paramString1 = paramString3;
                  if (paramString3 != null)
                  {
                    paramString1 = paramString3;
                    if (paramString3.length() > 0)
                    {
                      paramString1 = paramString3;
                      if (!s.hl(paramString2))
                      {
                        if (!s.fq(paramString2)) {
                          break label1355;
                        }
                        paramString3 = new com.tencent.mm.modelvoice.n(paramString3);
                        paramString1 = paramString3.enF + ": ";
                        paramPString1.value = "%s:";
                        paramPString2.value = paramString3.enF;
                      }
                    }
                  }
                  for (;;)
                  {
                    paramString3 = paramContext.getString(R.l.app_voice);
                    localObject1 = null;
                    i = 0;
                    break;
                    paramString1 = "";
                  }
                  if ((ab.XO(paramString2)) || (ab.XQ(paramString2)) || (s.hk(paramString2)) || (s.hm(paramString2)))
                  {
                    paramString1 = a(paramContext, paramInt1, paramString2, paramString3, paramContext.getString(R.l.app_video), paramPString1, paramPString2);
                    paramString3 = "";
                    localObject1 = null;
                    i = 0;
                  }
                  else
                  {
                    paramString1 = paramString3;
                    if (paramString3 != null)
                    {
                      paramString1 = paramString3;
                      if (paramString3.length() > 0)
                      {
                        paramString1 = paramString3;
                        if (!s.hl(paramString2))
                        {
                          if (!s.fq(paramString2)) {
                            break label1521;
                          }
                          paramString3 = new p(paramString3);
                          paramString1 = paramString3.enF + ": ";
                          paramPString1.value = "%s:";
                          paramPString2.value = paramString3.enF;
                        }
                      }
                    }
                    for (;;)
                    {
                      paramString3 = paramContext.getString(R.l.app_video);
                      localObject1 = null;
                      i = 0;
                      break;
                      paramString1 = "";
                    }
                    paramString3 = paramContext.getString(R.l.app_voip);
                    localObject1 = null;
                    i = 0;
                    paramString1 = "";
                    continue;
                    paramString3 = paramContext.getString(R.l.app_voice_remind);
                    localObject1 = null;
                    i = 0;
                    paramString1 = "";
                    continue;
                    if (paramString3.equals(com.tencent.mm.storage.bd.tby))
                    {
                      paramString3 = paramContext.getString(R.l.app_voip);
                      localObject1 = null;
                      i = 0;
                      paramString1 = "";
                    }
                    else
                    {
                      paramString1 = paramString3;
                      if (!paramString3.equals(com.tencent.mm.storage.bd.tbx)) {
                        break label846;
                      }
                      paramString3 = paramContext.getString(R.l.app_voip_voice);
                      localObject1 = null;
                      i = 0;
                      paramString1 = "";
                      continue;
                      paramString3 = paramContext.getString(R.l.app_voip);
                      localObject1 = null;
                      i = 0;
                      paramString1 = "";
                      continue;
                      paramString3 = paramContext.getString(R.l.app_voip_voice);
                      localObject1 = null;
                      i = 0;
                      paramString1 = "";
                      continue;
                      paramString1 = paramString3;
                      if (paramString3 == null) {
                        break label846;
                      }
                      paramString1 = paramString3;
                      if (paramString3.length() <= 0) {
                        break label846;
                      }
                      localObject1 = bd.d.YY(paramString3);
                      paramString1 = paramString3;
                      if (((bd.d)localObject1).otZ != null)
                      {
                        paramString1 = paramString3;
                        if (((bd.d)localObject1).otZ.length() <= 0) {}
                      }
                      switch (((bd.d)localObject1).scene)
                      {
                      case 19: 
                      case 20: 
                      case 21: 
                      default: 
                        paramString1 = paramContext.getString(R.l.fmt_want_to_be_your_friend, new Object[] { ((bd.d)localObject1).getDisplayName() });
                        paramPString1.value = paramString1;
                        paramString3 = "";
                        localObject1 = null;
                        i = 0;
                        break;
                      case 18: 
                        paramString1 = paramContext.getString(R.l.fmt_say_hello_to_you, new Object[] { ((bd.d)localObject1).getDisplayName() });
                        paramString3 = "";
                        localObject1 = null;
                        i = 0;
                        break;
                      case 22: 
                      case 23: 
                      case 24: 
                      case 26: 
                      case 27: 
                      case 28: 
                      case 29: 
                        paramString1 = paramContext.getString(R.l.fmt_shake_say_hello_to_you, new Object[] { ((bd.d)localObject1).getDisplayName() });
                        paramString3 = "";
                        localObject1 = null;
                        i = 0;
                        break;
                      case 25: 
                        paramString1 = paramContext.getString(R.l.fmt_bottle_say_hello_to_you, new Object[] { ((bd.d)localObject1).getDisplayName() });
                        paramPString1.value = paramString1;
                        paramString3 = "";
                        localObject1 = null;
                        i = 0;
                        continue;
                        paramString1 = paramString3;
                        if (paramString3 == null) {
                          break label846;
                        }
                        paramString1 = paramString3;
                        if (paramString3.length() <= 0) {
                          break label846;
                        }
                        localObject1 = bd.a.YV(paramString3);
                        paramString1 = paramString3;
                        if (((bd.a)localObject1).otZ != null)
                        {
                          paramString1 = paramString3;
                          if (((bd.a)localObject1).otZ.length() > 0)
                          {
                            paramString1 = paramContext.getString(R.l.fmt_just_reg_micromsg, new Object[] { ((bd.a)localObject1).getDisplayName() });
                            paramPString1.value = paramString1;
                          }
                        }
                        paramString3 = "";
                        localObject1 = null;
                        i = 0;
                        continue;
                        paramString1 = paramString3;
                        if (bi.oV(paramString3).length() <= 0) {
                          break label846;
                        }
                        au.HU();
                        paramString1 = c.FT().GP(paramString3);
                        paramString1 = paramContext.getString(R.l.fmt_qqmailhelper_brief, new Object[] { paramString1.eeZ, paramString1.title });
                        paramPString1.value = paramString1;
                        paramString3 = "";
                        localObject1 = null;
                        i = 0;
                        continue;
                        paramString1 = paramString3;
                        if (bi.oV(paramString3).length() <= 0) {
                          break label846;
                        }
                        if (s.fq(paramString2))
                        {
                          localObject1 = com.tencent.mm.model.bd.iB(paramString3);
                          paramString1 = (String)localObject1;
                          if (!TextUtils.isEmpty((CharSequence)localObject1)) {}
                        }
                        else
                        {
                          paramString1 = paramString2;
                        }
                        au.HU();
                        localObject2 = c.FT().GR(paramString3);
                        au.HU();
                        localObject1 = c.FR().Yg(paramString1).BL();
                        paramString3 = (String)localObject1;
                        if (s.fq((String)localObject1)) {
                          paramString3 = m.F(m.gL((String)localObject1));
                        }
                        if (paramInt1 == 1)
                        {
                          localObject1 = paramContext.getString(R.l.fmt_card_from, new Object[] { paramString3, ((bd.a)localObject2).getDisplayName() });
                          paramPString1.value = paramContext.getString(R.l.fmt_card_from, new Object[] { "%s", ((bd.a)localObject2).getDisplayName() });
                          paramPString2.value = paramString1;
                          paramString3 = "";
                          localObject2 = null;
                          i = 0;
                          paramString1 = (String)localObject1;
                          localObject1 = localObject2;
                        }
                        else
                        {
                          localObject1 = paramContext.getString(R.l.fmt_card_to, new Object[] { paramString3, ((bd.a)localObject2).getDisplayName() });
                          paramPString1.value = paramContext.getString(R.l.fmt_card_to, new Object[] { "%s", ((bd.a)localObject2).getDisplayName() });
                          paramPString2.value = paramString1;
                          paramString3 = "";
                          localObject2 = null;
                          i = 0;
                          paramString1 = (String)localObject1;
                          localObject1 = localObject2;
                        }
                        break;
                      }
                    }
                  }
                }
              }
              paramString1 = paramString3;
            } while (bi.oV(paramString3).length() <= 0);
            if (s.fq(paramString2))
            {
              i = com.tencent.mm.model.bd.iA(paramString3);
              if (i != -1)
              {
                paramString1 = paramString3.substring(0, i).trim();
                label2388:
                com.tencent.mm.model.bd.iC(paramString3);
              }
            }
            break;
          }
          for (;;)
          {
            if (paramInt1 == 1)
            {
              paramString1 = paramContext.getString(R.l.location_conversation);
              paramPString1.value = paramString1;
              paramString3 = "";
              localObject1 = null;
              i = 0;
              break label855;
            }
            localObject1 = paramContext.getString(R.l.location_conversation);
            paramPString1.value = paramContext.getString(R.l.location_conversation);
            paramPString2.value = paramString1;
            paramString3 = "";
            localObject2 = null;
            i = 0;
            paramString1 = (String)localObject1;
            localObject1 = localObject2;
            break label855;
            paramString1 = g.a.gp(bi.WT((String)localObject2));
            if (paramString1.dwR != 0) {
              if (paramString1.dwR == 1) {
                paramString1 = paramContext.getString(R.l.scan_product_type_conversation_book);
              }
            }
            for (;;)
            {
              paramPString2.value = str1;
              paramPString1.value = "";
              paramString3 = paramString1;
              localObject1 = null;
              i = 0;
              paramString1 = "";
              break;
              if (paramString1.dwR == 2) {
                paramString1 = paramContext.getString(R.l.scan_product_type_conversation_movie);
              } else if (paramString1.dwR == 3) {
                paramString1 = paramContext.getString(R.l.scan_product_type_conversation_cd);
              } else {
                paramString1 = paramContext.getString(R.l.scan_product_type_conversation_unknown);
              }
            }
            localObject1 = bi.WT((String)localObject2);
            paramString3 = "";
            paramString1 = "";
            localObject1 = g.a.gp((String)localObject1);
            if (localObject1 != null)
            {
              paramPString1.value = (paramContext.getString(R.l.scan_type_conversation_tv) + bi.oV(((g.a)localObject1).title));
              paramString1 = paramPString1.value;
            }
            paramPString2.value = str1;
            localObject1 = null;
            i = 0;
            break label855;
            localObject1 = bi.WT((String)localObject2);
            paramString3 = "";
            paramString1 = "";
            localObject1 = g.a.gp((String)localObject1);
            if (localObject1 != null)
            {
              if (paramInt1 != 1) {
                break label2775;
              }
              i = 1;
              label2703:
              switch (((g.a)localObject1).dxy)
              {
              case 2: 
              default: 
                paramPString1.value = bi.oV(((g.a)localObject1).title);
              }
            }
            for (;;)
            {
              paramString1 = paramPString1.value;
              paramPString2.value = str1;
              localObject1 = null;
              i = 0;
              break;
              label2775:
              i = 0;
              break label2703;
              if (i != 0)
              {
                paramPString1.value = paramContext.getString(R.l.appmsg_remittance_digest_payer_wait);
              }
              else
              {
                paramPString1.value = paramContext.getString(R.l.appmsg_remittance_digest_receiver_wait);
                continue;
                if (i != 0)
                {
                  paramPString1.value = paramContext.getString(R.l.appmsg_remittance_digest_receiver_collected);
                }
                else
                {
                  paramPString1.value = paramContext.getString(R.l.appmsg_remittance_digest_payer_collected);
                  continue;
                  if (i != 0) {
                    paramPString1.value = paramContext.getString(R.l.appmsg_remittance_digest_receiver_refused);
                  } else {
                    paramPString1.value = paramContext.getString(R.l.appmsg_remittance_digest_payer_refused);
                  }
                }
              }
            }
            paramString3 = bi.WT((String)localObject2);
            localObject2 = "";
            paramString1 = "";
            paramString3 = g.a.gp(paramString3);
            if (paramString3 != null)
            {
              if (paramInt1 != 1) {
                break label3006;
              }
              i = 1;
              label2922:
              if (i == 0) {
                break label3012;
              }
              paramPString1.value = ("[" + paramString3.dxZ + "]" + paramString3.dxW);
            }
            for (;;)
            {
              paramString1 = paramPString1.value;
              paramString3 = paramString1;
              if (s.hE(paramString2)) {
                break label7390;
              }
              paramString3 = paramString1;
              if (j != 0) {
                break label7390;
              }
              paramPString2.value = str1;
              localObject1 = null;
              i = 0;
              paramString3 = (String)localObject2;
              break;
              label3006:
              i = 0;
              break label2922;
              label3012:
              if (!bi.oW(str2)) {
                paramPString1.value = (bi.oV(str2) + ": [" + paramString3.dxZ + "]" + paramString3.dxV);
              } else {
                paramPString1.value = ("[" + paramString3.dxZ + "]" + paramString3.dxV);
              }
            }
            paramString1 = bi.WT((String)localObject2);
            localObject2 = "";
            paramString3 = "";
            paramString1 = g.a.gp(paramString1);
            if (paramString1 != null)
            {
              paramString1 = (com.tencent.mm.y.b)paramString1.u(com.tencent.mm.y.b.class);
              if (paramInt1 == 1)
              {
                i = 1;
                label3154:
                if (i == 0) {
                  break label3214;
                }
              }
              label3214:
              for (paramPString1.value = paramContext.getString(R.l.honey_pay_prefix, new Object[] { paramString1.dwc });; paramPString1.value = paramContext.getString(R.l.honey_pay_prefix, new Object[] { paramString1.dwd }))
              {
                paramString1 = paramPString1.value;
                paramPString2.value = str1;
                localObject1 = null;
                i = 0;
                paramString3 = (String)localObject2;
                break;
                i = 0;
                break label3154;
              }
              switch (g.a.gp(bi.WT((String)localObject2)).dwR)
              {
              default: 
                paramString1 = paramContext.getString(R.l.app_product);
                label3289:
                if (str1.length() <= 0) {
                  break;
                }
              }
              for (paramString3 = str1 + ": ";; paramString3 = "")
              {
                if ((!s.hE(paramString2)) && (j == 0)) {
                  paramPString2.value = str1;
                }
                paramPString1.value = "";
                localObject2 = paramString1;
                localObject1 = null;
                i = 0;
                paramString1 = paramString3;
                paramString3 = (String)localObject2;
                break;
                paramString1 = paramContext.getString(R.l.app_product_card);
                break label3289;
                paramString1 = paramContext.getString(R.l.app_product_ticket);
                break label3289;
              }
              paramString3 = g.a.gp(bi.WT((String)localObject2));
              if (paramString3 == null)
              {
                com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Notification.Wording", "decode msg content failed");
                return "";
              }
              localObject2 = "";
              localObject1 = paramContext.getString(R.l.card_msg_item_digest);
              if (str1.length() > 0)
              {
                paramString1 = str1 + ": " + (String)localObject1 + paramString3.title;
                label3473:
                if ((!s.hE(paramString2)) && (j == 0)) {
                  paramPString2.value = str1;
                }
                if (str1.length() <= 0) {
                  break label3570;
                }
              }
              label3570:
              for (paramString3 = "%s: " + (String)localObject1 + paramString3.title;; paramString3 = (String)localObject1 + paramString3.title)
              {
                paramPString1.value = paramString3;
                localObject1 = null;
                i = 0;
                paramString3 = (String)localObject2;
                break;
                paramString1 = (String)localObject1 + paramString3.title;
                break label3473;
              }
              paramString1 = g.a.gp(bi.WT((String)localObject2));
              if (paramString1 == null)
              {
                com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Notification.Wording", "decode msg content failed");
                return "";
              }
              localObject2 = "";
              paramString3 = paramContext.getString(R.l.card_msg_item_digest);
              if (paramInt1 == 1)
              {
                paramString1 = paramString3 + paramString1.dxM;
                if (str1.length() > 0) {}
                for (paramString3 = "%s: " + paramString1;; paramString3 = paramString1)
                {
                  paramPString1.value = paramString3;
                  paramString3 = paramString1;
                  if (s.hE(paramString2)) {
                    break label7372;
                  }
                  paramString3 = paramString1;
                  if (j != 0) {
                    break label7372;
                  }
                  paramPString2.value = str1;
                  localObject1 = null;
                  i = 0;
                  paramString3 = (String)localObject2;
                  break;
                }
              }
              paramString1 = paramString3 + paramString1.dxL;
              if (str1.length() > 0) {}
              for (paramString3 = "%s: " + paramString1;; paramString3 = paramString1)
              {
                paramPString1.value = paramString3;
                break;
              }
              paramString3 = g.a.gp(bi.WT((String)localObject2));
              if (paramString3 == null)
              {
                com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Notification.Wording", "decode msg content failed");
                return "";
              }
              localObject2 = "";
              if (str1.length() > 0)
              {
                paramString1 = str1 + ": " + paramString3.title;
                label3861:
                if ((!s.hE(paramString2)) && (j == 0)) {
                  paramPString2.value = str1;
                }
                if (str1.length() <= 0) {
                  break label3935;
                }
              }
              label3935:
              for (paramString3 = "%s: " + paramString3.title;; paramString3 = paramString3.title)
              {
                paramPString1.value = paramString3;
                localObject1 = null;
                i = 0;
                paramString3 = (String)localObject2;
                break;
                paramString1 = paramString3.title;
                break label3861;
              }
              localObject2 = paramContext.getString(R.l.app_app);
              if (str1.length() > 0)
              {
                paramString1 = str1 + ": ";
                label3983:
                if ((!s.hE(paramString2)) && (j == 0)) {
                  paramPString2.value = str1;
                }
                if (str1.length() <= 0) {
                  break label4038;
                }
              }
              label4038:
              for (paramString3 = "%s: ";; paramString3 = "")
              {
                paramPString1.value = paramString3;
                localObject1 = null;
                i = 0;
                paramString3 = (String)localObject2;
                break;
                paramString1 = "";
                break label3983;
              }
              paramString1 = bi.WT((String)localObject2);
              g.a locala = g.a.gp(paramString1);
              if (locala == null)
              {
                com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Notification.Wording", "decode msg content failed");
                return "";
              }
              switch (locala.type)
              {
              case 9: 
              case 10: 
              case 11: 
              case 12: 
              case 13: 
              case 14: 
              case 18: 
              case 20: 
              case 21: 
              case 22: 
              case 23: 
              case 28: 
              case 29: 
              case 30: 
              case 31: 
              case 32: 
              case 35: 
              case 37: 
              case 38: 
              case 39: 
              default: 
                paramString3 = paramContext.getString(R.l.app_app);
                localObject1 = null;
                i = 0;
                paramString1 = "";
                break;
              case 1: 
                localObject2 = "";
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": " + locala.title;
                  if ((!s.hE(paramString2)) && (j == 0)) {
                    paramPString2.value = str1;
                  }
                  if (str1.length() <= 0) {
                    break label4391;
                  }
                }
                for (paramString3 = "%s: " + locala.title;; paramString3 = locala.title)
                {
                  paramPString1.value = paramString3;
                  localObject1 = null;
                  i = 0;
                  paramString3 = (String)localObject2;
                  break;
                  paramString1 = locala.title;
                  break label4315;
                }
              case 2: 
                localObject2 = paramContext.getString(R.l.app_pic);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": ";
                  if ((!s.hE(paramString2)) && (j == 0)) {
                    paramPString2.value = str1;
                  }
                  if (str1.length() <= 0) {
                    break label4495;
                  }
                }
                for (paramString3 = "%s: ";; paramString3 = "")
                {
                  paramPString1.value = paramString3;
                  localObject1 = null;
                  i = 0;
                  paramString3 = (String)localObject2;
                  break;
                  paramString1 = "";
                  break label4440;
                }
              case 3: 
                localObject2 = paramContext.getString(R.l.app_music);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": ";
                  if ((!s.hE(paramString2)) && (j == 0)) {
                    paramPString2.value = str1;
                  }
                  if (str1.length() <= 0) {
                    break label4600;
                  }
                }
                for (paramString3 = "%s: ";; paramString3 = "")
                {
                  paramPString1.value = paramString3;
                  localObject1 = locala.title;
                  i = 1;
                  paramString3 = (String)localObject2;
                  break;
                  paramString1 = "";
                  break label4541;
                }
              case 4: 
                localObject2 = paramContext.getString(R.l.app_video);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": ";
                  if ((!s.hE(paramString2)) && (j == 0)) {
                    paramPString2.value = str1;
                  }
                  if (str1.length() <= 0) {
                    break label4705;
                  }
                }
                for (paramString3 = "%s: ";; paramString3 = "")
                {
                  paramPString1.value = paramString3;
                  localObject1 = locala.title;
                  i = 1;
                  paramString3 = (String)localObject2;
                  break;
                  paramString1 = "";
                  break label4646;
                }
              case 6: 
                localObject2 = paramContext.getString(R.l.app_file);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": ";
                  if ((!s.hE(paramString2)) && (j == 0)) {
                    paramPString2.value = str1;
                  }
                  if (str1.length() <= 0) {
                    break label4810;
                  }
                }
                for (paramString3 = "%s: ";; paramString3 = "")
                {
                  paramPString1.value = paramString3;
                  localObject1 = locala.title;
                  i = 1;
                  paramString3 = (String)localObject2;
                  break;
                  paramString1 = "";
                  break label4751;
                }
              case 7: 
                localObject2 = paramContext.getString(R.l.app_app);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": ";
                  if ((!s.hE(paramString2)) && (j == 0)) {
                    paramPString2.value = str1;
                  }
                  if (str1.length() <= 0) {
                    break label4911;
                  }
                }
                for (paramString3 = "%s: ";; paramString3 = "")
                {
                  paramPString1.value = paramString3;
                  localObject1 = null;
                  i = 0;
                  paramString3 = (String)localObject2;
                  break;
                  paramString1 = "";
                  break label4856;
                }
              case 5: 
                localObject2 = paramContext.getString(R.l.app_url);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": ";
                  if ((!s.hE(paramString2)) && (j == 0) && (!s.hN(paramString2))) {
                    paramPString2.value = str1;
                  }
                  if (str1.length() <= 0) {
                    break label5023;
                  }
                }
                for (paramString3 = "%s: ";; paramString3 = "")
                {
                  paramPString1.value = paramString3;
                  localObject1 = locala.getTitle();
                  i = 1;
                  paramString3 = (String)localObject2;
                  break;
                  paramString1 = "";
                  break label4957;
                }
              case 33: 
              case 36: 
                localObject2 = "";
                paramString3 = paramContext.getString(R.l.app_brand_default_name_with_brackets);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": " + paramString3 + locala.title;
                  if ((!s.hE(paramString2)) && (j == 0) && (!s.hN(paramString2))) {
                    paramPString2.value = str1;
                  }
                  if (str1.length() <= 0) {
                    break label5188;
                  }
                }
                for (paramString3 = "%s: " + paramString3 + locala.title;; paramString3 = paramString3 + locala.title)
                {
                  paramPString1.value = paramString3;
                  localObject1 = null;
                  i = 0;
                  paramString3 = (String)localObject2;
                  break;
                  paramString1 = paramString3 + locala.title;
                  break label5084;
                }
              case 8: 
                paramString3 = paramContext.getString(R.l.app_emoji2);
                if (str1.length() > 0) {}
                for (paramString1 = str1 + ": ";; paramString1 = "")
                {
                  if ((!s.hE(paramString2)) && (j == 0)) {
                    paramPString2.value = str1;
                  }
                  paramPString1.value = "";
                  localObject1 = null;
                  i = 0;
                  break;
                }
              case 15: 
              case 26: 
              case 27: 
                paramString3 = paramContext.getString(R.l.app_emoji_share);
                if (str1.length() > 0) {}
                for (paramString1 = str1 + ": ";; paramString1 = "")
                {
                  if ((!s.hE(paramString2)) && (j == 0)) {
                    paramPString2.value = str1;
                  }
                  paramPString1.value = "";
                  localObject1 = null;
                  i = 0;
                  break;
                }
              case 25: 
                paramString3 = paramContext.getString(R.l.app_designer_share);
                if (str1.length() > 0) {}
                for (paramString1 = str1 + ": ";; paramString1 = "")
                {
                  if ((!s.hE(paramString2)) && (j == 0)) {
                    paramPString2.value = str1;
                  }
                  paramPString1.value = "";
                  localObject1 = null;
                  i = 0;
                  break;
                }
              case 17: 
                localObject2 = "";
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": " + locala.title;
                  if ((!s.hE(paramString2)) && (j == 0)) {
                    paramPString2.value = str1;
                  }
                  if (str1.length() <= 0) {
                    break label5572;
                  }
                }
                for (paramString3 = "%s: " + locala.title;; paramString3 = locala.title)
                {
                  paramPString1.value = paramString3;
                  localObject1 = null;
                  i = 0;
                  paramString3 = (String)localObject2;
                  break;
                  paramString1 = locala.title;
                  break label5496;
                }
              case 19: 
                localObject2 = paramContext.getString(R.l.app_record);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": ";
                  if ((!s.hE(paramString2)) && (j == 0)) {
                    paramPString2.value = str1;
                  }
                  if (str1.length() <= 0) {
                    break label5676;
                  }
                }
                for (paramString3 = "%s: ";; paramString3 = "")
                {
                  paramPString1.value = paramString3;
                  localObject1 = null;
                  i = 0;
                  paramString3 = (String)localObject2;
                  break;
                  paramString1 = "";
                  break label5621;
                }
              case 24: 
                paramString1 = "";
                if (!bi.oW(locala.description))
                {
                  i = locala.description.indexOf("\n");
                  paramString1 = locala.description;
                  if (i > 0) {
                    paramString1 = paramString1.substring(0, i);
                  }
                }
                else
                {
                  localObject2 = paramContext.getString(R.l.favorite_wenote_msg) + paramString1;
                  if (str1.length() <= 0) {
                    break label5847;
                  }
                  paramString1 = str1 + ": ";
                  if ((!s.hE(paramString2)) && (j == 0)) {
                    paramPString2.value = str1;
                  }
                  if (str1.length() <= 0) {
                    break label5853;
                  }
                }
                for (paramString3 = "%s: ";; paramString3 = "")
                {
                  paramPString1.value = paramString3;
                  localObject1 = null;
                  i = 0;
                  paramString3 = (String)localObject2;
                  break;
                  i = locala.description.length();
                  break label5720;
                  paramString1 = "";
                  break label5785;
                }
              case 16: 
                localObject2 = "";
                localObject1 = paramContext.getString(R.l.card_msg_item_digest);
                if (str1.length() > 0) {}
                for (paramString1 = str1 + ": " + (String)localObject1 + locala.title;; paramString1 = (String)localObject1 + locala.title)
                {
                  if ((!s.hE(paramString2)) && (j == 0)) {
                    paramPString2.value = str1;
                  }
                  paramString3 = (String)localObject1;
                  if (str1.length() > 0) {
                    paramString3 = "%s: " + (String)localObject1;
                  }
                  paramPString1.value = paramString3;
                  localObject1 = null;
                  i = 0;
                  paramString3 = (String)localObject2;
                  break;
                }
              case 34: 
                localObject2 = "";
                paramString1 = paramContext.getString(R.l.card_msg_item_digest);
                if (paramInt1 == 1)
                {
                  paramString1 = paramString1 + locala.dxM;
                  if (str1.length() > 0) {}
                  for (paramString3 = "%s: " + paramString1;; paramString3 = paramString1)
                  {
                    paramPString1.value = paramString3;
                    paramString3 = paramString1;
                    if (s.hE(paramString2)) {
                      break label7372;
                    }
                    paramString3 = paramString1;
                    if (j != 0) {
                      break label7372;
                    }
                    paramPString2.value = str1;
                    localObject1 = null;
                    i = 0;
                    paramString3 = (String)localObject2;
                    break;
                  }
                }
                paramString1 = paramString1 + locala.dxL;
                if (str1.length() > 0) {}
                for (paramString3 = "%s: " + paramString1;; paramString3 = paramString1)
                {
                  paramPString1.value = paramString3;
                  break;
                }
              case 40: 
                label4315:
                label4391:
                label4440:
                label4495:
                label4541:
                label4600:
                label4646:
                label4705:
                label4751:
                label4810:
                label4856:
                label4911:
                label4957:
                label5023:
                label5084:
                label5188:
                label5496:
                label5572:
                label5621:
                label5676:
                label5720:
                label5785:
                label5847:
                label5853:
                if (k.gv(paramString1).dzv == 19)
                {
                  localObject2 = paramContext.getString(R.l.app_record);
                  localObject1 = null;
                  i = 0;
                  paramString1 = paramString3;
                  paramString3 = (String)localObject2;
                  break;
                }
                localObject2 = paramContext.getString(R.l.app_app);
                localObject1 = null;
                i = 0;
                paramString1 = paramString3;
                paramString3 = (String)localObject2;
                break;
                paramString1 = paramString3;
                if (k != 0) {
                  paramString1 = eT(paramString3);
                }
                paramString1 = eS(((com.tencent.mm.plugin.biz.a.a)g.l(com.tencent.mm.plugin.biz.a.a.class)).gs(paramString1));
                paramPString1.value = paramString1;
                paramString3 = "";
                localObject1 = null;
                i = 0;
                break;
                paramPString1.value = ((com.tencent.mm.plugin.biz.a.a)g.l(com.tencent.mm.plugin.biz.a.a.class)).wR(paramString3);
                paramString3 = paramPString1.value;
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Notification.Wording", "[parseMsgContentToShow] type:%s suffix:%s", new Object[] { Integer.valueOf(318767153), paramString3 });
                localObject1 = null;
                i = 0;
                paramString1 = "";
                break;
                paramString1 = com.tencent.mm.ad.a.b(a.a.ln(paramString3));
                paramPString1.value = paramString1;
                paramString3 = "";
                localObject1 = null;
                i = 0;
                break;
                paramString3 = "";
                localObject1 = g.a.gp((String)localObject2);
                paramString1 = paramString3;
                if (localObject1 == null) {
                  break label846;
                }
                paramString1 = paramString3;
                try
                {
                  paramString3 = URLDecoder.decode(((g.a)localObject1).content, "UTF-8");
                  paramString1 = paramString3;
                  paramString3 = j.TT(paramString3);
                  paramString1 = paramString3;
                }
                catch (Exception paramString3)
                {
                  try
                  {
                    paramPString1.value = paramString1;
                    paramString3 = "";
                    localObject1 = null;
                    i = 0;
                  }
                  catch (Exception paramString3)
                  {
                    for (;;)
                    {
                      continue;
                      paramString2 = paramString1;
                    }
                  }
                  paramString3 = paramString3;
                }
                com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.Notification.Wording", paramString3, "", new Object[0]);
                paramString3 = "";
                localObject1 = null;
                i = 0;
                break;
                paramString1 = ((e)g.l(e.class)).Gu(paramString3);
                if (paramString1 != null) {}
                for (paramString1 = paramString1.toString();; paramString1 = "")
                {
                  paramPString1.value = paramString1;
                  paramString3 = "";
                  localObject1 = null;
                  i = 0;
                  break;
                }
                paramString3 = com.tencent.mm.y.a.a.gw(paramString3).content;
                paramString1 = paramString3;
                if (bi.oW(paramString3)) {
                  paramString1 = "";
                }
                paramPString1.value = paramString1;
                paramString3 = "";
                localObject1 = null;
                i = 0;
                break;
                label6558:
                paramString1 = paramString1.split("@bottle:");
                if (paramString1.length > 1)
                {
                  paramPString1.value = paramString1[1];
                  return paramString1[1];
                }
                paramPString1.value = "";
                return null;
                label6593:
                paramString2 = null;
                paramPString2 = null;
                paramContext = paramString1.split(":");
                if ((paramContext == null) || (paramContext.length <= 0))
                {
                  paramPString1.value = "";
                  return null;
                }
                paramContext = paramContext[0];
                if (!bi.oW(paramContext))
                {
                  au.HU();
                  paramPInt = c.FR().Yg(paramContext);
                  paramContext = paramPString2;
                  if (paramPInt != null)
                  {
                    paramContext = paramPString2;
                    if (paramPInt.getCity() != null) {
                      paramContext = paramPInt.getCity();
                    }
                  }
                  if (paramContext != null)
                  {
                    paramString2 = paramContext;
                    if (paramContext.length() > 0) {}
                  }
                  else
                  {
                    paramString2 = paramPInt.getProvince();
                  }
                }
                if (!bi.oW(paramString3))
                {
                  paramPString1.value = (paramString2 + ": " + paramString3);
                  return paramString2 + ": " + paramString3;
                }
                paramString1 = paramString1.split("@bottle:");
                if (paramString1.length > 1)
                {
                  paramPString1.value = (paramString2 + ": " + paramString1[1]);
                  return paramString2 + ": " + paramString1[1];
                }
                paramPString1.value = paramString2;
                return paramString2;
                label6847:
                if (bi.oW(paramString1)) {
                  paramPString1.value = "";
                }
                if (!bi.oW(str1))
                {
                  paramString2 = paramString1;
                  if (str2 != null)
                  {
                    paramString2 = paramString1;
                    if (str2.length() > 0) {
                      paramString2 = j(paramString1, str1, str2);
                    }
                  }
                  if (bi.oW(paramPString2.value))
                  {
                    paramPString1.value = j(paramPString1.value, str1, "%s");
                    paramPString2.value = str1;
                  }
                  paramString1 = com.tencent.mm.compatible.util.n.fi(paramString2);
                  paramPString1.value = com.tencent.mm.compatible.util.n.fi(paramPString1.value);
                  paramString2 = paramString1 + paramString3;
                  paramPString1.value += paramString3;
                  if (paramBoolean1)
                  {
                    if ((paramPString1.value.length() != 32) || ((paramInt2 != 47) && (paramInt2 != 1048625))) {
                      break label7089;
                    }
                    paramPString1.value = paramString2;
                  }
                  label7089:
                  for (paramInt1 = 1;; paramInt1 = 0)
                  {
                    if (paramInt1 == 0) {
                      a(paramInt2, paramPString1, paramPString2, paramPInt);
                    }
                    paramString1 = paramString2;
                    if (i != 0) {
                      paramString1 = paramString2.concat(" " + bi.oV((String)localObject1));
                    }
                    return bi.oV(paramString1);
                  }
                }
                if ((s.hE(paramString2)) || (j != 0) || (s.hN(paramString2)))
                {
                  paramString2 = paramString1;
                  if (paramString3 != null)
                  {
                    paramString2 = paramString1;
                    if (paramString3.length() > 0) {
                      paramString2 = paramString3;
                    }
                  }
                  if (bi.oW(paramString2))
                  {
                    paramPString1.value = "";
                    paramPString2.value = "";
                    return "";
                  }
                  if (paramInt1 == 0)
                  {
                    paramPString1.value = ("%s:" + paramString2);
                    if (!paramBoolean1) {
                      break label7290;
                    }
                    a(paramInt2, paramPString1, paramPString2, paramPInt);
                    paramString1 = paramString2;
                  }
                }
                for (;;)
                {
                  paramString2 = paramString1;
                  if (i != 0)
                  {
                    paramString2 = paramString1;
                    if (localObject1 != null) {
                      paramString2 = paramString1.concat(" " + (String)localObject1);
                    }
                  }
                  paramString1 = paramString2;
                  if (k != 0) {
                    paramString1 = eT(paramString2);
                  }
                  return bi.oV(paramString1);
                  paramPString1.value = (paramContext.getString(R.l.app_me) + ":" + paramString2);
                  break;
                  label7290:
                  return r.gT(paramPString2.value) + ":" + paramString2;
                  if ((paramString3 == null) || (paramString3.length() <= 0)) {
                    break label7367;
                  }
                  paramPString1.value = paramString3;
                  paramString2 = paramString3;
                  paramString1 = paramString2;
                  if (paramBoolean1)
                  {
                    a(paramInt2, paramPString1, paramPString2, paramPInt);
                    paramString1 = paramString2;
                  }
                }
                label7367:
                label7372:
                localObject2 = "";
                localObject1 = null;
                i = 0;
                paramString1 = paramString3;
                paramString3 = (String)localObject2;
                break;
              }
            }
            label7390:
            localObject2 = "";
            localObject1 = null;
            i = 0;
            paramString1 = paramString3;
            paramString3 = (String)localObject2;
            break label855;
            paramString1 = paramString2;
            break label2388;
            paramString1 = paramString2;
          }
          label7418:
          j = i;
        }
        localObject2 = paramString3;
        str2 = "";
        str1 = "";
      }
    }
  }
  
  private static void a(int paramInt, PString paramPString1, PString paramPString2, PInt paramPInt)
  {
    int i = 150;
    if ((paramPString1.value.length() == 32) && ((paramInt == 47) || (paramInt == 1048625))) {
      return;
    }
    String str;
    if (paramPString1.value.length() >= 150)
    {
      localObject = paramPString1.value;
      str = paramPString1.value;
      paramInt = i;
      if (paramInt >= str.length()) {
        break label138;
      }
      if (str.charAt(paramInt) != '%') {
        label79:
        paramPString1.value = ((String)localObject).substring(0, paramInt);
      }
    }
    else
    {
      if (cZJ != null) {
        break label147;
      }
    }
    label138:
    label147:
    for (Object localObject = null;; localObject = (TextPaint)cZJ.get())
    {
      if ((!paramPString1.value.replace("%%", "").contains("%s")) && (localObject != null)) {
        break label161;
      }
      paramPInt.value = 0;
      return;
      paramInt += 1;
      break;
      paramInt = str.length();
      break label79;
    }
    try
    {
      label161:
      paramPString2 = String.format(paramPString1.value, new Object[] { paramPString2.value });
      if (cZK > 0)
      {
        paramInt = cZK;
        paramPString1.value = TextUtils.ellipsize(paramPString2, (TextPaint)localObject, paramInt, TextUtils.TruncateAt.END).toString();
        paramPInt.value = 1;
        return;
      }
    }
    catch (Exception paramPString2)
    {
      for (;;)
      {
        paramPString2 = paramPString1.value;
        continue;
        paramInt = BackwardSupportUtil.b.b(ad.getContext(), 200.0F);
      }
    }
  }
  
  public static void a(TextPaint paramTextPaint)
  {
    if ((cZJ == null) || (cZJ.get() == null)) {
      cZJ = new WeakReference(paramTextPaint);
    }
  }
  
  public static String b(ab paramab)
  {
    Object localObject2 = ad.getContext();
    Object localObject1;
    if (paramab == null) {
      localObject1 = ((Context)localObject2).getString(R.l.bottle_unknowed_city);
    }
    do
    {
      do
      {
        do
        {
          return (String)localObject1;
          if (!RegionCodeDecoder.Zh(paramab.getCountryCode())) {
            break;
          }
          localObject2 = paramab.getCity();
          localObject1 = localObject2;
        } while (!bi.oW((String)localObject2));
        localObject2 = r.gV(paramab.getProvince());
        localObject1 = localObject2;
      } while (!bi.oW((String)localObject2));
      RegionCodeDecoder.cmS();
      return RegionCodeDecoder.getLocName(paramab.getCountryCode());
      paramab = r.gV(paramab.getProvince());
      localObject1 = paramab;
    } while (!bi.oW(paramab));
    return ((Context)localObject2).getString(R.l.bottle_unknowed_city);
  }
  
  public static String b(com.tencent.mm.storage.bd parambd, PString paramPString1, PString paramPString2, PInt paramPInt, boolean paramBoolean)
  {
    if (parambd.cmh()) {}
    for (String str = parambd.cmH();; str = parambd.field_content)
    {
      str = j.TT(str);
      return bi.oV(a(parambd.field_imgPath, parambd.field_isSend, parambd.field_talker, str, parambd.getType(), ad.getContext(), paramPString1, paramPString2, paramPInt, true, paramBoolean));
    }
  }
  
  public static String c(Context paramContext, String paramString, boolean paramBoolean)
  {
    paramString = com.tencent.mm.br.b.cjC().Xw(paramString);
    if (paramBoolean) {
      return paramString;
    }
    return paramContext.getString(R.l.intro_title);
  }
  
  public static String d(Context paramContext, String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      return com.tencent.mm.br.b.cjC().Xw(paramString);
    }
    return paramContext.getString(R.l.notification_sample_ticker);
  }
  
  private static String eS(String paramString)
  {
    String str = paramString;
    if (paramString != null) {
      str = paramString.replaceAll("%", "%%");
    }
    return str;
  }
  
  private static String eT(String paramString)
  {
    String str = paramString;
    if (paramString != null) {
      str = paramString.replaceAll("%%", "%");
    }
    return str;
  }
  
  public static String eU(String paramString)
  {
    String str;
    if (paramString == null) {
      str = "";
    }
    do
    {
      return str;
      str = paramString;
    } while (paramString.length() < 150);
    return paramString.substring(0, 150) + "...";
  }
  
  public static void fA(int paramInt)
  {
    cZL = paramInt;
  }
  
  public static void fz(int paramInt)
  {
    cZK = paramInt;
  }
  
  public static String i(Context paramContext, String paramString1, String paramString2)
  {
    if (s.fq(paramString1))
    {
      paramString2 = com.tencent.mm.model.bd.iB(paramString2);
      if (paramString2 != null) {
        paramString2 = r.gT(paramString2.trim());
      }
    }
    while (paramString1.contains("@bottle"))
    {
      return paramContext.getResources().getQuantityString(R.j.notification_fmt_multi_bottle, 1, new Object[] { Integer.valueOf(1) });
      paramString2 = r.gT(paramString1);
      continue;
      paramString2 = r.gT(paramString1);
    }
    String str = paramString2;
    if (bi.oW(paramString2))
    {
      str = paramString2;
      if (s.fq(paramString1)) {
        str = paramContext.getString(R.l.chatting_roominfo_noname);
      }
    }
    return com.tencent.mm.br.b.cjC().Xw(str);
  }
  
  private static String j(String paramString1, String paramString2, String paramString3)
  {
    if ((bi.oW(paramString1)) || (bi.oW(paramString2)) || (bi.oW(paramString3))) {}
    int i;
    do
    {
      return paramString1;
      i = paramString1.indexOf(paramString2);
    } while (i < 0);
    return paramString1.substring(0, i) + paramString3 + paramString1.substring(i + paramString2.length());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/booter/notification/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */