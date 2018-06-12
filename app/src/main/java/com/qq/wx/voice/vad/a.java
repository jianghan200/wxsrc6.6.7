package com.qq.wx.voice.vad;

import java.io.PrintStream;

public final class a
{
  public static boolean DEBUG = false;
  public static boolean bgy = false;
  public long bgv = 0L;
  public EVadNative bgw = new EVadNative();
  public MMVoipVadNative bgx = new MMVoipVadNative();
  
  public static void ay(boolean paramBoolean)
  {
    bgy = paramBoolean;
    if (paramBoolean)
    {
      System.loadLibrary("MMVoipVadEmbed");
      if (DEBUG) {
        System.out.println("EVad loadLib MMVoipVadEmbed");
      }
    }
    do
    {
      return;
      System.loadLibrary("EVadEmbed");
    } while (!DEBUG);
    System.out.println("EVad loadLib EVadEmbed");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/qq/wx/voice/vad/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */