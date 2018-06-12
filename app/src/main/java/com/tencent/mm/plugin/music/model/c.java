package com.tencent.mm.plugin.music.model;

import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.tencent.mm.sdk.platformtools.x;

public final class c
{
  AudioManager.OnAudioFocusChangeListener lxS = new c.1(this);
  
  public final void bhO()
  {
    x.i("MicroMsg.Music.MusicAudioFocusHelper", "abandonFocus");
    h.bie().abandonAudioFocus(this.lxS);
  }
  
  public final boolean requestFocus()
  {
    int i = h.bie().requestAudioFocus(this.lxS, 3, 2);
    if (i == 1) {}
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.Music.MusicAudioFocusHelper", "request audio focus %b", new Object[] { Boolean.valueOf(bool) });
      if (i != 1) {
        break;
      }
      return true;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/music/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */