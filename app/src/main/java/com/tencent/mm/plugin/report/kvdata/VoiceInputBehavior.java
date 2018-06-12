package com.tencent.mm.plugin.report.kvdata;

public class VoiceInputBehavior
  extends com.tencent.mm.bk.a
{
  public int cancel;
  public int clear;
  public int click;
  public int fail;
  public int fullScreenVoiceLongClick;
  public long fullScreenVoiceLongClickTime;
  public int longClick;
  public long longClickTime;
  public int send;
  public int smileIconClick;
  public int textChangeCount;
  public int textChangeReturn;
  public long textChangeTime;
  public int textClick;
  public int voiceIconClick;
  public long voiceInputTime;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.cancel);
      paramVarArgs.fT(2, this.send);
      paramVarArgs.fT(3, this.click);
      paramVarArgs.fT(4, this.longClick);
      paramVarArgs.T(5, this.longClickTime);
      paramVarArgs.fT(6, this.textClick);
      paramVarArgs.fT(7, this.textChangeCount);
      paramVarArgs.T(8, this.textChangeTime);
      paramVarArgs.fT(9, this.textChangeReturn);
      paramVarArgs.T(10, this.voiceInputTime);
      paramVarArgs.fT(11, this.fail);
      paramVarArgs.fT(12, this.clear);
      paramVarArgs.fT(13, this.smileIconClick);
      paramVarArgs.fT(14, this.voiceIconClick);
      paramVarArgs.fT(15, this.fullScreenVoiceLongClick);
      paramVarArgs.T(16, this.fullScreenVoiceLongClickTime);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.cancel) + 0 + f.a.a.a.fQ(2, this.send) + f.a.a.a.fQ(3, this.click) + f.a.a.a.fQ(4, this.longClick) + f.a.a.a.S(5, this.longClickTime) + f.a.a.a.fQ(6, this.textClick) + f.a.a.a.fQ(7, this.textChangeCount) + f.a.a.a.S(8, this.textChangeTime) + f.a.a.a.fQ(9, this.textChangeReturn) + f.a.a.a.S(10, this.voiceInputTime) + f.a.a.a.fQ(11, this.fail) + f.a.a.a.fQ(12, this.clear) + f.a.a.a.fQ(13, this.smileIconClick) + f.a.a.a.fQ(14, this.voiceIconClick) + f.a.a.a.fQ(15, this.fullScreenVoiceLongClick) + f.a.a.a.S(16, this.fullScreenVoiceLongClickTime);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      VoiceInputBehavior localVoiceInputBehavior = (VoiceInputBehavior)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localVoiceInputBehavior.cancel = locala.vHC.rY();
        return 0;
      case 2: 
        localVoiceInputBehavior.send = locala.vHC.rY();
        return 0;
      case 3: 
        localVoiceInputBehavior.click = locala.vHC.rY();
        return 0;
      case 4: 
        localVoiceInputBehavior.longClick = locala.vHC.rY();
        return 0;
      case 5: 
        localVoiceInputBehavior.longClickTime = locala.vHC.rZ();
        return 0;
      case 6: 
        localVoiceInputBehavior.textClick = locala.vHC.rY();
        return 0;
      case 7: 
        localVoiceInputBehavior.textChangeCount = locala.vHC.rY();
        return 0;
      case 8: 
        localVoiceInputBehavior.textChangeTime = locala.vHC.rZ();
        return 0;
      case 9: 
        localVoiceInputBehavior.textChangeReturn = locala.vHC.rY();
        return 0;
      case 10: 
        localVoiceInputBehavior.voiceInputTime = locala.vHC.rZ();
        return 0;
      case 11: 
        localVoiceInputBehavior.fail = locala.vHC.rY();
        return 0;
      case 12: 
        localVoiceInputBehavior.clear = locala.vHC.rY();
        return 0;
      case 13: 
        localVoiceInputBehavior.smileIconClick = locala.vHC.rY();
        return 0;
      case 14: 
        localVoiceInputBehavior.voiceIconClick = locala.vHC.rY();
        return 0;
      case 15: 
        localVoiceInputBehavior.fullScreenVoiceLongClick = locala.vHC.rY();
        return 0;
      }
      localVoiceInputBehavior.fullScreenVoiceLongClickTime = locala.vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/report/kvdata/VoiceInputBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */