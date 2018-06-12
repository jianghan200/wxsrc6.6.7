package com.tencent.mm.plugin.facedetect.model;

import com.tencent.mm.model.at;

public final class e
{
  private static long iNr = -1L;
  private static long iNs = -1L;
  private static float iNt = -1.0F;
  
  public static boolean aJE()
  {
    return Boolean.parseBoolean(at.dBv.I("last_login_face_use_debug_mode", "false"));
  }
  
  public static boolean aJF()
  {
    return Boolean.parseBoolean(at.dBv.I("last_login_face_is_force_upload_face", "false"));
  }
  
  public static boolean aJG()
  {
    return Boolean.parseBoolean(at.dBv.I("last_login_face_save_correct_debug_mode", "false"));
  }
  
  public static boolean aJH()
  {
    return Boolean.parseBoolean(at.dBv.I("last_login_face_save_final_debug_mode", "false"));
  }
  
  public static boolean aJI()
  {
    return Boolean.parseBoolean(at.dBv.I("last_login_face_save_lip_reading", "false"));
  }
  
  public static boolean aJJ()
  {
    return Boolean.parseBoolean(at.dBv.I("last_login_face_save_final_voice", "false"));
  }
  
  public static void df(long paramLong)
  {
    iNr = paramLong;
  }
  
  public static void eD(boolean paramBoolean)
  {
    at.dBv.T("last_login_face_use_debug_mode", String.valueOf(paramBoolean));
  }
  
  public static void eE(boolean paramBoolean)
  {
    at.dBv.T("last_login_face_save_correct_debug_mode", String.valueOf(paramBoolean));
  }
  
  public static void eF(boolean paramBoolean)
  {
    at.dBv.T("last_login_face_save_final_debug_mode", String.valueOf(paramBoolean));
  }
  
  public static void eG(boolean paramBoolean)
  {
    at.dBv.T("last_login_face_save_lip_reading", String.valueOf(paramBoolean));
  }
  
  public static void eH(boolean paramBoolean)
  {
    at.dBv.T("last_login_face_save_final_voice", String.valueOf(paramBoolean));
  }
  
  public static void eI(boolean paramBoolean)
  {
    at.dBv.T("last_login_face_is_force_upload_face", String.valueOf(paramBoolean));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/facedetect/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */