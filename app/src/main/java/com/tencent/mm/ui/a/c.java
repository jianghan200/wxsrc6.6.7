package com.tencent.mm.ui.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.provider.Settings.Secure;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Method;
import java.util.Locale;

@TargetApi(14)
public final class c
  extends View.AccessibilityDelegate
{
  private boolean tqU = false;
  
  public c()
  {
    a locala = a.a.cqX();
    AudioManager localAudioManager = (AudioManager)locala.rc.getSystemService("audio");
    if ((locala.cqW()) && ((Settings.Secure.getInt(locala.rc.getContentResolver(), "speak_password", 0) != 0) || (localAudioManager.isWiredHeadsetOn()))) {}
    for (boolean bool = true;; bool = false)
    {
      this.tqU = bool;
      return;
    }
  }
  
  public final boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }
  
  public final AccessibilityNodeProvider getAccessibilityNodeProvider(View paramView)
  {
    return null;
  }
  
  public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent) {}
  
  public final void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo) {}
  
  public final void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent) {}
  
  public final boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return true;
  }
  
  public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    return true;
  }
  
  public final void sendAccessibilityEvent(View paramView, int paramInt)
  {
    if (!this.tqU) {
      break label7;
    }
    label7:
    while ((paramView == null) || ((paramInt != 128) && (paramInt != 1))) {
      return;
    }
    Object localObject;
    if ((paramView instanceof EditText))
    {
      localObject = (EditText)paramView;
      if (!bi.K(((EditText)localObject).getText())) {
        localObject = ((EditText)localObject).getText();
      }
    }
    for (;;)
    {
      x.d("MicroMsg.MMSecureAccessibilityDelegate", "speak content: %s", new Object[] { localObject });
      if (bi.K((CharSequence)localObject)) {
        break;
      }
      a locala = a.a.cqX();
      String str = ((CharSequence)localObject).toString();
      if (locala.tqQ == null) {
        locala.tqQ = new TextToSpeech(locala.rc, new a.1(locala, str));
      }
      try
      {
        localObject = View.class.getMethod("clearAccessibilityFocus", new Class[0]);
        ((Method)localObject).setAccessible(true);
        ((Method)localObject).invoke(paramView, new Object[0]);
        localObject = View.class.getMethod("requestAccessibilityFocus", new Class[0]);
        ((Method)localObject).setAccessible(true);
        ((Method)localObject).invoke(paramView, new Object[0]);
        if (locala.hni != null) {
          locala.hni = ((Vibrator)ad.getContext().getSystemService("vibrator"));
        }
        if (locala.hni == null) {
          break label7;
        }
        locala.hni.vibrate(50L);
        return;
        if (!bi.K(((EditText)localObject).getContentDescription()))
        {
          localObject = ((EditText)localObject).getContentDescription();
        }
        else if (((EditText)localObject).getHint() != null)
        {
          localObject = ((EditText)localObject).getHint();
          continue;
          if ((paramView instanceof TextView))
          {
            if (bi.K(paramView.getContentDescription()))
            {
              localObject = ((TextView)paramView).getText();
              continue;
            }
            localObject = paramView.getContentDescription();
            continue;
          }
          localObject = paramView.getContentDescription();
          continue;
          TextToSpeech localTextToSpeech = locala.tqQ;
          if (w.chL()) {}
          for (localObject = Locale.CHINESE;; localObject = Locale.ENGLISH)
          {
            localTextToSpeech.setLanguage((Locale)localObject);
            locala.tqQ.speak(str, 0, null);
            break;
          }
        }
      }
      catch (Exception paramView)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.Accessibility.AccessibilityHelper", paramView, "", new Object[0]);
        }
        localObject = null;
      }
    }
  }
  
  public final void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */