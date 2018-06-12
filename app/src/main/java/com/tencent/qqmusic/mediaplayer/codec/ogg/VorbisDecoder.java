package com.tencent.qqmusic.mediaplayer.codec.ogg;

import android.text.TextUtils;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.codec.ffmpeg.FfmpegPlayer;

public class VorbisDecoder
  extends FfmpegPlayer
{
  public AudioFormat.AudioType getAudioType(String paramString, byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0) && (new String(paramArrayOfByte).startsWith("OggS"))) {
      return AudioFormat.AudioType.OGG;
    }
    return AudioFormat.AudioType.UNSUPPORT;
  }
  
  public int getErrorCodeMask()
  {
    return 83886079;
  }
  
  public AudioFormat.AudioType guessAudioType(String paramString)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramString.toLowerCase().contains(".ogg"))) {
      return AudioFormat.AudioType.OGG;
    }
    return AudioFormat.AudioType.UNSUPPORT;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/codec/ogg/VorbisDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */