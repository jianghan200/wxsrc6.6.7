package com.tencent.mm.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Vibrator;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.w.a.i;
import java.util.Locale;

public final class a
{
  private AccessibilityManager gD;
  Vibrator hni;
  public Context rc;
  TextToSpeech tqQ = null;
  
  public a(Context paramContext)
  {
    this.rc = paramContext;
    this.gD = ((AccessibilityManager)this.rc.getSystemService("accessibility"));
  }
  
  public final void J(View paramView, int paramInt)
  {
    if (!cqW()) {}
    while ((this.rc == null) || (paramView == null)) {
      return;
    }
    paramInt = Math.max(paramInt, 1);
    b localb = new b();
    localb.ZU(this.rc.getResources().getQuantityString(a.i.chatting_voice_item_desc, paramInt, new Object[] { Integer.valueOf(paramInt) }));
    localb.dl(paramView);
  }
  
  public final void a(View paramView, String paramString1, int paramInt, String paramString2, String paramString3)
  {
    if (!cqW()) {}
    while ((this.rc == null) || (paramView == null) || (paramString1 == null) || (paramString2 == null) || (paramString3 == null)) {
      return;
    }
    b localb = new b();
    localb.ZU(paramString1);
    if (paramInt > 0) {
      localb.ZU(this.rc.getResources().getQuantityString(a.i.conversation_item_desc_unread, 1, new Object[] { Integer.valueOf(paramInt) }));
    }
    localb.ZU(paramString2).ZU(paramString3);
    localb.dl(paramView);
  }
  
  public final boolean cqW()
  {
    boolean bool1 = this.gD.isEnabled();
    boolean bool2 = this.gD.isTouchExplorationEnabled();
    return (bool1) && (bool2);
  }
  
  private static final class a
  {
    private static final a tqS = new a(ad.getContext());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */