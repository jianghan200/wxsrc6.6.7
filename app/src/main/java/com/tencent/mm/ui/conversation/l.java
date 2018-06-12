package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.R.l;
import com.tencent.mm.k.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.a.c;
import java.util.Map;

public final class l
{
  private static c urp = null;
  
  public static void czc()
  {
    if (urp != null)
    {
      urp.dismiss();
      urp = null;
    }
  }
  
  public static void gS(final Context paramContext)
  {
    if (!com.tencent.mm.sdk.platformtools.e.chv()) {}
    label86:
    label117:
    int j;
    label205:
    label548:
    label565:
    label587:
    label592:
    do
    {
      Map localMap;
      int m;
      int n;
      int k;
      do
      {
        do
        {
          return;
          localObject = g.AT().getValue("NewShowRating");
        } while (bi.oW((String)localObject));
        localMap = bl.z((String)localObject, "ShowRatingNode");
        if ((localMap != null) && (localMap.get(".ShowRatingNode.MinVer") != null)) {
          break;
        }
        localObject = "0";
        m = Integer.decode((String)localObject).intValue();
        if ((localMap != null) && (localMap.get(".ShowRatingNode.MaxVer") != null)) {
          break label548;
        }
        localObject = "0";
        n = Integer.decode((String)localObject).intValue();
        if ((localMap != null) && (localMap.get(".ShowRatingNode.WaitDays") != null)) {
          break label565;
        }
        localObject = "0";
        k = Integer.decode((String)localObject).intValue();
      } while ((m > com.tencent.mm.protocal.d.qVN) || (com.tencent.mm.protocal.d.qVN > n));
      Object localObject = paramContext.getSharedPreferences("show_rating_preferences", 0);
      j = ((SharedPreferences)localObject).getInt("show_rating_flag", 0);
      int i1 = ((SharedPreferences)localObject).getInt("show_rating_version", 0);
      long l1 = ((SharedPreferences)localObject).getLong("show_rating_timestamp", 0L);
      boolean bool = ((SharedPreferences)localObject).getBoolean("show_rating_again", false);
      long l2;
      if (k == 0)
      {
        i = 7;
        l2 = i * 86400000L;
        if ((i1 == 0) || (m > i1) || (i1 > n)) {
          break label587;
        }
      }
      for (int i = 0;; i = 1)
      {
        if (i != 0)
        {
          ((SharedPreferences)localObject).edit().putInt("show_rating_version", com.tencent.mm.protocal.d.qVN).commit();
          ((SharedPreferences)localObject).edit().putInt("show_rating_flag", 0).commit();
          j = 0;
          l1 = System.currentTimeMillis();
          ((SharedPreferences)localObject).edit().putLong("show_rating_timestamp", l1).commit();
          ((SharedPreferences)localObject).edit().putBoolean("show_rating_again", false).commit();
          ((SharedPreferences)localObject).edit().putInt("show_rating_wait_days", k).commit();
          ((SharedPreferences)localObject).edit().putInt("show_rating_first_second_time", (int)(System.currentTimeMillis() / 1000L)).commit();
          x.i("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]current clientVersion=%s,has rating clientVersion=%s,dynamic config showRatting min version=%s,max version:%s,waitDaysMillis:%s", new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.qVN), Integer.valueOf(i1), Integer.valueOf(m), Integer.valueOf(n), Long.valueOf(l2) });
        }
        if ((m > com.tencent.mm.protocal.d.qVN) || (com.tencent.mm.protocal.d.qVN > n) || (j != 0) || (l1 == 0L) || (System.currentTimeMillis() < l1 + l2)) {
          break label592;
        }
        x.i("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]show enjoy app dialog.");
        urp = com.tencent.mm.ui.base.h.a(paramContext, false, paramContext.getString(R.l.show_rating_enjoy_dialog_wording), "", paramContext.getString(R.l.show_rating_button_yes), paramContext.getString(R.l.show_rating_button_no), new DialogInterface.OnClickListener()new l.2
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            this.urq.edit().putInt("show_rating_flag", 1).commit();
            if (paramAnonymousDialogInterface != null) {
              paramAnonymousDialogInterface.dismiss();
            }
            l.czd();
            l.gU(paramContext);
            x.d("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]show rating dialog from enjoy app dialog.");
          }
        }, new l.2((SharedPreferences)localObject, paramContext));
        return;
        localObject = (String)localMap.get(".ShowRatingNode.MinVer");
        break;
        localObject = (String)localMap.get(".ShowRatingNode.MaxVer");
        break label86;
        localObject = (String)localMap.get(".ShowRatingNode.WaitDays");
        break label117;
        i = k;
        break label205;
      }
      if ((bool) && (l1 != 0L) && (System.currentTimeMillis() >= l1 + l2 + 345600000L))
      {
        x.i("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]show rating dialog again.");
        u(paramContext, false);
        ((SharedPreferences)localObject).edit().putInt("show_rating_flag", 3).commit();
        return;
      }
      if (j == 1)
      {
        u(paramContext, true);
        return;
      }
      if (j == 2)
      {
        gT(paramContext);
        return;
      }
    } while (j != 3);
    u(paramContext, false);
  }
  
  private static void gT(final Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("show_rating_preferences", 0);
    final int i = localSharedPreferences.getInt("show_rating_wait_days", 0);
    final int j = localSharedPreferences.getInt("show_rating_first_second_time", 0);
    urp = com.tencent.mm.ui.base.h.a(paramContext, false, paramContext.getString(R.l.show_rating_feedback_dialog_wording), "", paramContext.getString(R.l.show_rating_feedback_dialog_button_yes), paramContext.getString(R.l.show_rating_feedback_dialog_button_no), new DialogInterface.OnClickListener()new l.6
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        this.urq.edit().putInt("show_rating_flag", 4).commit();
        if (paramAnonymousDialogInterface != null) {
          paramAnonymousDialogInterface.dismiss();
        }
        com.tencent.mm.pluginsdk.d.a(paramContext, (int)System.currentTimeMillis(), new byte[0], "weixin://dl/feedback");
        l.czd();
        com.tencent.mm.plugin.report.service.h.mEJ.h(11216, new Object[] { Integer.valueOf(2), Integer.valueOf(j), Integer.valueOf(i) });
      }
    }, new l.6(localSharedPreferences, j, i));
  }
  
  private static void u(Context paramContext, boolean paramBoolean)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("show_rating_preferences", 0);
    boolean bool = localSharedPreferences.getBoolean("show_rating_again", false);
    int i = localSharedPreferences.getInt("show_rating_wait_days", 0);
    int j = localSharedPreferences.getInt("show_rating_first_second_time", 0);
    String str1;
    String str2;
    Object localObject2;
    if (paramBoolean)
    {
      str1 = paramContext.getString(R.l.show_rating_dialog_wording);
      localObject1 = paramContext.getString(R.l.show_rating_dialog_button_yes);
      str2 = paramContext.getString(R.l.show_rating_dialog_button_no);
      localObject2 = localObject1;
    }
    for (Object localObject1 = str2;; localObject1 = paramContext.getString(R.l.show_rating_dialog_again_button_no))
    {
      urp = com.tencent.mm.ui.base.h.a(paramContext, false, str1, "", (String)localObject2, (String)localObject1, new l.3(localSharedPreferences, paramContext, bool, j, i), new l.4(localSharedPreferences, bool, j, i));
      return;
      str1 = paramContext.getString(R.l.show_rating_dialog_again_wording);
      localObject2 = paramContext.getString(R.l.show_rating_dialog_again_button_yes);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/conversation/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */