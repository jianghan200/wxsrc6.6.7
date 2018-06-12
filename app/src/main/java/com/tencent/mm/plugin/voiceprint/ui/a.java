package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import com.tencent.mm.R.a;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  public static void a(View paramView, Context paramContext, a parama)
  {
    paramContext = AnimationUtils.loadAnimation(paramContext, R.a.faded_out);
    paramContext.setDuration(300L);
    paramContext.setFillAfter(true);
    paramContext.setRepeatCount(0);
    paramContext.setAnimationListener(new a.3(parama));
    paramView.startAnimation(paramContext);
  }
  
  public static void a(View paramView, a parama)
  {
    float f = paramView.getWidth();
    x.d("MicroMsg.VoiceViewAnimationHelper", "target " + f);
    Object localObject = new int[2];
    paramView.getLocationInWindow((int[])localObject);
    int i = (int)(f + localObject[0]);
    x.d("MicroMsg.VoiceViewAnimationHelper", "location %d %d preX=%d", new Object[] { Integer.valueOf(localObject[0]), Integer.valueOf(localObject[1]), Integer.valueOf(i) });
    paramView.getParent();
    localObject = new TranslateAnimation(0, 0.0F, 0, -i, 1, 0.0F, 1, 0.0F);
    ((Animation)localObject).setDuration(200L);
    ((Animation)localObject).setStartOffset(0L);
    ((Animation)localObject).setRepeatMode(-1);
    ((Animation)localObject).setRepeatCount(0);
    ((Animation)localObject).setFillAfter(true);
    ((Animation)localObject).setAnimationListener(new a.2(parama, i, paramView));
    paramView.startAnimation((Animation)localObject);
  }
  
  public static abstract interface a
  {
    public abstract void bJd();
    
    public abstract void bJe();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */