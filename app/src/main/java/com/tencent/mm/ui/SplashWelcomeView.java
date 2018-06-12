package com.tencent.mm.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bt;
import com.tencent.mm.plugin.setting.model.SwitchAccountModel;
import com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.chatting.ap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SplashWelcomeView
  extends FrameLayout
  implements ap
{
  private Bitmap bitmap;
  private boolean hasDrawed;
  private volatile boolean tqw;
  private volatile boolean tqx;
  private ImageView tqy;
  private int tqz;
  
  public SplashWelcomeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    gr(paramContext);
  }
  
  public SplashWelcomeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    gr(paramContext);
  }
  
  /* Error */
  private void cqT()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 54	com/tencent/mm/ui/SplashWelcomeView:tqw	Z
    //   6: ifne +28 -> 34
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield 54	com/tencent/mm/ui/SplashWelcomeView:tqw	Z
    //   14: aload_0
    //   15: getfield 38	com/tencent/mm/ui/SplashWelcomeView:bitmap	Landroid/graphics/Bitmap;
    //   18: astore_1
    //   19: aload_1
    //   20: ifnull +14 -> 34
    //   23: new 10	com/tencent/mm/ui/SplashWelcomeView$2
    //   26: dup
    //   27: aload_0
    //   28: invokespecial 56	com/tencent/mm/ui/SplashWelcomeView$2:<init>	(Lcom/tencent/mm/ui/SplashWelcomeView;)V
    //   31: invokestatic 62	com/tencent/mm/sdk/platformtools/ah:A	(Ljava/lang/Runnable;)V
    //   34: aload_0
    //   35: monitorexit
    //   36: return
    //   37: astore_1
    //   38: ldc 64
    //   40: aload_1
    //   41: ldc 66
    //   43: iconst_1
    //   44: anewarray 68	java/lang/Object
    //   47: dup
    //   48: iconst_0
    //   49: aload_1
    //   50: invokevirtual 72	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   53: aastore
    //   54: invokestatic 78	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   57: goto -23 -> 34
    //   60: astore_1
    //   61: aload_0
    //   62: monitorexit
    //   63: aload_1
    //   64: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	SplashWelcomeView
    //   18	2	1	localBitmap	Bitmap
    //   37	13	1	localException	Exception
    //   60	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   23	34	37	java/lang/Exception
    //   2	19	60	finally
    //   23	34	60	finally
    //   38	57	60	finally
  }
  
  private void gr(Context paramContext)
  {
    if (ad.cic())
    {
      Object localObject1 = ad.getContext().getSharedPreferences("switch_account_preferences", 0);
      try
      {
        boolean bool = ((SharedPreferences)localObject1).getBoolean("transit_to_switch_account", false);
        x.i("SplashWelcomeView", "transit to switch account %s", new Object[] { Boolean.valueOf(bool) });
        if (bool)
        {
          ((SharedPreferences)localObject1).edit().putBoolean("transit_to_switch_account", false).commit();
          localObject1 = ((Activity)paramContext).getLayoutInflater().inflate(R.i.settings_switch_account, null);
          SwitchAccountGridView localSwitchAccountGridView = (SwitchAccountGridView)((View)localObject1).findViewById(R.h.switch_account_grid);
          localSwitchAccountGridView.setRowCount(1);
          localSwitchAccountGridView.setClickable(false);
          ((View)localObject1).findViewById(R.h.switch_account_delete_btn).setVisibility(8);
          ((View)localObject1).findViewById(R.h.switch_account_cancel_btn).setVisibility(8);
          Object localObject2 = (TextView)((View)localObject1).findViewById(R.h.switch_account_title);
          x.i("SplashWelcomeView", "activity resources %s, application resources %s", new Object[] { paramContext.getResources(), ad.getResources() });
          ((TextView)localObject2).setText(paramContext.getResources().getString(R.l.settings_switch_account_login_title));
          Object localObject3 = bt.dDs.IH();
          localObject2 = at.dBv.I("login_weixin_username", "");
          HashMap localHashMap = new HashMap();
          if ((!bi.oW((String)localObject2)) && (!((Set)localObject3).contains(localObject2))) {
            localHashMap.put(localObject2, new SwitchAccountModel((String)localObject2, at.dBv.I("login_user_name", ""), at.dBv.HL(), at.dBv.I("last_logout_no_pwd_ticket", ""), bi.WU(at.dBv.I("last_login_use_voice", ""))));
          }
          for (;;)
          {
            localSwitchAccountGridView.setUseSystemDecoder(true);
            localSwitchAccountGridView.L(localHashMap);
            localSwitchAccountGridView.setLastLoginWxUsername((String)localObject2);
            localSwitchAccountGridView.setLogoutState(true);
            localSwitchAccountGridView.bum();
            addView((View)localObject1, new FrameLayout.LayoutParams(-1, -1));
            return;
            localObject3 = ((Set)localObject3).iterator();
            while (((Iterator)localObject3).hasNext())
            {
              String str2 = (String)((Iterator)localObject3).next();
              localHashMap.put(str2, new SwitchAccountModel(str2, bt.dDs.getString(str2, "login_user_name"), bt.dDs.getString(str2, "last_avatar_path"), bt.dDs.getString(str2, "last_logout_no_pwd_ticket"), bi.WU(bt.dDs.getString(str2, "last_login_use_voice"))));
            }
          }
        }
        this.tqy = new SplashImageView(paramContext);
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("SplashWelcomeView", localException, "show switch account view with exception!", new Object[0]);
      }
    }
    this.tqy.setScaleType(ImageView.ScaleType.CENTER_CROP);
    ((SplashImageView)this.tqy).setOnDrawListener(this);
    addView(this.tqy, new FrameLayout.LayoutParams(-1, -1));
    try
    {
      if (!ad.cic())
      {
        x.i("SplashWelcomeView", "not main process, only load default splash bitmap.");
        return;
      }
    }
    catch (Exception paramContext)
    {
      x.printErrStackTrace("SplashWelcomeView", paramContext, "%s", new Object[] { paramContext.getMessage() });
      return;
    }
    paramContext = ad.getContext().getSharedPreferences("system_config_prefs", 0);
    long l1 = paramContext.getLong("new_launch_image_begin_time", 0L);
    long l2 = paramContext.getLong("new_launch_image_end_time", 0L);
    long l3 = System.currentTimeMillis() / 1000L;
    x.i("SplashWelcomeView", "beginTime:%s,endTime:%s,currentTime:%s", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3) });
    final String str1 = b.duN + "splashWelcomeImg";
    if ((l3 > l1) && (l3 < l2))
    {
      this.tqz = paramContext.getInt("launch_fail_times", 0);
      i = paramContext.getInt("launch_last_status", 0);
      if (i == 1)
      {
        x.i("SplashWelcomeView", "last launch status is 'start'.");
        this.tqz += 1;
        paramContext.edit().putInt("launch_fail_times", this.tqz).commit();
        paramContext.edit().putInt("launch_last_status", 1).apply();
        if (this.tqz < 3) {
          break label839;
        }
        x.i("SplashWelcomeView", "launch exceed max failed times, %d", new Object[] { Integer.valueOf(this.tqz) });
      }
    }
    label839:
    for (int i = 0;; i = 1)
    {
      if (i != 0)
      {
        com.tencent.mm.sdk.f.e.post(new Runnable()
        {
          public final void run()
          {
            if (com.tencent.mm.a.e.cn(str1)) {
              try
              {
                byte[] arrayOfByte = com.tencent.mm.a.e.e(str1, 0, com.tencent.mm.a.e.cm(str1));
                if ((arrayOfByte != null) && (arrayOfByte.length > 0))
                {
                  SplashWelcomeView.a(SplashWelcomeView.this, BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length));
                  x.i("SplashWelcomeView", "ready to play animation, hasDrawed %s", new Object[] { Boolean.valueOf(SplashWelcomeView.a(SplashWelcomeView.this)) });
                  SplashWelcomeView.b(SplashWelcomeView.this);
                }
                return;
              }
              catch (Exception localException)
              {
                x.printErrStackTrace("SplashWelcomeView", localException, "decode new welcome image error: %s", new Object[] { localException.getMessage() });
                return;
              }
              finally
              {
                if (SplashWelcomeView.a(SplashWelcomeView.this)) {
                  SplashWelcomeView.c(SplashWelcomeView.this);
                }
              }
            }
            x.i("SplashWelcomeView", "cannot find %s", new Object[] { str1 });
          }
        }, "readWelcomeBg");
        return;
        if (i != 2) {
          break;
        }
        x.i("SplashWelcomeView", "last launch status is 'end'.");
        break;
        x.i("SplashWelcomeView", "change launch image activity is finished!");
        com.tencent.mm.a.e.deleteFile(str1);
      }
      return;
    }
  }
  
  public final void aRL()
  {
    x.i("SplashWelcomeView", "hasDrawed:%s", new Object[] { Boolean.valueOf(this.hasDrawed) });
    if (!this.hasDrawed)
    {
      this.hasDrawed = true;
      if ((this.tqx) && (!this.tqw)) {
        cqT();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/SplashWelcomeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */